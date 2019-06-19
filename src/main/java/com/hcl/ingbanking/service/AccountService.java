package com.hcl.ingbanking.service;

import org.springframework.stereotype.Service;

import com.hcl.ingbanking.entity.Account;
import com.hcl.ingbanking.exception.ApplicationException;

@Service
public interface AccountService {

	Account getAccountDetails(Long accountId) throws ApplicationException;
}
