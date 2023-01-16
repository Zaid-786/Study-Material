package com.crudoperation.service;

import com.crudoperation.entities.College;

public interface CollegeService {
	College findByCollegeId(long collegeId);

	void addCollege(College college);

	void updateCollege(College college);

	void removeCollege(College college);

}
