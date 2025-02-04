package com.order.order_service_testing.controller;


import com.order.order_service_testing.entity.Order;

import com.order.order_service_testing.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getAllOrder")
    public ResponseEntity<List<Order>> getAllOrder(){
        List<Order> allOrder = orderService.getAllOrder();
        return new ResponseEntity<>(allOrder, HttpStatus.OK);
    }




    @PostMapping("/saveOrder")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
       return new ResponseEntity<>( orderService.saveOrder(order), HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/id")
    public String deleteOrder(@RequestParam  Long id){

        orderService.deleteOrder(id);
        return "order deleted successfully";


    }
}
