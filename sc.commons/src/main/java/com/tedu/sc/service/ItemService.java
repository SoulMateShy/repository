package com.tedu.sc.service;

import java.util.List;

import com.tedu.sc.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}