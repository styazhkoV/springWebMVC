package com.snowsolution.web.repository;
import com.snowsolution.web.service.OrderRequestService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRequestRepository extends JpaRepository<OrderRequestService, Long> {

}
