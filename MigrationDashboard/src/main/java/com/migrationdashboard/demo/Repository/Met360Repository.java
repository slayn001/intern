package com.migrationdashboard.demo.Repository;


import com.migrationdashboard.demo.Models.MetLife360Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Met360Repository extends JpaRepository <MetLife360Policy,Long> {



}
