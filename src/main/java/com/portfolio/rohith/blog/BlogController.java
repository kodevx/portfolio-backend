package com.portfolio.rohith.blog;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/blogs")
@CrossOrigin(origins = { "https://rnair.tech/", "http://localhost:8000" })
public class BlogController {

    private final BlogService blogService;

    BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/")
    public Iterable<Blog> getAllBlogs() {
        return this.blogService.getAllBlogs();
    }

    @GetMapping("/category/{id}")
    public Iterable<Blog> getAllBlogsByCategoryId(@PathVariable(required = true) Integer id) {
        return this.blogService.getBlogsByCategoryId(id);
    }

    @GetMapping("/{id}")
    public Optional<Blog> getBlogById(@PathVariable(required = true) Integer id) {
        return this.blogService.getBlogById(id);
    }

    @PostMapping("/add")
    public Iterable<Blog> addBlog(@RequestBody Blog blog) {
        this.blogService.addBlog(blog);

        return this.blogService.getAllBlogs();
    }

    @PutMapping("/update/{id}")
    public Iterable<Blog> update(
            @PathVariable(required = true) Integer id,
            @RequestParam(required = false) String blogTitle,
            @RequestParam(required = false) String blogImageUrl,
            @RequestParam(required = false) String blogSmallDescription,
            @RequestParam(required = false) String blogContent,
            @RequestParam(required = false) String blogAuthor,
            @RequestParam(required = false) Date blogDate
    ) {
        this.blogService.update(
                id,
                blogTitle,
                blogImageUrl,
                blogSmallDescription,
                blogContent,
                blogAuthor,
                blogDate
        );

        return this.blogService.getAllBlogs();
    }


    @DeleteMapping("/delete/{id}")
    public Iterable<Blog> deleteBlog(@PathVariable Integer id) {
        this.blogService.delete(id);

        return this.blogService.getAllBlogs();
    }
}
