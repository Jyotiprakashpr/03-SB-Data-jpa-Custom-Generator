package com.ashokit.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "ORDER_DTLS")
@Data
public class OrderDetailsEntity {
	
	@Id
	@Column(name = "ORDER_ID")
	@GenericGenerator( name = "order_id_gen",
	                                         strategy ="com.ashokit."                      )
	private String orderId;
	
	@Column(name = "ORDER_BY")
	private String orderBy;
	
	@Column(name = "ORDER_PLACED_DT")
	private Date orderPlacedDate;
	

}
