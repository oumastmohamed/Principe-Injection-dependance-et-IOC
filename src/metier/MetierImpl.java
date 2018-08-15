package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import dao.IDao;

@Service //declarer cette classe comme un bean
public class MetierImpl implements IMetier{
	@Autowired // faire l'injection de dépendance
	private IDao dao;
	@Override
	public double calcul() {
		double temp = dao.getTemperateur();
		double res = temp * 12;
		return res;
	}
	public IDao getDao() {
		return dao;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}
}
