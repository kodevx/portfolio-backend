package com.portfolio.rohith.blogCategory;

import org.springframework.stereotype.Service;

@Service
public class BlogCategoryService {

    BlogCategoryRepository blogCategoryRepository;

    BlogCategoryService(BlogCategoryRepository blogCategoryRepository) {
        this.blogCategoryRepository = blogCategoryRepository;
    }

    public Iterable<BlogCategory> getAllBlogCategories() {
        return this.blogCategoryRepository.findAll();
    }
}
