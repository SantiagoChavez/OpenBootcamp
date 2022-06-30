class Suma{


        public int sumar(int a, int b, int c){
            return a + b + c;

        }

        public static void main(String[] args) {

            Suma sumaParametros = new Suma();
            int sum = sumaParametros.sumar(125, 125, 125);
            System.out.println(sum);

            Coche miCoche = new Coche();
            miCoche.agregarPuertas(1);
                System.out.println("Cantidad de puertas de mi coche :" + miCoche.puertas);



        }
}



