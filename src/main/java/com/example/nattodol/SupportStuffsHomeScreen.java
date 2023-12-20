package com.example.nattodol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SupportStuffsHomeScreen {
        @FXML
        private Button Logout;
        @FXML
        private  Button UpdateShows;
        @FXML
        private Button LRecieved;

        @FXML
        private Button EESL;
        @FXML
        private Button workProgress;



        @FXML
        public void UpdateOnShows(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SSShowUpdates.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stage.setTitle("New Shows");
            Stage stagem = (Stage) UpdateShows.getScene().getWindow();
            stagem.close();
        }


        @FXML
        public void LogisticRecieved(ActionEvent event) throws IOException{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SSLogisticListing.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stage.setTitle("Logistic Listings");
            Stage stagem = (Stage) LRecieved.getScene().getWindow();
            stagem.close();
        }
        @FXML
        public void ELogistics(ActionEvent event) throws IOException{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SSELogistics.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            stage.setTitle("Emergency Logistics");
            Stage stagem = (Stage) EESL.getScene().getWindow();
            stagem.close();
        }
        @FXML
        public void WorkProgress(ActionEvent event) throws IOException{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SSWorkProgress.fxml"));
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
