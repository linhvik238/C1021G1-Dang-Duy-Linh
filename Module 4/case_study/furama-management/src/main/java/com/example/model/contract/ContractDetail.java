package com.example.model.contract;

public class ContractDetail {
    private String idContactDetail;
    private String attachService;
    private int quantity;
    private int idContract;


    public ContractDetail() {
    }

    public ContractDetail(String idContactDetail, String attachService, int quantity) {
        this.idContactDetail = idContactDetail;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public ContractDetail(String idContactDetail, String attachService, int quantity, int idContract) {
        this.idContactDetail = idContactDetail;
        this.attachService = attachService;
        this.quantity = quantity;
        this.idContract = idContract;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getIdContactDetail() {
        return idContactDetail;
    }

    public void setIdContactDetail(String idContactDetail) {
        this.idContactDetail = idContactDetail;
    }

    public String getAttachService() {
        return attachService;
    }

    public void setAttachService(String attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
