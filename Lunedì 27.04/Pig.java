

class Pig extends Animal implements AnimalDo { //classe concreta estende classe astratta e implementa interfaccia

  public void animalSound() { //metodo concreto implementa metodo astratto
    System.out.println("The pig says: wee wee");
  }

  public void sleep() { //metodo dell'interfaccia
    System.out.println("The pig sleeps");
  }
}