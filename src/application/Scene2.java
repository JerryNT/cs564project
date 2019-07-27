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


public class Scene2 extends Application implements EventHandler<ActionEvent> {

  //scene #2
  Button Healthnism;
  Button Hedonism;
  Button Favorite;
  Button logout;//TODO
   

    @Override
    public void start(Stage primaryStage) throws Exception {
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
      Healthnism.setStyle("-fx-font-size:32");
      Healthnism.setText("Healthnism");
      Healthnism.setTextFill(Color.GREEN);
      Healthnism.setMinSize(200, 150);
      Healthnism.setPadding(new Insets(100,20,100,20));
      Hedonism = new Button();
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
    
    @Override
    public void handle(ActionEvent event) {
        // TODO Auto-generated method stub
        
    }
    
}