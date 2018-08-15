package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao{

	@Override
	public double getTemperateur() {
		/*
		 *  Se connecter à la BD pour récupérer la températeur
		 */
		double data = 14;
		return data;
	}

}
