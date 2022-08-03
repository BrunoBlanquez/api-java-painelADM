package com.adm.crm.repository;

import com.adm.crm.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsersRepository extends MongoRepository<Users, String> {
}
