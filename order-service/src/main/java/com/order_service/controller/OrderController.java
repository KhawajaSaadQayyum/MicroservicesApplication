package com.order_service.controller;

import com.order_service.model.Order;
import com.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/placeOrder")
    public Order placeOrder(@RequestParam Order order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("/getOrders")
    public List<Order> getOrder(){
        return orderService.getOrders();
    }
}
