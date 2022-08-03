package com.adm.crm.controller;

import com.adm.crm.dto.UsersDTO;
import com.adm.crm.model.Users;
import com.adm.crm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<Users> listAllUsers() {
        return this.usersService.listAllUsers();
    }

    @GetMapping("/{code}")
    public Users listById(@PathVariable String code) {
        return this.usersService.listById(code);
    }

    @PostMapping
    public Users createNewUser(@RequestBody Users user) {
        return this.usersService.createNewUser(user);
    }

    @PutMapping("/{code}")
    public ResponseEntity<Users> updateUserInfo(@PathVariable String code, @RequestBody @Validated UsersDTO user) {
        final var updatedUser = usersService.listById(code);
        if(updatedUser == null) {
            return ResponseEntity.notFound().build();
        }

        updatedUser.setUser(user.getUser());
        updatedUser.setFullName(user.getFullName());
        updatedUser.setBirthday(user.getBirthday());
        updatedUser.setAvatar(user.getAvatar());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setPhoneNumber(user.getPhoneNumber());
        updatedUser.setAddress(user.getAddress());
        return ResponseEntity.ok(this.usersService.updateUserInfo(updatedUser));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<?> deleteUserById(@PathVariable String code) {
        this.usersService.deleteUser(code);
        return ResponseEntity.noContent().build();
    }
}
