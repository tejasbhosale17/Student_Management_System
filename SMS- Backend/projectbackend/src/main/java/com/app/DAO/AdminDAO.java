package com.app.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Admin;
import com.app.model.AdminLogin;
@Repository
public interface AdminDAO extends JpaRepository<Admin, Integer> 
{
	public  Admin findByEmailAndPassword(String email, String password);
	Admin findById(int id);
}