public class Personaje {
    private String nom;
    private int dinero;
    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }
    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");

    }

    public void gastarDinero(){
        int divisor = 1 + (int)(Math.random() * 5);
        int gastado = dinero / divisor;
        System.out.println(nom + " gasta " +gastado+ "$ en ropa nueva");
    }
    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();
        jugador.gastarDinero();
    }
}
