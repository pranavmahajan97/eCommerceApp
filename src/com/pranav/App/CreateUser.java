package com.pranav.App;

public class CreateUser {
	int cID;
	String name;
	long mobile;
	String email;
	String product;
	int quantity;
	int price;
	
	
	
	public CreateUser() {
		super();
	}

	
	public CreateUser(int cID, String name, long mobile, String email, String product, int quantity, int price) {
		super();
		this.cID = cID;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}


	public int getcID() {
		return cID;
	}


	public void setcID(int cID) {
		this.cID = cID;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	

}
