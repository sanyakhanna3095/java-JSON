package com.bridgelabz.practiceProblems;

import org.json.JSONObject;

public class MergeJSON {
    public static void main(String[] args) {
        JSONObject ob1=new JSONObject();
        ob1.put("id", 1266);
        ob1.put("name", "Sanya Khanna");

        JSONObject ob2=new JSONObject();
        ob2.put("age", 21);
        ob2.put("email", "sanya12@gmail.com");

        for (String key: ob2.keySet()){
            ob1.put(key, ob2.get(key));
        }

        System.out.println("Merged JSON objects: "+ ob1.toString());
    }
}


/*
O/P->
Merged JSON objects: {"name":"Sanya Khanna","id":1266,"age":21,"email":"sanya12@gmail.com"}
 */