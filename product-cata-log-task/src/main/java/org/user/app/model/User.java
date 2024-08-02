package org.user.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	
	
	@NotBlank(message="Name is mandatory")
	@Column(name="name")
	private String product_name;
	
	
	private double price;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotBlank(message="catalog is mandatory")
	@Column(name="catalog")
	private long catalog;

}
