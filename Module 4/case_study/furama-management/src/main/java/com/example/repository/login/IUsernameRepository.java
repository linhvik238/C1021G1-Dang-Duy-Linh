package com.example.repository.login;

import com.example.model.person.Username;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsernameRepository extends JpaRepository <Username, String> {
    Username findByUsername(String username);
}
