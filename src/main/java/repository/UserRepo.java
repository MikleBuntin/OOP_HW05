package repository;

import org.example.model.User;

import java.io.FileWriter;
import java.io.IOException;

public class UserRepo {
    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
