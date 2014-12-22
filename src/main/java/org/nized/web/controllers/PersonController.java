package org.nized.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/person")
public class PersonController {

	@RequestMapping("error")
	public String catchAllErrors(@RequestParam(value = "name", required = false,
			defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		return "error";
	}

}
