package com.example.project.service;
//CRUD operational methods

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Certificate;
import com.example.project.repository.CertificateRepo;


@Service
public class CertificateService {
	@Autowired
	private CertificateRepo crepo;
	
	//inserting data
	public Certificate addCer(Certificate cer) {
		return crepo.save(cer);
	}
	//Get data
	public List<Certificate>getCer(Certificate cer){
		return crepo.findAll();
		}
		
	//update data
	
	public Certificate updateCer(Certificate cer) {
			
		long id=cer.getId();
		Certificate cer1=crepo.findById(id).get();
		cer1.setYear(cer.getYear());
		cer1.setCollege(cer.getCollege());
			return crepo.save(cer);
			}
		
		//delete
		public void deleteCer(long id) {
			crepo.deleteById(id);
		}

}
