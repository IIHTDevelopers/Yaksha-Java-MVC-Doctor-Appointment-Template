package com.yaksha.training.doctorappointment.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.doctorappointment.entity.Appointment;

@Controller
@RequestMapping(value = { "/appointment", "/" })
public class AppointmentController {

	@RequestMapping(value = { "/list", "/" })
	public String listAppointments(Model theModel) {
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		return "";
	}

	@PostMapping("/saveAppointment")
	public String saveAppointment(@Valid @ModelAttribute("appointment") Appointment theAppointment, Model theModel) {
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("appointmentId") Long appointmentId, Model theModel) {
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("appointmentId") Long appointmentId, Model theModel) {
		return "";
	}
}
