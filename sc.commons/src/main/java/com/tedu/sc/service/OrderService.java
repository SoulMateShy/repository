package com.tedu.sc.service;


import com.tedu.sc.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}
