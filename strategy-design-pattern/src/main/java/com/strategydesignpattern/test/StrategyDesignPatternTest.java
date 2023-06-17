package com.strategydesignpattern.test;

import com.strategydesignpattern.beans.MessageWriter;
import com.strategydesignpattern.converters.IMessageConverter;
import com.strategydesignpattern.converters.*;

public class StrategyDesignPatternTest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		IMessageConverter messageConverter = new HTMLMessageConverterImpl();
		
		// The process of passing the dependent object into another class is called Dependency Injection
		messageWriter.setMessageConverter(messageConverter);
		
		messageWriter.writeMessage("Strategy Design Pattern");
	}
}
