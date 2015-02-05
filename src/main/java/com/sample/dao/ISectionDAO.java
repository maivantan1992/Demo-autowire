package com.sample.dao;

import com.sample.entity.Section;

public interface ISectionDAO {
	Section getById(Integer sectionId);

	Integer insert(Section section);

	Section update(Section section);

	boolean delete(Section section);

	boolean delete(Integer sectionId);
}
