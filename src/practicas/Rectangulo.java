
package practicas;


public class Rectangulo {
    
    private int largo = 10;
    private int ancho = 2;
    
    public static void main(String[] args) {
                
        int area;
        
        Rectangulo rectangulo = new Rectangulo();
        area= rectangulo.largo * rectangulo.ancho;
        System.out.println("Area:" + area);
    }
    
}
