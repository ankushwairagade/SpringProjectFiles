package com.ankush.thingspeaks.ThingsSpeaks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankush.thingspeaks.ThingsSpeaks.entities.DataObj;



public interface DataDao extends JpaRepository<DataObj ,Integer> {

}
