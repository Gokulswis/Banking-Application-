import java.util.*;
public class BankApplication
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Bank> arr=new ArrayList<Bank>();
		while(true)
		{
		    System.out.println("1.Create new Account\n2.Check Balance\n3.Deposit Amount\n4.Withdraw Amount\n5.Change Password\n6.Delete Account\n7.View All Accounts\n8.Change Account Name\n9.Money Transfer\n10.Exit\nEnter your choice:");
		    int c=sc.nextInt();
		    if(c==1)
		    {
		        int f=0;
		    System.out.println("Enter the Account Name");
		    String a=sc.next();
		    System.out.println("Enter the Account Number");
		    int b=sc.nextInt();
		    for(Bank i:arr)
		    {
		        if(i.Accno==b)
		        {
		            f=1;
		            System.out.println("This Account Number is Already Existed");
		            break;
		        }
		    }
		    if(f==0)
		    {
		    System.out.println("Create pin");
		    int d=sc.nextInt();
		    arr.add(new Bank(a,b,d));
		    System.out.println("Account Created successfully");
		    }
		    }
		    else if(c==2)
		    {
		       System.out.println("Enter the Account Number");
		       int ban=sc.nextInt();
		       int f=0;
		       for(Bank i:arr)
		       {
		           if(i.Accno==ban)
		           {
		               f=1;
		              System.out.println("Enter pin");
		              int bpin=sc.nextInt();
		              i.balance(bpin);
		              break;
		           }
		       }
		       if(f==0)
		       {
		          System.out.println("The Account Number is Incorrect"); 
		       }
		    }
		    else if(c==3)
		    {
		       System.out.println("Enter the Account Number");
		       int dan=sc.nextInt();
		       int f=0;
		       for(Bank i:arr)
		       {
		           if(i.Accno==dan)
		           {
		               f=1;
		              System.out.println("Enter the Amount to be Deposit:");
		              int damt=sc.nextInt();
		              i.deposit(damt);
		              break;
		           }
		       }
		       if(f==0)
		       {
		          System.out.println("The Account Number is Incorrect"); 
		       }
		    }
		    else if(c==4)
		    {
		       System.out.println("Enter the Account Number");
		       int wan=sc.nextInt();
		       int f=0;
		       for(Bank i:arr)
		       {
		           if(i.Accno==wan)
		           {
		               f=1;
		              System.out.println("Enter the Amount to be Withdraw:");
		              int wamt=sc.nextInt();
		              System.out.println("Enter the pin:");
		              int wpin=sc.nextInt();
		              i.withdraw(wamt,wpin);
		              break;
		           }
		       }
		       if(f==0)
		       {
		          System.out.println("The Account Number is Incorrect"); 
		       }
		    }
		    else if(c==5)
		    {
		        System.out.println("Enter the Account Number");
		       int pan=sc.nextInt();
		       int f=0;
		       for(Bank i:arr)
		       {
		           if(i.Accno==pan)
		           {
		               f=1;
		              System.out.println("Enter the old pin:");
		              int ppin=sc.nextInt();
		              i.pinchange(ppin);
		              break;
		           }
		       }
		       if(f==0)
		       {
		          System.out.println("The Account Number is Incorrect"); 
		       }
		    }
		    else if(c==6)
		    {
		        System.out.println("Enter the Account Number");
		        int dacc=sc.nextInt();
		       int f=0;
		       for(Bank i:arr)
		       {
		           if(i.Accno==dacc)
		           {
		               f=1;
		              System.out.println("Enter the pin:");
		              int dpin=sc.nextInt();
		              if(i.pin==dpin)
		              {
		                  arr.remove(i);
		                  System.out.println("Account Deleted Successfully");
		              }
		              else
		              {
		                  System.out.println("You Entered Incorrect Pin"); 
		                  
		              }
		              break;
		           }
		       }
		       if(f==0)
		       {
		          System.out.println("The Account Number is Incorrect"); 
		       }
		        
		    }
		    else if(c==7)
		    {
		        int count=1;
		        System.out.println("\n********************\n");
		        for(Bank i:arr)
		       {
		           System.out.println("Account "+count+" Details:");
		           System.out.println("Name: "+i.Name);
		           System.out.println("Number:"+i.Accno);
		           System.out.println("Balance:"+i.Balance);
		           System.out.println("Pin:"+i.pin);
		           count++;
		           System.out.println("");
		      }
		       System.out.println("********************\n");
		    }
		    else if(c==8)
		    {
		         System.out.println("Enter the Account Number");
		       int Can=sc.nextInt();
		       int f=0;
		       for(Bank i:arr)
		       {
		           if(i.Accno==Can)
		           {
		               f=1;
		              System.out.println("Enter the pin:");
		              int Npin=sc.nextInt();
		              i.changename(Npin);
		              break;
		           }
		       }
		       if(f==0)
		       {
		          System.out.println("The Account Number is Incorrect"); 
		       }
		    }
		    else if(c==9)
		    {
		        int z=0;
		        System.out.println("Enter the Sender Account Number");
		        int sender=sc.nextInt();
		        System.out.println("Enter the Receiver Account Number");
		        int receiver=sc.nextInt();
		        for(Bank i:arr)
		        {
		            if(i.Accno==sender||i.Accno==receiver)
		            {
		                z++;
		            }
		        }
		        if(z==2)
		        {
		            int ret=0;
		            System.out.println("Enter the sender pin:");
		            int tpin=sc.nextInt();
		            for(Bank i:arr)
		            {
		                if(i.Accno==sender)
		                {
		                   ret=i.transfersender(tpin);
		                   break;
		                   
		                }
		            }
		            if(ret!=0)
		            {
		            for(Bank i:arr)
		            {
		                if(i.Accno==receiver)
		                {
		                    i.transferreceiver(ret);
		                    break;
		                }
		            }
		            }
		            
		        
		        }
		        else
		        {
		            System.out.println("The Account Number is not Available");
		        }
		        
		    }
		    else
		    {
		      System.out.println("Nandri Vanakam");
		      break;  
		    }
		}
		
		
		
	}
}
class Bank
{
    Scanner st=new Scanner(System.in);
    String Name;
    int Accno;
    int pin;
    int Balance=0;
    Bank(String Name,int Accno,int pin)
    {
        this.Name=Name;
        this.Accno=Accno;
        this.pin=pin;
    }
   void balance(int bpin)
    {
        
        if(bpin==this.pin)
        {
            System.out.println("Your Balance: "+this.Balance);
        }
        else
        {
            System.out.println("Your Pin is wrong");
        }
        
    }
    
