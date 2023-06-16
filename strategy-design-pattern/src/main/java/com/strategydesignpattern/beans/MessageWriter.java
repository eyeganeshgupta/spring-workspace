package com.strategydesignpattern.beans;

import com.strategydesignpattern.converters.HTMLMessageConverterImpl;
import com.strategydesignpattern.converters.IMessageConverter;
import com.strategydesignpattern.converters.PDFMessageConverterImpl;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void writeMessage(String message) {
		String convertedMessage = null;

		messageConverter = new PDFMessageConverterImpl();
		convertedMessage = messageConverter.convert(message);

		System.out.println(convertedMessage);
	}
}
