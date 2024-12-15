package com.heshanthenura.javarabbit;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Functions {

    public static Canvas canvas;
    public static Parent canvasRoot;
    public static Stage stage;
    public static boolean opened=false;
    public static GraphicsContext gc;

    public void show() throws IOException {

        if(!opened){
            System.out.println(opened);
            FXMLLoader fxmlLoader = new FXMLLoader(JavaRabbit.class.getResource("canvas.fxml"));
            canvasRoot = fxmlLoader.load();
            canvas = (Canvas) canvasRoot.lookup("#canvas");
            gc = canvas.getGraphicsContext2D();
            stage = new Stage();
            stage.setTitle("Canvas View");
            stage.setScene(new Scene(canvasRoot));
            stage.show();
            opened=true;
        }

        stage.setOnCloseRequest(event -> {
            opened=false;
            System.out.println("Window closed, opened set to false");
        });

    }

    public void setSize(double w, double h){
        canvas.setWidth(w);
        canvas.setHeight(h);
        stage.setWidth(w);
        stage.setHeight(h);
    }

    public void setColor(String c){
        Color color = Color.valueOf(c);
        gc.setFill(color);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }


        public void drawLine(String color,double width, double startX, double startY, double endX, double endY) {
            Color lineColor = Color.valueOf(color);
            gc.setStroke(lineColor);
            gc.setLineWidth(width);
            gc.strokeLine(startX, startY, endX, endY);
        }


}
