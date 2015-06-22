package cn.edu.bjtu.bean.page;
/**
 * ����pagebean
 * @author RussWest0
 * @date   2015��6��12�� ����8:42:48
 */
public class OrderBean {

	private String id;
	private String orderNum;
	private String carrierId;
	//������Ϣ
	private String clientName;//�����ͻ�
	private String hasCarrierContract;//�Ƿ���˷���ͬ
	private String contractId;//���˷���ͬ
	private String isLinkToClientWayBill;//�Ƿ�����ͻ��˵�
	private String clientWayBillNum;//�ͻ��˵���
	private String resourceName;//��Դ����
	private String companyName;//���˷�����
	private String resourceType;//��Դ����
	
	//��ע
	private String remarks;
	
	//������Ϣ
	private String goodsName;
	private Float goodsWeight;
	private Float goodsVolume;
	private Float declaredPrice;
	private Float expectedPrice;
	private Float insurance;
	//�շ�������Ϣ
	private String deliveryAddr;
	private String deliveryName;
	private String deliveryPhone;
	private String recieverAddr;
	private String recieverName;
	private String recieverPhone;
	
	//add by RussWest0 at 2015��6��19��,����10:46:58 
	// �ӻ������¶������õ�
	private String goodsId;
	private String responseId;
	
	
	
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getIsLinkToClientWayBill() {
		return isLinkToClientWayBill;
	}
	public void setIsLinkToClientWayBill(String isLinkToClientWayBill) {
		this.isLinkToClientWayBill = isLinkToClientWayBill;
	}
	public String getClientWayBillNum() {
		return clientWayBillNum;
	}
	public void setClientWayBillNum(String clientWayBillNum) {
		this.clientWayBillNum = clientWayBillNum;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getHasCarrierContract() {
		return hasCarrierContract;
	}
	public void setHasCarrierContract(String hasCarrierContract) {
		this.hasCarrierContract = hasCarrierContract;
	}
	
	public String getDeliveryAddr() {
		return deliveryAddr;
	}
	public void setDeliveryAddr(String deliveryAddr) {
		this.deliveryAddr = deliveryAddr;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryPhone() {
		return deliveryPhone;
	}
	public void setDeliveryPhone(String deliveryPhone) {
		this.deliveryPhone = deliveryPhone;
	}
	public String getRecieverAddr() {
		return recieverAddr;
	}
	public void setRecieverAddr(String recieverAddr) {
		this.recieverAddr = recieverAddr;
	}
	public String getRecieverName() {
		return recieverName;
	}
	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}
	public String getRecieverPhone() {
		return recieverPhone;
	}
	public void setRecieverPhone(String recieverPhone) {
		this.recieverPhone = recieverPhone;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Float getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(Float goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	public Float getGoodsVolume() {
		return goodsVolume;
	}
	public void setGoodsVolume(Float goodsVolume) {
		this.goodsVolume = goodsVolume;
	}
	public Float getDeclaredPrice() {
		return declaredPrice;
	}
	public void setDeclaredPrice(Float declaredPrice) {
		this.declaredPrice = declaredPrice;
	}
	public Float getExpectedPrice() {
		return expectedPrice;
	}
	public void setExpectedPrice(Float expectedPrice) {
		this.expectedPrice = expectedPrice;
	}
	public Float getInsurance() {
		return insurance;
	}
	public void setInsurance(Float insurance) {
		this.insurance = insurance;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	
	
}