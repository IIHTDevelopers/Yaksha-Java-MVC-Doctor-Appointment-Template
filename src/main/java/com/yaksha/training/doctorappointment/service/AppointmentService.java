package com.yaksha.training.doctorappointment.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.doctorappointment.entity.Appointment;

@Service
public class AppointmentService {

	public List<Appointment> getAppointments() {
		// write your logic here
		return null;
	}

	public Appointment saveAppointment(Appointment theAppointment) {
		// write your logic here
		return null;
	}

	public Appointment getAppointment(Long appointmentId) {
		// write your logic here
		return null;
	}

	public boolean deleteAppointment(Appointment appointment) {
		// write your logic here
		return false;
	}

	public Page<Appointment> searchAppointments(String theSearchName, String theSearchDate, Pageable pageable) {
		// write your logic here
		return null;
	}

}
