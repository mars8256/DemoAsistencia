package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.IAsignacionDAO;
import edu.uspg.model.Asignacion;
import edu.uspg.service.IAsignacionService;

@Service
public class AsignacionServiceImpl implements IAsignacionService {

	@Autowired
	private IAsignacionDAO dao;

	
	@Override
	public Asignacion registrar(Asignacion asignacion) {
		asignacion.getAsignacionDetalle().forEach(det -> det.setAsignacion(asignacion));
		return dao.save(asignacion);
	}

	@Override
	public Asignacion modificar(Asignacion t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Asignacion> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Asignacion> listar() {
		return dao.findAll();
	}

}
