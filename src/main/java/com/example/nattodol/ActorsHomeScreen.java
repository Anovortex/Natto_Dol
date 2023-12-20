package com.example.nattodol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ActorsHomeScreen {
    @FXML
    private Button Logout;
    @FXML
    private  Button UpdateShows;
    @FXML
    private Button CScript;

    @FXML
    private Button RehearsalTime;




    @FXML
    public void UpdateOnShows(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ActorsShowUpdates.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("New Shows");
        Stage stagem = (Stage) UpdateShows.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void Cscript(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ActorsCheckScript.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Work Plan");
        Stage stagem = (Stage) CScript.getScene().getWindow();
        stagem.close();
    }



    @FXML
    public void RehearsalTiming(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ActorsRehearsalTiming.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Rehearsal Timing");
        Stage stagem = (Stage) RehearsalTime.getScene().getWindow();
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

