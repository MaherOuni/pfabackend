package com.pfa.labor.dto;

import com.pfa.labor.dao.entities.Deposit;
import com.pfa.labor.dao.entities.Product;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class DepositDTO {

 
    private Long id;
    private String name;
    private Integer capacity;
    private Integer usedCapacity;
    private List<Product> product;

    /**
     * Maps an entity object to a DTO object
     * @param entity source
     * @return a DTO containing the values acquired from the entity
     */
    public static DepositDTO fromEntityToDto(Deposit entity) {
        DepositDTO dto = new DepositDTO();
        dto.setId(entity.getId());
        dto.setCapacity(entity.getCapacity());
        dto.setName(entity.getName());
        dto.setProduct(entity.getProduct());
        dto.setUsedCapacity(entity.getUsedCapacity());
        return dto;
    }

    /**
     * Maps a DTO object to an entity object
     * @param dto source
     * @return an entity containing the values acquired from the DTO
     */
    public static Deposit fromDtoToEntity(DepositDTO dto) {
        Deposit entity = new Deposit();
        entity.setId(dto.getId());
        entity.setCapacity(dto.getCapacity());
        entity.setName(dto.getName());
        entity.setProduct(dto.getProduct());
        entity.setUsedCapacity(dto.getUsedCapacity());

        return entity;
    }
}