import axios from "axios";

const API_URL = "http://localhost:8080"; // Your Spring Boot backend URL

const RecipeService = {
  getAllRecipes: () => axios.get(`${API_URL}/`), // Fetch all recipes
  addRecipe: (recipe) => axios.post(`${API_URL}/insert`, recipe), // Insert new recipe
  deleteRecipe: (name) => axios.delete(`${API_URL}/delete/${name}`), // Delete by name
};

export default RecipeService;
