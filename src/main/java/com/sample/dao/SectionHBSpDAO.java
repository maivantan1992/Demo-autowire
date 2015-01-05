package com.sample.dao;

import org.springframework.stereotype.Repository;

import com.sample.entity.Section;

@Repository
public class SectionHBSpDAO extends HBSpBasicDAO<Section, Integer> implements
		ISectionDAO {

	public SectionHBSpDAO() {
		super(Section.class);
	}

	@Override
	public Section getById(Integer sectionId) {
		return this.get(sectionId);
	}

	@Override
	public boolean update(Section section) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Section section) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer sectionId) {
		// TODO Auto-generated method stub
		return false;
	}

}
