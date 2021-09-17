package com.pfa.labor.dao.repositories;

import com.pfa.labor.dao.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale, Long> {
}
