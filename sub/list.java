import java.util.*;
public class CustomCollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				CustomCollection<String> li=new CustomCollection<String>(11);
				Scanner sc=new Scanner(System.in);
				int idx=sc.nextInt();     
				System.out.println("ADD FRUITS TO THE LIST");
					li.add("Apple");
					li.add("Banana");
					li.add("Mango");
					li.add("Grapes");
					li.add("Water Melon");
					li.add("Musk Melon");
					li.add("Pine Apple");
					li.add("Custurd Apple");
					li.add("Orange");
					System.out.println("PRINTING");
					li.print();
					System.out.println("REMOVED "+li.remove(2));
					System.out.println("FRUIT AT GIVEN INDEX");
					System.out.println(li.get(idx));
	}
}