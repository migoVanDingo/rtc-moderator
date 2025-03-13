package com.example.rtcmod.controllers;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    private WebView webView;  // Make sure this matches the fx:id in your FXML file

    public void initialize() {
        // Get the WebEngine from WebView
        WebEngine webEngine = webView.getEngine();

        // Load the React app from the local server or URL
        webEngine.load("http://localhost:5010");  // Point it to your locally served React app
    }
}