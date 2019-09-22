package calculator;

import javafx.application.Application;
import javafx.stage.Stage;

public class Calculator extends Application {
	private CalculatorModel model;
	private CalculatorView view;
	private CalculatorController controller;

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new CalculatorModel();
		view = new CalculatorView(primaryStage,model);
		controller = new CalculatorController(model,view);
		view.start();
		
	}
	

}
