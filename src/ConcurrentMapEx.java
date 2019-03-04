import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

	public class ConcurrentMapEx{

		public static void main(String[] args) {
			//Write a program to add customer details using concurrent Map
			Scanner input = new Scanner(System.in);
			ConcurrentHashMap map = new ConcurrentHashMap();
			for(int i=0;i<5;i++)
			map.put(input.nextInt(),input.next());
			System.out.println(map);
			map.putIfAbsent(111, "kamini");
			System.out.println(map);
			map.replace(111, "kamini", "varsha");
			System.out.println(map);
			map.remove(111, "kamini");
			System.out.println(map);
			
		}

	}
