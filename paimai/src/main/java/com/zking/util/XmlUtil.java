package com.zking.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlUtil {
	public static String beanToXml(Object obj, Class<?> load) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(load);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
		StringWriter writer = new StringWriter();
		marshaller.marshal(obj, writer);
		return writer.toString();
	}

	@SuppressWarnings("unchecked")
	public static <T> T xmlToBean(String xmlStr, Class<T> classofT) throws JAXBException, IOException {
		T xmlObject = null;
		Reader reader = null;
		System.out.println("XmlToBean");
		System.out.println(xmlStr);
		JAXBContext context = JAXBContext.newInstance(classofT);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		reader = new StringReader(xmlStr);
		xmlObject = (T) unmarshaller.unmarshal(reader);
		reader.close();
		return xmlObject;
	}

}
