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
		System.out.println(account.getFirstName()+" "+account.getLastName()+" "+account.getEmail());
		
		return "createAccount";
	}

}
