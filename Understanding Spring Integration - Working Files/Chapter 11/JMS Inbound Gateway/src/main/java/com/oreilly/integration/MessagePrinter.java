package com.oreilly.integration;

import org.springframework.messaging.Message;

public class MessagePrinter {

	public String print(Message<?> message){
		System.out.println("Printing the message:");
		System.out.println(message);
		return "1 message worked";
	}
}
