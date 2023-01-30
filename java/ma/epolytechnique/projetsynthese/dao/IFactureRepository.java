package ma.epolytechnique.projetsynthese.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.epolytechnique.projetsynthese.entities.Facture;
@Repository
public interface IFactureRepository extends JpaRepository<Facture,Integer> {
	List findFactureByEtat (String etat);

}
