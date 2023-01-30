package ma.epolytechnique.projetsynthese.metier;

import java.util.List;


import ma.epolytechnique.projetsynthese.entities.Facture;


public interface IFacture {
	
	public List<Facture> allFactures();
	
	public Facture getfacture(int num_fact);

	public List<Facture> ViewFactures(String etat);

}
