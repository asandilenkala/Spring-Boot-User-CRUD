//
//package com.example.user.configuration;
//
//import com.example.user.model.User;
//import com.example.user.repository.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class UserConfiguration {
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository repository){
//        return args -> {
//            User user1 = new User(
//                    "jane",
//                    "doe",
//                    "janedoe@gmail.com",
//                    24);
//
//            User user2 = new User(
//                    "Andile",
//                    "Nkala",
//                    "NKLASA001@myuct.ac.za",
//                    25);
//            repository.saveAll(
//                    List.of(user1, user2)
//            );
//        };
//    }
//}
