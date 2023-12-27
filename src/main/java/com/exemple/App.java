package com.exemple;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.exemple.model.User;
import com.exemple.repository.UserRepository;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
        } catch (BeansException e) {
            throw new RuntimeException(e);
        }

        UserRepository userRepository = context.getBean(UserRepository.class);

        // Example: Save a user
        /*User user = new User();
        user.setUsername("jamal");
        user.setEmail("jamal@example.com");
        userRepository.save(user);*/
        //int tab[] = {1,2,3,45};
        // Example: Find a user by ID
        //User retrievedUser = userRepository.findById(1).orElse(null);
        // just a comment
        List<User> listu = (List<User>) userRepository.findAll();
        listu.stream().forEach(listus -> System.out.println(listus.toString()));
    }
}
