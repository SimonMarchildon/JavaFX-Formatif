package edu.ics4u.MavenFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) 
    {

       
        var label = new Label("This will unleash horny thicc milf robots!");
        var text = new TextField(""); 
        var button = new Button("DO NOT PUSH."); 
      
        
       
        var hbox = new HBox(text, button); 
           
        var root = new VBox(label, hbox); 

        var scene = new Scene(root, 1000, 500); 
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch();
    }

}