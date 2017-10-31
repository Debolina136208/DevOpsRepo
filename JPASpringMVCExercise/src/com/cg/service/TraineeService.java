package com.cg.service;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService {

	public abstract Trainee save(Trainee employee);
	
	public abstract Trainee modify(Trainee employee);

	public Trainee getTrainee(int id);
	
	public Trainee deleteTrainee(long id);
	
	public abstract List<Trainee> loadAll();

}