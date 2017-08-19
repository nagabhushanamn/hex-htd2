package com.example.demo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.TxrService;

@Controller
@RequestMapping("/bank/txr")
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doTxr(HttpServletRequest req) {

		String amount = req.getParameter("amount");
		String fromAccNum = req.getParameter("fromAccNum");
		String toAccNum = req.getParameter("toAccNum");

		boolean b = txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("txr-status");
		mav.addObject("status", b ? "Txr success" : "Txr Failed");

		return mav;

	}

}
