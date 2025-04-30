import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Random;
class BillPrint{
    public static void main(String[] args) {
        System.out.println("\t\t\t---------------------------------------------------\n\t\t\t\t\tCASH RECEIPT\n\t\t\t---------------------------------------------------");
        System.out.println("\t\t\t\t      P&S Grocery Store,\n\t\t\t     Behind Taj Skyline,Sindhubhavan Road,\n\t\t\t\t      Ahmedabad - 380054");
        System.out.println("\t\t\t---------------------------------------------------");
        System.out.println("\t\t\t GSTIN:03AWBPPB756K592");
        System.out.println("\t\t\t Customer care:0816 276 0259  /\t www.pandas257.com");
        Random ran = new Random();
        int ran1 = ran.nextInt(1000);
        System.out.println("\t\t\t Order No:"+ran1);
        TimeZone tz = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone.setDefault(tz);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("\t\t\t yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(tz);
        String istTime = sdf.format(date);
        System.out.println(istTime);
        Scanner scn = new Scanner(System.in);
        System.out.print("\t\t\t Cashier name:");
        String cashier = scn.nextLine();
        System.out.println("\t\t\t---------------------------------------------------");
        System.out.print("\t\t\t Enter Customer Name:");
        String cust = scn.nextLine();
        double totalprice=0;
        double overallprice=0;
        int choice=0;
        do{
        System.out.print("\t\t\t Enter Product Details::\n");
        System.out.print("\t\t\t PRODUCT ID:");
        int id = scn.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\t\t PRODUCT NAME:");
        String pname = sc.nextLine();
        System.out.print("\t\t\t QUANTITY:");
        int pqty = scn.nextInt();
        System.out.print("\t\t\t PRICE(Per Unit):");
        double pprice = scn.nextDouble();
        totalprice=pqty*pprice;
        System.out.print("\t\t\t TOTAL PRICE:"+totalprice);
        overallprice = overallprice+totalprice;
        System.out.println("\n\t\t\t *PRESS 1 TO ADD MORE ITEMS\n\t\t\t *PRESS 2 FOR EXIT ");
        System.out.print("\t\t\t ");
        choice = scn.nextInt();
        }
        while(choice == 1);
        System.out.println("\t\t\t---------------------------------------------------");
        System.out.print("\t\t\t OVERALL PRICE(Rs.):"+overallprice);
        double discount = 0.0;
        discount=overallprice*5/100;
        System.out.print("\n\t\t\t DISCOUNT(Rs.):"+discount);
        double sgst=0.0;
        double cgst=0.0;
        sgst=overallprice*9/100;
        cgst=overallprice*9/100;
        System.out.print("\n\t\t\t SGST(%):"+sgst);
        System.out.print("\n\t\t\t CGST(%)"+cgst);
        System.out.println("\n\t\t\t INVOICE TOTAL:"+(overallprice-discount+sgst+cgst));
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\t\t PAYMENT MODE:");
        String p = sc.nextLine();
        if(p.equals("debitcard") || p.equals("creditcard"))
        {
            Scanner s = new Scanner(System.in);
            System.out.print("\t\t\t Card No:");
            int n = s.nextInt();
        }
        if(p.equals("upi") || p.equals("cash"))
        {
            Scanner scol = new Scanner(System.in);
            System.out.print("\t\t\t Mobile Number:");
            long m = scol.nextLong();
        }
        System.out.println("\t\t\t Payment Date and Time:");
        TimeZone tze = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone.setDefault(tze);
        Date dates = new Date();
        SimpleDateFormat sdfe = new SimpleDateFormat("\t\t\t yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(tze);
        String istTimes = sdfe.format(dates);
        System.out.println(istTimes);
		System.out.println();
		System.out.println("\t\t\t TOTAL SAVINGS:"+discount);
		System.out.println("\t\t\t---------------------------------------------------");
		//System.out.println("\t\t\t---------------------------------------------------");
		System.out.println("\t\t\t\t   'NO RETURN , NO EXCHANGE' ");
		//System.out.println();
       // System.out.println("\t\t\t\t THANK YOU FOR SHOPPING at P&S!!");
        //System.out.println("\t\t\t\t     VISIT AGAIN :)");
        System.out.println("\t\t\t---------------------------------------------------"); 
        System.out.println("\t\t\t\t    !!TERMS & CONDITIONS!! ");
        System.out.println("\t\t\t      -------------------------------------");
        System.out.println("\t\t\t    *Goods once Sold will not be taken back.");
        System.out.println("\t\t\t    *No Cashback against any Product. ");
        System.out.println("\t\t\t    *We aren't responsible for any\n\t\t\t     Shortage or Damage or Theft in transit.");
        System.out.println("\t\t\t    *Goods are Pure but take care before use.");
        System.out.println("\t\t\t    *Subject to AHMEDABAD Jurisdiction.");
        System.out.println();
        System.out.println("\t\t\t\t THANK YOU FOR SHOPPING at P&S!!");
        System.out.println("\t\t\t\t       VISIT AGAIN :)");
        System.out.println("\t\t\t      -------------------------------------");
	}
}