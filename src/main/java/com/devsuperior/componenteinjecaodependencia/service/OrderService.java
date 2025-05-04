package com.devsuperior.componenteinjecaodependencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.componenteinjecaodependencia.entity.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    
    public double total(Order order) {
        double discount = order.getBasic() * (order.getDiscount() / 100);
        return shippingService.shipment(order) - discount;
    }
}
