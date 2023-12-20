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
import java.io.IOException;
import java.util.Scanner;

public class AccountsWorkPlan {
    @FXML
    private Button back;

    @FXML
    private TextArea FileRead;
    @FXML
    private TextField FileName;

    @FXML
    private void ReadTextFile(ActionEvent event){
        FileRead.setText("");
        File f = null;
        Scanner sc; String str;
        try{
            f =new File("D:\\NattoDol\\Files\\Workplan\\" +FileName.getText());
            sc = new Scanner(f);
            if (f.exists()){
                FileRead.appendText("Content is :");
                while(sc.hasNextLine()){
                    str = sc.nextLine();
                    FileRead.appendText(str);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void BacktoManagement(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AccountsHomeScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Accounts Home");
        Stage stagem = (Stage)back.getScene().getWindow();
        stagem.close();
    }
}
