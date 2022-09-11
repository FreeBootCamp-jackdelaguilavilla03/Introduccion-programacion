public class ejercicio8 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(20);
        persona1.setNombre("Juan");
        persona1.setTelefono("123456789");
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;


    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.telefono = "";
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
}