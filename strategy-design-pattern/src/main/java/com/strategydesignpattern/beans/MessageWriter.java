package com.strategydesignpattern.beans;

import com.strategydesignpattern.converters.IMessageConverter;
import com.strategydesignpattern.helper.MessageConverterFactory;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void writeMessage(String message) {
		String convertedMessage = null;

		// dependency-pulling === going-and-getting-the-dependent-object-from-another-class
		messageConverter = MessageConverterFactory.createMessageConverter("html");
		convertedMessage = messageConverter.convert(message);

		System.out.println(convertedMessage);
	}
}
