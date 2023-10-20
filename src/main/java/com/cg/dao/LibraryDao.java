package com.cg.dao;

import java.util.List;

import com.cg.entity.Library;

public interface LibraryDao {
	public String addLibrary(Library l);
	public List<Library> getLibraryList();
		

}
