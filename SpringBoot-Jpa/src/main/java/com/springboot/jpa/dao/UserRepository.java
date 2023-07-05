package com.springboot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);
	public List<User>findByNameAndCity(String name,String city);
	//JPQL Query
	@Query("select u From User u")
	public List<User> getAllUser();
	@Query("Select u From User u Where u.id =:n and u.city =:c")
	public List<User>getUserById(@Param("n") int id,@Param("c") String city);
 //Native Query	
	@Query(value="select * From User",nativeQuery = true)
	public List<User> getUsers();
}
