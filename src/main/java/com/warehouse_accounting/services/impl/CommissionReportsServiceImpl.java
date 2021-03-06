package com.warehouse_accounting.services.impl;

import com.warehouse_accounting.models.dto.CommissionReportsDto;
import com.warehouse_accounting.repositories.CommissionReportsRepository;
import com.warehouse_accounting.repositories.CompanyRepository;
import com.warehouse_accounting.repositories.ContractRepository;
import com.warehouse_accounting.repositories.ContractorRepository;
import com.warehouse_accounting.repositories.ProjectRepository;
import com.warehouse_accounting.services.interfaces.CommissionReportsService;
import com.warehouse_accounting.util.ConverterDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionReportsServiceImpl implements CommissionReportsService {
    private final CommissionReportsRepository commissionReportsRepository;
    private final ContractRepository contractRepository;
    private final ContractorRepository contractorRepository;
    private final CompanyRepository companyRepository;
    private final ProjectRepository projectRepository;

    public CommissionReportsServiceImpl(CommissionReportsRepository commissionReportsRepository,
                                        ContractRepository contractRepository,
                                        ContractorRepository contractorRepository,
                                        CompanyRepository companyRepository,
                                        ProjectRepository projectRepository) {
        this.commissionReportsRepository = commissionReportsRepository;
        this.contractRepository = contractRepository;
        this.contractorRepository = contractorRepository;
        this.companyRepository = companyRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public List<CommissionReportsDto> getAll() {
        List<CommissionReportsDto> dtos = commissionReportsRepository.getAll();
        for(CommissionReportsDto cr : dtos){
            cr.setContractDto(contractRepository.getById(cr.getContractDto().getId()));
            cr.setContractorDto(contractorRepository.getById(cr.getContractorDto().getId()));
            cr.setCompanyDto(companyRepository.getById(cr.getCompanyDto().getId()));
            cr.setProjectDto(projectRepository.getById(cr.getProjectDto().getId()));
        }
        return dtos;
    }

    @Override
    public CommissionReportsDto getById(Long id) {
        CommissionReportsDto dto = commissionReportsRepository.getById(id);
        dto.setContractDto(contractRepository.getById(dto.getContractDto().getId()));
        dto.setContractorDto(contractorRepository.getById(dto.getContractorDto().getId()));
        dto.setCompanyDto(companyRepository.getById(dto.getCompanyDto().getId()));
        dto.setProjectDto(projectRepository.getById(dto.getProjectDto().getId()));
        return dto;
    }

    @Override
    public void create(CommissionReportsDto commissionReportsDto) {
        commissionReportsRepository.save(ConverterDto.convertToModel(commissionReportsDto));
    }

    @Override
    public void update(CommissionReportsDto commissionReportsDto) {
        commissionReportsRepository.save(ConverterDto.convertToModel(commissionReportsDto));
    }

    @Override
    public void deleteById(Long id) {
        commissionReportsRepository.deleteById(id);
    }
}
