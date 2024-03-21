package com.zomato.Zomato.entity;


public class categories {

	
	private boolean availability;
    private String photoUrl;
    private String price;
    private String Id;
    private String Name;
    
    
	public categories() {
		super();
		// TODO Auto-generated constructor stub
	}


	public categories(boolean availability, String photoUrl, String price, String id, String Name) {
		super();
		this.availability = availability;
		this.photoUrl = photoUrl;
		this.price = price;
		Id = id;
		this.Name = Name;
	}


	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public String getPhotoUrl() {
		return photoUrl;
	}


	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getShopName() {
		return Name;
	}


	public void setShopName(String shopName) {
		this.Name = shopName;
	}


	@Override
	public String toString() {
		return "service [availability=" + availability + ", photoUrl=" + photoUrl + ", price=" + price + ", Id=" + Id
				+ ", shopName=" + Name + "]";
	}
	
	
}
