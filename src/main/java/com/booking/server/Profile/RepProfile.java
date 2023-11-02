package com.booking.server.Profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepProfile extends JpaRepository<ProfileType,String>{
    
}
