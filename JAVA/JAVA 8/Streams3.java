package java8;

import java.util.ArrayList;
import java.util.List;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Streams3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product1> productsList = new ArrayList<Product1>();
		
		productsList.add(new Product1(1,"HP Laptop",25000f));
		productsList.add(new Product1(2,"Dell Laptop",30000f));
		productsList.add(new Product1(3,"Lenovo Laptop",28000f));
		productsList.add(new Product1(4,"Sony Laptop",28000f));
		productsList.add(new Product1(5,"Apple Laptop",90000f));
		
		Float totalPrice = productsList.stream().map(product1 -> product1.price).reduce(0.0f, (sum,price)->sum+price);
		Float totalPrice2 = productsList.stream().map(product1 -> product1.price).reduce(0.0f, Float::sum);
		
		System.out.println(totalPrice2);
		System.out.println(totalPrice);
	}

}
