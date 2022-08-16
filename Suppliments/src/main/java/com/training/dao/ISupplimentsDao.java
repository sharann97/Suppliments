package com.training.dao;

import java.util.List;

import com.training.model.Suppliments;

public interface ISupplimentsDao {

	List<Suppliments>findAll();
	List<Suppliments>findByProductId();
	List<Suppliments>findByCategory();
	
}
