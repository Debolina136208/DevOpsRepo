package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long traineeId;
	
	private String traineeName;
	private String traineeDomain;
	private String traineeLocation;
	public Long getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	@Override
	public String toString() {
		return "traineeId=" + traineeId + "\ntraineeName=" + traineeName + "\ntraineeDomain=" + traineeDomain
				+ "\ntraineeLocation=" + traineeLocation
				+ "\n==============================================================";
	}
}