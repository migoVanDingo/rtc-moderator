package com.example.rtcmod.utils;

import okhttp3.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class FirebaseService {
    private static final String FIREBASE_API_KEY = "YOUR_FIREBASE_WEB_API_KEY";
    private static final String SIGN_IN_URL = "https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=" + FIREBASE_API_KEY;

    private static final OkHttpClient client = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String signIn(String email, String password) throws IOException {
        String json = String.format("{\"email\":\"%s\",\"password\":\"%s\",\"returnSecureToken\":true}", email, password);
        RequestBody body = RequestBody.create(json, MediaType.get("application/json"));

        Request request = new Request.Builder()
                .url(SIGN_IN_URL)
                .post(body)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        JsonNode jsonResponse = objectMapper.readTree(response.body().string());
        return jsonResponse.get("idToken").asText();  // Return Firebase ID token
    }
}
