package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    static class Student{
        private String name;
        private int age;
        private String email;

        public Student(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        // Getters and Setters
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getEmail() { return email; }


    }

    public static void main(String[] args){
        try {
            List<Student> l = new ArrayList<>();
            l.add(new Student("Sanya Khanna", 21, "sanya12@gmail.com"));
            l.add(new Student("Sehajpreet Kaur", 22, "sehaj08765@gmail.com"));
            l.add(new Student("Aarush Sharma", 16, "aaru110@gmail.com"));
            l.add(new Student("Prachi Jain", 23, "prachi0987@gmail.com"));

            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(l);

            System.out.println("JSON Array:");
            System.out.println(jsonArray);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*
O/P->
JSON Array:
[ {
  "name" : "Sanya Khanna",
  "age" : 21,
  "email" : "sanya12@gmail.com"
}, {
  "name" : "Sehajpreet Kaur",
  "age" : 22,
  "email" : "sehaj08765@gmail.com"
}, {
  "name" : "Aarush Sharma",
  "age" : 16,
  "email" : "aaru110@gmail.com"
}, {
  "name" : "Prachi Jain",
  "age" : 23,
  "email" : "prachi0987@gmail.com"
} ]

 */