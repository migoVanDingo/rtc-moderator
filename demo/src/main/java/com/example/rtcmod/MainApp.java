package com.example.rtcmod;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/rtcmod/views/DashboardView.fxml"));
        
        // Create the scene with the FXML content
        Scene scene = new Scene(fxmlLoader.load());

        // Set the scene on the stage
        primaryStage.setScene(scene);

        // Set window title
        primaryStage.setTitle("JavaFX");

        // Show the stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
