package com.ecommerce.search;

public class ECommerceSearchTest {
public static void main(String[] args) {
    Product[] products = {
        new Product(101, "Laptop", "Electronics"),
        new Product(102, "Shoes", "Footwear"),
        new Product(103, "Watch", "Accessories"),
        new Product(104, "Phone", "Electronics")
    };

    Product result1 = LinearSearch.linearSearch(products, "Phone");
    System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

   
    Product result2 = BinarySearch.binarySearch(products, "Phone");
    System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
}
}
