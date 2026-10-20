public class PerfilUsuario {
    String nombre;
    int pasosAcomulados;
    String insignia;
    String[] insigniasObtenidas;
    int cantidadInsignas;

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
        this.pasosAcomulados = 0;
        this.insignia = "";
        insigniasObtenidas = new String[10];
        cantidadInsignas = 0;
    }

    public void otorgarInsignia(String nombreInsignia) {
        this.insignia = nombreInsignia;
        insigniasObtenidas[cantidadInsignas] = nombreInsignia;
        cantidadInsignas++;
        System.out.println("insignia obtenida: " + nombreInsignia);
    }
}
