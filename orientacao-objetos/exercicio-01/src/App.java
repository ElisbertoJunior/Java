public class App {
    public static void main(String[] args)  {
      Car carro1 = new Car();

       carro1.setModel("Gol");         
       carro1.setColor("Preto");
       carro1.setTankCapacity(45);

       System.out.println(carro1.getModel());
       System.out.println(carro1.getColor());
       System.out.println(carro1.getTankCapacity());

       System.out.println("Valor para encher o tanque e " + carro1.valueToFillTheTank(5.37));

    }
}


