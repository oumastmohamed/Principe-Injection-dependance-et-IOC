package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao{

	@Override
	public double getTemperateur() {
		/*
		 *  Se connecter � la BD pour r�cup�rer la temp�rateur
		 */
		double data = 14;
		return data;
	}

}
