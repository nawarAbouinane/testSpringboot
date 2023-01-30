package ma.epolytechnique.projetsynthese.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.epolytechnique.projetsynthese.dao.IFactureRepository;
import ma.epolytechnique.projetsynthese.entities.Facture;

@Service
public class ServiceFacture implements IFacture {
	
	@Autowired
	IFactureRepository factureRepository;

	@Override
	public List<Facture> allFactures() {
		return factureRepository.findAll();
	}

	@Override
	public List<Facture> ViewFactures(String etat) {
		return factureRepository.findFactureByEtat(etat);
	}

	@Override
	public Facture getfacture(int num_fact) {
		return factureRepository.getById(num_fact);
	}
	
	
	

}
