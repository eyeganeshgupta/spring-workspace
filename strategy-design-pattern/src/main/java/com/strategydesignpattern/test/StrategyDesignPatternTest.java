package com.strategydesignpattern.test;

import com.strategydesignpattern.beans.MessageWriter;

public class StrategyDesignPatternTest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		messageWriter.writeMessage("Strategy Design Pattern");
	}
}
