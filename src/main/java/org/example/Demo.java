package org.example;

import com.google.gson.Gson;

public class Demo {
    public static void main(String[] args) {
        String name = "Svitlana";
        String lastName = "Symbratovych";

        Person person = new Person(name, lastName);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}