package com.pfa.labor.dao.repositories;

import com.pfa.labor.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client,Long> {
}
