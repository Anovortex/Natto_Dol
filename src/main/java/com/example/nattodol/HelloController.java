package com.example.nattodol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class HelloController implements Initializable {

    @FXML
    private ImageView Logo;
    @FXML
    private TextField UserName;
    @FXML
    private TextField Password;
    @FXML
    private ComboBox UserDepartment;
    @FXML
    private Button UserLogin;
    @FXML
    private Label WarningLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        UserDepartment.getItems().addAll("Management", "Accounts", "Logistics", "Producer/Director", "Support Stuffs", "Actors");
    }

    @FXML
    protected void LoginButtonOnCLick(ActionEvent event) throws IOException {
        Management mn = new Management();
        Accounts ac = new Accounts();
        Logistics ls = new Logistics();
        Producer pd = new Producer();
        SupportStuffs ss = new SupportStuffs();
        Actors act = new Actors();


        try {

            if ("Management".equals(UserDepartment.getValue().toString()) && UserName.getText().toString().equals("Management") && Password.getText().toString().equals("4321")) {
                WarningLogin.setText("Login Successful!");
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ManagementHomeScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stage.setTitle("Management Home");
                Stage stagem = (Stage) UserLogin.getScene().getWindow();
                stagem.close();

            }
            

            else if ("Accounts".equals(UserDepartment.getValue().toString()) && UserName.getText().toString().equals("Accounts") && Password.getText().toString().equals("4321")) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AccountsHomeScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stage.setTitle("Accounts Home");
                Stage stagem = (Stage) UserLogin.getScene().getWindow();
                stagem.close();

            }

            else if ("Logistics".equals(UserDepartment.getValue().toString()) && UserName.getText().toString().equals("Logistics") && Password.getText().toString().equals("4321")) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogisticsHomeScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stage.setTitle("Logistics Home");
                Stage stagem = (Stage) UserLogin.getScene().getWindow();
                stagem.close();
            }
            else if ("Producer/Director".equals(UserDepartment.getValue().toString()) && UserName.getText().toString().equals("Producer") && Password.getText().toString().equals("4321")) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ProducerHomeScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stage.setTitle("Producer Home");
                Stage stagem = (Stage) UserLogin.getScene().getWindow();
                stagem.close();
            }
            else if ("Support Stuffs".equals(UserDepartment.getValue().toString()) && UserName.getText().toString().equals("Support Stuffs") && Password.getText().toString().equals("4321")) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SupportStuffsHomeScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stage.setTitle("Support Stuffs Home");
                Stage stagem = (Stage) UserLogin.getScene().getWindow();
                stagem.close();
            }
            else if ("Actors".equals(UserDepartment.getValue().toString()) && UserName.getText().toString().equals("Actors") && Password.getText().toString().equals("4321")) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ActorsHomeScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
                stage.setTitle("Actors Home");
                Stage stagem = (Stage) UserLogin.getScene().getWindow();
                stagem.close();
            }
            else if (UserName.getText().isEmpty()&&Password.getText().isEmpty()){
                WarningLogin.setText("Please Enter Your Credentials.");
            }
            else{
                WarningLogin.setText("Wrong Username and Password");
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
