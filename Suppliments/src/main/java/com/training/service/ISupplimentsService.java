package com.training.service;

import java.util.List;

import com.training.model.Suppliments;

public interface ISupplimentsService {

	List<Suppliments>getAll();
	List<Suppliments>getByProductNo();
	List<Suppliments>getByCategory();
	
}
