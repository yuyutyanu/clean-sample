package View;

import ViewModel.orderViewModel;

public class OrderView {
	public void display(orderViewModel viewModel) {
		System.out.println(viewModel.getPrice());
	}
}
