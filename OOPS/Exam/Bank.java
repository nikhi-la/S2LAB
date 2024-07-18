import java.util.Scanner;

class Account{
    int acc_no,acc_bal;
    String name;

    void acceptDetails(Scanner s){
        System.out.println("Enter Account Number");
        acc_no=s.nextInt();s.nextLine();

        System.out.println("Enter Account Holder Name");
        name=s.nextLine();

        System.out.println("Enter Account Balance");
        acc_bal=s.nextInt();
    }
    void displayDetails(){
        System.out.println("\n**********Account Details************");
        System.out.println("Account Number  : "+acc_no);
        System.out.println("Holder Name     : "+name);
        System.out.println("Account Balance : "+acc_bal);
        System.out.println();
    }

    void deposit(Scanner s){
        System.out.println("\nEnter the amount to be deposited");
        int amount=s.nextInt();

        acc_bal+=amount;
    }

    void withdraw(Scanner s){

        if(acc_bal==0)
            System.out.println("Insufficient Balance");
        else
        { 
            System.out.println("\nEnter the amount to be withdrawed");
            int amount=s.nextInt();

            if(acc_bal-amount<0){
                System.out.println("Insufficient Balance");
            }
            else
            acc_bal-=amount;
        }
    }
}

class Bank{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        int large,index=0;
        System.out.println("Enter the count of account holders");
        int n=s.nextInt();

        Account a[]=new Account[n];

        for(int i=0;i<n;++i){
            System.out.println("\nEnter details for account "+(i+1)+"\n");
            a[i]=new Account();

            a[i].acceptDetails(s);
            
        }
        System.out.println("\n*******Transactions*******");
        while(true){
            System.out.println("\n1.Withdraw/Deposit\n2.Account with largest Balance\n3.Exit");
            int ch=s.nextInt();
            if(ch==1){
                    System.out.println("\nEnter the account number");
                    int accno=s.nextInt();

                    for(int i=0;i<n;++i){
                        if(a[i].acc_no==accno){
                            index=i;
                            break;
                        }
                    }
                    

                    System.out.println("\n1.Deposit \n2.Withdraw\n");
                    int choice=s.nextInt();
                    if (choice==1){
                        a[index].deposit(s);
                        
                    }
                    else if (choice==2){
                        a[index].withdraw(s);
                    }
                    else
                        System.out.println("Invalid Choice");
                }
            else if(ch==2){
                large=0;
                for(int i=0;i<n;++i){
                    if(a[i].acc_bal>large){
                        large=a[i].acc_bal;
                        index=i;
                    }
                }
                a[index].displayDetails();
            }
            else if(ch==3){
                System.out.println("Exited");
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
    }
}