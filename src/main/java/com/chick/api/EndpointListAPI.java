package com.chick.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chick.model.object.Account;
import com.chick.model.object.Action;
import com.chick.model.object.Data;
import com.chick.model.object.Doc;
import com.chick.model.object.Image;
import com.chick.model.object.UserInterface;

@Controller
@RequestMapping("/common")
public class EndpointListAPI {

	@RequestMapping(value = "/endpoint-list", method = RequestMethod.GET)
	public @ResponseBody Map ByName(ModelMap model) {
		Map endpointList = new HashMap<>();
		endpointList.put("ACCOUNT_LIST", "account-list");
		return endpointList;
	}
}
