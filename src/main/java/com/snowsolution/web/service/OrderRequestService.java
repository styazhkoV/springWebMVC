package com.snowsolution.web.service;

import com.snowsolution.web.dto.OrderRequestDto;
import com.snowsolution.web.entity.ModelRequest;
import com.snowsolution.web.repository.OrderRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
@RequiredArgsConstructor
public class OrderRequestService {
    private final OrderRequestRepository repository;

    public void save(OrderRequestDto dto) {
        ModelRequest entity = ModelRequest.builder()
                .orderId(dto.getOrderId())
                .nameProject(dto.getNameProject())
                .name(dto.getName())
                .fullName(dto.getFullName())
                .phone(dto.getPhone())
                .email(dto.getEmail())
                .status(dto.getStatus())
                .message(dto.getMessage())
                .description(dto.getDescription())
                .createdAt(LocalDateTime.now())
                .createdBy(dto.getCreatedBy())
                .updatedAt(LocalDateTime.now())
                .updatedBy(dto.getUpdatedBy())
                .build();
        repository.save(entity);
    }

}
