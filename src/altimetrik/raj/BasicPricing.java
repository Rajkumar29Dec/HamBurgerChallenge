package altimetrik.raj;

public class BasicPricing {
    String HamburgerType;

    public BasicPricing(String hamburgerType) {
        this.HamburgerType = hamburgerType;
    }

    public void PrintBasicPlan(){
       switch (this.HamburgerType){
           case "Basic":
               System.out.println("100 $ per Burger! For Additions Extra 10$ per Addition");
               break;
           case "Healthy":
               System.out.println("200$ Finally including 6 Additions");
               break;
           case "Deluxe":
               System.out.println("250$ Finally including Chips and Drinks!");
               break;
           default:
               System.out.println("Invalid Processingt");
       }
    }
}
