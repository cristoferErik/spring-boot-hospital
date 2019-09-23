package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import pe.edu.upn.demo.model.entity.Cristofer;
import pe.edu.upn.demo.service.CristoferService;

public class CristoferServicesImpl implements CristoferService {
	
	private CristoferService cristoferService;
	@Override
	public List<Cristofer> findAll() throws Exception {
		// TODO Auto-generated method stub
		return cristoferService.findAll();
	}

	@Override
	public Optional<Cristofer> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return cristoferService.findById(id);
	}

	@Override
	public Cristofer save(Cristofer entity) throws Exception {
		// TODO Auto-generated method stub
		return cristoferService.save(entity);
	}

	@Override
	public Cristofer update(Cristofer entity) throws Exception {
		// TODO Auto-generated method stub
		return cristoferService.update(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		// T
		cristoferService.deleteById(id);
		
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		cristoferService.deleteAll();
	}
	
}
