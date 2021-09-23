import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(51) + 1;
    System.out.println(randomNum);
    System.out.println("The Random number is: " + randomNum); 
    if(randomNum>=5)
       {
      System.out.println("Ahoy mateys!");
       }
       else{
        
          if (randomNum > 25 && randomNum < 42)
           {
               System.out.println("Cannonball!");
           }
       }
       System.out.println("Blast off!");
  }
}