package altimetrik.raj;

public class OrderBurger {
    String BurgerType;
    String BreadRollType;
    boolean meat=true,carrot=true,lettuce=false,tomato=true;


    public OrderBurger(String burgerType) {
        this.BurgerType=burgerType;
        if (this.BurgerType.equalsIgnoreCase("Basic")){
                BasicBurger();
        }
        else if (this.BurgerType.equalsIgnoreCase("Healthy")){
            HealthyBurger healthyBurger=new HealthyBurger();
            System.out.println(healthyBurger.getPrice_healthyhamburger());
        }
        else if (this.BurgerType.equalsIgnoreCase("Deluxe")){
            DeluxeBurger deluxeBurger=new DeluxeBurger();
            System.out.println(deluxeBurger.getPrice_deluxeburger());
        }
    }

    private void HealthyBurger_price() {
        System.out.println("Price is "+250);
    }

    public void BasicBurger(){
        int basicPrice=100;
        if (meat){
            basicPrice+=10;
        }
        if (carrot){
            basicPrice+=10;
        }
        if (lettuce){
            basicPrice+=10;
        }
        if (tomato){
            basicPrice+=10;
        }

        printTotalBasic(basicPrice);

    }

    private void printTotalBasic(int basicPrice) {
        System.out.println("Price is "+basicPrice);
    }
}
