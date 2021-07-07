package demo2;
import java.util.*;
public class Generics_2 {

	public static void main(String[] args) {
		List cl = new ArrayList();
        cl.add("1");
        cl.add(2);
        cl.add("Roy");
        int z = Integer.parseUnsignedInt((String)  (cl.get(1)));
        System.out.println(z ); 
	}

}
