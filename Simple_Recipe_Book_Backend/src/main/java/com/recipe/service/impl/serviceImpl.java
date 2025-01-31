package com.recipe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.entity.recipe;
import com.recipe.repository.recipe_repo;

@Service
public class serviceImpl implements service{
	
	@Autowired
	private recipe_repo jpa;
	
	
	@Override
	public recipe addRecipe(recipe rec) {
		// TODO Auto-generated method stub
		return jpa.save(rec);
	}


	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		 jpa.deleteByName(name);
	}


	@Override
	public List<recipe> viewRecipes() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}


	

}
