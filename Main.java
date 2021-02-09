import java.util.*;

public class Main {

	public static void main(String[] args) {
		int i,j,n,count=0;
	}
	String k;
	String[] todo = new String[100];
	
	Scanner sc= new Scanner(System.in);
	do {
		System.out.println("1.Add in ToDo List\n2.Count task\n3.Remove task");
	}
	n=sc.nextInt();
	if(n==1) {
		System.out.println("Enter task name: ");
	}
	sc.nextLine();
	k=sc.nextLine();
	todo[count]=k;
	count++;
	}
	else if(n==2) {
		System.out.println("Number of task present in list: " + count);
	}
	else if(n==3) {
		System.out.println("Enter position to be deleted: ");
	}
	j=sc.nextInt();
	System.out.println(todo[j-1] + " is deleted.");
	for(i=j-1;i<count;i++) {
		todo[i]=todo[i+1];
	}
	count--;
	}
}
