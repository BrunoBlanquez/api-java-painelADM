package com.adm.crm.service.implementa;

import java.util.List;
import com.adm.crm.model.Users;
import com.adm.crm.repository.UsersRepository;
import com.adm.crm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImplements implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> listAllUsers() {
        return this.usersRepository.findAll();
    }

    @Override
    public Users listById(String code) {
        return this.usersRepository
                .findById(code)
                .orElseThrow(() -> new IllegalArgumentException("ID not found"));
    }

    @Override
    public Users createNewUser(Users user) {
        return this.usersRepository.save(user);
    }

    @Override
    public Users updateUserInfo(Users user) {
        return this.usersRepository.save(user);
    }

    @Override
    public void deleteUser(String code) {
        this.usersRepository.deleteById(code);
    }

}
