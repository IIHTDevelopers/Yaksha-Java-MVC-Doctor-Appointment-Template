package com.yaksha.training.doctorappointment.repository;

import java.sql.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.doctorappointment.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	// write your logic here

	// feel free to update this
	Page<Appointment> findByPatientNameAndAppointmentDate(@Param("keyword") String keyword,
			@Param("apptDate") Date apptDate, Pageable pageable);
}
