package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Sale;
import com.pfa.labor.dto.SaleDTO;

import java.util.List;

public interface ISaleService {
    void addCommande(SaleDTO order);

    void updateCommande(Sale order);

    void deleteCommande(Long id);

    List<Sale> getAll();
    
}
