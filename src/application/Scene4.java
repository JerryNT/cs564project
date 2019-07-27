package application;

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


public class Scene4 extends Application implements EventHandler<ActionEvent> {
  //scene #4
  Button fav;
  Button Health;
  Button Lgt;
  Button find;
    
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
  
  Lgt = new Button();
  Lgt .setStyle("-fx-font-size:20");
  Lgt .setText("Logout");
  Lgt .setTextFill(Color.BLUE);
  Lgt .setMinSize(150, 100);
  
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
  lkANDdislk.setAlignment(Pos.TOP_RIGHT);
  gs.getChildren().addAll(Vfb, calories,lkANDdislk,search);
  
  
  
Scene InHedonism = new Scene(gs,5000,5000);
primaryStage.setScene(InHedonism);
primaryStage.setResizable(true);
primaryStage.show();
    
}

@Override
public void handle(ActionEvent event) {
    // TODO Auto-generated method stub
    
}

@Override
public void start(Stage primaryStage) throws Exception {
    // TODO Auto-generated method stub
    
}

}