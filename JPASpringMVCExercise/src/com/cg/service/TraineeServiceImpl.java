package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeDao;
import com.cg.entities.Trainee;

@Service 
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeDao traineeDaoImpl;
	
	
	/* (non-Javadoc)
	 * @see com.cg.service.EmployeeService#save(com.cg.entities.Employee)
	 */
	@Override
	public Trainee save(Trainee trainee) {
		return traineeDaoImpl.save(trainee);
	}
	
	/* (non-Javadoc)
	 * @see com.cg.service.EmployeeService#loadAll()
	 */
	@Override
	public List<Trainee> loadAll() {
		return traineeDaoImpl.loadAll();
	}
	
	@Override
	public Trainee getTrainee(int id) {
		return traineeDaoImpl.get(id);
	}

	@Override
	public Trainee deleteTrainee(long id) {
		// TODO Auto-generated method stub
		return traineeDaoImpl.deleteTrainee(id);
	}

	@Override
	public Trainee modify(Trainee trainee) {
		return traineeDaoImpl.modify(trainee);
	}
}