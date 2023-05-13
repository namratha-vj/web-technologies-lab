import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class sax extends DefaultHandler {

  boolean bUserId = false;
  boolean bName = false;
  boolean bAge = false;
  boolean bEmail = false;
  boolean bAddress = false;
  String userId;

  public sax(String userId) {
    this.userId = userId;
  }

  public void startElement(
    String uri,
    String localName,
    String qName,
    Attributes attributes
  ) throws SAXException {
    if (qName.equalsIgnoreCase("user")) {
      String id = attributes.getValue("id");
      if (id.equals(userId)) {
        System.out.println("User details for user ID: " + userId);
      }
    } else if (qName.equalsIgnoreCase("name")) {
      bName = true;
    } else if (qName.equalsIgnoreCase("age")) {
      bAge = true;
    } else if (qName.equalsIgnoreCase("email")) {
      bEmail = true;
    } else if (qName.equalsIgnoreCase("address")) {
      bAddress = true;
    }
  }

  public void characters(char ch[], int start, int length) throws SAXException {
    if (bName) {
      System.out.println("Name: " + new String(ch, start, length));
      bName = false;
    } else if (bAge) {
      System.out.println("Age: " + new String(ch, start, length));
      bAge = false;
    } else if (bEmail) {
      System.out.println("Email: " + new String(ch, start, length));
      bEmail = false;
    } else if (bAddress) {
      System.out.println("Address: " + new String(ch, start, length));
      bAddress = false;
    }
  }

  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter user ID: ");
      String userId = scanner.nextLine();
      File inputFile = new File("users.xml");
      SAXParserFactory factory = SAXParserFactory.newInstance();
      SAXParser saxParser = factory.newSAXParser();
      sax userXMLParser = new sax(userId);
      saxParser.parse(inputFile, userXMLParser);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
