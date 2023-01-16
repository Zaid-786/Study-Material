package com.crudoperation.service;

import com.crudoperation.entities.Admin;



public interface AdminService {
	Admin findByAdminId(long adminId);

	void addAdmin(Admin admin);

	void updateAdmin(Admin admin);

	void removeAdmin(Admin admin);

}
