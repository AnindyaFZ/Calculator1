package com.anindya.calculator1;

import javafx.event.ActionEvent;
import javafx.scene.SnapshotResult;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator1Controller
{

    @javafx.fxml.FXML
    private TextField textfieldone;
    @javafx.fxml.FXML
    private TextField textfieldtwo;
    @javafx.fxml.FXML
    private Label answerlabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addbuttonOnaction(ActionEvent actionEvent) {
        String numOne = textfieldone.getText();
        String numTwo = textfieldtwo.getText();

        int num1= Integer.parseInt(numOne);
        int num2= Integer.parseInt(numTwo);

        int num3= num1+num2;
        String numthree= Integer.toString(num3);

        answerlabel.setText(numthree);






    }

    @javafx.fxml.FXML
    public void subbuttonOnaction(ActionEvent actionEvent) {

            String numOne = textfieldone.getText();
            String numTwo = textfieldtwo.getText();

            int num1= Integer.parseInt(numOne);
            int num2= Integer.parseInt(numTwo);

            int num3= num1-num2;
            String numthree= Integer.toString(num3);

            answerlabel.setText(numthree);


    }
}