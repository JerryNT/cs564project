package application;

import java.io.EOFException;
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
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

//sdfdsfsdf
public class Main extends Application implements EventHandler<ActionEvent> {

    //scene #1
    Button login;
    Button sign_up;
//    
    //scene #2
    Button Healthnism;
    Button Hedonism;
    Button Favorite;
    Button logout;//TODO
//    
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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("Welcome to the recipes selection");
        first(primaryStage);
        
    }
    
    public void first(Stage primaryStage) throws Exception{
        // Button setup
        login = new Button();
        login.setText("Log in");
        sign_up = new Button();
        sign_up.setText("Sign up");
        login.setOnAction(this);
        sign_up.setOnAction(this);
        
        
        //TODO: exception
        login.setOnAction(e->{
            try {
                loginButton(primaryStage);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        
        
        
        
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

        // Username input
        TextField NI = new TextField("Type in your username");

        // Password
        Label password = new Label("Password");

        // Password input
        TextField PI = new TextField("Type in your password");
        
        UserHB.getChildren().addAll(name, NI, login);
        PasswordHB.getChildren().addAll(password, PI, sign_up);

        loginVbox.getChildren().addAll(UserHB, PasswordHB);
        
        //putting loginVbox into root
        root.getChildren().add(loginVbox);
        
        Scene loginScene = new Scene(root,800,800); // Set the layout to the scene
        primaryStage.setScene(loginScene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
    
    public void second(Stage primaryStage) throws Exception {
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
        Healthnism.setOnAction(e->healthnismButton(primaryStage));
        Healthnism.setStyle("-fx-font-size:32");
        Healthnism.setText("Healthnism");
        Healthnism.setTextFill(Color.GREEN);
        Healthnism.setMinSize(200, 150);
        Healthnism.setPadding(new Insets(100,20,100,20));
        Hedonism = new Button();
        Hedonism.setOnAction(e->hedonismButton(primaryStage));
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
        
        
    
        Scene Selection = new Scene(generalStructure,800,800);
        primaryStage.setScene(Selection);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
    
    
//Third scene
    public void third(Stage primaryStage) throws Exception {
        
        BorderPane bp = new BorderPane();
        //Using Vbox as general structure
        
        //Put title in a Hbox
        HBox Thb = new HBox();
        Thb.setAlignment(Pos.CENTER);
        Text title = new Text("Welcome to our healthnism recipes");
        title.setFont(Font.font("Verdana", 40));
        Thb.getChildren().add(title);
        bp.getChildren().addAll(Thb);
        bp.setAlignment(Thb, Pos.CENTER);
        
        //My favorite, Hedonism and logout button by using Vbox
        VBox Vfb = new VBox();
        //Vfb.setPadding(new Insets(100,100,0,250));
        
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
        Vfb.setAlignment(Pos.BASELINE_CENTER);
        bp.getChildren().add(Vfb);
        bp.setAlignment(Vfb, Pos.BASELINE_LEFT);
        
        //Setting calories using Vbox 
        
        VBox calories = new VBox();
        //calories.setPadding(new Insets(200,300,0,200));
        
        HBox CB1 = new HBox();
        CB1.setPadding(new Insets(30,0,10,100));
        CheckBox cb1 = new CheckBox();
        cb1.setText("High(700 Kcal)");
        CB1.getChildren().add(cb1);
        CB1.setAlignment(Pos.BASELINE_CENTER);
        
        HBox CB2 = new HBox();
        CB2.setPadding(new Insets(30,50,10,100));
        CheckBox cb2 = new CheckBox();
        cb2.setText("Medium(500 Kcal)");
        CB2.getChildren().add(cb2);
        CB2.setAlignment(Pos.BASELINE_CENTER);
        
        HBox CB3 = new HBox();
        CB3.setPadding(new Insets(30,50,10,100));
        CheckBox cb3 = new CheckBox();
        cb3.setText("Low(300 Kcal)");
        CB3.getChildren().add(cb3);
        CB3.setAlignment(Pos.BASELINE_CENTER);
        
        HBox sp = new HBox();
        sp.setPadding(new Insets(30,50,10,100));
        Label spec = new Label("Specific: ");
        TextField Spec = new TextField(); 
        sp.getChildren().addAll(spec, Spec);
        sp.setSpacing(20);
        sp.setAlignment(Pos.BASELINE_CENTER);
        
        HBox thb = new HBox();
        Text cal = new Text("Calories");
        thb.getChildren().add(cal);
        cal.setFont(Font.font("Verdana", 30));
        thb.setPadding(new Insets(30,50,10,100));
        calories.getChildren().addAll(thb,CB1,CB2,CB3,sp);
        bp.getChildren().addAll(calories);
        bp.setAlignment(calories, Pos.BASELINE_CENTER);
        
        
        //Setting another Vbox for lk and dislk
        VBox lkANDdislk = new VBox();
        
        //Inserting like 
        HBox lk = new HBox();
        Label like = new Label("What specificly do you want: ");
        TextField Like = new TextField("Type in here");
        lk.setPadding(new Insets(-200,100,0,0));
        lk.getChildren().addAll(like, Like);
        lk.setAlignment(Pos.BASELINE_CENTER);
        
        
      //Inserting dislike 
        HBox dislk = new HBox();
        Label dislike = new Label("Is there anything you do not want: ");
        TextField Dislike = new TextField("Type in here");
        dislk.setPadding(new Insets(-200,100,100,0));
        dislk.getChildren().addAll(dislike, Dislike);
        dislk.setAlignment(Pos.BASELINE_CENTER);
        
        
        
       //Put search button in a hbox
        Search = new Button();
        Search.setMinSize(500, 100);
        HBox search = new HBox();
        search.setPadding(new Insets(50,0,0,-100));
        search.setAlignment(Pos.BOTTOM_CENTER);
        Search.setText("Search");
        search.getChildren().add(Search);
        bp.getChildren().add(search);
        bp.setAlignment(search, Pos.BOTTOM_CENTER);
        
        
        
        //putting those sub box into the general one
        
        lkANDdislk.getChildren().addAll(lk,dislk);
        lkANDdislk.setAlignment(Pos.TOP_RIGHT);
        bp.getChildren().add(lkANDdislk);
        bp.setAlignment(lkANDdislk, Pos.BASELINE_RIGHT);
        
        
      Scene InHealthnism = new Scene(bp,800,800);
      primaryStage.setScene(InHealthnism);
      primaryStage.setResizable(true);
      primaryStage.show();
        
    }
    
//fourth scene   
    public void fourth(Stage primaryStage) throws Exception {
      //Using Vbox as general structure
      VBox gs = new VBox();
      
      //Put title in a Hbox
      HBox Thb = new HBox();
      Thb.setPadding(new Insets(100,0,0,0));
      Thb.setAlignment(Pos.CENTER);
      Text title = new Text("Welcome to our hedonism recipes");
      title.setFont(Font.font("Verdana", 40));
      Thb.getChildren().add(title);
      gs.getChildren().add(Thb);
      
      //My favorite, Healthnism and logout button by using Vbox
      VBox Vfb = new VBox();
      Vfb.setPadding(new Insets(50,100,0,0));
      
      fav = new Button();
      fav.setStyle("-fx-font-size:20");
      fav.setText("My favorite");
      fav.setTextFill(Color.BLUE);
      fav.setMinSize(150, 100);
      
      
      Health = new Button();
      Health.setStyle("-fx-font-size:20");
      Health.setText("Healthnism");
      Health.setTextFill(Color.BLUE);
      Health.setMinSize(150, 100);
      Health.setOnAction(e->healthnismButton(primaryStage));
      
      Lgt = new Button();
      Lgt .setStyle("-fx-font-size:20");
      Lgt .setText("Logout");
      Lgt .setTextFill(Color.BLUE);
      Lgt .setMinSize(150, 100);
      Lgt.setOnAction(e->logoutButton(primaryStage));
      
      Vfb.getChildren().addAll(fav, Health, Lgt);
      Vfb.setAlignment(Pos.BASELINE_LEFT);
      
      //Setting calories using Vbox 
      
      VBox calories = new VBox();
      calories.setPadding(new Insets(-200, 0,0,-150));
      
      HBox CB1 = new HBox();
      CB1.setPadding(new Insets(30,0,10,0));
      CheckBox cb1 = new CheckBox();
      cb1.setText("High(2500 Kcal)");
      CB1.getChildren().add(cb1);
      CB1.setAlignment(Pos.BASELINE_CENTER);
      
      HBox CB2 = new HBox();
      CB2.setPadding(new Insets(30,0,10,0));
      CheckBox cb2 = new CheckBox();
      cb2.setText("Medium(2000 Kcal)");
      CB2.getChildren().add(cb2);
      CB2.setAlignment(Pos.BASELINE_CENTER);
      
      HBox CB3 = new HBox();
      CB3.setPadding(new Insets(30,0,10,0));
      CheckBox cb3 = new CheckBox();
      cb3.setText("Low(1500 Kcal)");
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
      find = new Button();
      find.setMinSize(500, 100);
      HBox search = new HBox();
      search.setPadding(new Insets(50,0,0,-100));
      search.setAlignment(Pos.BOTTOM_CENTER);
      find.setText("Search");
      search.getChildren().add(find);
      
      
      
      //putting those sub box into the general one
      calories.getChildren().addAll(cal,CB1,CB2,CB3,sp);
      calories.setAlignment(Pos.TOP_CENTER);
      lkANDdislk.getChildren().addAll(lk,dislk);
      lkANDdislk.setAlignment(Pos.CENTER);
      gs.getChildren().addAll(Vfb, calories,lkANDdislk,search);
      gs.setAlignment(Pos.CENTER);
      
      
      
    Scene InHedonism = new Scene(gs,800,800);
    primaryStage.setScene(InHedonism);
    primaryStage.setResizable(true);
    primaryStage.show();
        
    }

    public void loginButton(Stage stage){
        try {
            second(stage);
        }
        catch (Exception e) {
            return;
        };
        
    }
    
    public void sign_upButton(Stage stage) {
        try {
            second(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    public void healthnismButton(Stage stage) {
        try {
            third(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    public void hedonismButton(Stage stage) {
        try {
            fourth(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    
    public void favoriteButton(Stage stage) {
        try {
            second(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    public void logoutButton(Stage stage) {
        try {
            first(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    
    public void hedButton(Stage stage) {
        try {
            second(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    
    public void searchButton(Stage stage) {
        try {
            second(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    
    public void healthButton(Stage stage) {
        try {
            second(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    
    public void findButton(Stage stage) {
        try {
            second(stage);
        }
        catch (Exception e) {
            return;
        };
    }
    
    
    
    
    
    

    @Override
    public void handle(ActionEvent event) {
        // TODO Auto-generated method stub
        
    }
   

}
