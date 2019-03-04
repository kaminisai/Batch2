import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueEx {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int capacity = input.nextInt(); 
		ArrayBlockingQueue queue = new ArrayBlockingQueue(capacity); 
		for(int i=0;i<3;i++)
		queue.add(input.next());
		
		System.out.println(queue);
		if (queue.remainingCapacity() == 0) { 
            System.out.println("Queue is full"); 
        } 
        else { 
            System.out.println("Queue is not full"); 
        } 
		
		 try { 
	            queue.add("capg"); 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
		 System.out.println(queue);
	}

}
