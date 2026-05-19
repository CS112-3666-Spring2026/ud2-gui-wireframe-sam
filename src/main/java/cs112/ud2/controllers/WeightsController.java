package cs112.ud2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class WeightsController {
    @FXML
    private Button weightsAddButton;

    @FXML
    private Button weightsSaveButton;



    @FXML
    protected void onWeightsAddButtonClick() {
        System.out.println("weights add button clicked");
    }
    @FXML
    protected void onWeightsSaveButtonClick() {
        System.out.println("weights save button clicked");
    }
    @FXML
    protected void onWeightsBackClick(){
        System.out.println("weights back button clicked");
    }
}
