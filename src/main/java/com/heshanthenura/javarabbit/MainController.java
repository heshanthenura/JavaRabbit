package com.heshanthenura.javarabbit;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController {

    @FXML
    private Button runBtn;

    @FXML
    private TextArea textField;

    @FXML
    public Canvas canvas;

    Interpreter interpreter = new Interpreter();

    @FXML
    void runBtn(MouseEvent event) throws IOException {
        new Functions().show();
        System.out.println("clicked");
        String content = textField.getText();
        String[] lines = content.split("\n");
        for (int i = 0; i < lines.length; i++) {
                interpreter.interpret(i,lines[i]);
        }
    }

    @FXML
    void textTypeEvent(KeyEvent event) throws IOException {
    }

}
