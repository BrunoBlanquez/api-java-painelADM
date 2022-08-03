package com.adm.crm.model;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Data
@Document("users")
public class Users {

    @Id
    private String id;

    private String user;

    private String fullName;

    private String birthday;

    private String avatar;

    private String email;

    private String password;

    private long phoneNumber;

    private String address;

    private Date registrationDate = new Date(System.currentTimeMillis());
}
