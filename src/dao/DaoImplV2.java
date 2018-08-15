package dao;

import org.springframework.stereotype.Repository;

//@Repository
public class DaoImplV2 implements IDao{

	@Override
	public double getTemperateur() {
		/*
		 *  Dans cette version, je me connecte à un web service
		 *  pour récupérer la température
		 */
		double data = 32;
		return data;
	}

}
