package com.sample.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.ISectionDAO;
import com.sample.entity.Section;

@Service
public class SectionManagerImp implements ISectionManager {

	@Autowired
	ISectionDAO sectionDAO;

	@Override
	public Section getById(Integer sectionId) {
		return this.sectionDAO.getById(sectionId);
	}

	@Override
	public Integer insert(Section section) {
		return this.sectionDAO.insert(section);
	}

	@Override
	public Section update(Section section) {
		return this.sectionDAO.update(section);
	}

	@Override
	public boolean delete(Section section) {
		return this.sectionDAO.delete(section);
	}

	@Override
	public boolean delete(Integer sectionId) {
		return this.sectionDAO.delete(sectionId);
	}

}
