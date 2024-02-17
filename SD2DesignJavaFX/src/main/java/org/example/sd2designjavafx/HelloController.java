package org.example.sd2designjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.PasswordField;
//import javafx.scene.text.Text;


public class HelloController {
    public Label conPasswd;
    public Label username;
    public Label loginDetails;
    public Label mobile;
    public Label contactDetailLabel;
    @FXML
    private Label email;
    @FXML
    private Label passwd;


    //ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();


    @FXML
    protected void onHelloButtonClick() {
        //passwordField.setPromptText("Your password");
    }



}
