package DI;

import DI.Context.Foo;
import Gateways.OrderRepository;
import Presenter.OrderPresenter;
import UseCase.Order;
import View.IOrderView;
import View.OrderView;

public class Main {

	public static void main(String[] args) {
		Context.register("IOrderRepository", OrderRepository.class);
		Context.register("IOrderView", OrderView.class);
		
		IOrderView orderView = (IOrderView)Context.getBean("IOrderView");
		orderView.say();
	}
}
