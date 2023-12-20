package com.example.nattodol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LogisticWorkProgress {

    @FXML
    private Button back;

    @FXML
    private TextArea WorkProgress;
    @FXML
    private TextField FileName;
    @FXML
    private TextArea FileRead;

    @FXML
    public void SaveToDisc(ActionEvent event) throws IOException {
        try {
            FileWriter fw = new FileWriter("D:\\NattoDol\\Files\\Work Progress\\Logistics " +FileName.getText());

            fw.write(WorkProgress.getText());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void BacktoManagement(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticsHomeScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Logistics Home");
        Stage stagem = (Stage)back.getScene().getWindow();
        stagem.close();
    }

}

