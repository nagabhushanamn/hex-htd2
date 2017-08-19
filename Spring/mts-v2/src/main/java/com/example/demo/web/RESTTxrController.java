package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.TxrService;

@Controller
@RequestMapping("/api/txr")
public class RESTTxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody TxrResponse doTxr(@RequestBody TxrRequest request) {

		boolean b = txrService.txr(request.getAmount(), request.getFromAccNum(), request.getToAccNum());

		TxrResponse response = new TxrResponse();
		response.setStatus(b ? "Txr Success" : "Txr Failed");

		return response;

	}

}
