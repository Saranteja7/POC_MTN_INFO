package com.vzw.dvs.mtninfo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vzw.dvs.mtninfo.models.DMDSkuResult;
import com.vzw.dvs.mtninfo.models.RequestModel;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class DMDSkuInfoServiceImpl implements  DMDSkuInfoService{
    private static final Logger logger = LoggerFactory.getLogger(DMDSkuInfoServiceImpl.class);

    Map keyAttr = new HashMap<String, String>();

    @Autowired
    PNORestClient pnoRestClient;
    @Override
    public DMDSkuResult findByDMDDeviceSku(RequestModel requestModel) {
        DMDSkuResult dmdSkuResult = new DMDSkuResult();
        requestModel.setCorrelationId("1234567890");
        requestModel.setOrginalService("multiDeviceLookup");
        requestModel.setOrginalSubService("NONE");
        StringBuilder sb = pnoRestClient.getPNOResponse(requestModel);

        ObjectMapper mapper = new ObjectMapper();
        try {
            if(sb.toString() != null && !StringUtils.isEmpty(sb.toString()))
                logger.info("Getting PNO response ");
            else
                logger.error("No response from PNO");
            dmdSkuResult = mapper.readValue(sb.toString(), DMDSkuResult.class);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.error("IOException "+e.getMessage());
        }


        return dmdSkuResult;
    }
}
