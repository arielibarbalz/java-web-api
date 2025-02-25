package ar.com.educacionit.repository.impl;

import ar.com.educacionit.repository.dto.ProductoDTO;
import ar.com.educacionit.repository.repositories.ProductoRepository;

public class ProductoRepositoryMySqlImpl implements ProductoRepository {
    @Override
    public void save(ProductoDTO entity) {

    }

    @Override
    public ProductoDTO getById(Long id) {
    	//hardcode
    	
    	String sql = "SELECT * FROM producto WHERE id =" +id;
    	System.out.println(sql);
    	// simulo que tengo los datos simulados desde la DB
    	Long _id = id;
    	String titulo = "producto simulado desde la DB";
    	Double precio = 1500.75;
        return new ProductoDTO(_id, titulo, precio);
    }

    @Override
    public ProductoDTO update(ProductoDTO entity) {
        return null;
    }

    @Override
    public ProductoDTO delete(Long id) {
        return null;
    }
}
