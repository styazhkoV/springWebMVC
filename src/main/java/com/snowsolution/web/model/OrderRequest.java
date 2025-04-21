package com.snowsolution.web.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class OrderRequest {
    private Long id;

    private String fullName;
    private String email;
    private String phone;
    private String siteType; // "Сайт-визитка", "Интернет-магазин" и т.д.
    private String description;
    private String setCreateAt;
    private LocalDateTime createdAt;


}
