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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Scene extends Application implements EventHandler<ActionEvent>{
    //scene #1
    Button login;
    Button sign_up;
    
  //scene #2
    Button Healthnism;
    Button Hedonism;
    Button Favorite;
    Button logout;//TODO
    
    //scene #3
    Button Fav;
    Button Hed;
    Button Logout;
    Button Search;
    
    //scene #4
    Button fav;
    Button Health;
    Button Lgt;
    Button find;
    
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
    

      //SCENE #2    
        //Set a Vbox as the general structure
        VBox generalStructure = new VBox();
        
        //Set a Hbox to put the title in
        Text title = new Text("Which one do you prefer today?");
        title.setFont(Font.font("Verdana", 40));
        HBox hb = new HBox(20);
        hb.setPadding(new Insets(200,0,50,0));
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().add(title);
        generalStructure.getChildren().add(hb);
        
        //Set a Hbox for the buttons of healthnism and hedonism
        HBox HH = new HBox();
        HH.setSpacing(20);
        
        Text or = new Text("OR");
        Label HealthnismButton = new Label("Healthnism");
        Label HedonismButton = new Label("Hedonism");
        HealthnismButton.setFont(Font.font("Verdana", 40));
        HedonismButton.setFont(Font.font("Verdana", 40));
        or.setFont(Font.font("Verdana", 40));
        
        Healthnism = new Button();
        Healthnism.setOnAction(this);
        Healthnism.setStyle("-fx-font-size:32");
        Healthnism.setText("Healthnism");
        Healthnism.setTextFill(Color.GREEN);
        Healthnism.setMinSize(200, 150);
        Healthnism.setPadding(new Insets(100,20,100,20));
        Hedonism = new Button();
        Hedonism.setOnAction(this);
        Hedonism.setStyle("-fx-font-size:32");
        Hedonism.setText("Hedonism");
        Hedonism.setTextFill(Color.RED);
        Hedonism.setMinSize(200, 150);
        Hedonism.setPadding(new Insets(100,20,100,20));
        
        HH.getChildren().addAll(Healthnism, or, Hedonism);
        HH.setAlignment(Pos.CENTER);
        generalStructure.getChildren().add(HH);
        
        
        //Another Hbox for My favorite button
        HBox Fhb = new HBox();
        Fhb.setPadding(new Insets(100,0,0,0));
        Fhb.setSpacing(20);
        Fhb.setAlignment(Pos.CENTER);
        Favorite = new Button();
        Favorite.setStyle("-fx-font-size:20");
        Favorite.setText("My favorite");
        Favorite.setTextFill(Color.BLUE);
        Favorite.setMinSize(300, 100);
        Fhb.getChildren().add(Favorite);
        generalStructure.getChildren().add(Fhb);
        
        Scene scene2 = new Scene(generalStructure, 1500,1500);
    


//SCENE  #3
        
        //Using Vbox as general structure
          VBox gs = new VBox();
          
          //Put title in a Hbox
          HBox Thb = new HBox();
          Thb.setPadding(new Insets(100,0,0,0));
          Thb.setAlignment(Pos.CENTER);
          Text ThirdTitle = new Text("Welcome to our healthnism recipes");
          ThirdTitle.setFont(Font.font("Verdana", 40));
          Thb.getChildren().add(ThirdTitle);
          gs.getChildren().add(Thb);
          
          //My favorite, Hedonism and logout button by using Vbox
          VBox Vfb = new VBox();
          Vfb.setPadding(new Insets(50,100,0,0));
          
          Fav = new Button();
          Fav.setStyle("-fx-font-size:20");
          Fav.setText("My favorite");
          Fav.setTextFill(Color.BLUE);
          Fav.setMinSize(150, 100);
          
          
          Hed = new Button();
          Hed.setStyle("-fx-font-size:20");
          Hed.setText("Hedonism");
          Hed.setTextFill(Color.BLUE);
          Hed.setMinSize(150, 100);
          
          Logout = new Button();
          Logout .setStyle("-fx-font-size:20");
          Logout .setText("Logout");
          Logout .setTextFill(Color.BLUE);
          Logout .setMinSize(150, 100);
          
          Vfb.getChildren().addAll(Fav, Hed, Logout);
          Vfb.setAlignment(Pos.BASELINE_LEFT);
          
          //Setting calories using Vbox 
          
          VBox calories = new VBox();
          calories.setPadding(new Insets(-200, 0,0,-150));
          
          HBox CB1 = new HBox();
          CB1.setPadding(new Insets(30,0,10,0));
          CheckBox cb1 = new CheckBox();
          cb1.setText("High(700 Kcal)");
          CB1.getChildren().add(cb1);
          CB1.setAlignment(Pos.BASELINE_CENTER);
          
          HBox CB2 = new HBox();
          CB2.setPadding(new Insets(30,0,10,0));
          CheckBox cb2 = new CheckBox();
          cb2.setText("Medium(500 Kcal)");
          CB2.getChildren().add(cb2);
          CB2.setAlignment(Pos.BASELINE_CENTER);
          
          HBox CB3 = new HBox();
          CB3.setPadding(new Insets(30,0,10,0));
          CheckBox cb3 = new CheckBox();
          cb3.setText("Low(300 Kcal)");
          CB3.getChildren().add(cb3);
          CB3.setAlignment(Pos.BASELINE_CENTER);
          
          HBox sp = new HBox();
          sp.setPadding(new Insets(10,0,10,0));
          Label spec = new Label("Specific: ");
          TextField Spec = new TextField(); 
          sp.getChildren().addAll(spec, Spec);
          sp.setSpacing(20);
          sp.setAlignment(Pos.BASELINE_CENTER);
          
          
          Text cal = new Text("Calories");
          cal.setFont(Font.font("Verdana", 30));
          
          //Setting another Vbox for lk and dislk
          VBox lkANDdislk = new VBox();
          
          
          //Inserting like 
          HBox lk = new HBox();
          Label like = new Label("What specificly do you want: ");
          TextField Like = new TextField("Type in here");
          lk.setPadding(new Insets(-200,100,0,0));
          lk.getChildren().addAll(like, Like);
          lk.setAlignment(Pos.CENTER_RIGHT);
          
          
        //Inserting dislike 
          HBox dislk = new HBox();
          Label dislike = new Label("Is there anything you do not want: ");
          TextField Dislike = new TextField("Type in here");
          dislk.setPadding(new Insets(-200,100,100,0));
          dislk.getChildren().addAll(dislike, Dislike);
          dislk.setAlignment(Pos.CENTER_RIGHT);
          
          
          
         //Put search button in a hbox
          Search = new Button();
          Search.setOnAction(this);
          Search.setMinSize(500, 100);
          HBox search = new HBox();
          search.setPadding(new Insets(50,0,0,-100));
          search.setAlignment(Pos.BOTTOM_CENTER);
          Search.setText("Search");
          search.getChildren().add(Search);
          
          
          
          //putting those sub box into the general one
          calories.getChildren().addAll(cal,CB1,CB2,CB3,sp);
          calories.setAlignment(Pos.CENTER);
          lkANDdislk.getChildren().addAll(lk,dislk);
          lkANDdislk.setAlignment(Pos.TOP_RIGHT);
          gs.getChildren().addAll(Vfb, calories,lkANDdislk,search);
          
          Scene scene3 = new Scene(gs, 1500,1500);
    
        
        
 
        
      //SCENE #4
        //Using Vbox as general structure
          VBox gs1 = new VBox();
          
          //Put title in a Hbox
          HBox Thb1 = new HBox();
          Thb1.setPadding(new Insets(100,0,0,0));
          Thb1.setAlignment(Pos.CENTER);
          Text title1 = new Text("Welcome to our hedonism recipes");
          title1.setFont(Font.font("Verdana", 40));
          Thb1.getChildren().add(title1);
          gs1.getChildren().add(Thb1);
          
          //My favorite, Healthnism and logout button by using Vbox
          VBox Vfb1 = new VBox();
          Vfb1.setPadding(new Insets(50,100,0,0));
          
          fav = new Button();
          fav.setOnAction(this);
          fav.setStyle("-fx-font-size:20");
          fav.setText("My favorite");
          fav.setTextFill(Color.BLUE);
          fav.setMinSize(150, 100);
          
          
          Health = new Button();
          Health.setOnAction(this);
          Health.setStyle("-fx-font-size:20");
          Health.setText("Healthnism");
          Health.setTextFill(Color.BLUE);
          Health.setMinSize(150, 100);
          
          Lgt = new Button();
          Lgt.setOnAction(this);
          Lgt .setStyle("-fx-font-size:20");
          Lgt .setText("Logout");
          Lgt .setTextFill(Color.BLUE);
          Lgt .setMinSize(150, 100);
          
          Vfb1.getChildren().addAll(fav, Health, Lgt);
          Vfb1.setAlignment(Pos.BASELINE_LEFT);
          
          //Setting calories using Vbox 
          
          VBox Calories1 = new VBox();
          Calories1.setPadding(new Insets(-200, 0,0,-150));
          
          HBox Checkbox1 = new HBox();
          Checkbox1.setPadding(new Insets(30,0,10,0));
          CheckBox cb11 = new CheckBox();
          cb11.setText("High(2500 Kcal)");
          Checkbox1.getChildren().add(cb11);
          Checkbox1.setAlignment(Pos.BASELINE_CENTER);
          
          HBox CB21 = new HBox();
          CB21.setPadding(new Insets(30,0,10,0));
          CheckBox cb21 = new CheckBox();
          cb21.setText("Medium(2000 Kcal)");
          CB21.getChildren().add(cb21);
          CB21.setAlignment(Pos.BASELINE_CENTER);
          
          HBox CB31 = new HBox();
          CB31.setPadding(new Insets(30,0,10,0));
          CheckBox cb31 = new CheckBox();
          cb31.setText("Low(1500 Kcal)");
          CB31.getChildren().add(cb31);
          CB31.setAlignment(Pos.BASELINE_CENTER);
          
          HBox sp1 = new HBox();
          sp1.setPadding(new Insets(10,0,10,0));
          Label spec1 = new Label("Specific: ");
          TextField Spec1 = new TextField(); 
          sp1.getChildren().addAll(spec1, Spec1);
          sp1.setSpacing(20);
          sp1.setAlignment(Pos.BASELINE_CENTER);
          
          
          Text cal1 = new Text("Calories");
          cal1.setFont(Font.font("Verdana", 30));
          
          //Setting another Vbox for lk and dislk
          VBox lkANDdislk1 = new VBox();
          
          
          //Inserting like 
          HBox lk1 = new HBox();
          Label like1 = new Label("What specificly do you want: ");
          TextField Like1 = new TextField("Type in here");
          lk1.setPadding(new Insets(-200,100,0,0));
          lk1.getChildren().addAll(like1, Like1);
          lk1.setAlignment(Pos.CENTER_RIGHT);
          
          
        //Inserting dislike 
          HBox dislk1 = new HBox();
          Label dislike1 = new Label("Is there anything you do not want: ");
          TextField Dislike1 = new TextField("Type in here");
          dislk1.setPadding(new Insets(-200,100,100,0));
          dislk1.getChildren().addAll(dislike1, Dislike1);
          dislk1.setAlignment(Pos.CENTER_RIGHT);
          
          
          
         //Put search button in a hbox
          find = new Button();
          find.setMinSize(500, 100);
          HBox search1 = new HBox();
          search1.setPadding(new Insets(50,0,0,-100));
          search1.setAlignment(Pos.BOTTOM_CENTER);
          find.setText("Search");
          search1.getChildren().add(find);
          
          
          
          //putting those sub box into the general one
          Calories1.getChildren().addAll(cal1,Checkbox1,CB21,CB31,sp1);
          Calories1.setAlignment(Pos.TOP_CENTER);
          lkANDdislk1.getChildren().addAll(lk1,dislk1);
          lkANDdislk1.setAlignment(Pos.TOP_RIGHT);
          gs1.getChildren().addAll(Vfb1, Calories1,lkANDdislk1,search1);
          
          Scene scene4 = new Scene(gs1, 1500,1500);
          
          
          
          //button work
          login.setOnAction(e->primaryStage.setScene(scene2));
          
          Healthnism.setOnAction(e->primaryStage.setScene(scene3));
          Hedonism.setOnAction(e->primaryStage.setScene(scene4));
          //logout.setOnAction(e->primaryStage.setScene(Scene1));
          
          Hed.setOnAction(e->primaryStage.setScene(scene4));
          Logout.setOnAction(e->primaryStage.setScene(Scene1));
          
          Health.setOnAction(e->primaryStage.setScene(scene3));
          //Lgt.setOnAction(e->primaryStage.setScene(loginScene));
          
          

          primaryStage.setScene(Scene1);
          primaryStage.setResizable(true);
          primaryStage.show();
          
    }
    

    @Override
    public void handle(ActionEvent event) {
        
    }
    
    
    
}