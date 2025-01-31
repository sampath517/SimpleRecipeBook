import React from "react";
import RecipeList from "./components/RecipeList";
import AddRecipe from "./components/AddRecipe";

const App = () => {
  return (
    <div>
      <h1>Recipe Management</h1>
      <AddRecipe />
      <RecipeList />
    </div>
  );
};

export default App;
