package ar.com.educacionit.service;

import ar.com.educacionit.repository.dto.ProductoDTO;
import ar.com.educacionit.repository.impl.ProductoRepositoryMySqlImpl;
import ar.com.educacionit.repository.repositories.ProductoRepository;

public class ProductoServiceImpl implements ProductoService{
    // implemnto los metodos de la interface
    // inyeccion de dependencia
	private ProductoRepository repository;
	public ProductoServiceImpl() {
		inyectarClases();
	}
	
    private void inyectarClases() {
		// TODO Auto-generated method stub
		this.repository = new ProductoRepositoryMySqlImpl();
	}

	@Override
    public ProductoDTO getById(Long id) {
        return this.repository.getById(id);
    }
}
