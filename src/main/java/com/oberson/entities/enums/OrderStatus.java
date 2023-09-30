package com.oberson.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1,"Waiting_payment"),
	PAID(2,"paid"),
	SHIPPED(3,"Shipped"),
	DELIVERED(4,"Delivered"),
	CANCELED(5,"Canceled");

	
	private int code;
	private String description;



	private OrderStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}



	public int getCode() {
		return code;
	}



	public String getDescription() {
		return description;
	}


	public static OrderStatus toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
			
		}
		for (OrderStatus x : OrderStatus.values()) {
			if (cod.equals(x.getCode())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus" + cod);
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
