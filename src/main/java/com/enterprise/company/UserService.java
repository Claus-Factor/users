package com.enterprise.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        if (user.getId() != null) {
            throw new IllegalArgumentException("Идентификатор инкременируетсяя автоматиески");
        }
        if (user.getSalary() < 100) {
            throw new IllegalArgumentException("Зарплата не может быть меньше прожиточного минимума");
        }
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Пользовательн с такой почтой уже зарегистрирован");
        }
        return userRepository.save(user);
    }
}
