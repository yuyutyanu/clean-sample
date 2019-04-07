package Gateways;

import Entity.Order;

public class InMemoryOrderRepository implements IOrderRepository{
	@Override
	public Order save(Integer price) {
		Order order = new Order();
		//InMemory db save price
		return order;
	}
	@Override
	public Order findById(Integer id) {
		return new Order();
	}
}
