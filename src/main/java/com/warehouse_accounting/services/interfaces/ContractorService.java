package com.warehouse_accounting.services.interfaces;

import com.warehouse_accounting.models.dto.ContractorDto;

import java.util.List;

public interface ContractorService {
    List<ContractorDto> getAll();

    ContractorDto getById(Long id);

    void create(ContractorDto contractorDto);

    void update(ContractorDto contractorDto);

    void deleteById(Long id);
}
