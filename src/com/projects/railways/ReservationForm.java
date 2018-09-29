package com.projects.railways;

import java.util.List;

import com.projects.railways.Domain.PassengerDomain;

public class ReservationForm {
	private double trainNo;
	private List<PassengerDomain> passengers;
	public double getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(double trainNo) {
		this.trainNo = trainNo;
	}
	public List<PassengerDomain> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerDomain> passengers) {
		this.passengers = passengers;
	}
}