package com.zomato.Zomato.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.zomato.Zomato.entity.categories;

@Service
public class categoriesImpl implements categoriesServ {

	List<categories> list;
	 String[] data = {"Cake", "Dosa", "Idly", "Pizza", "Sandwich"};
	 
	 public categoriesImpl() {
		list  = new ArrayList<>();
		list.add(new categories(true,"https://cdn.shopify.com/s/files/1/0362/1653/articles/Birthday_Cake_Square_5_1400x.progressive.jpg?v=1505903378","","01","Cake"));
		list.add(new categories(true,"https://www.indianpolitics.co.in/wp-content/uploads/2021/02/dosa_c.jpg","","02","Dosa"));
		list.add(new categories(true,"https://st1.latestly.com/wp-content/uploads/2020/03/idli.jpg","","03","Idly"));
		list.add(new categories(true,"https://wallpaperaccess.com/full/2237015.jpg","","04","Pizza"));
		list.add(new categories(true,"https://wallpaperaccess.com/full/1727371.jpg","","05","Sandwich"));
	 }
	@Override
	public List<categories> getCat() {
		return list;
	}
	
	


}
