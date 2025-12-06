package com.portfolio.rohith.blogCategory;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="blogcategories")
public class BlogCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BLOG_CATEGORY_ID")
    private Integer blogCategoryId;

    @Column(name="BLOG_CATEGORY_NAME")
    private String blogCategoryName;

    @Column(name="BLOG_CATEGORY_COLOR")
    private String blogCategoryColor;

}
