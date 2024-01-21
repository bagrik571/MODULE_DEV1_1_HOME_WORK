package org.example;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Vitalii","Bahrynovskyi");
        String json = new Gson().toJson(user);
        System.out.println(json);
        FileWriter file = new FileWriter(new File("C:/Users/bagri/java16/MODULE_DEV1_1_HOME_WORK/file.txt"));
        file.write(user.toString());
        file.close();
    }
}