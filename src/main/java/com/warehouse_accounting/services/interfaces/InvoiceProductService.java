package com.warehouse_accounting.services.interfaces;

import com.warehouse_accounting.models.dto.InvoiceProductDto;

import java.util.List;

public interface InvoiceProductService {

    List<InvoiceProductDto> getAll();

    InvoiceProductDto getById(Long id);

    void create(InvoiceProductDto invoiceProductDto);

    void update(InvoiceProductDto invoiceProductDto);

    void deleteById(Long id);
}
