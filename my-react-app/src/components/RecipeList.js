import React, { useState, useEffect } from "react";
import axios from "axios";
import './RecipeList.css';  // Import the CSS file

const RecipeList = () => {
    const [recipes, setRecipes] = useState([]);

    useEffect(() => {
        fetchRecipes();
    }, []);

    const fetchRecipes = async () => {
        try {
            const response = await axios.get("http://localhost:8080/recipes");
            setRecipes(response.data);
        } catch (error) {
            console.error("Error fetching recipes:", error);
        }
    };

    const deleteRecipe = async (name) => {
        try {
            await axios.delete(`http://localhost:8080/delete/${name}`);
            alert("Recipe deleted successfully!");
            fetchRecipes(); // Refresh the list after deleting
        } catch (error) {
            alert("Error deleting recipe");
            console.error("Delete error:", error);
        }
    };

    return (
        <div className="recipe-list-container">
            <h2 className="recipe-list-title">Recipe List</h2>
            <ul className="recipe-list">
                {recipes.map((recipe, index) => (
                    <li key={index}>
                        {recipe.name}
                        <button 
                            className="delete-button" 
                            onClick={() => deleteRecipe(recipe.name)}>
                            Delete
                        </button>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default RecipeList;
