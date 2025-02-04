package com.order.order_service_testing.service;

import com.order.order_service_testing.entity.Order;
import com.order.order_service_testing.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {

       return orderRepository.save(order);
    }
}
