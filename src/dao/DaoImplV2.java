package dao;

import org.springframework.stereotype.Repository;

//@Repository
public class DaoImplV2 implements IDao{

	@Override
	public double getTemperateur() {
		/*
		 *  Dans cette version, je me connecte � un web service
		 *  pour r�cup�rer la temp�rature
		 */
		double data = 32;
		return data;
	}

}
