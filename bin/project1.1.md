Problem Statement
Write a program to list all, even numbers less than or equal to the number n. Take the value of n as input from the user.

Outputpackage ps1.rectangle1_2;

import java.util.Scanner;

class Rectangle {
    int length; 
    int breadth; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}package ps1.rectangle1_2;

import java.util.Scanner;

class Rectangle {
    int length; 
    int breadth; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}package ps1.rectangle1_2;

import java.util.Scanner;

class Rectangle {
    int length; 
    int breadth; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    voidpackage ps1.rectangle1_2;

import java.util.Scanner;

class Rectangle {
    int length; 
    int breadth; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}package ps1.rectangle1_2;

import java.util.Scanner;

class Rectangle {
    int length; 
    int breadth; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}package ps1.rectangle1_2;

import java.util.Scanner;

class Rectangle {
    int length; 
    int breadth; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}Problem Statement
1.2 Define a class Rectangle with its length and breadth. Follow the below steps,

Provide appropriate constructor(s), which gives facility of constructing Rectangle object with default values of length and breadth as 0 or passing value of length and breadth externally to constructor.
Provide appropriate accessor & mutator methods to Rectangle class.
Provide methods to calculate area & to display all information of Rectangle.
Design different classTestRectangle class in a separate source file, which will contain main method. From this main method, create 5 Rectangle objects by taking all necessary information from the user and calculate respective area of rectangle objects and display it.
Output
1
Enter length of rectangle: 12 Enter breadth of rectangle: 10 Area of Rectangle = 120 Perimeter of Rectangle = 44

2
Enter length of rectangle: 15 Enter breadth of rectangle: 7 Area of Rectangle = 105 Perimeter of Rectangle = 44package ps17.balancedbrackets17;

	import java.util.*;
	 
	public class BalancedBrackets {
	 
	    
	    static boolean areBracketsBalanced(String expr)
	    {
	       
	        Deque<Character> stack
	            = new ArrayDeque<Character>();
	 
	       
	        for (int i = 0; i < expr.length(); i++)
	        {
	            char x = expr.charAt(i);
	 
	            if (x == '(' || x == '[' || x == '{')
	            {
	                
	                stack.push(x);
	                continue;
	            }
	 
	           
	            if (stack.isEmpty())
	                return false;
	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        }
	 
	        
	        return (stack.isEmpty());
	    }
	 
	    
	    public static void main(String[] args)
	    {
	        String expr = "“[(])}";
	 
	        
	        if (areBracketsBalanced(expr))
	            System.out.println("Balanced ");
	        else
	            System.out.println("Not Balanced ");
	    }
	}package ps18.repeatingdecimal18;
import java.util.*;

	public class Demo {

	
		public static String calculateFraction(int num, int den)
		{
			if (num == 0)
				return "0"; 
			if (den == 0)
				return ""; 

			

			StringBuilder result = new StringBuilder();
			if ((num < 0) ^ (den < 0))
				result.append("-");

			num = Math.abs(num);
			den = Math.abs(den);

			long quo = num / den; 
			long rem = num % den * 10; 

			result.append(
				String.valueOf(quo));
			if (rem == 0)
				return result
					.toString(); 

			result.append(".");
			Map<Long, Integer> m
				= new HashMap<>(); 
			while (rem != 0) {

				if (m.containsKey(rem)) {

					

					int index = m.get(rem);
					String part1 = result.substring(0, index);
					String part2 = "("
								+ result.substring(
									index, result.length())
								+ ")";
					return part1 + part2;
				}

				

				m.put(rem, result.length());
				quo = rem / den;
				result.append(String.valueOf(quo));

				
				rem = (rem % den) * 10;
				
			}
			return result.toString();
		}

		
		public static void main(String[] args)
		{
			int num = 1;
			int den = 3;
			

			String resString1 = calculateFraction(num, den);

			num = 1;
			den = 4;

			String resString2 = calculateFraction(num, den);
			
			num = 1;
			den = 6;

			String resString3 = calculateFraction(num, den);
			
			num = 1;
			den = 7;

			String resString4 = calculateFraction(num, den);

			System.out.println(resString1);
			System.out.println(resString2);
			System.out.println(resString3);
			System.out.println(resString4);
		}
	}package ps2.palindrome2_1;

import java.util.Scanner;
 
class CheckPalindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}
	package ps3.instrumnet3_1;

