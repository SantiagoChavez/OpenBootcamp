public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad("31");
        persona.setNombre("Juan");
        persona.setTelefono("1523467945");

        System.out.println(Persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}
    class Persona {
        private static String edad;
        private String nombre;
        private String telefono;

        public static String getEdad() {
            return edad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setEdad(String edad) {
            Persona.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

    }