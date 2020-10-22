package net.codejava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.codejava.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	

	
		public Role findByName(String role);
	}
	
	
	
	
	
	