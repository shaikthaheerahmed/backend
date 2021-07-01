package com.openstrap.openstrap.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Transport;
import com.openstrap.openstrap.repositories.TransportRepository;

@Service
public class TransportService {
@Autowired private TransportRepository transportRepository;
	public List<Transport> getTransport() {
		return transportRepository.findAll();
	}
	public void save(Transport transport) {
		transportRepository.save(transport);
		
	}
	public void save1(Transport transport) {
		transportRepository.save(transport);
		
	}
	public Optional<Transport> findById(int id) {
		return transportRepository.findById(id);
	}

}
