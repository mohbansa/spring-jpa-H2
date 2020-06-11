package dev.mohini.springjpa.controller;

import dev.mohini.springjpa.model.User;
import dev.mohini.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public void create(@RequestBody User user)
    {
        userRepository.save(user);
    }

    @GetMapping
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable(name="id") String id)
    {
        return userRepository.findByName(id);
    }
}
