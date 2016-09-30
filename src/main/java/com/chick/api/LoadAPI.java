package com.chick.api;

import java.util.ArrayList;
import java.util.List;

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
@RequestMapping("/load")
public class LoadAPI {	
	
	@RequestMapping(value = "/byname/{name}", method = RequestMethod.GET)
	public @ResponseBody Doc ByName(ModelMap model,@PathVariable("name") String name) {
		Doc demoDoc = null;
		if (name.equalsIgnoreCase("account-list")){
		List<Account> accoutList = new ArrayList<Account>();
			accoutList.add(new Account("5455", "Hung", "Chicken", "P@ssword123"));
			accoutList.add(new Account("1234", "Nguyen", "hnguyen283", "P@ssword123"));
			
			Image childImageCover = new Image();
			childImageCover.setLocation("chim.JPG");
			UserInterface childUi = new UserInterface("card", childImageCover, null, "This is child card", null);
			Doc childDoc = new Doc(null, "show-password",childUi, new Data("This is password"),null);
			
			Image imageCover = new Image();
			imageCover.setLocation("demo.JPG");
			String description = " This is my first demo";
			Action action = new Action("alert", "click", "", "");
			Action [] actionList = {action};
			UserInterface ui = new UserInterface("card", imageCover, null, description, actionList);
			demoDoc = new Doc(null, "account-list",ui, new Data(accoutList),childDoc);
		}
		return demoDoc;
	}
}
