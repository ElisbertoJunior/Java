public class Car {
  static String name = "Gol";
  static String color = "Prata";
  static int tankCapacity = 45;
    
  public static void carInfo() {
    System.out.println("O nome do carro e " + name + " a cor e " + color + " e tem capacidade para " + tankCapacity + " litros de combustivel.");
  }

  public static double valueToFillTheTank(double literValue) {
 
    return (double) (literValue * tankCapacity);
    
  }
  
}