package com.devsuperior.componenteinjecaodependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.componenteinjecaodependencia.entity.Order;
import com.devsuperior.componenteinjecaodependencia.service.OrderService;

@SpringBootApplication
public class ComponenteInjecaoDependenciaApplication  implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponenteInjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150, 20);
		
		orderService.total(order1);
		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order1));

		Order order2 = new Order(2282, 800, 10);
		orderService.total(order2);
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order2));

		Order order3 = new Order(1309, 95.90, 0);
		orderService.total(order3);
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order3));
	}

}