    void deposit(int damt)
    {
        System.out.println("You Successfully Deposited Rs: "+damt);
        this.Balance+=damt;
        System.out.println("And Your Current Balance Rs: "+this.Balance);
    }
    
    void withdraw(int wamt,int wpin)
    {
        if(wamt<=this.Balance)
        {
            if(wpin==this.pin)
            {
                System.out.println("You successfully Withdraw Rs: "+wamt);
                this.Balance-=wamt;
                System.out.println("And Your Current Balance Rs:"+this.Balance);
            }
            else
            {
                System.out.println("You entered Wrong Pin");
            }
            
        }
        else
        {
            System.out.println("Insuficient Balance");
        }
    }
    void pinchange(int ppin)
    {
        int npin;
        if(this.pin==ppin)
        {
            System.out.println("Enter the New Pin");
            npin=st.nextInt();
            this.pin=npin;
            System.out.println("Pin Changed successfully");
        }
        else
        {
           System.out.println("You Entered Incorrect Pin"); 
        }
    }
    void changename(int kpin)
    {
        if(this.pin==kpin)
        {   String nname;
            System.out.println("Enter the New Name");
            nname=st.nextLine();
            this.Name=nname;
            System.out.println("Account Name Changed successfully");
        }
        else
        {
           System.out.println("You Entered Incorrect Pin"); 
        }
    }
    int transfersender(int tpin)
    {
        if(this.pin==tpin)
        {   
            System.out.println("Enter the Transfer Amount");
            int tamt=st.nextInt();
            if(tamt<=this.Balance)
            {
                if(tamt>0)
                {
                System.out.println("Before Transfer Sender Balance Rs:"+this.Balance);
                this.Balance-=tamt;
                System.out.println("After Transfer Sender Balance Rs:"+this.Balance);
                return tamt;
                }
                else
                {
                    System.out.println("Please Enter The Amount above 0");
                    return 0;
                }
            }
            else
            {
                System.out.println("Insuficient Balance");
                return 0;
            }
        }
        else
        {
           System.out.println("You Entered Incorrect Pin"); 
           return 0;
        }
    }
    void transferreceiver(int ret)
    {
        System.out.println("Before Transfer Receiver Balance Rs: "+this.Balance);
        this.Balance+=ret;
        System.out.println("After Transfer Receiver Balance Rs: "+this.Balance);
       System.out.println("You successfully Transfer from Sender to  Receiver Rs:"+ret);
    }
    
}
