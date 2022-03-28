public class Main
{
  public static void main(String[] args)
  {

    System.out.println("--- Testing Dancer constructor ---");
    Agent maria = new Agent("Maria Hilliard", "917-221-3451");
    Dancer tony = new Dancer("Tony Danza", 32, maria, 11);



    System.out.println("--- Testing Part 1: pirouette ---");
    tony.pirouette(5); // new method



    System.out.println("\n--- Testing Part 2: rehearse ---");
    tony.rehearse(); // overridden method



    System.out.println("\n--- Testing Part 3: perform ---");
    tony.perform(); // inherited method
    System.out.println();
    tony.perform(true); // overloaded method
    System.out.println();
    tony.perform(false); // overloaded method



    System.out.println("\n--- Testing Part 4: callAgent ---");
    tony.callAgent(); // overridden method



    System.out.println("\n--- Testing Part 5: callAgent #2 ---");
    tony.callAgent(12); // overloaded method



    System.out.println("\n--- Testing Part 6 & 7: getter methods ---");
    System.out.println(tony.getShoeSize()); // new getter method
    System.out.println(tony.getName()); // overridden getter method

  }
}