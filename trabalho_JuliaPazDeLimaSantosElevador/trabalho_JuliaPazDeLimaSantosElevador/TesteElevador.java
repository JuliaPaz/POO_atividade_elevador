public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10);

        elevador.mostrarAndarAtual();
        elevador.abrirPorta();
        elevador.fecharPorta();
        elevador.mostrarEstadoDaPorta();

        elevador.subir();
        elevador.subir();

        elevador.abrirPorta();
        elevador.subir();
        elevador.descer();
        elevador.fecharPorta();
        elevador.descer();

        elevador.mostrarAndarAtual();
        elevador.mostrarEstadoDaPorta();
    }
}
