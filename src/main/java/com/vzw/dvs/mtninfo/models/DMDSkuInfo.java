package com.vzw.dvs.mtninfo.models;

public class DMDSkuInfo {
    private String deviceSku;
    private String createdBy;
    private String mfgCode;
    private String prodName;

    public DMDSkuInfo() {
    }

    public DMDSkuInfo(String deviceSku, String createdBy, String mfgCode, String prodName) {
        this.deviceSku = deviceSku;
        this.createdBy = createdBy;
        this.mfgCode = mfgCode;
        this.prodName = prodName;
    }

    public String getDeviceSku() {
        return deviceSku;
    }

    public void setDeviceSku(String deviceSku) {
        this.deviceSku = deviceSku;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getMfgCode() {
        return mfgCode;
    }

    public void setMfgCode(String mfgCode) {
        this.mfgCode = mfgCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
