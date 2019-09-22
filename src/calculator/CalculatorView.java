package calculator;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class CalculatorView {
	protected Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnEquals,btnErase;
	protected Label lblDisplay, spacer1;
	private Stage stage;
	private CalculatorModel model;

	protected CalculatorView(Stage primaryStage, CalculatorModel model) {
		this.stage = primaryStage;
		this.model =model;
		GridPane buttons = new GridPane();
	
		BorderPane root = new BorderPane();
		
		lblDisplay = new Label ("0");
		btn0 = new Button ("0");
		btn1 = new Button("1");
		btn2 = new Button ("2");
		btn3 = new Button ("3");
		btn4 = new Button ("4");
		btn5 = new Button ("5");
		btn6 = new Button ("6");
		btn7 = new Button ("7");
		btn8 = new Button ("8");
		btn9 = new Button ("9");
		btnPlus = new Button("+");
		btnEquals = new Button ("=");
		btnErase = new Button ("C");
		spacer1=new Label("");
		
		root.setTop(lblDisplay);
		//buttons.add(spacer1, 1, 1);
		buttons.add(btn7, 1, 0);
		buttons.add(btn8, 2, 0);
		buttons.add(btn9, 3, 0);
		buttons.add(btnPlus, 4, 0);
		buttons.add(btn4, 1, 1);
		buttons.add(btn5, 2, 1);
		buttons.add(btn6, 3, 1);
		buttons.add(btnErase, 4, 1);
		buttons.add(btn1, 1, 2);
		buttons.add(btn2, 2, 2);
		buttons.add(btn3, 3, 2);
		buttons.add(btn0, 1, 3, 3, 1);
		buttons.add(btnEquals, 4, 2,1,2);
		
		
		
		root.setCenter(buttons);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("Calculator.css").toExternalForm());
		stage.setScene(scene);
		
	}

	public void start() {
		stage.show();
		
	}

}
