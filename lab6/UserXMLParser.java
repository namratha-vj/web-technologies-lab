import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class UserXMLParser {

  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter user ID: ");
      String userId = scanner.nextLine();
      File inputFile = new File("users.xml");
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(inputFile);
      doc.getDocumentElement().normalize();
      NodeList userList = doc.getElementsByTagName("user");
      for (int i = 0; i < userList.getLength(); i++) {
        Element user = (Element) userList.item(i);
        String id = user.getAttribute("id");
        if (id.equals(userId)) {
          System.out.println("User details for user ID: " + userId);
          System.out.println(
            "Name: " +
            user.getElementsByTagName("name").item(0).getTextContent()
          );
          System.out.println(
            "Age: " + user.getElementsByTagName("age").item(0).getTextContent()
          );
          System.out.println(
            "Email: " +
            user.getElementsByTagName("email").item(0).getTextContent()
          );
          System.out.println(
            "Address: " +
            user.getElementsByTagName("address").item(0).getTextContent()
          );
          break;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
