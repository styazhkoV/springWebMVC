package com.snowsolution.web.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderRequestDto {
    private Long orderId;

    @NotBlank(message = "Имя проекта не может быть пустым")
    private String nameProject;

    @NotBlank(message = "ФИО не может быть пустым")
    private String fullName;

    private String name;

    @NotBlank(message = "Email обязателен")
    @Email(message = "Неверный формат email")
    private String email;

    @NotBlank(message = "Телефон обязателен")
    private String phone;

    private String message;
    private String description;
    private String status;

    private String createdBy;
    private String updatedBy;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
