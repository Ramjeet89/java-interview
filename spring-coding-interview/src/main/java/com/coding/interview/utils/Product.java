package com.coding.interview.utils;

import java.util.Arrays;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Notebook", 600),
                new Product("Phone", 800),
                new Product("Monitor", 450),
                new Product("Nail Polish", 10),
                new Product("Laptop", 1200)
        );

       /* List<Product> discountedProducts = products.stream()
                .filter(product -> product.getPrice() < 30000)
                .map(product -> new Product(product.getName(), product.getDiscountedPrice()))
                .toList();

        System.out.println("Original Products:");
        products.forEach(product -> System.out.println(product.getName() +
                " - Price: " + product.getPrice()));

        System.out.println("\nDiscounted Products:");
        discountedProducts.forEach(product -> System.out.println(product.getName() +
                " - Discounted Price: " + product.getDiscountedPrice()));*/

      /*  List<Product> discountedProduct = products.stream().map(p -> new Product(p.getName(), p.getPrice() * 0.9)).toList();
        System.out.println(discountedProduct);

        System.out.println("Original Products:");
        products.forEach(product -> System.out.println(product.getName() + " - Price: " + product.getPrice()));

        System.out.println("\n Discounted Products:");
        discountedProduct.forEach(product -> System.out.println(product.getName() + " - Discounted Price: " + product.getPrice()));
*/
        List<String> filteredProductNames = products.stream()
                .filter(p -> p.getName().startsWith("P") && p.getPrice() > 500)
                .map(Product::getName)
                .toList();
        System.out.println("Product names starting with 'N' and price greater than 500:");
        filteredProductNames.forEach(System.out::println);
    }
}
