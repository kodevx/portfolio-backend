package com.portfolio.rohith.blogCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @Column(name="blog_category_id")
    @JsonProperty("id")
    private Integer blogCategoryId;

    @Column(name="blog_category_name")
    @JsonProperty("name")
    private String blogCategoryName;

    @Column(name="blog_category_color")
    @JsonProperty("color")
    private String blogCategoryColor;

}
