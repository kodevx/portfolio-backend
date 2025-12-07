package com.portfolio.rohith.blog;

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
    @Column(name="blog_id")
    private Integer blogId;

    @Column(name="blog_title")
    private String blogTitle;

    @Column(name="blog_image_url")
    private String blogImageUrl;

    @Column(name="blog_small_description")
    private String blogSmallDescription;

    @Column(name="blog_content")
    private String blogContent;

    @Column(name="blog_author")
    private String blogAuthor;

    @Column(name="blog_date")
    private Date blogDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "blog_category_id", referencedColumnName = "BLOG_CATEGORY_ID")
    private BlogCategory blogCategory;

}
