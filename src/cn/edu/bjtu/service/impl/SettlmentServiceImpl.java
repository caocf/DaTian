package cn.edu.bjtu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.bjtu.dao.SettlementDao;
import cn.edu.bjtu.service.SettlementService;
@Service("settlementServiceImpl")
public class SettlmentServiceImpl implements SettlementService{

	@Resource
	SettlementDao settlementDao;
	@Override
	public List getUserOrder(String userId) {
		// TODO Auto-generated method stub
		return settlementDao.getUserOrder(userId);
	}

}