package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Sale;
import com.pfa.labor.dao.repositories.ISaleRepository;
import com.pfa.labor.dto.SaleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.pfa.labor.dto.SaleDTO.fromDtoToEntity;

@Service
public class SaleServiceImpl implements ISaleService {

    @Autowired
    private ISaleRepository repository;
    @Override
    public void addCommande(SaleDTO commande) {
        repository.save(fromDtoToEntity(commande));
    }

    @Override
    public void updateCommande(Sale sale) {
        if(sale != null && sale.getId() != null){
            Optional<Sale> CommandeFromDb = repository.findById(sale.getId());
            if(CommandeFromDb.isPresent()){
                repository.save(sale);
            }
        }
    }

    @Override
    public void deleteCommande(Long id) {
        if (id != null){
            repository.deleteById(id);
        }

    }

    @Override
    public List<Sale> getAll() {
        return repository.findAll();
    }
}
