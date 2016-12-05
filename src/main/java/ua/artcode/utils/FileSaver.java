package ua.artcode.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ua.artcode.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Lisa on 12/4/2016.
 */
public class FileSaver {

    private String path;
    private Gson gson = new Gson();

    public FileSaver(String path) {
        this.path = path;
    }

    public List<Contact> read() {

        try {
            BufferedReader br = new BufferedReader( new FileReader(path));
            List<Contact> contacts = gson.fromJson(br, new TypeToken<List<Contact>>() {
            }.getType());
            // first add

            if (contacts == null){
                contacts = new ArrayList<>();
            }

            return contacts;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }

    public void save(List<Contact> contacts) {
        String json = gson.toJson(contacts);
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
