package org.OrderDetails.domain;

import java.time.LocalDate;
import java.util.Date;

public class OrdersData {
	private int orderId;
	private String thingName;
	private String orderOwnerName;
	private String adress;
	private String phoneNumber;
	private LocalDate orderPickup;
	
	
	
	public OrdersData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdersData(int orderId, String thingName, String orderOwnerName, String adress, String phoneNumber,LocalDate orderPickup)
	{
		this.orderId=orderId;
		this.thingName=thingName;
		this.orderOwnerName=orderOwnerName;
		this.adress=adress;
		this.phoneNumber=phoneNumber;
		this.orderPickup=orderPickup;
	}

	public LocalDate getOrderPickup() {
		return orderPickup;
	}

	public void setOrderPickup(LocalDate orderPickup) {
		this.orderPickup = orderPickup;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getThingName() {
		return thingName;
	}

	public void setThingName(String thingName) {
		this.thingName = thingName;
	}

	public String getOrderOwnerName() {
		return orderOwnerName;
	}

	public void setOrderOwnerName(String orderOwnerName) {
		this.orderOwnerName = orderOwnerName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "OrdersData [orderId=" + orderId + ", thingName=" + thingName + ", orderOwnerName=" + orderOwnerName
				+ ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", orderPickup=" + orderPickup + "]";
	}
	

	
	
	
	

}
