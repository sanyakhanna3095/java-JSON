package com.bridgelabz.practiceProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {
    public static void main(String[] args) {
        JSONObject obj=new JSONObject();

        obj.put("name", "Sanya Khanna");
        obj.put("age", 21);

        JSONArray arr=new JSONArray();

        arr.put("English");
        arr.put("Hindi");
        arr.put("Maths");
        obj.put("subjects", arr);
        System.out.println(obj);
    }
}


/*
O/P-> {"subjects":["English","Hindi","Maths"],"name":"Sanya Khanna","age":21}
 */