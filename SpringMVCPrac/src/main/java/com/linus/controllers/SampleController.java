package com.linus.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linus.model.Account;

@Controller
public class SampleController {
	
	private String[] quotes= {"To be or not to be - Shakespeare",
					"If you change nothing, nothing will change - Gandhi",
					"What's in a name? - Shakespeare"};
	
	@RequestMapping(value="/getQuote")
	public String getRandomQuote(Model model) {
		
		int index= new Random().nextInt(quotes.length);
		String quote= quotes[index];
		
		model.addAttribute("randomQuote",quote);
		
		return "quote";
	}
	
	@RequestMapping(value="/createAccount")
	public String createAccount(@ModelAttribute("newAccount") Account account) {
		
		return "createAccount";
	}
	
	
	@RequestMapping(value="/result")
	public String createAccountResult(@ModelAttribute("newAccount") Account account,
			Model result) {
		System.out.println(account.getFirstName()+" "+account.getLastName()+" "+account.getEmail());
		
		if(account.getFirstName() != null && !account.getFirstName().isEmpty()
				&& account.getLastName()!=null && !account.getLastName().isEmpty()
				&& account.getEmail() != null && !account.getEmail().isEmpty()) {
			result.addAttribute("firstName",account.getFirstName());
			result.addAttribute("lastName", account.getLastName());
			result.addAttribute("email", account.getEmail());
			result.addAttribute("creationResult","success");
		}
		else {
			result.addAttribute("creationResult", "fail");
		}
		return "createAccountResult";
	}

}
