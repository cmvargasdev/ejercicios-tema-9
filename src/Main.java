public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setEdad(18);
        cliente1.setNombre("Jhon");
        cliente1.setTelefono("01234");
        cliente1.setCredito(999);

        System.out.println("Cliente Nombre: "+cliente1.getNombre());
        System.out.println("Cliente Edad: "+cliente1.getEdad());
        System.out.println("Cliente Telefono: "+cliente1.getTelefono());
        System.out.println("Cliente Credito: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();

        trabajador1.setEdad(18);
        trabajador1.setNombre("Maria");
        trabajador1.setTelefono("56789");
        trabajador1.setSalario(1200);

        System.out.println("Trabajador Nombre: "+trabajador1.getNombre());
        System.out.println("Trabajador Edad: "+trabajador1.getEdad());
        System.out.println("Trabajador Telefono: "+trabajador1.getTelefono());
        System.out.println("Trabajador Salario: "+trabajador1.getSalario());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

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

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}
class Cliente extends Persona {
    private int credito;
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }

}
class Trabajador extends Persona {
    private int salario;
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }

}