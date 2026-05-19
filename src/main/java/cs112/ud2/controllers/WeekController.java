package cs112.ud2.controllers;

import cs112.ud2.MainApplication;
import cs112.ud2.models.Week;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

import java.io.IOException;
public class WeekController {
    public static final int MONDAY_INDEX_VAL = 0;
    public static final int TUESDAY_INDEX_VAL = 1;
    public static final int WEDNESDAY_INDEX_VAL = 2;
    public static final int THURSDAY_INDEX_VAL = 3;
    public static final int FRIDAY_INDEX_VAL = 4;
    public static final int SATURDAY_INDEX_VAL = 5;
    public static final int SUNDAY_INDEX_VAL = 6;

    @FXML

    private Button editButtonMonday;

    @FXML
    private Button editButtonTuesday;

    @FXML
    private Button editButtonThursday;
    @FXML
    private Button editButtonWednesday;
    @FXML
    private Button editButtonFriday;
    @FXML
    private Button editButtonSaturday;
    @FXML
    private Button editButtonSunday;








    @FXML
    protected void onEditButtonMondayClick() throws IOException{
        workoutOpener(MONDAY_INDEX_VAL);
    }
    @FXML
    protected void onEditButtonTuesdayClick() throws IOException{
        workoutOpener(TUESDAY_INDEX_VAL);
    }
    @FXML
    protected void onEditButtonWednesdayClick() throws IOException{
        workoutOpener(WEDNESDAY_INDEX_VAL);
    }
    @FXML
    protected void onEditButtonThursdayClick() throws IOException{
        workoutOpener(THURSDAY_INDEX_VAL);
    }
    @FXML
    protected void onEditButtonFridayClick()throws IOException {
        workoutOpener(FRIDAY_INDEX_VAL);
    }
    @FXML
    protected void onEditButtonSaturdayClick()throws IOException {
        workoutOpener(SATURDAY_INDEX_VAL);
    }
    @FXML
    protected void onEditButtonSundayClick()throws IOException {
        workoutOpener(SUNDAY_INDEX_VAL);
    }

    @FXML
    protected void workoutOpener(int dayIndex)throws IOException{
        System.out.println("workoutOpener");

        //get FMXL file for popup
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("newWorkout-view.fxml"));
        Parent newWorkoutViewParent = loader.load();
        //pass info to workout controller
        NewWorkoutController newWorkoutController = loader.getController();
        newWorkoutController.dayIndexData(dayIndex);
        //create new stage for popup
        Stage popupStage = new Stage();
        //extra step: change modality, appmodal means it is the only window to interact with
        popupStage.initModality(Modality.APPLICATION_MODAL);
        //set scene
        popupStage.setScene(new Scene(newWorkoutViewParent));
        //show scene
        popupStage.show();
    }



}
