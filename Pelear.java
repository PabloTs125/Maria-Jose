import java.util.Scanner;

public class Pelear {

  public static void main(String[] args) {
    personaje jugador1 = null;
    personaje jugador2 = null;

    Scanner leer = new Scanner(System.in);
    int respu, opc;
    System.out.println("BIEEENVEENIDOOOS  A PELEAAS CLANDESTINAS jugador 1");
    // System.out.println("jugador 1");
    jibaro.detalles();
    Tombo.detalles();
    System.out.println("ESCOGER LUCHADOOR");
    System.out.println("1. jibaro");
    System.out.println("2. Tombo");
    respu = leer.nextInt();
    if (respu == 1) {
      jugador1 = new jibaro();
      System.out.println("Jugador 1 Elejiste a jibaro");
    } else if (respu == 2) {
      jugador2 = new Tombo();
      System.out.println("Jugador 1 Elejiste a Tombo");
    }
    System.out.println("BIEEENVEENIDOOOS  A PELEAAS CLANDESTINAS jugador 2");
    // System.out.println("2.seleccionar");
    jibaro.detalles();
    Tombo.detalles();
    System.out.println("ESCOGER LUCHADDOOR");
    System.out.println("1. Jibaro");
    System.out.println("2. Tombo");
    opc = leer.nextInt();
    switch (opc) {
      case 1:
        jugador1 = new jibaro();
        System.out.println("Jugador 2 Elejiste a Jibaro");
        break;
      case 2:
        jugador2 = new Tombo();
        System.out.println("Jugador 2 Elejiste a Tombo");
        break;
    }
    System.out.println();

    System.out.println("HORA DE PELEAR");
    System.out.println();

    do {
      ATAQUE(jugador1, jugador2);
      jugador2.setSalud(jugador2.getSalud() - jugador1.getFuerza() - jugador1.getPoder());
    
    System.out.println("la fuerza del ataque del jugador1 es: " + jugador1.getFuerza());
    System.out.println("La salud del jugador1 es: " + jugador1.getSalud());
    System.out.println("el poder del jugador1 es:" + jugador1.getPoder());
    ATAQUE(jugador2, jugador1);
    jugador1.setSalud(jugador1.getSalud() - jugador2.getFuerza() - jugador2.getPoder());
    System.out.println("La fuerza del del ataque del jugador2 es: " + jugador2.getFuerza());
    System.out.println("La salud del jugador2 es: " + jugador2.getSalud());
    System.out.println("el poder del jugador2 es:" + jugador2.getPoder());
    leer.next();
  } while (jugador1.Salud > 0 && jugador2.Salud > 0);
    if (jugador2.getSalud() <= 0) {
      System.out.println("¡jugador 1 gandor!");
    } else if (jugador2.getSalud() <= 0) {
      System.out.println("¡jugador 2 gandor!");
    }

  }


  // ATAQUE
  public static void ATAQUE(personaje uno, personaje dos) {
    dos.setSalud(dos.getSalud() - uno.getFuerza());
  }
}
