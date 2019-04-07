package Gateways;

import Entity.Order;

public interface IOrderRepository {
	public Order save(Integer price);
	public Order findById(Integer id);
}
