package com.pfa.labor.web.rest;


import com.pfa.labor.dao.entities.Sale;
import com.pfa.labor.dto.SaleDTO;
import com.pfa.labor.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/sale")
public class SaleRestController {

    @Autowired
    private ISaleService service;

    @PostMapping("/add")
    public void createCommande(@RequestBody SaleDTO commande){
        service.addCommande(commande);
    }

    @PutMapping("/update")
    public void updateCommande(@RequestBody Sale sale){
        service.updateCommande(sale);
    }

    @DeleteMapping("/delete/{idCommande}")
    public void deleteCommande(@PathVariable("idCommande") Long id) {
        service.deleteCommande(id);
    }
    @GetMapping("/all")
    public List<Sale> getAll (){
        return service.getAll();
    }
}
