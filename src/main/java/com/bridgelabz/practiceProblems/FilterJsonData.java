package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FilterJsonData {
    public static void main(String[] args) throws IOException {
        ObjectMapper obj=new ObjectMapper();
        JsonNode jsonNode = obj.readTree(new File("/Users/sanyakhanna/Desktop/bridgelabz-workspace/java-JSON/src/main/java/com/bridgelabz/practiceProblems/user.json"));

        System.out.println("Students with age>25 are: ");

        for(JsonNode s:jsonNode){
            if(s.has("age") && s.get("age").asInt()>25){
                System.out.println(s);
            }
        }
    }
}



/*
O/P->
Students with age>25 are:
{"name":"Sehajpreet Kaur","age":27,"email":"sehaj08765@gmail.com"}
{"name":"Chirag","age":32,"email":"chir@gmail.com"}
{"name":"Mehak Sharma","age":29,"email":"mehak09876@gmail.com"}
 */