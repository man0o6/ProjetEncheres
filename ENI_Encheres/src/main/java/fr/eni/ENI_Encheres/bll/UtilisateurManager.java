package fr.eni.ENI_Encheres.bll;

import java.util.List;

import fr.eni.ENI_Encheres.bo.Utilisateur;
import fr.eni.ENI_Encheres.dal.DALException;
import fr.eni.ENI_Encheres.dal.DAO;
import fr.eni.ENI_Encheres.dal.DAOFactory;

public class UtilisateurManager {

	
	private static DAO<Utilisateur> daoUtilisateur;

	public UtilisateurManager() throws BLLException{
			//Instancier le Data Access Object
		daoUtilisateur =DAOFactory.getUtilisateurDAO();
	}
	/**
	 * 
	 * Select All
	 * 
	 * @return
	 * @throws BLLException
	 */
	
	public List<Utilisateur> getAllUtilisateur() throws BLLException{
		List<Utilisateur> utilisateurs=null;
		try {
			utilisateurs = daoUtilisateur.selectAll();
		} catch (DALException e) {
			e.printStackTrace();
			throw new BLLException("Erreur récupération utilisateurs", e);
		}
		
		return utilisateurs;
	}
	/**
	 * Select by Id
	 * 
	 */
	public Utilisateur getUtilisateurById(int id) throws BLLException{
		Utilisateur utilisateur = null;
		try {
			utilisateur = daoUtilisateur.selectById(id);
		} catch (DALException e) {
			
			e.printStackTrace();
			throw new BLLException("Erreur récupération de l'utilisateur id="+id, e);
		}
		return utilisateur;
	}
	
	/**
	 * Ajout d'un Utilisateur 
	 * @param newArticle
	 * @return index du nouvel utilisateur dans le catalogue
	 * @throws BLLException 
	 */
	public void ajoutUtilisateur(Utilisateur newUtilisateur) throws BLLException {
		
		try {
			// TODO Faire une validation 
			//validerUtilisateur(newUtilisateur);
			daoUtilisateur.insert(newUtilisateur);
		} catch (DALException e) {
			throw new BLLException("Echec ajout Utilisateur", e);
		}
	}

	/**
	 * updateArticle : Modifier un article du catalogue
	 * @param article
	 * @throws BLLException
	 */
	public void updateUtilisateur(Utilisateur utilisateur) throws BLLException{
		try {
			//validerUtilisateur(utilisateur);
			daoUtilisateur.update(utilisateur);
			
		} catch (DALException e) {
			throw new BLLException("Echec updateUtilisateur-utilisateur:"+utilisateur, e);
		}
	}
	
	
	
	
	/**
	 * Supprimer un article du catalogue
	 * @param index
	 * @throws BLLException
	 */
	public void removeArticle(Utilisateur utilisateur ) throws BLLException{
		try {
			daoUtilisateur.delete(utilisateur);
		} catch (DALException e) {
			throw new BLLException("Echec de la suppression de l'utilisateur - ", e);
		}
		
	}
	
	
	public void validerUtilisateur(Utilisateur utilisateur) throws BLLException
	{}
}