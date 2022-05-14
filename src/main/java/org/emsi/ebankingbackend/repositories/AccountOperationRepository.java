package org.emsi.ebankingbackend.repositories;

import org.emsi.ebankingbackend.entities.AccountOperation;
import org.emsi.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
