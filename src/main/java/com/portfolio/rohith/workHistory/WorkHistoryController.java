package com.portfolio.rohith.workHistory;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "https://rnair.tech/", /*"http://localhost:8000"*/ })
@RequestMapping("/work-life")
public class WorkHistoryController {

    public final WorkHistoryService workHistoryService;

    public WorkHistoryController (WorkHistoryService workHistoryService) {
        this.workHistoryService = workHistoryService;
    }

    @GetMapping("/")
    public Iterable<WorkHistory> getWorkHistoryData(){
        return workHistoryService.getWorkHistory();
    }
}
