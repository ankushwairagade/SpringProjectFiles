package com.ankush.thingspeaks.ThingsSpeaks.service;

import java.util.List;

import com.ankush.thingspeaks.ThingsSpeaks.entities.DataObj;

public interface DataService {

	public List<DataObj> getAllObj();
	
	public DataObj getObj(int Uid);
	
	public DataObj addField(DataObj data);
	
	public String getField(int i);
	
	public DataObj updateField(DataObj data);
	
}
