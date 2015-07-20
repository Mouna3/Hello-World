import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XmlParsing {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(ClassLoader.getSystemResourceAsStream("Documents/Parts.xml"));
		ArrayList<Part> partsList = new ArrayList<Part>();
		NodeList nodeList = document.getDocumentElement().getChildNodes();
	    for (int i = 0; i < nodeList.getLength(); i++) {
		    Node node = nodeList.item(i);
		    if (node instanceof Element) {
			    Part prt = new Part();
			    NodeList childNodes = node.getChildNodes();
			    for (int j=0;j<childNodes.getLength(); j++) {
				    Node cNode = childNodes.item(j);
			        if (cNode instanceof Element) {
					    String content = cNode.getLastChild().
					    getTextContent().trim();
					    switch (cNode.getNodeName()) {
						    case "ITEM":
						    	prt.ITEM = content;
						    	break;
						    case "MANUFACTURER":
						    	prt.MANUFACTURER = content;
						    	break;
						    case "MODEL":
						    	prt.MODEL = content;
						    	break;
						    case "COST":
						    	prt.COST = content;
							    break;
					    }
				    }
			    }
			    partsList.add(prt);
	    }
    }

	  for (Part prt:partsList) {
		  System.out.println(prt);
    }

	}
	

}
class Part{
	  String ITEM;
	  String MANUFACTURER;
	  String MODEL;
	  String COST;
	
	  @Override
	  public String toString() {
	    return ITEM+"	"+MANUFACTURER+"	"+MODEL+"	"+COST;
	  }
}

