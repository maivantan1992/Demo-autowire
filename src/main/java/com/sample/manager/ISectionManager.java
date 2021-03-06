package com.sample.manager;

import com.sample.entity.Section;

public interface ISectionManager {
	Section getById(Integer sectionId);

	Integer insert(Section section);

	Section update(Section section);

	boolean delete(Section section);

	boolean delete(Integer sectionId);
}
