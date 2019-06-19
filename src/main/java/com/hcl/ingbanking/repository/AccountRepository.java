package com.hcl.ingbanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ingbanking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByAccountId(Long accountId);
}
