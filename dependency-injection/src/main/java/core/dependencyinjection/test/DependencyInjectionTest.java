package core.dependencyinjection.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

import core.dependencyinjection.beans.MessageWriter;

@SuppressWarnings("deprecation")
public class DependencyInjectionTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("core/dependencyinjection/common/application-context.xml"));

		MessageWriter messageWriter = (MessageWriter) beanFactory.getBean("messageWriter");

		messageWriter.writeMessage("Dependency Injection");
	}

}
