public class Switch {
    public static void main(String[] args) {
        var estacion = "Verano";

        switch (estacion){

        case "Verano":
            System.out.println("Estamos en : " + estacion);
            break;
        case "Otoño":
            System.out.println("Estamos en : " + estacion);
            break;
        case "Invierno":
            System.out.println("Estamos en : " + estacion);
            break;
        case "Primavera":
        System.out.println("Estamos en : " + estacion);
            break;

        default:
        System.out.println("No es una estacion");
    }
 }
}