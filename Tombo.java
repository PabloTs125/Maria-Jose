public class Tombo extends personaje {
    int pistola = 70;
    int Ak47 = 150;
    int placa = 1;
    int bolillo = 1;

    public Tombo() {
        LasLukas = 15000;
        Salud = 1000;
        Ataque = 150;
        Fuerza = 56;
    }

    public static void detalles() {
        System.out.println("El Tombo tiene los siguientes elementos");

        System.out.println("Dinero: 15000");
        System.out.println("Salud: 1000");
        System.out.println("Pistola: 70");
        System.out.println("Ak47: 150");
        System.out.println("placa: 1");
        System.out.println("bolillo: 1");
        System.out.println("ataque: 150");
        System.out.println("fuerza: 56");
    }
}
