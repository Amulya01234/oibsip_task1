import java.util.Scanner;
class OnlineExam
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your username and password");
		String username = scan.nextLine();
		String password = scan.nextLine();
		while(true)
		{
            System.out.println("----Welcome to login form----");
			System.out.println("Enter the username and password:");
			String enteredUsername=scan.next();
			String enteredPassword=scan.next();
			if(enteredUsername.trim().equals(username.trim()) && enteredPassword.trim().equals(password.trim()))
			{
				System.out.println("-------Login successful------");
				System.out.println("Do you want to update profile..click true or false!!");
				boolean choice=scan.nextBoolean();
				if(choice==true)
				{
					System.out.println("------UPDATE PROFILE-------");
					System.out.println("Enter the new Username:");
					String UpdatedUsername=scan.next();
					System.out.println("Enter the new password:");
					String UpdatedPassword=scan.next();

					System.out.println("Profile updated..!!");
				}
				else
				{
					System.out.println("Do you want to proceed with the exam..!!");
				}	
				System.out.println("press 1 to start and 0 to exit");
				int score=0;
				int choice2=scan.nextInt();
				if(choice2==1)
				{
					System.out.println("lets get started..select the answers to following MCQ's");
					System.out.println("1. When is object created with new keyword \n 1.at run-time 2.at compile time 3.none");
		            System.out.println("Enter your choice");
			        int ans1=scan.nextInt();
                    if(ans1==1)
			        {
				      score=score+1;
			        }
		 	        System.out.println("2. What is Runnable \n 1.abstract class 2.interface 3.method");
		            System.out.println("Enter your choice");
			        int ans2=scan.nextInt();
                    if(ans2==2)
		         	{
				      score=score+1;
			        }
			        System.out.println("3. Exception created by try block is caught in which block \n 1.catch 2.throw 3.final");
		            System.out.println("Enter your choice");
			        int ans3=scan.nextInt();
                    if(ans3==1)
			        {
			        	score=score+1;
			        }
			        System.out.println("4. Where is System class defined \n 1.java.lang 2.java.util 3.java.io");
		            System.out.println("Enter your choice");
			        int ans4=scan.nextInt();
                    if(ans4==1)
			        {
				      score=score+1;
			        }
			        System.out.println("5. Number of primitive datatypes in java are \n 1.6 2.7 3.8");
		            System.out.println("Enter your choice");
			        int ans5=scan.nextInt();
                    if(ans5==3)
			        {
				      score=score+1;
			        }
					System.out.println("Would you like to submit? \n press 1");
					int n=scan.nextInt();
					int timeRemaining=1;
					if(n==1)
					{
						System.out.println("your exam is submitted");
						System.out.println("Your score: "+score);
		            System.out.println("---Quiz ended---");
				    System.exit(0);
					}
				}
				else
				{
					System.out.println("You are Exit..!!");
					System.exit(0);  
				}
			}
			else
			{
				System.out.println("Invalid credentials..!!");
			}
		}
	}
	
}
