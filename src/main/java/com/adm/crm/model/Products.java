package com.adm.crm.model;

import java.math.BigDecimal;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("products")
public class Products {
	
	@Id
	private String id;
	
	private String name;
	
	private String image;
	
	private int stock;
	
	private BigDecimal price;
	
	private String brand;

}
