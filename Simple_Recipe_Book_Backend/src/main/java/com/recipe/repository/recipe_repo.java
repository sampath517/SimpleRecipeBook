package com.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recipe.entity.recipe;

import jakarta.transaction.Transactional;

@Repository
public interface recipe_repo extends JpaRepository<recipe, String>{
	
	
	 @Transactional
	  public void deleteByName(String name); 
}
