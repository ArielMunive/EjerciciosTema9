package ejerciciostema9;

public class EjerciciosTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        cliente.setNombre("Ariel");
        System.out.println("El nombre es: " + cliente.getNombre());
        
        cliente.setEdad(35);
        System.out.println("La edad es: " + cliente.getEdad());
        
        cliente.setTelefono(123456789);
        System.out.println("El telefono es: " + cliente.getTelefono());
        
        cliente.setCredito(1458.32);
        System.out.println("El credito disponible es: " + cliente.getCredito());
        
        trabajador.setNombre("Francisco");
        System.out.println("El nombre es: " + trabajador.getNombre());
        
        trabajador.setEdad(28);
        System.out.println("La edad es: " + trabajador.getEdad());
        
        trabajador.setTelefono(987654321);
        System.out.println("El telefono es: " + trabajador.getTelefono());
        
        trabajador.setSalario(2500.0);
        System.out.println("El salario es: " + trabajador.getSalario());
    }
}
    
    class Persona{
    private int edad;
    private String nombre;
    private int telefono;   
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
   }  
    
   class Cliente extends Persona{
       double credito;
       
       public void setCredito(double credito){
        this.credito = credito;
        }
        public double getCredito(){
        return this.credito;
        }
    }
   
   class Trabajador extends Persona{
       double salario;
       
       public void setSalario(double salario){
        this.salario = salario;
        }
        public double getSalario(){
        return this.salario;
        }
    }
