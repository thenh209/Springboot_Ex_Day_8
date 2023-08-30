package com.Day_8.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Day_8.Model.Bike;
import com.Day_8.Repository.BikeRepo;

@Service
public class BikeService {
	@Autowired
	BikeRepo br;
	
	public List<Bike> addBikes(List<Bike> b)
	{
		return (List<Bike>)br.saveAll(b);
	}
	
	public List<Bike> showBikeOnYear(int year)
	{
		return br.fetchYear(year);
	}
	
	public List<Bike> showBikeOnYearAndName(int year, String bName)
	{
		return br.fetchYearAndBike(year, bName);
	}
	
	public List<Bike> showBikeOnName(String name)
	{
		return  br.fetchBikeName(name);
	}
}

