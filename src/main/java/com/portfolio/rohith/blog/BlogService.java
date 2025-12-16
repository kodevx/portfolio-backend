package com.portfolio.rohith.blog;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }

    // Get all Blogs
    public Iterable<Blog> getAllBlogs() {
        return this.blogRepository.findAll();
    }

    // Get a Blog by its ID
    public Optional<Blog> getBlogById(@PathVariable (required = true) Integer id) {
        return this.blogRepository.findById(id);
    }

    // Get all Blogs by their categories
    public Iterable<Blog> getBlogsByCategoryId(Integer id) {
        if(id == 0) {               // 'ALL' Category has got 'id' in front-end which fetches and returns all Blogs
            return this.blogRepository.findAll();
        } else {
            return this.blogRepository.findBlogByCategoryId(id);
        }
    }

    //  Save Blog
    public Blog addBlog (Blog blog) {
        this.blogRepository.save(blog);
        return blog;
    }

    // Update a Blog by its ID
    public Iterable<Blog> update(
            Integer id,
            String blogTitle,
            String blogImageUrl,
            String blogSmallDescription,
            String blogContent,
            String blogAuthor,
            Date blogDate            
    ){
        Optional<Blog> blogToUpdateOptional = this.blogRepository.findById(id);

        if(blogToUpdateOptional.isPresent()) {

            Blog blogToUpdate = blogToUpdateOptional.get();
            
            if(Objects.nonNull(blogTitle)) {
                blogToUpdate.setBlogTitle(blogTitle);
            } else if (Objects.nonNull(blogImageUrl)) {
                blogToUpdate.setBlogImageUrl(blogImageUrl);
            } else if (Objects.nonNull(blogSmallDescription)) {
                blogToUpdate.setBlogSmallDescription(blogSmallDescription);
            } else if (Objects.nonNull(blogContent)){
                blogToUpdate.setBlogContent(blogContent);
            } else if (Objects.nonNull(blogAuthor)){
                blogToUpdate.setBlogAuthor(blogAuthor);
            } else if (Objects.nonNull(blogDate)){
                blogToUpdate.setBlogDate(blogDate);
            }

            this.blogRepository.save(blogToUpdate);

            return this.blogRepository.findAll();

        } else {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Blog with ID \""+id+"\" not found"
            );
        }
    }

    // Delete a blog by its id
    public Iterable<Blog> delete(Integer id){
        blogRepository.deleteById(id);
        return this.blogRepository.findAll();
    }
}
