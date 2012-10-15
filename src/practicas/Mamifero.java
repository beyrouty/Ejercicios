
package practicas;

class Animal{
private String nom,son;
Animal(String nom,String son){
    this.nom=nom;
    this.son=son;
}
public String getNom(){
    return nom;
}
public String getSon(){
    return son;
}
}

public class Mamifero {
    
    public static void main(String[] args) {
        Animal gato=new
                Animal("Peluche","Miauuuu");
        Animal perro=new
                Animal("Fido","Guauuuuuu");
        
        System.out.println("El gato "+gato.getNom()+" hace "+gato.getSon());
        System.out.println("El perro "+perro.getNom()+" hace "+perro.getSon());
    }
    
  
    
}
