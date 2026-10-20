public class Main {
    public static void main(String[] args) {
    PerfilUsuario usuario = new PerfilUsuario("Juan Perez");
    PulseraInteligente pulsera = new PulseraInteligente(usuario);
    pulsera.registrarPasos(12000);
    System.out.println("insignia obtenida: " + usuario.insignia);
    }
}
