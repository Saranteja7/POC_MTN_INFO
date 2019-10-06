package com.vzw.dvs.mtninfo.controller;


import com.vzw.dvs.mtninfo.models.DMDSkuInfo;
import com.vzw.dvs.mtninfo.models.DMDSkuResult;
import com.vzw.dvs.mtninfo.models.RequestModel;
import com.vzw.dvs.mtninfo.service.DMDSkuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mtn_info")
@RefreshScope
public class Mtncontroller {


	@Value("${message}")
	private String message;

	@Autowired
	DMDSkuInfoService dmdSkuInfoService;

	@GetMapping("/getmessage")
	public String sayHello()
	{
		return message;
	}
	@PostMapping(value = "/findbyid")
	public DMDSkuResult findByDeviceSku(@RequestBody RequestModel requestModel) {
		return dmdSkuInfoService.findByDMDDeviceSku(requestModel);
	}
}
