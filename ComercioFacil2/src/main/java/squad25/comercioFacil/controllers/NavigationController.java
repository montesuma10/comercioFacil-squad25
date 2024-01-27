package squad25.comercioFacil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import squad25.comercioFacil.enums.SystemAlert;

@Controller
public class NavigationController { //Atualizado 27.01 18:08;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("alert", SystemAlert.SUCCESSFUL_OPERATION);
		Double seuValor = 100.00;
		String nome = "Monitor Gamer Hero Full Hd 27'' G-sync 144hz Ips 1ms Aoc Cor Preto/Vermelho 110V/220V";
		model.addAttribute("nome", nome);
        model.addAttribute("seuValor", seuValor);   
		return "index";
	}
	
	@GetMapping("/about")
    public String about() {
        return "pages/about";
    }
	
	@GetMapping("/contact")
    public String contact() {
        return "pages/contacts";
    }
	
	@GetMapping("/partnersClients")
	public String partClie() {
		return "pages/partnersClients";
	}
	
	@GetMapping("/adminSide")
	public String testeSide() {
		return "admin/marketsPage";
	}
	
	@GetMapping("/employerAdmin")
	public String empAdmin() {
//		"redirect:/isRegistered=" + false + "?showAlert=true" Trabalhando aqui, antes de colocar o model section;
		
		return "redirect:/employer/id=" + null + "/getAllEnterprises";
	}
	
	@GetMapping("/notfications")
	public String notifications() {
		return "employer/notificationsPage";
	}
	
	
	@GetMapping("/prodEnterprise")
	public String productEnterprise() {
		return "product/productEnterprise";
	}
	
	@GetMapping("/loginClient")
	public String loginClient() {
		return "client/login";
	}
	
	@GetMapping("/cadClient")
	public String cadClient() {
		return "client/register";				
	}
	
	@GetMapping("/help")
	public String help() {
		return "pages/help";
	}
}