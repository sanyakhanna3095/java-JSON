package com.bridgelabz.handsOnPracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadKeyValue {
    public static void main(String[] args) {
        try {
            ObjectMapper obj=new ObjectMapper();
            JsonNode jsonNode = obj.readTree(new File("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-JSON/src/main/java/com/bridgelabz/practiceProblems/studentInfo.json"));
//            System.out.println(jsonNode.toString());
            for(JsonNode s: jsonNode){
                System.out.println(s);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
