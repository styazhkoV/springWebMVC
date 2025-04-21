package com.snowsolution.web.model;
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
    private String description;
    private String setCreateAt;
    private LocalDateTime createdAt;


}
