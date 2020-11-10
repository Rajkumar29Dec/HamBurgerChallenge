package altimetrik.raj;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Altimetrik Food Corner!" +
                "Please select Your Choice"
        +"1. View Basic Pricing"+" "
        +"2.Order Hamburger"+""+
                "3.CollectBill");
        int choice=2;
        switch (choice){
            case 1:
                BasicPricing basicPricing=new BasicPricing("Basic");
                basicPricing.PrintBasicPlan();
                break;
            case 2:
                OrderBurger orderBurger=new OrderBurger("Deluxe");
            case 3:

        }

    }
}
