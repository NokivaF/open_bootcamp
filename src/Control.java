public class Control {
  public static void main(String[] args) {
    int numeroIf = 0;
    int numeroWhile = 0;
    String estacion = "";

    if (numeroIf > 0) {
      System.out.println(numeroIf + "es un número positivo");
    }
    if (numeroIf < 0) {
      System.out.println(numeroIf + "es un número negativo");
    } else {
      System.out.println("No hay número por comparar");
    }

    while (numeroWhile < 3) {
      numeroWhile++;
      System.out.println(numeroWhile);
    }

    do {
      numeroWhile++;
      System.out.println(numeroWhile);
    } while (numeroWhile == 0);

    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println(numeroFor);
    }

    switch (estacion) {
      case ("Primavera"):
        System.out.println("Es Primavera");
        break;
      case ("Verano"):
        System.out.println("Es Verano");
        break;
      case ("Otoño"):
        System.out.println("Es Otoño");
        break;
      case ("Invierno"):
        System.out.println("Es Invierno");
      default:
        System.out.println("No es una estación");

    }
  }

}
