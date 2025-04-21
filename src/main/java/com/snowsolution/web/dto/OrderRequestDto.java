package com.snowsolution.web.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderRequestDto {
    private LocalDateTime createdAt;
    private String fullName;
    private String email;
    private String name;
    private String phone;
    private String message;


}
