package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.Impl.CustomerRepositoryImpl;
import repository.Impl.CustomerTypeRepositoryImpl;
import service.Impl.CustomerServiceImpl;
import service.Impl.CustomerTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static util.CustomerCodeCreating.setCode;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    public CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
    private CustomerTypeServiceImpl customerTypeServiceImpl = new CustomerTypeServiceImpl();
    public CustomerRepositoryImpl customerRepositoryImpl = new CustomerRepositoryImpl();
    private CustomerTypeRepositoryImpl customerTypeRepositoryImpl = new CustomerTypeRepositoryImpl();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm (request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Customer existingCustomer = customerRepositoryImpl.getCustomerById(id);
            request.setAttribute("customer", existingCustomer);
            List<CustomerType> customerTypeList = customerTypeRepositoryImpl.findAll();
            request.setAttribute("customerType", customerTypeList);

            RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                updateCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerServiceImpl.deleteCustomer(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customerId = Integer.parseInt(request.getParameter("customer-id"));
        String customerCode = setCode("KH-", customerId);
        String customerName = request.getParameter("customer-name");
        String customerBirthday = request.getParameter("code-birthday");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String customerIdCard = request.getParameter("customer-id-card");
        String customerPhone = request.getParameter("customer-phone");
        String customerEmail = request.getParameter("customer-email");
        String customerAddress = request.getParameter("customer-address");
        int customerTypeId = Integer.parseInt(request.getParameter("customerType"));
        Customer customer = new Customer (customerId, customerCode, customerName, customerBirthday, gender, customerIdCard, customerPhone, customerEmail, customerAddress, customerTypeId);
        customerRepositoryImpl.updateCustomer(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerRepositoryImpl.findAll();
        Collections.sort(customerList);
        Customer customer = customerList.get(customerList.size() -1);
        int id = customer.getCustomerId()+1;
        String customerName = request.getParameter("customer-name");
        String customerCode = setCode("KH-", id);
        String customerBirthday = request.getParameter("code-birthday");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String customerIdCard = request.getParameter("customer-id-card");
        String customerPhone = request.getParameter("customer-phone");
        String customerEmail = request.getParameter("customer-email");
        String customerAddress = request.getParameter("customer-address");
        int customerTypeId = Integer.parseInt(request.getParameter("idCustomerType"));
        customer = new Customer(customerName, customerCode, customerBirthday, gender, customerIdCard, customerPhone, customerEmail, customerAddress, customerTypeId);
        customerServiceImpl.create(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerServiceImpl.findAll();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypeList = customerTypeServiceImpl.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


}
