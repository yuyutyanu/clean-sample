package UseCase;

import Entity.CalcSaleTax;
import Gateways.OrderRepository;
import Presenter.OrderPresenter;
import UseCase.OrderOutputData;

public class Order implements IOrder{
	
	// DI : repository, presenter
	public void handle(OrderInputData inputData) {
		Integer price = new CalcSaleTax().handle(inputData.getPrice());
		Entity.Order order = new OrderRepository().save(price);
		new OrderPresenter().responseOutput(new OrderOutputData(order.getPrice()));
	}
}
