package Presenter;

import UseCase.OrderOutputData;
import ViewModel.orderViewModel;

public class OrderPresenter implements IOrderPresenter{
	//DI : viewModel
	@Override
	public void responseOutput(OrderOutputData outputData) {
		new orderViewModel().setPrice("*"+ outputData.getPrice() +"*");
	}
}
