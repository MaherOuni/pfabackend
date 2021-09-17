package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Deposit;
import com.pfa.labor.dto.DepositDTO;

import java.util.List;

public interface IDepositService {
    void addDeposit(DepositDTO Deposit);

    void updateDeposit(Deposit Deposit);

    void deleteDeposit(Long id);

    List<Deposit> getAll();
}
