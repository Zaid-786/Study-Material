package com.crudoperation.dao;

import com.crudoperation.entities.College;

public interface CollegeDAO {
	College getCollegeById(long collegeId);

	void addCollege(College college);

	void removeCollege(College college);

	void updateCollege(College college);

	void commitTransaction();

	void beginTransaction();

}
