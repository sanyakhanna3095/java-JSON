package com.bridgelabz.practiceProblems;

import java.util.Scanner;
import org.json.JSONObject;

public class CarJSON {
    public static class Car {
        private String brand;
        private String model;
        private int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String getBrand() { return brand; }
        public String getModel() { return model; }
        public int getYear() { return year; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Car Year: ");
        int year = sc.nextInt();

        Car car = new Car(brand, model, year);

        JSONObject json = new JSONObject();
        json.put("brand", car.getBrand());
        json.put("model", car.getModel());
        json.put("year", car.getYear());

        System.out.println("Car in JSON format:");
        System.out.println(json.toString());
    }
}


/*
O/P ->
Enter Car Brand: Toyota
Enter Car Model: High Ryder
Enter Car Year: 2021
Car in JSON format:
{"year":2021,"model":"High Ryder","brand":"Toyota"}
 */