package com.recipe.service.impl;

import java.util.List;

import com.recipe.entity.recipe;

public interface service {

	public abstract recipe addRecipe(recipe rec);

	public abstract void delete(String name);

	public List<recipe>viewRecipes();

	
}
