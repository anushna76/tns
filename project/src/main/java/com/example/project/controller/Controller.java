package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Certificate;
import com.example.project.service.CertificateService;


@RestController
public class Controller {
	
	
	@Autowired
	private CertificateService cser;
	
	@PostMapping("/addcer")
	public Certificate regCer(@RequestBody Certificate cer) {
		return cser.addCer(cer);
		
	}
	
	//Get data
	@GetMapping("/getcer")
	public List<Certificate>getCertificate(Certificate cer){
		return cser.getCer(cer);
	}
	@PutMapping("/updatecer")
	public Certificate updateCertificate(@RequestBody Certificate cer) {
			
		return cser.updateCer(cer);

	}
	//delete
	@DeleteMapping("/deletecer/{id}")
	public void deleteCertificate(@PathVariable Long id) {
		cser.deleteCer(id);
		}
}
	
