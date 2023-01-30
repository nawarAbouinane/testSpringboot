package ma.epolytechnique.projetsynthese.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.epolytechnique.projetsynthese.entities.Facture;
import ma.epolytechnique.projetsynthese.metier.ServiceFacture;



@Controller
public class FactureController {
	
	@Autowired
	ServiceFacture serviceFacture;
	
	@Secured(value = {"ROLE_ADMIN"})
	@RequestMapping(value = "/factures")
	public String all_factures(Model model){
		model.addAttribute("factures",serviceFacture.allFactures() );
		return "all_factures";
	}

	@Secured(value = {"ROLE_VISITEUR","ROLE_ADMIN"})
	@RequestMapping(value = "/encours")
	public String View(Model model){
		model.addAttribute("factures",serviceFacture.ViewFactures("encours") );
		return "View";
	}
	
	@RequestMapping(value = "/index")
	public String index(Model model,Principal principal)
	{
		model.addAttribute("name", principal.getName());
		return "index";
	}
	@Secured(value = {"ROLE_ADMIN"})
	@RequestMapping(value = "/find")
	public String find()
	{
	return "find";
	}
	@Secured(value = {"ROLE_ADMIN"})
	@RequestMapping(value = "/findfacture")
	public String findfacture(@RequestParam int num_fact,Model model)
	{

		Facture f =serviceFacture.getfacture(num_fact);
		model.addAttribute("facture",f );	
	    return "findfacture";

	}
	
}
