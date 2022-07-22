public class App {
    public static void main(String[] args) {
        App a = new App();

        suma(10, 20, 10);

        Car miCoche = a.new Car();
        miCoche.getDoors();
        System.out.println(miCoche.doorsNumber);
    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de la suma es: " + resultado);

    }

    class Car {
        public int doorsNumber = 0;

        public void getDoors() {
            this.doorsNumber++;
        }

    }
}
