package com.warehouse_accounting.services.interfaces;

import com.warehouse_accounting.models.dto.TypeOfContractorDto;

import java.util.List;

public interface TypeOfContractorService {
    List<TypeOfContractorDto> getAll();

    TypeOfContractorDto getById(Long id);

    void create(TypeOfContractorDto tcDTO);

    void deleteByID(Long Id);

    void update(TypeOfContractorDto tcDTO) ;
}

