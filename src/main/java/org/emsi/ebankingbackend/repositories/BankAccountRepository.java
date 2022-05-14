package org.emsi.ebankingbackend.repositories;

import org.emsi.ebankingbackend.entities.BankAccount;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
