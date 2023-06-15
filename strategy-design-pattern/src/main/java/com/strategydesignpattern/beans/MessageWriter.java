package com.strategydesignpattern.beans;

public class MessageWriter {
	private IMessageConverter messageConveter;
	
	public void writeMessage(String message) {
		String convertedMessage = null;
		
		messageConverter = new HTMLMessageConverterImpl();
		convertedMessage = messageConverted.convert(message);
		
		System.out.println(convertedMessage);
	}
}
