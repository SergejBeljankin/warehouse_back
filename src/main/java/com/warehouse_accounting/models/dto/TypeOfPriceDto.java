package com.warehouse_accounting.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfPriceDto {

    private Long id;

    private String name;

    private String sortNumber;
}


