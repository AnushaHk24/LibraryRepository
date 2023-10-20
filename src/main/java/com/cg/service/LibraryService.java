package com.cg.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.cg.dao.LibraryDao;
import com.cg.entity.Library;

@Service
public class LibraryService implements LibraryDao {
	List<Library> llist=new ArrayList<Library>();

	@Override
	public String addLibrary(Library l) {
		llist.add(l);
		return "Added Successfully";
	}

	@Override
	public List<Library> getLibraryList() {
		return llist;
	}
	

}
