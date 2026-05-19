package cs112.ud2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SwimController {
    @FXML
    private Button swimAddButton;

    @FXML
    private Button swimSaveButton;



    @FXML
    protected void onSwimAddButtonClick() {
        System.out.println("swim add button clicked");
    }
    @FXML
    protected void onSwimSaveButtonClick() {
        System.out.println("swim save button clicked");
    }
    @FXML
    protected void onSwimBackClick(){
        System.out.println("swim back button clicked");
    }

}
