package practicas;

public class Person {
    
    private int ageYears = 32;
    private String name = "Pedro";
    private String job = "Programador";
    
    public void calculateAge() {
    int ageDays = ageYears * 365;
    long ageSeconds = ageYears * 365 * 24L * 60 * 60;
        System.out.println("Tienes" + ageDays + " días de nacido.");
        System.out.println("Tienes" + ageSeconds + " días de nacido.");
    }
    
    public void display() {
        System.out.println("Mi nombre es" + name + ",Soy un" + job);
    }
    
}
