package com.recipe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class recipe {
	
	@Id
	private String name;
	private String ingredients;
	
	public recipe(String name, String ingredients) {
		super();
		this.name = name;
		this.ingredients = ingredients;
	}

	public recipe() {
		super();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "recipe [name=" + name + ", ingredients=" + ingredients + "]";
	}
	
	

}
