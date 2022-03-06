package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Samsung Galaxy S21 FE", 15990000, "Màn hình của Galaxy S21 FE có thiết kế " +
        "đục lỗ với tấm nền Dynamic AMOLED 2X kích thước 6.4 inch, độ phân giải Full HD+ và có độ làm tươi lên đến 120 Hz. " +
        "Hiệu năng của Galaxy S21 FE cũng hứa hẹn sẽ mạnh mẽ hơn khi sử dụng con chip 'nhà làm' Exynos 2100 tương tự như bộ 3 " +
        "flagship Galaxy S21 series được ra mắt vào đầu năm ngoái. Đi kèm với con chip khủng là thanh RAM 6 GB hoặc 8 GB " +
        "và ROM 128 GB hoặc 256 GB đem đến khả năng đa nhiệm mượt mà, người dùng có thể mở nhiều ứng dụng nặng mà không lo giật lag.", "SamSung"));
        products.put(2, new Product(2, "Samsung Galaxy S21 Ultra ", 25990000, "Samsung Galaxy S21 Ultra là chiếc điện thoại cao cấp hàng đầu " +
                "của Samsung được ra mắt vào đầu năm 2021. Đây cũng là mẫu flagship dòng S đầu tiên của Samsung tương thích được với chiếc " +
                "bút S Pen, một công cụ vốn đã quen thuộc với nhiều người dùng Galaxy Note. Đây còn được xem là một chiếc smartphone " +
                "sang trọng và thời thượng, với camera bốn ống kính rực rỡ có khả năng zoom quang học 10x - camera zoom tốt nhất trên " +
                "điện thoại Android. Các tín đồ đam mê săn ảnh đẹp thì có thể “rinh” em này về nhà nhé!", "SamSung"));
        products.put(3, new Product(3, "Xiaomi Mi 11", 21990000, "Xiaomi Mi 11 được trang bị màn hình AMOLED kích thước khủng 6.81 inch 1440 x 3200 cho bạn thoải mái xem phim, gọi facetime hay chiến game cực kỳ đã mắt. \n" +
                "\n" +
                "Về hiệu năng thì chiếc smartphone này không hề kém cạnh các dòng điện thoại cao cấp khác khi sở hữu con chip " +
                "Snapdragon 888 8 nhân mang hiệu năng hàng đầu trong thế giới điện thoại Android. Đi kèm 12 GB RAM,  tần số quét 120 Hz, " +
                "cho máy hoạt động mượt mà, đa nhiệm không giật lag để người dùng cảm nhận trọn vẹn từng khung giờ giải trí vô cùng thú vị.", "XiaoMi"));
        products.put(4, new Product(4, "Google Pixel 6 Pro", 23999000, "Google Pixel 6 Pro là điện thoại cao cấp nhất mà Google từng sản xuất, " +
                "sở hữu màn hình QHD+ 6.7 inch sắc nét và khá ấn tượng. Google tự tin mang đến cho người dùng trải nghiệm xem phim và lướt web" +
                " mượt mà trên chiếc smartphone này. Những điểm nổi bật khác bao gồm hệ điều hành Android 12 mới nhất và thiết kế độc đáo, " +
                "không kém phần sang trọng. Thời lượng pin của Pixel 6 Pro khá ấn tượng với dung lượng 5.003 mAh cho bạn thoải mái sử dụng" +
                " cả ngày dài.", "Google"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
