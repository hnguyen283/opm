package com.chick.api;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountAPI {
	
	@RequestMapping(value = "/account_list", method = RequestMethod.GET)
	public @ResponseBody List AdminUser(ModelMap model) {	
		return null;
	}
	
}
