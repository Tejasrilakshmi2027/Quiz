package com.example.quiz;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class quizController {
    @FXML
    public Label question;
    @FXML
    public Button opt1,opt2,opt3,opt4;
    int counter=0;
    static int correct=0;
    static int wrong=0;
    @FXML
    private void initialize(){
        loadQuestions();
    }

    private void loadQuestions() {
        if (counter==0){
                question.setText("1.How many Consonants  are there in  English Alphabets?");
                opt1.setText("21");
                opt2.setText("22");
                opt3.setText("20");
                opt4.setText("26");
        }
        else if (counter==1){
            question.setText("2.Who invented the Light Bulb?");
            opt1.setText("Thomas alva Edison");
            opt2.setText("Alexander Flemingo");
            opt3.setText("Albert Einstien");
            opt4.setText("Ramanujan");
        }
        else if (counter==2){
            question.setText("3.In the Solar System ,Farthest planet from Sun is");
            opt1.setText("Earth");
            opt2.setText("Neptune");
            opt3.setText("Jupiter");
            opt4.setText("saturn");
        }
        else if (counter==3){
            question.setText("4.Largest moon in Solar system is __");
            opt1.setText("Moon");
            opt2.setText("Ganymede");
            opt3.setText("lo");
            opt4.setText("Europa");
        }
        else if (counter==4){
            question.setText("5.Which of these is 'not' a property of metal ?");
            opt1.setText("Malleability");
            opt2.setText("Ductility");
            opt3.setText("Elasticity");
            opt4.setText("Conductivity");
        }
        else if (counter==5){
            question.setText("6.Who discovered penicillin?");
            opt1.setText("Thomas alva Edison");
            opt2.setText("Alexander Fleming");
            opt3.setText("Albert Einstien");
            opt4.setText("Ramanujan");
        }
        else if (counter==6){
            question.setText("7.Formula of Hydrochloric acid is __");
            opt1.setText("H2O");
            opt2.setText("H2SO4");
            opt3.setText("HCl");
            opt4.setText("MgCl");
        }
        else if (counter==7){
            question.setText("8.The Fastest Animal in the World is ___");
            opt1.setText("Cheetah");
            opt2.setText("Lion");
            opt3.setText("Tiger");
            opt4.setText("black marlin");
        }
        else if (counter==8){
            question.setText("9.Complementary colour of Red is __");
            opt1.setText("Yellow");
            opt2.setText("Green");
            opt3.setText("Pink");
            opt4.setText("Blue");
        }
        else if (counter==9){
            question.setText("10.World Environment Day is Celebrated on __");
            opt1.setText("August 15th");
            opt2.setText("January 26th");
            opt3.setText("June 5th");
            opt4.setText("May 2nd");
        }
    }

    @FXML
    public void opt1locked(ActionEvent event) {
            checkAnswer(opt1.getText().toString());
            if (checkAnswer(opt1.getText().toString())){
                correct+=1;
            }
            else{
                wrong+=1;
            }
            if (counter ==9){
                try{
                    Stage thisstage =(Stage)((Button) event.getSource()).getScene().getWindow();
                    thisstage.close();
                    String name;
                    FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource(name="result.fxml"));
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
            else{
                counter++;
                loadQuestions();
            }
    }

    boolean checkAnswer(String answer) {
        if (counter==0){
            if (answer.equals("21")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==1){
            if (answer.equals("Thomas alva Edison")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==2){
            if (answer.equals("Neptune")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==3){
            if (answer.equals("Ganymede")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==4){
            if (answer.equals("Elasticity")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==5){
            if (answer.equals("Alexander Fleming")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==6){
            if (answer.equals("HCl")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==7){
            if (answer.equals("Cheetah")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==8){
            if (answer.equals("Green")){
                return true;
            }
            else{
                return false;
            }
        }
        if (counter==9) {
            if (answer.equals("June 5th")) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    @FXML
    public void opt2locked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())){
            correct+=1;
        }
        else{
            wrong+=1;
        }
        if (counter ==9){
            try{
                Stage thisstage =(Stage)((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                String name;
                FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource(name="result.fxml"));
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
        else{
            counter++;
            loadQuestions();
        }

    }
    @FXML
    public void opt3locked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())){
            correct+=1;
        }
        else{
            wrong+=1;
        }
        if (counter ==9){
            try{
                Stage thisstage =(Stage)((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                String name;
                FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource(name="result.fxml"));
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
        else{
            counter++;
            loadQuestions();
        }

    }
    @FXML
    public void opt4locked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())){
            correct+=1;
        }
        else{
            wrong+=1;
        }
        if (counter ==9){
            try{
                Stage thisstage =(Stage)((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                String name;
                FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource(name="result.fxml"));
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
        else{
            counter++;
            loadQuestions();
        }

    }
}
