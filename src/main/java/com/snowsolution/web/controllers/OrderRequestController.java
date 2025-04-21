package com.snowsolution.web.controller;

import com.snowsolution.web.dto.OrderRequestDto;
import com.snowsolution.web.service.OrderRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1/order")
@RequiredArgsConstructor
public class OrderRequestController {

    private final OrderRequestService service;

    @PostMapping("/api/v1/order/createOrder")
    public ResponseEntity<String> createOrder(@RequestBody OrderRequestDto dto) {
        service.save(dto);
        return ResponseEntity.ok("Заявка успешно сохранена");
    }

    @GetMapping("api/v1/checkOrderEndpoint")
    public ResponseEntity<String> checkOrderEndpoint() {
        return ResponseEntity.ok("Путь /order работает");
    }
    @GetMapping("/Order")
    public String showForm() {
        return "Order"; // имя HTML-файла из папки templates, если ты используешь Thymeleaf
    }
    @Controller("/Error")
    public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

        @RequestMapping("/error")
        public String handleError() {
            return "Error"; // возвращает шаблон error.html
        }
    }


}
