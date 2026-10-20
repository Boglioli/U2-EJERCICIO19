public class PulseraInteligente {
    PerfilUsuario perfil;
    int metaDiaria = 10000;

    public PulseraInteligente(PerfilUsuario perfil) {
        this.perfil = perfil;
        metaDiaria = 10000;
    }

    public void registrarPasos(int cantidad) {
        perfil.pasosAcomulados += cantidad;
        System.out.println("pasos registrados: " + cantidad);
        System.out.println("pasos acumulados: " + perfil.pasosAcomulados);

        if (perfil.pasosAcomulados >= metaDiaria && perfil.insignia.isEmpty()) {
            perfil.otorgarInsignia("meta diaria cumplida");
        }
    }
}
