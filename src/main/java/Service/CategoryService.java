package Service;

import Models.Category;
import Repo.CategoryRepo;

import java.util.List;
import java.util.Optional;

public class CategoryService {
    private CategoryRepo categoryRepo;
    public void createCategory(Category category){
        categoryRepo.save(category);
    }

    public List<Category> getAllCategories(){
        List<Category> list = this.categoryRepo.findAll();
        return  list;
    }

    public Optional<Category> getCategoryByID(Integer id){
        Optional<Category> category = this.categoryRepo.findById(id);
        return category;
    }

}
