package com.empresa.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empresa.springboot.app.productos.models.dao.ProductoDao;
import com.empresa.springboot.app.productos.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired //Inyecta el componente ProductoDao
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true) //para que esté sincronizada con la DB - indicamos que solo es de lectura
	public List<Producto> findAll() {
		return (List<Producto>)productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null); //findById retorna un optional(permite saber si el item está en la BD)
	}


}
