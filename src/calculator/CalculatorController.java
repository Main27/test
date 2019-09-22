package calculator;

public class CalculatorController {
	
	final private CalculatorModel model;
	final private CalculatorView view;

	protected CalculatorController(CalculatorModel model, CalculatorView view) {
		this.view = view;
		this.model=model;
		
		view.btn1.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(1));
		});
		view.btn2.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(2));
		});
		view.btn3.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(3));
		});
		view.btn4.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(4));
		});
		view.btn5.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(5));
		});
		view.btn6.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(6));
		});
		view.btn7.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(7));
		});
		view.btn8.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(8));
		});
		view.btn9.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(9));
		});
		view.btn0.setOnAction((event)->{
			view.lblDisplay.setText(model.addNumber(0));
		});
		view.btnErase.setOnAction((event)->{
			view.lblDisplay.setText(model.erase());
		});
		view.btnPlus.setOnAction((event)->{
			view.lblDisplay.setText(model.addition())
			;
		});
		view.btnEquals.setOnAction((event)->{
			view.lblDisplay.setText(model.equals());
			model.eraseSum();
		});
		
	}

}
