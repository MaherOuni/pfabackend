package com.pfa.labor.dao.repositories;

import com.pfa.labor.dao.entities.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepositRepository extends JpaRepository<Deposit,Long> {
}
