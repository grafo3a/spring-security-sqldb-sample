package net.apasajb.spring_security_sqldb_sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	
	@GetMapping("/")
	@ResponseBody
	public String getSlash() {
		return "==== Bonjour les gens. Ici l'adresse / ====";
	}
	
	@GetMapping("/home")
	@ResponseBody
	public String getHome() {
		return "==== Bonjour les gens. Ici l'adresse /home ====";
	}
	
	@GetMapping("/user")
	@ResponseBody
	public String getUser() {
		return "==== Bonjour les gens. Ici l'adresse /user ====";
	}
	
	@GetMapping("/admin")
	@ResponseBody
	public String getAdmin() {
		return "==== Bonjour les gens. Ici l'adresse /admin ====";
	}
}
