package dao;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDao {

    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "iPhone XR 64GB", 600, "Iphone XR is powered by a hexa-core Apple A12 Bionic processor.", "Apple"));
        productMap.put(2, new Product(2, "Samsung Galaxy Z Flip3 5G", 950, "Samsung Galaxy Z Flip is powered by a 2.95GHz octa-core Qualcomm Snapdragon 855+ processor.", "Samsung"));
        productMap.put(3, new Product(3, "iPhone 13", 940, "Apple's iPhone features a ceramic shield front, Super Retina XDR display with True Tone and an A15 Bionic chip.", "Apple"));
        productMap.put(4, new Product(4, "Asus ROG Phone 5", 850, "Asus ROG Phone 5 is a gaming beast of a smartphone by ASUS featuring a 144Hz Amoled display, dual batteries, front-facing stereo speakers, and a removable cooler.", "Asus"));
        productMap.put(5, new Product(5, "Nubia Red Magic 6 Pro", 700, "Nubia Red Magic 6 Pro features Pressure sensitive zones (400Hz touch-sensing) and a built-in cooling fan. The smartphone is powered by Qualcomm SM8350 Snapdragon 888 Octa-core processor.", "Nubia"));
    }

    public static List<Product> getListProduct() {
        return new ArrayList<>(productMap.values());
    }

    public static void save(Product product) {
        productMap.put(product.getId(), product);
    }
    public static Product findById(Integer id) {
        return productMap.get(id);
    }

    public static void deleteById(Integer id) {
        productMap.remove(id);
    }
}
