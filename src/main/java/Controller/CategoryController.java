package Controller;

import Models.Category;
import Service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CategoryController {
    @GetMapping("/hello/V2") public String hello(){
        String a = "Hello";
        return a;
    }

//    @GetMapping("/categories") public List<Category> getAllCategories(){
//       Service
//        return "";
//    }
}
