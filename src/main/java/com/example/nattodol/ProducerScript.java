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

import java.io.FileWriter;
import java.io.IOException;

public class ProducerScript {
    @FXML
    private Button back;
    @FXML
    private Button Save;
    @FXML
    private TextArea ShowDetails;
    @FXML
    private TextField FileName;

    @FXML
    public void SaveToDisc(ActionEvent event) throws IOException {
        try {
            FileWriter fw = new FileWriter("D:\\NattoDol\\Files\\Script\\Producer "+FileName.getText());

            fw.write(ShowDetails.getText());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void BacktoManagement(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProducerHomeScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Producer Home");
        Stage stagem = (Stage)back.getScene().getWindow();
        stagem.close();
    }

}
