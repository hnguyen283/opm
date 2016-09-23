package com.chick.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chick.model.object.Account;

@Controller
@RequestMapping("/account")
public class AccountAPI {
	
	@RequestMapping(value = "/account_list", method = RequestMethod.GET)
	public @ResponseBody List AdminUser(ModelMap model) {	
		List<Account> accoutList = new ArrayList<Account>();
		accoutList.add(new Account("5455", "Hung", "Chicken", "P@ssword123"));
		accoutList.add(new Account("1234", "Nguyen", "hnguyen283", "P@ssword123"));
		return accoutList;
	}
	
}
