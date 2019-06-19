package com.hcl.ingbanking.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingbanking.entity.Account;
import com.hcl.ingbanking.exception.ApplicationException;
import com.hcl.ingbanking.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	private static Logger logger = Logger.getLogger(AccountServiceImpl.class.getName());

	@Autowired
	AccountRepository accountRepositoty;

	@Override
	public Account getAccountDetails(Long accountId) throws ApplicationException {

		Account account = accountRepositoty.findByAccountId(accountId);
		logger.info("inside account details method");

		if (account == null) {
			throw new ApplicationException("Account Details Not Found");
		}
		return account;
	}

}
