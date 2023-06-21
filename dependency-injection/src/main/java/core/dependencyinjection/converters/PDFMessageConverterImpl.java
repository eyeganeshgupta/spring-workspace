package core.dependencyinjection.converters;

public class PDFMessageConverterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<pdf> " + message + " </pdf>";
	}

}
