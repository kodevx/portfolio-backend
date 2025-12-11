package com.portfolio.rohith.blog;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BlogRepository extends CrudRepository<Blog, Integer> {

    @Query("SELECT b FROM Blog b where b.blogCategory.id = :id")
    public Iterable<Blog> findBlogByCategoryId(@Param("id") Integer Id);
}
