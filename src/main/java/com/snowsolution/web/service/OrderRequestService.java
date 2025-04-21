package com.snowsolution.web.service;

import com.snowsolution.web.dto.OrderRequestDto;
import com.snowsolution.web.model.OrderRequest;
import com.snowsolution.web.repository.OrderRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class OrderRequestService {
    private final OrderRequestRepository repository;

    public void save(OrderRequest orderRequest) {
        orderRequest.setCreatedAt(LocalDateTime.now());
        repository.save(orderRequest);
    }
}
