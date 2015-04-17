package cn.edu.bjtu.vo;

// Generated 2015-2-14 19:50:34 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * GoodsClientViewId generated by hbm2java
 */@Component
public class GoodsClientView implements java.io.Serializable {

	private String id;
	private String name;
	private String type;
	private String transportType;
	private Float weight;
	private Float volume;
	private String startPlace;
	private String endPlace;
	private Date relDate;
	private Date limitDate;
	private String declaredValue;
	private String transportReq;
	private String damageReq;
	private String vipservice;
	private String oriented;
	//private int feedbackQuantity;
	private String invoice;
	private String relatedMaterial;
	private String state;
	private String clientId;
	private String remarks;
	private String realName;
	private String carrierId;
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GoodsClientView() {
	}

	public GoodsClientView(String id) {
		this.id = id;
	}

	

	public GoodsClientView(String id, String name, String type,
			String transportType, Float weight, Float volume,
			String startPlace, String endPlace, Date relDate, Date limitDate,
			String declaredValue, String transportReq, String damageReq,
			String vipservice, String oriented, 
			//int feedbackQuantity,
			String invoice, String relatedMaterial, String state,
			String clientId, String remarks, String realName, String carrierId,
			String phone) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.transportType = transportType;
		this.weight = weight;
		this.volume = volume;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		this.relDate = relDate;
		this.limitDate = limitDate;
		this.declaredValue = declaredValue;
		this.transportReq = transportReq;
		this.damageReq = damageReq;
		this.vipservice = vipservice;
		this.oriented = oriented;
		//this.feedbackQuantity = feedbackQuantity;
		this.invoice = invoice;
		this.relatedMaterial = relatedMaterial;
		this.state = state;
		this.clientId = clientId;
		this.remarks = remarks;
		this.realName = realName;
		this.carrierId = carrierId;
		this.phone = phone;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTransportType() {
		return this.transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getVolume() {
		return this.volume;
	}

	public void setVolume(Float volume) {
		this.volume = volume;
	}

	public String getStartPlace() {
		return this.startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getEndPlace() {
		return this.endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public Date getRelDate() {
		return this.relDate;
	}

	public void setRelDate(Date relDate) {
		this.relDate = relDate;
	}

	public Date getLimitDate() {
		return this.limitDate;
	}

	public void setLimitDate(Date limitDate) {
		this.limitDate = limitDate;
	}

	public String getDeclaredValue() {
		return this.declaredValue;
	}

	public void setDeclaredValue(String declaredValue) {
		this.declaredValue = declaredValue;
	}

	public String getTransportReq() {
		return this.transportReq;
	}

	public void setTransportReq(String transportReq) {
		this.transportReq = transportReq;
	}

	public String getDamageReq() {
		return this.damageReq;
	}

	public void setDamageReq(String damageReq) {
		this.damageReq = damageReq;
	}

	public String getVipservice() {
		return this.vipservice;
	}

	public void setVipservice(String vipservice) {
		this.vipservice = vipservice;
	}

	public String getOriented() {
		return this.oriented;
	}

	public void setOriented(String oriented) {
		this.oriented = oriented;
	}
	
	/*public int getFeedbackQuantity() {
		return this.feedbackQuantity;
	}

	public void setFeedbackQuantity(int feedbackQuantity) {
		this.feedbackQuantity = feedbackQuantity;
	}*/

	public String getInvoice() {
		return this.invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getRelatedMaterial() {
		return this.relatedMaterial;
	}

	public void setRelatedMaterial(String relatedMaterial) {
		this.relatedMaterial = relatedMaterial;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCarrierId() {
		return this.carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GoodsClientView))
			return false;
		GoodsClientView castOther = (GoodsClientView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getTransportType() == castOther.getTransportType()) || (this
						.getTransportType() != null
						&& castOther.getTransportType() != null && this
						.getTransportType()
						.equals(castOther.getTransportType())))
				&& ((this.getWeight() == castOther.getWeight()) || (this
						.getWeight() != null && castOther.getWeight() != null && this
						.getWeight().equals(castOther.getWeight())))
				&& ((this.getVolume() == castOther.getVolume()) || (this
						.getVolume() != null && castOther.getVolume() != null && this
						.getVolume().equals(castOther.getVolume())))
				&& ((this.getStartPlace() == castOther.getStartPlace()) || (this
						.getStartPlace() != null
						&& castOther.getStartPlace() != null && this
						.getStartPlace().equals(castOther.getStartPlace())))
				&& ((this.getEndPlace() == castOther.getEndPlace()) || (this
						.getEndPlace() != null
						&& castOther.getEndPlace() != null && this
						.getEndPlace().equals(castOther.getEndPlace())))
				&& ((this.getRelDate() == castOther.getRelDate()) || (this
						.getRelDate() != null && castOther.getRelDate() != null && this
						.getRelDate().equals(castOther.getRelDate())))
				&& ((this.getLimitDate() == castOther.getLimitDate()) || (this
						.getLimitDate() != null
						&& castOther.getLimitDate() != null && this
						.getLimitDate().equals(castOther.getLimitDate())))
				&& ((this.getDeclaredValue() == castOther.getDeclaredValue()) || (this
						.getDeclaredValue() != null
						&& castOther.getDeclaredValue() != null && this
						.getDeclaredValue()
						.equals(castOther.getDeclaredValue())))
				&& ((this.getTransportReq() == castOther.getTransportReq()) || (this
						.getTransportReq() != null
						&& castOther.getTransportReq() != null && this
						.getTransportReq().equals(castOther.getTransportReq())))
				&& ((this.getDamageReq() == castOther.getDamageReq()) || (this
						.getDamageReq() != null
						&& castOther.getDamageReq() != null && this
						.getDamageReq().equals(castOther.getDamageReq())))
				&& ((this.getVipservice() == castOther.getVipservice()) || (this
						.getVipservice() != null
						&& castOther.getVipservice() != null && this
						.getVipservice().equals(castOther.getVipservice())))
				&& ((this.getOriented() == castOther.getOriented()) || (this
						.getOriented() != null
						&& castOther.getOriented() != null && this
						.getOriented().equals(castOther.getOriented())))
				&& ((this.getInvoice() == castOther.getInvoice()) || (this
						.getInvoice() != null && castOther.getInvoice() != null && this
						.getInvoice().equals(castOther.getInvoice())))
				&& ((this.getRelatedMaterial() == castOther
						.getRelatedMaterial()) || (this.getRelatedMaterial() != null
						&& castOther.getRelatedMaterial() != null && this
						.getRelatedMaterial().equals(
								castOther.getRelatedMaterial())))
				&& ((this.getState() == castOther.getState()) || (this
						.getState() != null && castOther.getState() != null && this
						.getState().equals(castOther.getState())))
				&& ((this.getClientId() == castOther.getClientId()) || (this
						.getClientId() != null
						&& castOther.getClientId() != null && this
						.getClientId().equals(castOther.getClientId())))
				&& ((this.getRemarks() == castOther.getRemarks()) || (this
						.getRemarks() != null && castOther.getRemarks() != null && this
						.getRemarks().equals(castOther.getRemarks())))
				&& ((this.getRealName() == castOther.getRealName()) || (this
						.getRealName() != null
						&& castOther.getRealName() != null && this
						.getRealName().equals(castOther.getRealName())))
				&& ((this.getCarrierId() == castOther.getCarrierId()) || (this
						.getCarrierId() != null
						&& castOther.getCarrierId() != null && this
						.getCarrierId().equals(castOther.getCarrierId())))
				&& ((this.getPhone() == castOther.getPhone()) || (this
						.getPhone() != null
						&& castOther.getPhone() != null && this
						.getPhone().equals(castOther.getPhone())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37
				* result
				+ (getTransportType() == null ? 0 : this.getTransportType()
						.hashCode());
		result = 37 * result
				+ (getWeight() == null ? 0 : this.getWeight().hashCode());
		result = 37 * result
				+ (getVolume() == null ? 0 : this.getVolume().hashCode());
		result = 37
				* result
				+ (getStartPlace() == null ? 0 : this.getStartPlace()
						.hashCode());
		result = 37 * result
				+ (getEndPlace() == null ? 0 : this.getEndPlace().hashCode());
		result = 37 * result
				+ (getRelDate() == null ? 0 : this.getRelDate().hashCode());
		result = 37 * result
				+ (getLimitDate() == null ? 0 : this.getLimitDate().hashCode());
		result = 37
				* result
				+ (getDeclaredValue() == null ? 0 : this.getDeclaredValue()
						.hashCode());
		result = 37
				* result
				+ (getTransportReq() == null ? 0 : this.getTransportReq()
						.hashCode());
		result = 37 * result
				+ (getDamageReq() == null ? 0 : this.getDamageReq().hashCode());
		result = 37
				* result
				+ (getVipservice() == null ? 0 : this.getVipservice()
						.hashCode());
		result = 37 * result
				+ (getOriented() == null ? 0 : this.getOriented().hashCode());
		result = 37 * result
				+ (getInvoice() == null ? 0 : this.getInvoice().hashCode());
		result = 37
				* result
				+ (getRelatedMaterial() == null ? 0 : this.getRelatedMaterial()
						.hashCode());
		result = 37 * result
				+ (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result
				+ (getClientId() == null ? 0 : this.getClientId().hashCode());
		result = 37 * result
				+ (getRemarks() == null ? 0 : this.getRemarks().hashCode());
		result = 37 * result
				+ (getRealName() == null ? 0 : this.getRealName().hashCode());
		result = 37 * result
				+ (getCarrierId() == null ? 0 : this.getCarrierId().hashCode());
		result = 37 * result
				+ (getPhone() == null ? 0 : this.getPhone().hashCode());
		return result;
	}

}
