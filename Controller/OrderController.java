package Controller;
import UseCase.OrderInputData;
import UseCase.Order;

public class OrderController {
	public void handle() {
		new Order().handle(new OrderInputData(1000));
	}
}
