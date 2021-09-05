package anand.aman.project.demo.bootstrap;

import anand.aman.project.demo.controllers.UserController;
import anand.aman.project.demo.models.Risk;
import anand.aman.project.demo.models.Symptom;
import anand.aman.project.demo.repositories.SymptomRepository;
import anand.aman.project.demo.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class BootStrapData implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        UserController userController = new UserController();
        userRepository.save(userController.registerUser("rohit", 212341234L, 500081));
        System.out.println("Number of users saved is " + userRepository.count());

        System.out.println("Populating db with list of symptoms for users to choose from.");


        symptomRepository.save(new Symptom("cough"));
        symptomRepository.save(new Symptom("cold"));
        symptomRepository.save(new Symptom("fever"));

        System.out.println("Select list of symptoms " + symptomRepository.findAll());

//        Risk risk = new Risk();
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        if(x < 4 && x > 0){
//            if(x == 1){
//                //risk.getSymptoms().add(symptomRepository.findBy)
//            }
//        }


    }

    public final UserRepository userRepository;
    public final SymptomRepository symptomRepository;

    public BootStrapData(UserRepository userRepository, SymptomRepository symptomRepository) {
        this.userRepository = userRepository;
        this.symptomRepository = symptomRepository;
    }
}
