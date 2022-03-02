package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    List<Object> arrayList = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer customer1 = new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "https://haycafe.vn/wp-content/uploads/2022/01/Hinh-anh-cute.jpg");
        Customer customer2 = new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "https://toigingiuvedep.vn/wp-content/uploads/2021/01/hinh-anh-cute-de-thuong.jpg");
        Customer customer3 = new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "https://anhdephd.com/wp-content/uploads/2019/04/nhung-hinh-anh-cute-de-thuong-nhat.jpg");
        Customer customer4 = new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "https://i.pinimg.com/736x/85/c8/38/85c8384e9082008d1129fc8f73d65954.jpg");
        Customer customer5 = new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "https://thuthuatnhanh.com/wp-content/uploads/2020/03/hinh-ve-de-thuong-cute.jpg");

        arrayList.add(customer1);
        arrayList.add(customer2);
        arrayList.add(customer3);
        arrayList.add(customer4);
        arrayList.add(customer5);

        String listCustomer = "";
        request.setAttribute("listCustomer", arrayList);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
