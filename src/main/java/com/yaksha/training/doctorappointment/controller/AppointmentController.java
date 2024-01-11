package com.yaksha.training.doctorappointment.controller;

import java.text.ParseException;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.doctorappointment.entity.Appointment;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/appointment", "/" })
public class AppointmentController {

	@RequestMapping(value = { "/list", "/" })
	public String listAppointments(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@RequestParam(value = "theSearchDate", required = false) String theSearchDate,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) throws ParseException {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveAppointment")
	public String saveAppointment(@Valid @ModelAttribute("appointment") Appointment theAppointment,
			BindingResult bindingResult, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("appointmentId") Long appointmentId, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("appointmentId") Long appointmentId, Model theModel) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchAppointment(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@RequestParam(value = "theSearchDate", required = false) String theSearchDate, Model theModel,
			Pageable pageable) {
		// write your logic here
		return "";
	}
}
