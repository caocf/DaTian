package cn.edu.bjtu.vo;

// Generated 2015-2-22 16:45:18 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * CarCarrierViewId generated by hbm2java
 */
@Component
public class FocusCarView implements java.io.Serializable {

	
	private String id;
	private String clientId;
	private String focusType;
	private String focusId;
	private String status;
	private String carNum;
	private String carrierId;
	private String companyName;
	private Date relDate;
	private String linetransportId;
	public FocusCarView() {
	}

	public FocusCarView(String id) {
		this.id = id;
	}

	public FocusCarView(String id, String clientId, String focusType,
			String focusId, String status, String carNum, String carrierId,
			String companyName, Date relDate, String linetransportId) {
		this.id = id;
		this.clientId = clientId;
		this.focusType = focusType;
		this.focusId = focusId;
		this.status = status;
		this.carNum = carNum;
		this.carrierId = carrierId;
		this.companyName = companyName;
		this.relDate = relDate;
		this.linetransportId = linetransportId;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getFocusType() {
		return this.focusType;
	}

	public void setFocusType(String focusType) {
		this.focusType = focusType;
	}

	public String getFocusId() {
		return this.focusId;
	}

	public void setFocusId(String focusId) {
		this.focusId = focusId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCarNum() {
		return this.carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getCarrierId() {
		return this.carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getRelDate() {
		return this.relDate;
	}

	public void setRelDate(Date relDate) {
		this.relDate = relDate;
	}

	public String getLinetransportId() {
		return this.linetransportId;
	}

	public void setLinetransportId(String linetransportId) {
		this.linetransportId = linetransportId;
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
