package com.klu.jfsdproject;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.jfsd.Entries.CertificationUsers;

public interface UserRepository extends JpaRepository<CertificationUsers, Long> {
    boolean existsByEmail(String email); // To check for existing users
}
