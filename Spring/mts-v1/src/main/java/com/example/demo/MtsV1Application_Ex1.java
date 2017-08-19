package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Account;
import com.example.demo.model.AccountType;
import com.example.demo.repository.AccountRepository;

@SpringBootApplication
public class MtsV1Application_Ex1 {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(MtsV1Application_Ex1.class, args);

		AccountRepository accRepo = context.getBean(AccountRepository.class);

		// --------------------------------------------------

		// Account account = new Account();
		// account.setNum("1");
		// account.setName("Nag");
		// account.setBalance(2000.00);
		// account.setType(AccountType.SAVING);
		//
		// accRepo.save(account);
		//

		// --------------------------------------------------

		// List<Account> accounts = accRepo.findAll();
		// for (Account account : accounts) {
		// System.out.println(account);
		// }

		// --------------------------------------------------

		// Account account=accRepo.findOne("1");
		// System.out.println(account);

		// --------------------------------------------------

		// accRepo.delete("3");

		// --------------------------------------------------

		// List<Account> accounts = accRepo.findByBalance(2000.00);
		//
		// for (Account account : accounts) {
		// System.out.println(account);
		// }
		
		//------------------------------------------------------

	}
}
