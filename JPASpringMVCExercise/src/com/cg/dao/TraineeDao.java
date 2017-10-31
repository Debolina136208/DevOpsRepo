package com.cg.dao;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeDao {

	public abstract Trainee save(Trainee trainee);

	public abstract Trainee modify(Trainee trainee);
	
	public abstract Trainee get(int id);

	public Trainee deleteTrainee(long id);
	
	public abstract List<Trainee> loadAll();

}