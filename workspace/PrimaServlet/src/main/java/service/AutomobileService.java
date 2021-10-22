package service;

import java.util.List;

import model.Automobile;
import repository.AutomobileDAO_Jdbc;

public class AutomobileService {
	AutomobileDAO_Jdbc dao = new AutomobileDAO_Jdbc();
	public List<Automobile> getAllAutomobili() {

		return dao.getAll();
		
	}
	public void saveAutomobile(Automobile auto) {
		dao.save(auto);
	}
	public Automobile getAuto(int auto_id) {
		return dao.getAutoById(auto_id);
		
	}

}
