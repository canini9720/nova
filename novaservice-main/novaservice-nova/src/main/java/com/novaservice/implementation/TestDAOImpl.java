package com.novaservice.implementation;

import org.springframework.stereotype.Repository;

import com.novaservice.common.implementation.JdbcCommonDao;
import com.novaservice.model.TestEntity;

@Repository
public class TestDAOImpl extends JdbcCommonDao implements TestDAO{

	//@Override
	public void saveTest(TestEntity entity) throws Exception {
		this.getEm().persist(entity);
		System.out.println("tested");
	}



	/*@Override
	public void saveTest(TestEntity entity) throws Exception {
		this.getEm().persist(entity);
		
	}*/


}
