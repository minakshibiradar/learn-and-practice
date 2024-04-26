package String;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        System.out.println("Here using string builder class we can perform different operation on string");
        StringBuilder str = new StringBuilder();
        str.append(1);
        str.append(7);
        str.append(" ");
        str.append("Biradar Minakshi Baliram ");
        System.out.println(str);
        str.append("MSBCL");
        System.out.println("Length of given string is  " + str.length());
        str.deleteCharAt(27);
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println("Last index of the string is " + str.lastIndexOf("Minakshi"));
        str.substring(11, 17);
        System.out.println("Is give string is empty "+str.isEmpty());
    }
}

