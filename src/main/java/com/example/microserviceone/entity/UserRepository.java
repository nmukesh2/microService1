package com.example.microserviceone.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepository extends JpaRepository<UserDetails,Integer>{
    
}