import java.util.Random;

public class Assignment3 {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		
		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		instruments[i] = new Piano();
	    	else if (randomNum == 2)
	    		instruments[i] = new Flute();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar();
	    	
	    	instruments[i].play();
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	if (instruments[i] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (instruments[i] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (instruments[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
	    }

	}

}package ps3.instrumnet3_1;

public class Flute extends Instrument {

	@Override
	public void play() {
		System.out.println("Flute is playing  toot toot toot toot");

	}

}package ps3.instrumnet3_1;

public class Guitar extends Instrument {

	@Override
	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");

	}

}package ps3.instrumnet3_1;

public abstract class Instrument {
	public abstract void play();
}package ps3.medicine3_2;

public class TestMedicine{
	public static void main(String[] args){
	Medicine m[] = new Medicine[10];
	double i = Math.random()*4;
	int j = (int) i;
	System.out.println(j);
	switch(j){
	
	
case 1: m[0] = new Medicine();
m[1] = new Tablet();
m[0].displayLabel();
m[1].displayLabel();break;

case 2: m[2] = new Medicine();
m[3] = new Syrup();
m[2].displayLabel();
m[3].displayLabel();break;

case 3: m[4] = new Medicine();
m[5] = new Ointment();
m[4].displayLabel();
m[5].displayLabel();break;

default: System.out.println("Invalid Choice");
}
	}
	}
package ps3.medicine3_2;

public class TestMedicine{
	public static void main(String[] args){
	Medicine m[] = new Medicine[10];
	double i = Math.random()*4;
	int j = (int) i;
	System.out.println(j);
	switch(j){
	
	
case 1: m[0] = new Medicine();
m[1] = new Tablet();
m[0].displayLabel();
m[1].displayLabel();break;

case 2: m[2] = new Medicine();
m[3] = new Syrup();
m[2].displayLabel();
m[3].displayLabel();break;

case 3: m[4] = new Medicine();
m[5] = new Ointment();
m[4].displayLabel();
m[5].displayLabel();break;

default: System.out.println("Invalid Choice");
}
	}
	}
package ps4.bankaccount4_1;

public class BankAccount  {
    int account_number;
    String name;
    String account_type;
    double balance;
   
    public int getAccount_number() {
        return account_number;
    }
   
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
   
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public String getAccount_type() {
        return account_type;
    }
   
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
   
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException nw)
        {
            System.out.println("Balance is low"+balance);
        }
        }
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }//end setter and getter

    public BankAccount() {
       
        this.account_number = 100;
        this.name = "AMOl";
        this.account_type = "Saving";
        this.balance = 500;
    }
   
   
    public BankAccount(int account_number, String name, String account_type,
            double balance) {
       
        this.account_number = account_number;
        this.name = name;
        this.account_type = account_type;
        this.balance = balance;
    }
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf)
            {
                System.out.println("Negaive Amount cant be deposited");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is ="+balance);
           
        }
       
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("WE CANT DEPOSITE AMOUNT INSUFFICENT BALANCE ");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
       
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }
   
    public static void main(String[] args) {
       
       
        BankAccount b=new BankAccount();
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        b.withdraw(2000);
        b.getBalance();
        b.display();
         
    }
}package ps6.studentarraylist6_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 public class StudentNameArrayList {
 public static void main (String[] args) {
	 ArrayList<String> a1=new ArrayList<String>();
 int n;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the number of students:");
 n=sc.nextInt();
 System.out.println("enter the student names:");
for(int i=0;i<n;i++)
{
	a1.add(sc.next());
}
System.out.println("student list:");
for(String a:a1)
{
		System.out.println("enter the name of the student to be searched:");
	    String st=sc.next(); 
	    int position=Collections.binarySearch(a1,st);
		System.out.println("posistion of"+st+"is:"+position);
		
		}
 }
 }package ps7.Deserialization7_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

