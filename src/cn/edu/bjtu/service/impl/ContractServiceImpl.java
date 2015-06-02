package cn.edu.bjtu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.bjtu.dao.ContractDao;
import cn.edu.bjtu.service.ContractService;
import cn.edu.bjtu.util.HQLTool;
import cn.edu.bjtu.util.ParseDate;
import cn.edu.bjtu.vo.Contract;
@Transactional
@Service("contractServiceImpl")
/**
 * 合同服务层实现 
 * @author RussWest0
 *
 */
public class ContractServiceImpl implements ContractService{

	@Resource
	ContractDao contractDao;
	@Resource 
	Contract contract;
	@Resource
	HQLTool hqltool;

	
	@Override
	/**
	 * 获取公司合同
	 */
	public List getCompanyContract(String carrierId) {
		// TODO Auto-generated method stub
		
		return contractDao.getCompanyContract(carrierId);
	}
	@Override
	/**
	 * 获取合同信息
	 */
	public Contract getContractInfo(String contractId) {
		// TODO Auto-generated method stub
		return contractDao.getContractInfo(contractId);
	}
	@Override
	/**
	 * 新增合同
	 */
	public boolean insertContract(String id,String name, String caculateType,
			String carrierAccount, String startDate, String endDate,
			String contact, String phone, String remarks, String carrierId,
			String monthlyStatementDays, String path, String fileName) {
		// TODO Auto-generated method stub
		contract.setCaculateType(caculateType);
		contract.setCarrierAccount(carrierAccount);
		contract.setCarrierId(carrierId);
		contract.setContact(contact);
		contract.setEndDate(ParseDate.parseDate(startDate));
		contract.setStartDate(ParseDate.parseDate(endDate));
		contract.setName(name);
		contract.setPhone(phone);
		contract.setRemarks(remarks);
		contract.setId(id);
		contract.setState("待确认");
		if(monthlyStatementDays != ""){
			contract.setMonthlyStatementDays(monthlyStatementDays);
		}
		// 保存文件路径
		if (path != null && fileName != null) {
			String fileLocation = path + "//" + fileName;
			contract.setRelatedMaterial(fileLocation);
		}
		contractDao.save(contract);//保存实体
		return true;
		
	}
	@Override
	/**
	 * 终止合同
	 */
	public boolean shutdownContract(String contractId, String reason) {
		// TODO Auto-generated method stub
		return contractDao.shutdownContract(contractId,reason);
	}
	
	@Override
	/**
	 * 查询合同
	 */
	public List getFindContract(String carrierId,String startDate,String endDate,String name,int Display,int PageNow){
		String sql="from Contract where carrierId='"+carrierId+"' and ";
		System.out.println("name1="+name+"startDate="+startDate+"endDate="+endDate);
		if(name.equals("合同名称")){
			//查找时不考虑合同名字
			System.out.println("name2="+name);
			name = "";
			System.out.println("name3="+name);
		}
		if(!startDate.equals("开始时间")){
			if(!endDate.equals("结束时间")){
				//查询时有开始和截止时间
				sql+=" startDate >= '"+startDate+"' and endDate <= '"+endDate+"' and name like '%"+name+"%'";
				
			}
			else{
				//只有开始日期没有截止日期
				sql+=" startDate >= '"+startDate+"' and name like '%"+name+"%'";
				
			}
		}
		else if(!endDate.equals("结束时间")){
			//只有结束时间没有开始时间
			sql+=" endDate <= '"+endDate+"' and name like '%"+name+"%'";
			
		}
		else{
			//没有时间限制
			sql+=" name like '%"+name+"%'";
		}
		return contractDao.getFindContract(sql, Display, PageNow);
	}
	
	@Override
	/**
	 * 查询合同的结果页数
	 */
	public int getFindContractTotalRows(String carrierId,String startDate,String endDate,String name,int Display,int PageNow){
		String sql="from Contract where carrierId='"+carrierId+"' and ";
		//System.out.println("name1="+name);
		if(name.equals("合同名称")){
			//查找时不考虑合同名字
			//System.out.println("name2="+name);
			name = "";
			//System.out.println("name3="+name);
		}
		if(!startDate.equals("开始时间")){
			if(!endDate.equals("结束时间")){
				//查询时有开始和截止时间
				sql+=" startDate >= '"+startDate+"' and endDate <= '"+endDate+"' and name like '%"+name+"%'";
				
			}
			else{
				//只有开始日期没有截止日期
				sql+=" startDate >= '"+startDate+"' and name like '%"+name+"%'";
				
			}
		}
		else if(!endDate.equals("结束时间")){
			//只有结束时间没有开始时间
			sql+=" endDate <= '"+endDate+"' and name like '%"+name+"%'";
			
		}
		else{
			//没有时间限制
			sql+=" name like '%"+name+"%'";
		}
		return hqltool.getTotalRows(sql);// 这里的HQLTool实例千万不能自己new出来，用@Resource
	}

}
