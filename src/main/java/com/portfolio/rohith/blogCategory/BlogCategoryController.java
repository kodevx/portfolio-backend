package com.portfolio.rohith.blogCategory;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog-categories")
@CrossOrigin(origins = { "https://rnair.tech/", "http://localhost:8000" })
public class BlogCategoryController {

    BlogCategoryService blogCategoryService;

    BlogCategoryController(BlogCategoryService blogCategoryService) {
        this.blogCategoryService = blogCategoryService;
    }

    @GetMapping("/")
    public Iterable<BlogCategory> getAllCategories(){
        return this.blogCategoryService.getAllBlogCategories();
    }
}
