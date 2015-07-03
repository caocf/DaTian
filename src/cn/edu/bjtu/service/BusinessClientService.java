package cn.edu.bjtu.service;

import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONArray;

/**
 *  所属客户相关
 * @author RussWest0
 * @date   2015年6月22日 下午7:27:09
 */
public interface BusinessClientService {

	/**
	 * 获取用户的所属客户
	 * @return
	 */
	public JSONArray getUserBusinessClient(HttpSession session);
	
	/**
	 * 我的信息-客户信息-总记录数
	 * @Title: getUserBusinessClientTotalRows 
	 *  
	 * @param: @param session
	 * @param: @return 
	 * @return: Integer 
	 * @throws: 异常 
	 * @author: chendonghao 
	 * @date: 2015年7月3日 下午4:33:16
	 */
	public Integer getUserBusinessClientTotalRows(HttpSession session);
}
