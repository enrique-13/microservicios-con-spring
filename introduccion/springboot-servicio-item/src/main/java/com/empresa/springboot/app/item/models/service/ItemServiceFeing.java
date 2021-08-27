package com.empresa.springboot.app.item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.empresa.springboot.app.item.clientes.ProductoClienteRest;
import com.empresa.springboot.app.item.models.Item;

@Service("serviceFeing") //Le daremos un nombre para poder identificarlo en el controlador usando Qualifier
@Primary //Para indicar que aquí se implementará por defecto la interfaz ItemService, ya que tenemos 2 implementaciones {otra forma es Qualifier}
//@Primary funciona cuando no se especifican el nombre de los servicios
public class ItemServiceFeing implements ItemService {
	
	@Autowired
	private ProductoClienteRest clienteFeign;

	@Override
	public List<Item> findAll() {
		return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clienteFeign.detalle(id), cantidad);
	}

}
