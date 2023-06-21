package core.dependencyinjection.beans;

import core.dependencyinjection.converters.IMessageConverter;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void writeMessage(String message) {
		String convertedMessage = null;

		convertedMessage = messageConverter.convert(convertedMessage);

		System.out.println(convertedMessage);
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
}
