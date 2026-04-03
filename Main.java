public class Main{

  public static void main(String[] args) {
        //create and instance of a Toy class = Toy object


        /*this 
        *is a 
        *multiline 
        *comment
        */


        Toy toy1 = new Toy();
        toy1.name = "kingpain";
        toy1.brand = "click";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setprice((toy1.price*0.5));
        System.out.println(toy1.price);
}

