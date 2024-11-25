//package com.enterprise.company;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Configuration
//public class UserConfig {
//
//    private UserRepository userRepository;
//
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository userRepository) {
//        return (args) -> {
//            List<User> userList = List.of(
//                    new User(
//                            null,
//                            "Николай",
//                            LocalDate.of(2004,3,9),
//                            "volxin.k2004@gmail.com",
//                            5000
//                    ),
//                    new User(
//                            null,
//                            "Максим",
//                            LocalDate.of(2003,4,9),
//                            "max@gmail.com",
//                            3000
//                    )
//            );
//            userRepository.saveAll(userList);
//
//        };
//    }
//
//}
