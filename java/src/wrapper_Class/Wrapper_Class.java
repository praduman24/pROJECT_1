package wrapper_Class;
import java.util.*;
public class Wrapper_Class {
     public static void main(String[] args) {
    	 
    	 ArrayList<Custom> List = new ArrayList<>();
    	 List.add(new Custom(14)); // boxint
    	 List.add(new Custom(19));
    	 System.out.println(List);
    	 
     }
}
class Custom{
	private int value;
	
	public Custom(int value) {
		this.value = value;
	}
	
	public void setvalue(int x) {
		this.value = x;
	}
	public int getvalue() {
		return value;
	}

	@Override
	public String toString() {
		return "Custom [value=" + value + "]";
	}
	
}
