public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEdad("30");
        cliente.setTelefono("11233445677");
        cliente.setCredito("500");

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("\t Edad: " + cliente.getEdad());
        System.out.println("\t Telefono: " + cliente.getTelefono());
        System.out.println("\t Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Juan");
        trabajador.setEdad("30");
        trabajador.setTelefono("11233445677");
        trabajador.setSalario("80000");

        System.out.println("Trabajador: " + trabajador.getNombre());
        System.out.println("\t Edad: " + trabajador.getEdad());
        System.out.println("\t Telefono: " + trabajador.getTelefono());
        System.out.println("\t Salario: " + trabajador.getSalario());


    }
}


class Persona {
    private String edad;
    private String nombre;
    private String telefono;

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
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

    private String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {

    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}