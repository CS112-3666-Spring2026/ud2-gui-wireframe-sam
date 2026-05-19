package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import cs112.ud2.models.Week;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.ud2.models.Singleton.week;

public class NewWorkoutController {
    //passing in which day the user clicked on to add the workout
    public void dayIndexData(int index){
        dayIndex = index;
        System.out.println("week index passing to workout controller: " + dayIndex);
    }

    private int dayIndex;




    @FXML
    private Button swimButton;

    @FXML
    private Button weightsButton;


    @FXML
    protected void onSwimButtonClick(ActionEvent actionEvent) throws IOException {
        //


        //get swim view as a scene
        Parent swimView = FXMLLoader.load(MainApplication.class.getResource("swim-view.fxml"));
        Scene swimViewScene = new Scene(swimView);
        // get stage
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        //set scene to swim
        window.setScene(swimViewScene);
        //show the stage
        window.show();
    }
    @FXML
    protected void onWeightsButtonClick(ActionEvent actionEvent) throws IOException {
        //get weights view as a scene
        Parent mapView = FXMLLoader.load(MainApplication.class.getResource("weights-view.fxml"));
        Scene mapViewScene = new Scene(mapView);
        // get stage
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        //set scene to weights
        window.setScene(mapViewScene);
        //show the stage
        window.show();
    }


}
