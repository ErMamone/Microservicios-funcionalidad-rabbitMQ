package com.sysone.springboot.app.productos.models.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.sysone.springboot.app.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {
	

}
