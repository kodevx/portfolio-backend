package com.portfolio.rohith.workHistory;

import com.portfolio.rohith.blog.Blog;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class WorkHistoryService {

    private final WorkHistoryRepository blogHistoryRepository;

    public WorkHistoryService (WorkHistoryRepository blogHistoryRepository) {
        this.blogHistoryRepository = blogHistoryRepository;
    }

    public Iterable<WorkHistory> getWorkHistory() {
        return this.blogHistoryRepository.findAllByOrderByIdAsc();
    }
}
