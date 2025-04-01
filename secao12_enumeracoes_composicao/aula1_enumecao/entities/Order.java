package entities;

import java.util.Date;

import entities.enums.OrderStat;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStat status;
	
	
	public Order() {
		
	}


	public Order(Integer id, Date moment, OrderStat status) {		
		this.id = id;
		this.moment = moment;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStat getStatus() {
		return status;
	}


	public void setStatus(OrderStat status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
	
}
