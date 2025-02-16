package ar.com.educacionit.repository.repositories;

import ar.com.educacionit.repository.dto.ProductoDTO;

public interface ProductoRepository {
    // aca se persiste el objeto de la DB
    //create
    public void save(ProductoDTO entity);
    // read
    public ProductoDTO getById(Long id);
    //update
    public ProductoDTO update(ProductoDTO entity);
    //delete
    public ProductoDTO delete(Long id);

}
