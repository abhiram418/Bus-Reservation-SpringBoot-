package com.booking.server.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository
public interface Rep extends JpaRepository<LoginType,String>{

    @Query("SELECT password FROM LoginType WHERE userName = ?1")
    String findPasswordByUsername(String username);

}
