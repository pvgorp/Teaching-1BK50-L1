import org.apache.commons.lang3.StringUtils;

/** 
 * Demo concerning the use of some library methods
 * @author pvgorp
 */
public class SubstringExample {
  public static void main(String[] args) {
    // use of substring -- https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int, int)
    String myString= "abc123";
    System.out.println("substring(0, 3) of "+myString + " is "+ myString.substring(0, 3));
    
    // us of replace -- https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
    // download the JAR from https://commons.apache.org/proper/commons-lang/
    
    System.out.println("replacing abc by def in "+myString + " yields "+ StringUtils.replace(myString, "abc", "def"));
  }
}
