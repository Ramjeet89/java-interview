package com.interview.utils;

import java.util.List;

public class ProductExample {

    private int id;
    private String name;
    private long price;

    public ProductExample(int id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductExample() {

    }

    public ProductExample(String name, double discountedPrice) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return price - (price * 0.1); // 10% discount
    }

    public static void main(String[] args) {
        List<ProductExample> listOfProducts = List.of(
                new ProductExample(101, "Sony", 25000),
                new ProductExample(102, "Dell", 31000),
                new ProductExample(103, "HP", 29000),
                new ProductExample(104, "MaC", 50000),
                new ProductExample(105, "Acer", 28000));


       // List<Long> productPrice = listOfProducts.stream().map(ProductExample::getPrice).toList();
      //  productPrice.forEach(System.out::println);

        List<String> productNameGreaterThen5000 = listOfProducts.stream().filter(p -> p.getPrice() > 50000).map(ProductExample::getName).toList();
        productNameGreaterThen5000.forEach(System.out::println);

      //  LongSummaryStatistics summary = listOfProducts.stream().mapToLong(ProductExample::getPrice).summaryStatistics();
//        System.out.println(summary.getMin());
//        System.out.println(summary.getAverage());
//        System.out.println(summary.getSum());
//        System.out.println(summary.getCount());
//        System.out.println(summary.getMax());

        List<ProductExample> discountedProduct = listOfProducts.stream()
                .filter(p -> p.getPrice() < 30000)
                .map(p -> new ProductExample(p.getName(), p.getDiscountedPrice())).toList();

        System.out.println("Original Products:");
        listOfProducts.forEach(product -> System.out.println(product.getName() + " - Price: " + product.getPrice()));

        System.out.println("\nDiscounted Products:");
        discountedProduct.forEach(product -> System.out.println(product.getName()
                + " - Discounted Price: " + product.getDiscountedPrice()));
    }


}
