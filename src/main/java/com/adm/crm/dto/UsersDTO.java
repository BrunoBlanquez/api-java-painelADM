package com.adm.crm.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UsersDTO {

    @NotEmpty
    private String user;

    @NotEmpty
    private String fullName;

    @NotEmpty
    private String birthday;

    private String avatar;

    private String email;

    private long phoneNumber;

    private String address;

    @Size(min = 8, max = 300)
    private String password;
}
