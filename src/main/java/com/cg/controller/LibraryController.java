package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Library;
import com.cg.service.LibraryService;


@RestController
@RequestMapping("/library")
public class LibraryController  {
	@Autowired
	private LibraryService service;
	
	@PostMapping("/")
	public String addProduct(@RequestBody Library l){

		 return service.addLibrary(l);

	}

	@GetMapping("/getAll")

	public List<Library> getAll(){

		return service.getLibraryList();

	}	

}

