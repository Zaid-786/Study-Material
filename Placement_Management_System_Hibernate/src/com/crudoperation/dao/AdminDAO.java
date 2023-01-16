package com.crudoperation.dao;

import com.crudoperation.entities.Admin;

public interface AdminDAO {
	Admin getAdminById(long adminId);

	void addAdmin(Admin admin);

	void removeAdmin(Admin admin);

	void updateAdmin(Admin admin);

	void commitTransaction();

	void beginTransaction();

}
