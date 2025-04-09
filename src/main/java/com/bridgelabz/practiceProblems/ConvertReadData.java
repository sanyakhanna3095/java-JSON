package com.bridgelabz.practiceProblems;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertReadData {
    public static void main(String[] args) {
        try {
            String data = new String(Files.readAllBytes(Paths.get("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-JSON/src/main/java/com/bridgelabz/practiceProblems/studentInfo.json")));

            JSONObject json = new JSONObject(data);

            String name = json.getString("name");
            String email = json.getString("email");

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
        }
    }
}


/*
O/P->
Name: Sanya Khanna
Email: sanya.khanna@example.com

 */