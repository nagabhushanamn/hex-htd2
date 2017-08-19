package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	@Autowired(required = true)
	private AccountRepository accountRepository;

	@Override
	@Transactional(rollbackFor = {
			AccountUpdateException.class }, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		// load from & to Accounts
		Account fromAccount = accountRepository.findOne(fromAccNum);
		Account toAccount = accountRepository.findOne(toAccNum);

		if (amount <= fromAccount.getBalance()) {
			// debit & credit
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			// update both accounts
			accountRepository.save(fromAccount);

			boolean flag = false;
			if (flag)
				throw new AccountUpdateException();

			accountRepository.save(toAccount);

		} else {
			throw new AccountBalanceException("No enough balance");
		}

		return true;

	}

}
