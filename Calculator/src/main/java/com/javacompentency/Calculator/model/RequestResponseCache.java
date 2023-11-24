package com.javacompentency.Calculator.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("RequestResponseCache")
public class RequestResponseCache implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String operation;
	private String request;
	private String response;
	private LocalDateTime creationTime;
	private LocalDateTime updatedTime;
}
