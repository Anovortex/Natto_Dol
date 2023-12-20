package com.example.nattodol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ProducerHomeScreen { @FXML
private Button Logout;
    @FXML
    private  Button UpdateShows;
    @FXML
    private Button ScriptSend;
    @FXML
    private Button ELListing;
    @FXML
    private Button RehearsalTime;
    @FXML
    private Button workProgress;



    @FXML
    public void UpdateOnShows(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProducerShowUpdates.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("New Shows");
        Stage stagem = (Stage) UpdateShows.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void Script(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProducerScript.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Script");
        Stage stagem = (Stage) ScriptSend.getScene().getWindow();
        stagem.close();
    }

    @FXML
    public void ELogisticListing(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProducerLogisticListing.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Emergency Logistic Listings");
        Stage stagem = (Stage) ELListing.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void RehearsalTiming(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProducerRehearsalTiming.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProducerWorkProgress.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle(" Work Progress");
        Stage stagem = (Stage) workProgress.getScene().getWindow();
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

