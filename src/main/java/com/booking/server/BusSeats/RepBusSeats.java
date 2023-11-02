package com.booking.server.BusSeats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepBusSeats extends JpaRepository<BusSeatsType,Integer>{
    
}
