package com.example.nattodol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LogisticsHomeScreen {
    @FXML
    private Button LNeeded;
    @FXML
    private Button Logout;
    @FXML
    private  Button UpdateShows;
    @FXML
    private Button LogisticR;
    @FXML
    private Button LogisticS;
    @FXML
    private Button LListing;

    @FXML
    private Button workProgress;



    @FXML
    public void UpdateOnShows(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticsShowUpdates.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("New Shows");
        Stage stagem = (Stage) UpdateShows.getScene().getWindow();
        stagem.close();
    }



    @FXML
    public void LogisticListing(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticsLogisticListing.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Logistic Listings");
        Stage stagem = (Stage) LListing.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void LogisticNeeded(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticsLogisticsNeeded.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Logistic Needed");
        Stage stagem = (Stage) LNeeded.getScene().getWindow();
        stagem.close();
    }

    @FXML
    public void LogisticReceived(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticReceived.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Logistic Received");
        Stage stagem = (Stage) LogisticR.getScene().getWindow();
        stagem.close();
    }
    @FXML
    public void LogisticSend(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticSend.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Logistic Send");
        Stage stagem = (Stage) LogisticS.getScene().getWindow();
        stagem.close();
    }

    @FXML
    public void WorkProgress(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticWorkProgress.fxml"));
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