class file{
    file()
    {
        try{
        FileReader fr = new FileReader("output.txt");
        String str = "";
        int i;
	    while ((i = fr.read()) != -1)str += (char)i;
	    System.out.println("Data Stored in file : \n"+str);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}

public class Main {
	static void solve(){
	    try{
	        System.out.println("\tWELCOME");
	        int option=-1,count=0;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        FileWriter fw = new FileWriter("output.txt");
	        while(option!=2)
	        {
	            count++;
	            System.out.println("1.Add details\n2.Exit");
	            option=Integer.parseInt(br.readLine());
	               int age,rollNo;
	               String Name,Address;
	            if(option==1)
	            {
	                System.out.println("Enter Name :");
	                Name=br.readLine();
	                System.out.println("Enter Roll Number : ");
	                rollNo=Integer.parseInt(br.readLine());
	                System.out.println("Enter age : ");
	                age=Integer.parseInt(br.readLine());
	                System.out.println("Enter Address : ");
	                Address=br.readLine();
	                String details=String.valueOf(count)+"."+"Name : "+Name+"\n Roll Number : "+rollNo+"\n Age : "+age+"\n Address : "+Address+"\n";
	                System.out.println("Do you want to enter details into file :\n1.Yes\n2.No");
	                String o=br.readLine();
	                if(o.equals("1"))
	                {
	                	fw.write(details);
	                	System.out.println("Data Stored ");
	                }
	                else
	                {
	                    fw.close();
	                    break;
	                }
	            }
	        }
	        System.out.println("Do you want view file data on terminal :\n1.Yes\n2.No");
	        String temp=br.readLine();
	        if(temp.equals("1"))
	        new file();
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	    finally{
	        System.out.println("Program Completed");
	    }
	}
	public static void main(String[] args) {
		solve();
	}
}
 package ps7.Deserialization7_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

class file{
    file()
    {
        try{
        FileReader fr = new FileReader("output.txt");
        String str = "";
        int i;
	    while ((i = fr.read()) != -1)str += (char)i;
	    System.out.println("Data Stored in file : \n"+str);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}

public class Main {
	static void solve(){
	    try{
	        System.out.println("\tWELCOME");
	        int option=-1,count=0;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        FileWriter fw = new FileWriter("output.txt");
	        while(option!=2)
	        {
	            count++;
	            System.out.println("1.Add details\n2.Exit");
	            option=Integer.parseInt(br.readLine());
	               int age,rollNo;
	               String Name,Address;
	            if(option==1)
	            {
	                System.out.println("Enter Name :");
	                Name=br.readLine();
	                System.out.println("Enter Roll Number : ");
	                rollNo=Integer.parseInt(br.readLine());
	                System.out.println("Enter age : ");
	                age=Integer.parseInt(br.readLine());
	                System.out.println("Enter Address : ");
	                Address=br.readLine();
	                String details=String.valueOf(count)+"."+"Name : "+Name+"\n Roll Number : "+rollNo+"\n Age : "+age+"\n Address : "+Address+"\n";
	                System.out.println("Do you want to enter details into file :\n1.Yes\n2.No");
	                String o=br.readLine();
	                if(o.equals("1"))
	                {
	                	fw.write(details);
	                	System.out.println("Data Stored ");
	                }
	                else
	                {
	                    fw.close();
	                    break;
	                }
	            }
	        }
	        System.out.println("Do you want view file data on terminal :\n1.Yes\n2.No");
	        String temp=br.readLine();
	        if(temp.equals("1"))
	        new file();
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	    finally{
	        System.out.println("Program Completed");
	    }
	}
	public static void main(String[] args) {
		solve();
	}
}
 package ps7.Deserialization7_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

class file{
    file()
    {
        try{
        FileReader fr = new FileReader("output.txt");
        String str = "";
        int i;
	    while ((i = fr.read()) != -1)str += (char)i;
	    System.out.println("Data Stored in file : \n"+str);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}

public class Main {
	static void solve(){
	    try{
	        System.out.println("\tWELCOME");
	        int option=-1,count=0;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        FileWriter fw = new FileWriter("output.txt");
	        while(option!=2)
	        {
	            count++;
	            System.out.println("1.Add details\n2.Exit");
	            option=Integer.parseInt(br.readLine());
	               int age,rollNo;
	               String Name,Address;
	            if(option==1)
	            {
	                System.out.println("Enter Name :");
	                Name=br.readLine();
	                System.out.println("Enter Roll Number : ");
	                rollNo=Integer.parseInt(br.readLine());
	                System.out.println("Enter age : ");
	                age=Integer.parseInt(br.readLine());
	                System.out.println("Enter Address : ");
	                Address=br.readLine();
	                String details=String.valueOf(count)+"."+"Name : "+Name+"\n Roll Number : "+rollNo+"\n Age : "+age+"\n Address : "+Address+"\n";
	                System.out.println("Do you want to enter details into file :\n1.Yes\n2.No");
	                String o=br.readLine();
	                if(o.equals("1"))
	                {
	                	fw.write(details);
	                	System.out.println("Data Stored ");
	                }
	                else
	                {
	                    fw.close();
	                    break;
	                }
	            }
	        }
	        System.out.println("Do you want view file data on terminal :\n1.Yes\n2.No");
	        String temp=br.readLine();
	        if(temp.equals("1"))
	        new file();
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	    finally{
	        System.out.println("Program Completed");
	    }
	}
	public static void main(String[] args) {
		solve();
	}
}
 package ps7.streambasedprogram7_2;
public class Student{
    int roll,age;
    String name,course;
    Student()
    {
         roll=0;
         name=null;
         age=0;
         course=null;
    }
    Student(int r,String n,int a,String c) throws Exception
    {
         roll=r;
         course=c;
         int l,temp=0;
         l = n.length();
         for(int i=0;i<l;i++)
         {
              char ch;
              ch=n.charAt(i);
              if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
                   temp=1;
         }
         /*———-Checking Name——————–*/
         try
         {
              if(temp==1)
                   throw new Exception();
              else
                   name=n;
         }
         catch(NameNotValidException e2)
         {
              System.out.println(e2);
         }
         /*———-Checking Age——————–*/
         try
         {
              if(a>=15 && a<=21)
                   age=a;
              else
                   throw new Exception();
         }
         catch(AgeNotWithInRangeException e1)
         {
              System.out.println(e1);
         }
    }
    void display()
    {
         System.out.println("roll Name Age Course");
         System.out.println("---------------------");
         System.out.println(roll+" "+name+" "+age+" " +course);
    }
}package ps8.storagecounterprinter8_1;

public class ThreadCounter {

	public static void main(String args[])

	{

	Counter counter = new Counter(25);

	counter.run();

	}
}package ps9.sortingarray9;

import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array : ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("enter array values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        HashMap<Integer, Integer> freqMap = solveIterative(arr);
 
        for(int value : freqMap.keySet())
        {
            System.out.println(value + " occurs " + freqMap.get(value)+ " times");
        }
 
    }
 
    public static HashMap<Integer, Integer> solveIterative(int[] arr)
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int value : arr)
        {
            if(!freqMap.containsKey(value))
            {
                freqMap.put(value, 1);
            }
            else {
                freqMap.put(value, freqMap.get(value)+1);
            }
        }   
        return freqMap;
    }
} calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
1
Enter value n : 11 2 4 6 8 10

2
Enter value n : 50 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48

