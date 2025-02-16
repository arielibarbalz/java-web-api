package ar.com.educacionit.repository.dto;

public class ProductoDTO {
	
	private Long id;
	private String titulo;
	private Double precio;
	
	//mutable | inmutable
	
	public ProductoDTO(
			Long id,
			String titulo,
			Double precio
			) { 
		
		setId(id);
		this.titulo = titulo;
		this.precio = precio;
		
	}

	private void setId(Long id2) {
		if(id == null || id<0) {
			throw new IllegalArgumentException("Id no puede ser nulo ni menor a 0");
		}
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}

}
