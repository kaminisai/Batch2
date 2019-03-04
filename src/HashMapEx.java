import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	
    public static void main(String args[]) 
    { 
        Object value; 
        HashMap hashMap = new HashMap(); 
        hashMap.put( new Integer(1),"21" ); 
        hashMap.put( new Integer(2) ,"23" ); 
        hashMap.put( new Integer(3) ,"34" ); 
        hashMap.put( new Integer(4) ,"44" ); 
        hashMap.put( new Integer(5) ,"55" ); 
        hashMap.put( new Integer(6) ,"66" ); 
        hashMap.put( new Integer(7) ,"67" );  
        hashMap.put( new Integer(8),"87" );  
        hashMap.put( new Integer(9) ,"78");  
        hashMap.put( new Integer(10),"98" );  
       
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter an integer :");  
        int x = sc.nextInt();  
        value = hashMap.get("x");  
        System.out.println("Value is:" + value);  
    } 
} 


