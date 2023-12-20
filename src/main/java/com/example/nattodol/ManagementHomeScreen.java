package com.example.nattodol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;



public class ManagementHomeScreen {
    @FXML
    private Button Logout;
    @FXML
    private  Button UpdateShows;
    @FXML
    private Button Workplan;
    @FXML
    private Button LListing;
    @FXML
    private Button RehearsalTime;
    @FXML
    private Button workProgress;
    @FXML
    private Button ELN;



    @FXML
    public void UpdateOnShows(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UpdateOnShows.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("New Shows");
        Stage stagem = (Stage) UpdateShows.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void WorkPlan(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkPlan.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Work Plan");
        Stage stagem = (Stage) Workplan.getScene().getWindow();
        stagem.close();
    }

    @FXML
    public void LogisticListing(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticListing.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Logistic Listings");
        Stage stagem = (Stage) LListing.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void RehearsalTiming(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RehearsalTiming.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Rehearsal Timing");
        Stage stagem = (Stage) RehearsalTime.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void WorkProgress(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WorkProgress.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle(" Work Progress");
        Stage stagem = (Stage) workProgress.getScene().getWindow();
        stagem.close();
    }@FXML
    public void ExtraLogistics(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ManagementExtraLogistics.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle(" Extra Logistics Needed");
        Stage stagem = (Stage) ELN.getScene().getWindow();
        stagem.close();
    }


    @FXML
    public void UserLogout(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogInScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("XYZ Natto Dol Login");
        Stage stagem = (Stage)Logout.getScene().getWindow();
        stagem.close();
    }


}
