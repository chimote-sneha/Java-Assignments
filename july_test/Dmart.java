import java.util.Scanner;
class Dmart{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the customer: ");
        String name=sc.nextLine();
        System.out.println("Enter the Gender of the customer(female/male) : ");
        String gender=sc.nextLine();
        String gift=((gender == "female")?"Cadeberry":"Ladger Wallet");

        System.out.println("Enter the name of Item1: ");
        String item1=sc.next();
        System.out.println("Enter the quantity of Item1: ");
        int qua1=sc.nextInt();
        int price1=qua1*10;
        double discount1=0.0;
        double afterdis1 = price1;
        if(qua1 > 4){
            discount1 = price1*0.5;
            afterdis1 = price1-discount1;
        }
        
       
        System.out.println("Enter the name of Item2: ");
        String item2=sc.next();
        System.out.println("Enter the quantity of Item2: ");
        int qua2=sc.nextInt();
        int price2=qua2*20;
        double afterdis2 = price2;
       
        
        System.out.println("Enter the name of Item3: ");
        String item3=sc.next();
        System.out.println("Enter the quantity of Item3: ");
        int qua3=sc.nextInt();
        int price3=qua3*30;
        double afterdis3 = price3;
       

        System.out.println("Enter the name of Item4: ");
        String item4=sc.next();
        System.out.println("Enter the quantity of Item4: ");
        int qua4=sc.nextInt();
        int price4=qua4*40;
        double afterdis4 = price4;
        

        System.out.println("Enter the name of Item5: ");
        String item5=sc.next();
        System.out.println("Enter the quantity of Item5: ");
        int qua5=sc.nextInt();
        int price5=qua5*50;
        double discount2=price5*0.10;
        double afterdis5 = price1-discount2;
        

        System.out.println("Enter the name of Item6: ");
        String item6=sc.next();
        System.out.println("Enter the quantity of Item6: ");
        int qua6=sc.nextInt();
        int price6=qua6*60;
        double afterdis6 = price6;
      

        System.out.println("Enter the name of Item7: ");
        String item7=sc.next();
        System.out.println("Enter the quantity of Item7: ");
        int qua7=sc.nextInt();
        int price7=qua7*70;
        double afterdis7 = price7;
       

        System.out.println("Enter the name of Item8: ");
        String item8=sc.next();
        System.out.println("Enter the quantity of Item8: ");
        int qua8=sc.nextInt();
        int price8=qua8*80;
        double afterdis8 = price8;
        

        System.out.println("Enter the name of Item9: ");
        String item9=sc.next();
        System.out.println("Enter the quantity of Item9: ");
        int qua9=sc.nextInt();
        int price9=qua9*90;
        double afterdis9 = price9;
        

        System.out.println("Enter the name of Item10: ");
        String item10=sc.next();
        System.out.println("Enter the quantity of Item10: ");
        int qua10=sc.nextInt();
        int price10=qua10*100;
        double discount10=price10*0.15;
        double afterdis10 = price10-discount10;
      


        double TotalBeforeDiscount=afterdis1 + afterdis2 + afterdis3 + afterdis4 + afterdis5 + afterdis6 + afterdis7 + afterdis8 + afterdis9 + afterdis10;
         
        double TotalDiscount = 0.0;
        if(TotalBeforeDiscount > 10000){
             TotalDiscount=TotalBeforeDiscount*0.15;
            double AfterDiscount=TotalBeforeDiscount-TotalDiscount;
        }
        else if(TotalBeforeDiscount > 5000 && TotalBeforeDiscount < 10000){
             TotalDiscount=TotalBeforeDiscount*0.10;
            double AfterDiscount=TotalBeforeDiscount-TotalDiscount;
        }
        double AfterDiscount=TotalBeforeDiscount-TotalDiscount;

        double gst= AfterDiscount *0.10;

        System.out.println("Carry bag (yes/no): ");
        String bag=sc.next();
        double carrybag =0.0;
        if(bag == "yes"){
            carrybag=10.0;
        }

        double TotalAmount=AfterDiscount + gst + carrybag ;

        System.out.println("\t\t\t D-Mart\t\t\t");
        System.out.println("Name : "+name+"\t\tDate : "+"21-07-2025");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Item name"+"\tQuantity"+"\tPrice"+"\t\ttotal"+"\tAfter Discount");
        System.out.println(" "+item1+" \t\t"+qua1+" \t\t"+"10\t\t"+price1+" \t\t"+afterdis1);
        System.out.println(" "+item2+" \t\t"+qua2+" \t\t"+"20\t\t"+price2+" \t\t"+afterdis2);
        System.out.println(" "+item3+" \t\t"+qua3+" \t\t"+"30\t\t"+price3+" \t\t"+afterdis3);
        System.out.println(" "+item4+" \t\t"+qua4+" \t\t"+"40\t\t"+price4+" \t\t"+afterdis4);
        System.out.println(" "+item5+" \t\t"+qua5+" \t\t"+"50\t\t"+price5+" \t\t"+afterdis5);
        System.out.println(" "+item6+" \t\t"+qua6+" \t\t"+"60\t\t"+price6+" \t\t"+afterdis6);
        System.out.println(" "+item7+" \t\t"+qua7+" \t\t"+"70\t\t"+price7+" \t\t"+afterdis7);
        System.out.println(" "+item8+" \t\t"+qua8+" \t\t"+"80\t\t"+price8+" \t\t"+afterdis8);
        System.out.println(" "+item9+" \t\t"+qua9+" \t\t"+"90\t\t"+price9+" \t\t"+afterdis9);
        System.out.println(" "+item10+" \t\t"+qua10+" \t\t"+"100\t\t"+price10+" \t\t"+afterdis10);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\tA.P"+"\t\tD.P");
        System.out.println("\t\t\t\t\t\t\t"+TotalBeforeDiscount+" \t\t"+AfterDiscount);
        System.out.println("Gift : "+gift+"\t\t\t\t\t0.0"+"\t\t0.0");
        System.out.println();
        System.out.println("Carrybag : "+bag+"\t\t\t\t\t\t10.0"+"\t\t10.0");
        System.out.println("GST(10%) : " +"\t\t\t\t\t\t"+gst+"\t\t"+gst);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t "+AfterDiscount+"\t\t "+TotalAmount);
        System.out.println("\t\t\tTHANK YOU \t\t\t");
        System.out.println("\t\t\tVISIT US \t\t\t");
        System.out.println("\t\t\tD-Mart\t\t\t");
    }
}