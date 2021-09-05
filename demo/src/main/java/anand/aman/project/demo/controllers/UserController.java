package anand.aman.project.demo.controllers;

import anand.aman.project.demo.models.Risk;
import anand.aman.project.demo.models.User;
import anand.aman.project.demo.repositories.UserRepository;


public class UserController {

    public UserController() {
    }

    public User registerUser(String name, Long phoneNum, Integer pinCode){
        User user = new User(name, phoneNum, pinCode);
        return user;
    }


    public void selfAssessment(){

    }
}
