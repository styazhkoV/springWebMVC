package com.snowsolution.web.repository;

import com.snowsolution.web.entity.ModelRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRequestRepository extends CrudRepository<ModelRequest, Long> {
}