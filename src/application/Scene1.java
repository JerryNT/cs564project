package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Scene1 extends Application implements EventHandler<ActionEvent>{
    //scene #1
    Button login;
    Button sign_up;
   
    
//SCENE #1    
    // Username input
    TextField NI = new TextField("Type in your username");
    // Password input
    TextField PI = new TextField("Type in your password");
    //New info
    private Label info;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("Welcome to the recipes selection");
        
//SCENE #1       
        // Button setup
        login = new Button();
        login.setText("Log in");
        sign_up = new Button();
        sign_up.setText("Sign up");
        login.setOnAction(this);
        sign_up.setOnAction(this);
        
        // Define the root for the scene
        VBox root = new VBox(); // The overall layout of the scene
        root.setAlignment(Pos.CENTER);
        
        // The first part, title HBox
        HBox titleHBox = new HBox(40);
        titleHBox.setAlignment(Pos.CENTER);
        // TODO: Set style to the HBox

        Text leftText = new Text("Healthnism");
        leftText.setFont(Font.font("Verdana", 40));
        // TODO:set style to the left text
        titleHBox.getChildren().add(leftText);

        Text midText = new Text("or");
        midText.setFont(Font.font("Verdana", 40));
        // TODO:set style to the left text
        titleHBox.getChildren().add(midText);

        Text rightText = new Text("Hedonism");
        rightText.setFont(Font.font("Verdana", 40));
        // TODO:set style to the left text
        titleHBox.getChildren().add(rightText);

        // After all components have added to the titleHBox, add the finished HBox to the root VBox
        root.getChildren().add(titleHBox);
        

        //Setting Vbox, and put two Hbox
        VBox loginVbox = new VBox();
        HBox UserHB = new HBox();
        UserHB.setAlignment(Pos.CENTER);
        UserHB.setSpacing(20);
        HBox PasswordHB = new HBox();
        PasswordHB.setSpacing(20);
        PasswordHB.setAlignment(Pos.CENTER);
        
        // Username
        Label name = new Label("Username");
        // Password
        Label password = new Label("Password");
        
        UserHB.getChildren().addAll(name, NI, login);
        PasswordHB.getChildren().addAll(password, PI, sign_up);

        loginVbox.getChildren().addAll(UserHB, PasswordHB);
        
        //putting loginVbox into root
        root.getChildren().add(loginVbox);
        
        Scene Scene1 = new Scene(root,1500,1500); // Set the layout to the scene
        primaryStage.setScene(Scene1);
        primaryStage.show();
          
        //login.setOnAction(e->primaryStage.setScene(second(primaryStage).Selection));
    }
    
    public void second(Stage primaryStage) throws Exception {
        VBox generalStructure = new VBox();
        Scene Selection = new Scene(generalStructure,800,800);
    }

    @Override
    public void handle(ActionEvent event) {
        }
    }
    
    
    