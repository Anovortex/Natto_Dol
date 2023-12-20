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

import java.io.*;
import java.util.Scanner;

public class WorkProgress {
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
            FileWriter fw = new FileWriter("D:\\NattoDol\\Files\\Work Progress\\Managements " +FileName.getText());

            fw.write(WorkProgress.getText());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

       @FXML
       private void ReadTextFile(ActionEvent event){
        FileRead.setText("");
        File f = null;
        Scanner sc; String str;
        try{
            f =new File("D:\\NattoDol\\Files\\Work Progress\\" +FileName.getText());
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ManagementHomeScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Management Home");
        Stage stagem = (Stage)back.getScene().getWindow();
        stagem.close();
    }

}

