package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStat;

public class Order_ {
	private Date moment;
	private OrderStat stat;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();

	public Order_() {
		
	}
	
	public Order_(Date moment, OrderStat stat, Client client) {		
		this.moment = moment;
		this.stat = stat;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStat getStat() {
		return stat;
	}

	public void setStat(OrderStat stat) {
		this.stat = stat;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for (OrderItem o : items) {
			sum += o.subTotal(o.getQuantity(), o.getProduct().getPrice());
		}		
		return sum; 
	}
	
	
	
	
	
	
}
