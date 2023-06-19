package com.strategydesignpattern.test;

import com.strategydesignpattern.beans.MessageWriter;
import com.strategydesignpattern.converters.IMessageConverter;
import com.strategydesignpattern.helper.ObjectFactory;

public class StrategyDesignPatternTest {
	public static void main(String[] args) throws Exception {
		MessageWriter messageWriter = (MessageWriter) ObjectFactory.createObject("messageWriter.class");
		IMessageConverter messageConverter = (IMessageConverter) ObjectFactory.createObject("messageConverter.class");

		// The process of passing the dependent object into another class is called Dependency Injection
		messageWriter.setMessageConverter(messageConverter);

		messageWriter.writeMessage("Strategy Design Pattern");
	}
}
