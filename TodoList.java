import java.util.*;  

public class TodoList {
	
	public static void main(String args[]) {  
		Scanner sc = new Scanner (System.in);
		System.out.println("To-do list operations");
		boolean flag = true;
		String task = "";
		//Creating a List  
		List<String> todo = new ArrayList<String>();
		do {
			System.out.println("1.Add a task\n" + "2.See all tasks\n" + "3.Clear a task\n" + "4.Delete all tasks\n" + "5.Exit\n");
			// Getting the user choice from menu
			int choice = sc.nextInt();
			switch(choice){
			case 1:
			// Getting task from user
				System.out.println("Enter task name: ");
				task = sc.next();
				//Adding element in the List  
				todo.add(task);
				break;
				case 2:
					System.out.println("Tasks in to-do list are:");
					//Iterating the list element using for-each loop  
					for(String t : todo)  
						System.out.println(t);
					break;
					case 3:
						System.out.println("Enter task to be clear:");
						task = sc.next();
						//Removing the particular element in list
						todo.remove(task);
						break;
						case 4:
							//Clearing all the elements from list
							todo.clear();
							System.out.println("you cleared all the tasks");
							System.out.println(todo);
							break;
							case 5:
								flag = false;
								System.out.println("Thank you!");
								}
			} while(flag);
		}  
	}