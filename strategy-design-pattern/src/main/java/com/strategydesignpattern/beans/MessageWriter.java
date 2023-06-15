package com.strategydesignpattern.beans;

import com.strategydesignpattern.converters.HTMLMessageConverterImpl;
import com.strategydesignpattern.converters.IMessageConverter;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void writeMessage(String message) {
		String convertedMessage = null;

		messageConverter = new HTMLMessageConverterImpl();
		convertedMessage = messageConverter.convert(message);

		System.out.println(convertedMessage);
	}
}
