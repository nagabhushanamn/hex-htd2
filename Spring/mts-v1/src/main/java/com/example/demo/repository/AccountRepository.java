package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;

@Repository("accountRepo")
public interface AccountRepository extends JpaRepository<Account, String> {
	// List<Account> findByBalance(double balance);
}
