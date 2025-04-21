package com.snowsolution.web.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder // Используем только SuperBuilder
public class ModelRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private LocalDateTime createdAt;
    private String nameProject;
    private String fullName;
    private String name;
    private String email;
    private String phone;
    private String message;

    @Enumerated(EnumType.STRING)
    private SiteType sites;

    private String description;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
    private String status;

    // Определяем enum как отдельный public enum
    public enum SiteType {
        SPA("Одностраничник"),
        MWC("Классический корпоративный сайт"),
        MARKETPLACE("Интернет-магазин");

        private final String description;

        SiteType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
