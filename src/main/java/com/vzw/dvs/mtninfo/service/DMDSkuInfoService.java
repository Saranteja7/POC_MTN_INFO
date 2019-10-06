package com.vzw.dvs.mtninfo.service;

import com.vzw.dvs.mtninfo.models.DMDSkuResult;
import com.vzw.dvs.mtninfo.models.RequestModel;

public interface DMDSkuInfoService {
    public DMDSkuResult findByDMDDeviceSku(RequestModel requestModel);
}
