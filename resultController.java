package com.example.quiz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;


public class resultController {
    @FXML
    public Label remark,marks,correcttext,markstext,wrongtext;
    @FXML
    public ProgressIndicator correct_progress,wrong_progress;

    @FXML
    private void initialize(){
        correcttext.setText("Correct Answers : "+ String.valueOf(quizController.correct));
        wrongtext.setText("Incorrect Answers : "+ String.valueOf(quizController.wrong));
        marks.setText(quizController.correct+"/10 ");
        markstext.setText(quizController.correct+" marks Scored");
        float correct1= (float)quizController.correct/10;
        correct_progress.setProgress(correct1);
        float wrong1= (float)quizController.wrong/10;
        wrong_progress.setProgress(wrong1);
        int correct=quizController.correct;
        if (correct<2){
            remark.setText("Oh no...! You Failed .You should improve general Knowledge.");
        }
        else if(correct>2 && correct <5){
            remark.setText("Oops..!You scored less score .You should improve general Knowledge.");

        }
        else if (correct>=5 && correct<=7){
            remark.setText("Good..!A bit improvement might helps much better.Practice makes man Perfect.");
        }
        else if (correct==8 || correct==9){
            remark.setText("Congratulations..!Your Hardwork and determination helped u to answer all questions");
        }
        else if (correct==10){
            remark.setText("Congratulations..! You passed the test with full marks with your hardwork and dedication.");
        }

    }
}
