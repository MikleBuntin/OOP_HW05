package org.example.repository;

import org.example.model.User;

import java.io.*;
import java.util.ArrayList;

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
        } catch(IOException e){throw new RuntimeException(e);}
        }


    public static Integer getNewID() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

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

    public static void deleteUser(Integer delID) {
        FileReader fileReader = null;
        try {
            ArrayList<String> stringList = new ArrayList<>();
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            Integer id = 0;
            while (line != null) {
                String[] subLine = line.split("ID=");
                id = Integer.parseInt(subLine[1].split(", ")[0]);
                if (id != delID) {stringList.add(line); System.out.println("added" + line);}
                line = bufferedReader.readLine();
            }
            fileReader.close();

            new FileWriter(file, false).close();
            FileWriter fileWriter = new FileWriter(file, true);
                for (String str: stringList) {
                    System.out.println("Writed: " + str);

                    fileWriter.write(str + '\n');
                }
                fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}

//    User{ID=0, name=Mikle, check=2000}
//    User{ID=1, name=Julia, check=2500}
//    User{ID=2, name=Irina, check=2800}
//    User{ID=3, name=Serafima, check=2500}
