package com.portfolio.rohith.workHistory;

import org.springframework.data.repository.CrudRepository;

public interface WorkHistoryRepository extends CrudRepository<WorkHistory, Integer> {

    public Iterable<WorkHistory> findAllByOrderByIdAsc();
}
