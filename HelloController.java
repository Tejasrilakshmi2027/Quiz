package com.example.quiz;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelloController {
    @FXML
    private Button playQuizbtn;
    @FXML
    private void initialize(){
        playQuizbtn.setOnAction(new EventHandler< ActionEvent >(){
            @Override
            public void handle(ActionEvent event){
                try{
                    Stage thisstage =(Stage)((Button) event.getSource()).getScene().getWindow();
                    thisstage.close();
                    String name;
                    FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource(name="quiz.fxml"));
                    Scene scene=new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.initStyle(StageStyle.TRANSPARENT);
                    scene.setFill(Color.TRANSPARENT);
                    stage.show();
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        });
    }
}