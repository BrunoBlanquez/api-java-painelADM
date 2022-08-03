package com.adm.crm.service;

import com.adm.crm.model.Users;

import java.util.List;

public interface UsersService {

    List<Users> listAllUsers();

    public Users listById(String code);

    public Users createNewUser(Users user);

    public Users updateUserInfo(Users user);

    public void deleteUser(String code);
}
