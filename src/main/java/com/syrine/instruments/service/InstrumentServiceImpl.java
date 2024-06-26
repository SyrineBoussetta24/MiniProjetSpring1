package com.syrine.instruments.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.syrine.instruments.entities.Instrument;
import com.syrine.instruments.entities.Type;
import com.syrine.instruments.repos.InstrumentRepository;
import com.syrine.instruments.repos.TypeRepository;

@Service
public class InstrumentServiceImpl implements InstrumentService {
	@Autowired
	InstrumentRepository instrumentRepository;
	
	@Autowired
	TypeRepository typeRepository;

	@Override
	public Instrument saveInstrument(Instrument i) {
		return instrumentRepository.save(i);
	}

	@Override
	public Instrument updateInstrument(Instrument i) {
		return instrumentRepository.save(i);
	}

	@Override
	public void deleteInstrument(Instrument i) {
		instrumentRepository.delete(i);
	}

	@Override
	public void deleteInstrumentById(Long id) {
		instrumentRepository.deleteById(id);
	}

	@Override
	public Instrument getInstrument(Long id) {
		return instrumentRepository.findById(id).get();
	}

	@Override
	public List<Instrument> getAllInstruments() {
		return instrumentRepository.findAll();
	}

	@Override
	public Page<Instrument> getAllInstrumentsParPage(int page, int size) {
		return instrumentRepository.findAll(PageRequest.of(page, size));
	}
	
	@Override
	public List<Instrument> findByNomInstrument(String nom) {
	return instrumentRepository.findByNomInstrument(nom);
	}
	@Override
	public List<Instrument> findByNomInstrumentContains(String nom) {
	return instrumentRepository.findByNomInstrumentContains(nom);
	}
	@Override
	public List<Instrument> findByNomPrix(String nom, Double prix) {
	return instrumentRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Instrument> findByType(Type type) {
	return instrumentRepository.findByType(type);
	}
	@Override
	public List<Instrument> findByTypeIdTyp(Long id) {
	return instrumentRepository.findByTypeIdTyp(id);
	}
	@Override
	public List<Instrument> findByOrderByNomInstrumentAsc() {
	return instrumentRepository.findByOrderByNomInstrumentAsc();
	}
	@Override
	public List<Instrument> trierInstrumentsNomsPrix() {
	return instrumentRepository.trierInstrumentsNomsPrix();
	}

	@Override
	public List<Type> getAllTypes() {
		return typeRepository.findAll();
	}

	
}
