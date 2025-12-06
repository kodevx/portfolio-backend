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
    @Column(name="BLOG_ID")
    private Integer blogId;

    @Column(name="BLOG_TITLE")
    private String blogTitle;

    @Column(name="BLOG_IMAGE_URL")
    private String blogImageUrl;

    @Column(name="BLOG_SMALL_DESCRIPTION")
    private String blogSmallDescription;

    @Column(name="BLOG_CONTENT")
    private String blogContent;

    @Column(name="BLOG_AUTHOR")
    private String blogAuthor;

    @Column(name="BLOG_DATE")
    private Date blogDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "blog_category_id", referencedColumnName = "blogCategoryId")
    private BlogCategory blogCategory;

}
