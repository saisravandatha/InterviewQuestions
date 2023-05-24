package com.javagudies.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	
	public static void main(String[] args) {
		   getProducts().stream()
				.filter(e -> e.getPrice() > 25000f)
				.collect(Collectors.toList()).forEach(System.out::println);//Method Reference
	}
	
	private static List<Product> getProducts() {
		
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 54000f));
		productsList.add(new Product(2, "Mobile", 25000f));
		productsList.add(new Product(3, "Printer", 36000f));
		productsList.add(new Product(4, "Books", 4000f));
		productsList.add(new Product(5, "xbox", 64000f));
		
		return productsList;
	}

}

class Product {
	
	private int id;
	private String name;
	private float price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}