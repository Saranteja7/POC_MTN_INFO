package com.vzw.dvs.mtninfo.models;

import java.util.List;

public class Results {
    List<DMDSkuInfo> dmdSkuInfo;

    public Results(List<DMDSkuInfo> dmdSkuInfo) {
        this.dmdSkuInfo = dmdSkuInfo;
    }

    public Results() {
    }

    public List getDmdDeviceInfo() {
        return dmdSkuInfo;
    }

    public void setDmdDeviceInfo(List<DMDSkuInfo> dmdSkuInfo) {
        this.dmdSkuInfo = dmdSkuInfo;
    }
}
