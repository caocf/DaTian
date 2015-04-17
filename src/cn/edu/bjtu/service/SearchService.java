package cn.edu.bjtu.service;

import java.util.List;

/**
 * 
 * @author RussWest0
 *
 */
public interface SearchService {
	
	public List getLineResourceByStartPlace(String startPlace);
	public List getLineResourceByEndPlace(String endPlace);
	
	public List getCitylineResourceByName(String name);
	
	public List getGoodsResourceByName(String name);
	
	public List getCompanyResourceByCompanyName(String companyName);
	
	public List getCarResourceByCarNum(String carNum);
	
	public List getWarehouseResourceByName(String name);
}
