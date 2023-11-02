package com.booking.server.UserBooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface RepUserBookings extends JpaRepository<UserBookingType,String>{
    
    // @Query("FROM UserBookingType WHERE userName=?1")
    List<UserBookingType> findByUserName(String userName);
}
