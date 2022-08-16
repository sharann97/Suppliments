package com.training.model;

public class Suppliments {
 private String brand;
 private  int prodcuctNo;
 private  double price;
 private  String category;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getProdcuctNo() {
	return prodcuctNo;
}
public void setProdcuctNo(int prodcuctNo) {
	this.prodcuctNo = prodcuctNo;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "Suppliments [brand=" + brand + ", prodcuctNo=" + prodcuctNo + ", price=" + price + ", category=" + category
			+ "]";
}

}
