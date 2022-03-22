package com.example.model.contract;

import java.util.List;

public class Contract {
    private int idContract;
    private String startDateContract;
    private String endDateContract;
    private String contactDetail;
    private double contractTotalMoney;
    private int idEmployee;
    private int idCumtomer;
    private int idService;
    private List<ContractDetail> listAttachService;

    public Contract() {
    }

    public Contract(int idContract, String startDateContract, String contactDetail, double contractTotalMoney, int idEmployee, int idCumtomer, int idService) {
        this.idContract = idContract;
        this.startDateContract = startDateContract;
        this.contactDetail = contactDetail;
        this.contractTotalMoney = contractTotalMoney;
        this.idEmployee = idEmployee;
        this.idCumtomer = idCumtomer;
        this.idService = idService;
    }

    public Contract(int idContract, String startDateContract, String endDateContract, String contactDetail, double contractTotalMoney, int idEmployee, int idCumtomer, int idService) {
        this.idContract = idContract;
        this.startDateContract = startDateContract;
        this.endDateContract = endDateContract;
        this.contactDetail = contactDetail;
        this.contractTotalMoney = contractTotalMoney;
        this.idEmployee = idEmployee;
        this.idCumtomer = idCumtomer;
        this.idService = idService;
    }

    public Contract(int idContract, String startDateContract, String endDateContract, String contactDetail, double contractTotalMoney, int idEmployee, int idCumtomer, int idService, List<ContractDetail> listAttachService) {
        this.idContract = idContract;
        this.startDateContract = startDateContract;
        this.endDateContract = endDateContract;
        this.contactDetail = contactDetail;
        this.contractTotalMoney = contractTotalMoney;
        this.idEmployee = idEmployee;
        this.idCumtomer = idCumtomer;
        this.idService = idService;
        this.listAttachService = listAttachService;
    }

    public List<ContractDetail> getListAttachService() {
        return listAttachService;
    }

    public void setListAttachService(List<ContractDetail> listAttachService) {
        this.listAttachService = listAttachService;
    }

    public String getEndDateContract() {
        return endDateContract;
    }

    public void setEndDateContract(String endDateContract) {
        this.endDateContract = endDateContract;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getStartDateContract() {
        return startDateContract;
    }

    public void setStartDateContract(String startDateContract) {
        this.startDateContract = startDateContract;
    }

    public String getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(String contactDetail) {
        this.contactDetail = contactDetail;
    }

    public double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdCumtomer() {
        return idCumtomer;
    }

    public void setIdCumtomer(int idCumtomer) {
        this.idCumtomer = idCumtomer;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }
}
