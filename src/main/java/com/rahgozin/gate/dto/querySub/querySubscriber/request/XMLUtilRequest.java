package com.rahgozin.gate.dto.querySub.querySubscriber.request;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLUtilRequest {

	public static Document getDocument() throws Exception {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		return documentBuilder.newDocument();
	}

	public static Document createDocument(String elementName) throws ParserConfigurationException {
		DocumentBuilder dbdr = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dbdr.newDocument();
		Element ele = doc.createElement(elementName);
		doc.appendChild(ele);
		return doc;
	}

	public static Element createChildElement(Element parentElement, String childName) {
		Element child = null;
		if (parentElement != null && (!"".equals(childName))) {
			child = parentElement.getOwnerDocument().createElement(childName);
			parentElement.appendChild(child);
		}
		return child;
	}

	public static Element getChildElement(Element element, String tagName) throws Exception {

		return getChildElement(element, tagName, true);

	}

	public static Element getChildElement(Element element, String tagName, boolean create) throws Exception {
		Node node = null;
		NodeList nodeList = element.getChildNodes();
		Element childElm = null;
		for (int i = 0; i < nodeList.getLength(); i++) {
			node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE && tagName.equals(node.getNodeName())) {
				childElm = (Element) node;
				break;
			}
		}

		if ((childElm == null) && (create)) {
			childElm = createChildElement(element, tagName);
		}

		return childElm;
	}

	public static List<Element> getChildElements(Element element, String tagName) throws Exception {
		Node node = null;
		List<Element> elementList = new ArrayList();
		NodeList nodeList = element.getChildNodes();
		Element childElm = null;
		for (int i = 0; i < nodeList.getLength(); i++) {
			node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE && tagName.equals(node.getNodeName())) {
				childElm = (Element) node;
				elementList.add(childElm);
			}
		}

		return elementList;
	}
	
	public static Document getDocumentFromFile(String fileNameWithPath)
			throws ParserConfigurationException, SAXException, IOException {
		Document retVal = null;
		if (fileNameWithPath != null) {
			String modifiedInXML = fileNameWithPath.trim();
			if (modifiedInXML.length() > 0) {

				FileReader inFileReader = new FileReader(modifiedInXML);
				try {
					InputSource iSource = new InputSource(inFileReader);
					retVal = getDocument(iSource);
				} finally {
					inFileReader.close();
				}
			}
		}
		return retVal;
	}

	public static Document getDocument(InputSource inSource)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();

		DocumentBuilder dbdr = fac.newDocumentBuilder();

		return dbdr.parse(inSource);
	}

	public static String getFirstLevelTextContent(Node node) {
		NodeList list = node.getChildNodes();
		StringBuilder textContent = new StringBuilder();
		textContent.append("");
		for (int i = 0; i < list.getLength(); ++i) {
			Node child = list.item(i);
			if (child.getNodeType() == Node.TEXT_NODE)
				textContent.append(child.getTextContent());
		}
		return textContent.toString().trim();
	}
	

}
