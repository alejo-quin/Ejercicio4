//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
//esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
//el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
//y con una variable salario que solo tenga la clase Trabajador.
public class Main {
    public static void main(String[] args) {
//Ejemplo para cliente con el numero de credito
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("jairo");
        cliente1.setEdad(25);
        cliente1.setTelefono("3145553899");
        cliente1.setCredito(32245899);

        System.out.println("El nombre es: "+ cliente1.getNombre());
        System.out.println("La edad es: "+ cliente1.getEdad());
        System.out.println("El telefono es: "+ cliente1.getTelefono());
        System.out.println("El credito es: "+ cliente1.getCredito());

//Ejemplo para trabajador con el valor del salario
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("camilo");
        trabajador1.setEdad(38);
        trabajador1.setTelefono("3145553899");
        trabajador1.setSalario(3.999f);

        System.out.println("El nombre es: "+ trabajador1.getNombre());
        System.out.println("La edad es: "+ trabajador1.getEdad());
        System.out.println("El telefono es: "+ trabajador1.getTelefono());
        System.out.println("El salario es: "+ trabajador1.getSalario());
    }

}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona {
     int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}