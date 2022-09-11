public class ejercicio9 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Juan";
        cliente1.edad = 21;
        cliente1.telefono = "123456789";
        cliente1.credito = 1000;
        cliente1.MostrarDatos();
        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Pedro";
        trabajador1.edad = 22;
        trabajador1.telefono = "987654321";
        trabajador1.salario = 1000;
        trabajador1.MostrarDatos();
    }
}

abstract class Persona {
    int edad;
    String nombre;
    String telefono;
}
class Trabajador extends Persona {
    int salario;
    void MostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Salario: " + salario);
    }
}
class Cliente extends Persona {
    int credito;

    void MostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Credito: " + credito);
    }
}