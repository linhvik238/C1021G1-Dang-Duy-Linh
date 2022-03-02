package controller;

import dao.ProductDao;
import model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/productServlet")
public class ProductServlet extends HttpServlet {
    ProductDao productDao = new ProductDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch(action) {
            case "create":
                response.sendRedirect("create.jsp");
                break;
            case "detail":
                getInfoProduct (request, response);
                break;
            case "edit":
                goEdit(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                showSearchMenu(request, response);
            default:
                goProductList(request, response);
                break;
        }
    }

    private void getInfoProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Product product = ProductDao.findById (id);

        request.setAttribute("product", product);
        request.getRequestDispatcher("detail.jsp").forward(request, response);
    }

    private void goEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Product product = ProductDao.findById (id);

        request.setAttribute("product", product);
        request.getRequestDispatcher("edit.jsp").forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        ProductDao.deleteById(id);
        request.setAttribute("message", "Delete product succesfully!");
        goProductList(request, response);
    }

    private void showSearchMenu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("search.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                registerNewProduct(request, response);
                break;
            case "edit":
                editProductInfor(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
        }
    }


    private void goProductList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("productList", ProductDao.getListProduct());
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    private void registerNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");

        Product product = new Product(id, name, price, description, producer);
        ProductDao.save(product);

        request.setAttribute("message", "Register new product succesfully!");
        goProductList(request, response);
    }

    private void editProductInfor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");

        Product product = new Product(id, name, price, description, producer);
        ProductDao.save(product);

        request.setAttribute("message", "Edit product information succesfully!");
        goProductList(request, response);
    }



    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listSearch = new ArrayList<>();
        String name = request.getParameter("nameProduct");
        List<Product> arrayList = this.productDao.getListProduct();
        for (Product product : arrayList) {
            if (product.getName().contains(name)) {
                listSearch.add(product);
            }
        }
        if (listSearch.size() == 0) {
            request.setAttribute ("message", "không có sản phẩm cần tìm");
        } else {
            request.setAttribute("listSearch", listSearch);
        }
        request.getRequestDispatcher("search-result.jsp").forward(request, response);
    }
}
