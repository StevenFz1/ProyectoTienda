
package com.ProyectoTienda.dao;

import com.ProyectoTienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
