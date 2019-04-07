package Gateways;

import Entity.Order;

public class OrderRepository implements IOrderRepository{
	@Override
	public Order save(Integer price) {
		Order order = new Order();
		//db save price
		return order;
	}
	@Override
	public Order findById(Integer id) {
		return new Order();
	}
}
