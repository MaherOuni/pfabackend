package com.pfa.labor.dao.repositories;

import com.pfa.labor.dao.entities.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExchangeRepository extends JpaRepository<Exchange,Long> {
}
