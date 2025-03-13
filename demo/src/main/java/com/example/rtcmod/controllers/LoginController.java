package com.example.rtcmod.controllers;

import com.example.rtcmod.utils.FirebaseService;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController {
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;

    @FXML
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        try {
            String token = FirebaseService.signIn(email, password);
            messageLabel.setText("Login successful! Token: " + token.substring(0, 20) + "...");
        } catch (IOException e) {
            messageLabel.setText("Login failed: " + e.getMessage());
        }
    }
}
