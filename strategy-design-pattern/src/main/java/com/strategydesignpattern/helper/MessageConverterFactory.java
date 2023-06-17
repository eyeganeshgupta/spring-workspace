package com.strategydesignpattern.helper;

import com.strategydesignpattern.converters.HTMLMessageConverterImpl;
import com.strategydesignpattern.converters.IMessageConverter;
import com.strategydesignpattern.converters.PDFMessageConverterImpl;

public class MessageConverterFactory {
	public static IMessageConverter createMessageConverter(String converterType) {
		IMessageConverter messageConverter = null;

		if (converterType.equals("html")) {
			messageConverter = new HTMLMessageConverterImpl();
		} else if (converterType.equals("pdf")) {
			messageConverter = new PDFMessageConverterImpl();
		}
		return messageConverter;
	}
}
