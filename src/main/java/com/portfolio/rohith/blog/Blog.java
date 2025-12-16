package com.portfolio.rohith.blog;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portfolio.rohith.blogCategory.BlogCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    @Column(name="blog_id")
    private Integer blogId;

    @Column(name="blog_title")
    @JsonProperty("title")
    private String blogTitle;

    @Column(name="blog_image_url")
    @JsonProperty("image_url")
    private String blogImageUrl;

    @Column(name="blog_small_description")
    @JsonProperty("short_description")
    private String blogSmallDescription;

    @Column(name="blog_content")
    @JsonProperty("html_content")
    private String blogContent;

    @Column(name="blog_author")
    @JsonProperty("author")
    private String blogAuthor;

    @Column(name="blog_date")
    @JsonProperty("date")
    private Date blogDate;

    @OneToOne(cascade = CascadeType.MERGE)
    @JsonProperty("category")
    @JoinColumn(name = "blog_category_id", referencedColumnName = "blog_category_id")
    private BlogCategory blogCategory;
}
