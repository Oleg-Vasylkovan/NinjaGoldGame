package com.example.demo;

import javax.servlet.http.HttpSession;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaGoldGameController {
	@RequestMapping("/gold")
	public String index(Model model, HttpSession session) {
		FormPlayer player = (FormPlayer) session.getAttribute("player");
		if(player == null) {
			session.setAttribute("player", new FormPlayer());
		}
		model.addAttribute("player", player);
		return "index.jsp";
	}
	@PostMapping("/farmAction")
	public String farm(HttpSession session) {
		Random rand = new Random();
		FormPlayer player=(FormPlayer) session.getAttribute("player");
		Integer income = rand.nextInt(10)+10;
		player.gold += income;
		player.addmsg("You wen't to the FARM and earned" + income + "points");
		return "redirect:/gold";
	}
	@PostMapping("/caveAction")
	public String cave(HttpSession session) {
		Random rand = new Random();
		FormPlayer player=(FormPlayer) session.getAttribute("player");
		Integer income = rand.nextInt(5)+10;
		player.gold += income;
		player.addmsg("You wen't to the CAVE and earned" + income + "points");
		return "redirect:/gold";
	}
	@PostMapping("/houseAction")
	public String house(HttpSession session) {
		Random rand = new Random();
		FormPlayer player=(FormPlayer) session.getAttribute("player");
		Integer income = rand.nextInt(2)+5;
		player.gold += income;
		player.addmsg("You wen't to the House and earned" + income + "points");
		return "redirect:/gold";
	}
	@PostMapping("/casinoAction")
	public String casino(HttpSession session) {
		Random rand = new Random();
		FormPlayer player=(FormPlayer) session.getAttribute("player");
		Integer income = rand.nextInt(0)+50;
		player.gold += income;
		player.addmsg("You wen't to the Casino and earned" + income + "points");
		return "redirect:/gold";
	}
}
	
