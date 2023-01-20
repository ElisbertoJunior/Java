public class Car {
  String model;
  String color;
  int tankCapacity;

 Car() {}

  Car(String model, String color, int tankCapacity) {
    this.model = model;
    this.color = color;
    this.tankCapacity = tankCapacity;
  }

  void setColor(String color) {
    this.color = color;
  }

  String getColor() {
    return color;
  }

  void setModel(String model) {
    this.model = model;
  }

  String getModel() {
    return model;
  }

  void setTankCapacity(int tankCapacity) {
    this.tankCapacity = tankCapacity;
  }

  int getTankCapacity() {
    return tankCapacity;
  }
    
 

  double valueToFillTheTank(double literValue) {
 
    return (double) (literValue * tankCapacity);
    
  }
  
}