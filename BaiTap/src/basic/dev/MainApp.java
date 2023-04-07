package basic.dev;
import java.util.LinkedList;
import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> stack = new LinkedList<Integer>();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.peek()); 

		stack.pop();
		System.out.println(stack.peek());

	
	
	      String str = "racecar";
	      
	      if (isPalindrome(str)) {
	         System.out.println(str + " có đối xứng.");
	      } else {
	         System.out.println(str + " không đối xứng.");
	      }
	   }

		
		
		
		
	
	 public static boolean isPalindrome(String str) {
	      Stack<Character> stack = new Stack<Character>();
	      Queue<Character> queue = new LinkedList<Character>();
	      
	      // Thêm các kí tự vào stack và queue
	      for (int i = 0; i < str.length(); i++) {
	         char c = str.charAt(i);
	         stack.push(c);
	         queue.add(c);
	      }
	      
	      // Lấy các kí tự từ stack và queue để kiểm tra xem chúng có giống nhau hay không
	      while (!stack.isEmpty() && !queue.isEmpty()) {
	         if (stack.pop() != queue.remove()) {
	            return false;
	         }
	      }
	      
	      // Nếu tất cả các kí tự giống nhau thì chuỗi là đối xứng, ngược lại thì không đối xứng
	      return true;
	   }
	 
	 
}
