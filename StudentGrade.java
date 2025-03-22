import java.util.Scanner;
class Student {
	String  name;
  int marks[]=new int [5];
	public  void inputDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the student Details");
	  name=sc.nextLine();
		System.out.println("enter the markss of Student");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		 }
	}
	public int calculateTotal() {
		int sum=0;
       for(int i=0;i<5;i++) {
    	    sum += marks[i];
       }
       return sum;
	}
  public  int  calculateAvg() {
	  int sum=0;
	  for(int i=0;i<marks.length;i++) {
		  sum +=marks[i];
	  }
	  int avg=sum/5;
	  return avg;
  }
  public char Grade() {
      int avg = calculateAvg();
      if (avg >= 90) {
          return 'A';
      } else if (avg >= 80) {
          return 'B';
      } else if (avg >= 70) {
          return 'C';
      } else if (avg >= 60) {
          return 'D';
      } else {
          return 'F'; // Fail grade
      }
  }
  public void displayResult() {
	  System.out.println("name: "+ name);
	  System.out.println("Total: "+ calculateTotal());
	  System.out.println("average: "+calculateAvg());
	  System.out.println("Grade: "+Grade());
  }
}
public class StudentGrade{
	public static void main(String[] args) {
		Student s=new Student();
		s.inputDetails();
		s.displayResult();
	}
}
