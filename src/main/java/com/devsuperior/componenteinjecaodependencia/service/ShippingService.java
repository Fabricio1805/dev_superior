package com.devsuperior.componenteinjecaodependencia.service;

import org.springframework.stereotype.Service;

import com.devsuperior.componenteinjecaodependencia.entity.Order;

@Service
public class ShippingService {

    /**
     * @param order
     * @return
     */
    public double shipment(Order order) {

        if (order.getBasic() < 100) {
            // o frete é 20
            return order.getBasic() + 20;
        }else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
            // o frete é 12,00 
            return order.getBasic() + 12;
        }

        return order.getBasic();
    }
}
