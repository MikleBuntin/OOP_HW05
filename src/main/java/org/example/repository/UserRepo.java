package org.example.repository;

import org.example.model.User;

import java.io.*;

public class UserRepo {
    static File file = new File("text.txt");

    public UserRepo() throws FileNotFoundException {
    }

    public void addUser(User user) {
        try(FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewAll() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            fileReader.close();
        }
        catch(IOException e){
                throw new RuntimeException(e);
            }
        }


    public static Integer getNewID() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);

            Integer newID = 0;
            Integer id = 0;
            while (line != null) {
                String[] subLine = line.split("ID=");
                id = Integer.parseInt(subLine[1].split(", ")[0]);
                if (id >= newID) {newID = ++id;}
                line = bufferedReader.readLine();
            }
            fileReader.close();
            return newID;
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
