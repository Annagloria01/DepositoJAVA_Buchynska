public class Main {
    public static void main(String[] args) {

    /* Animal myAnimal = new Animal();  
 */
    Animal myPig = new Pig(); //creazoine oggetto di classe concreta usando classe astratta come tipo di riferimento 
    Animal myDog = new Dog();  

    myPig.animalSound(); //metodo astratto usato come modello per metodo concreto
    myDog.animalSound();
    myPig.sleep(); //metodo dell'interfaccia usato come modello per metodo concreto
 }  
}
