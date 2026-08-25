import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class XMLParser {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse("products.xml");

            NodeList list = doc.getElementsByTagName("product");

            for (int i = 0; i < list.getLength(); i++) {

                Node node = list.item(i);
                Element product = (Element) node;

                String id = product.getElementsByTagName("id")
                        .item(0).getTextContent();

                String name = product.getElementsByTagName("name")
                        .item(0).getTextContent();

                String price = product.getElementsByTagName("price")
                        .item(0).getTextContent();

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Price: " + price);
                System.out.println("----------------");
            }

        } catch (Exception e) {
            System.out.println("XML Parsing Error: " + e.getMessage());
        }
    }
}
