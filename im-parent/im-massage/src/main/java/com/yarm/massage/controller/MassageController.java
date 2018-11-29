package com.yarm.massage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yarm.massage.pojo.AjaxResult;
import com.yarm.massage.pojo.ResponseMassage;
import com.yarm.massage.service.MassageService;
import com.yarm.massage.pojo.RequestMassage;

@RestController
@RequestMapping("massage")
public class MassageController {

	@Autowired
	private MassageService massageService;
	
	@RequestMapping(value="send", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult<ResponseMassage> sendMassage(@RequestBody RequestMassage
			requestMassage){
		ResponseMassage serviceResutl = this.massageService.sendMassage(requestMassage);
		return null;
	}
}
