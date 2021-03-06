package com.ankush.thingspeaks.ThingsSpeaks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankush.thingspeaks.ThingsSpeaks.dao.DataDao;
import com.ankush.thingspeaks.ThingsSpeaks.entities.DataObj;

@Service
public class DataServiceImplementation implements DataService{

	// List<DataObj> list;
	
	@Autowired
	private DataDao dataDao;
	
	
	
	public DataServiceImplementation() {

	}




	@Override
	public List<DataObj> getAllObj() {
		
		
		return dataDao.findAll();
	
		
	}




	@Override
	public DataObj getObj(int Uid) {
		
		DataObj re = null;
		List<DataObj> ob = dataDao.findAll();
			
		for(DataObj c : ob)
		{
			if(c.getUid() == Uid)
			{
				re =c;
			}
		}
		return re;
	}




	@Override
	public DataObj addField(DataObj data) {

			
		return dataDao.save(data);
	}




	@Override
	public String getField(int Uid) {


		
		DataObj ob =dataDao.getOne(Uid);
		dataDao.delete(ob);
		return "Delete successfully";
	}




	@Override
	public DataObj updateField(DataObj data) {
		

		dataDao.save(data);
		
		return data;
	}




	

}
