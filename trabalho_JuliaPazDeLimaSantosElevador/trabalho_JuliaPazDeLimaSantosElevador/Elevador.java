public class Elevador {
    boolean porta;
    int totalAndares;
    int andarAtual;

    public Elevador(int totalAndares){
        this.totalAndares = totalAndares;
        andarAtual = 0;
        porta = false;
    }

    public void abrirPorta(){
        if (!porta){
            porta = true;
            System.out.println("A porta está aberta!");
        } else {
            System.out.println("A porta já esta aberta!");
        }
    }

    public void fecharPorta(){
        if (porta){
            porta = false;
            System.out.println("Porta está fechada!");
        } else {
            System.out.println("A porta já está fechada!");
        }
    }

    public void subir(){
        if (porta){
            System.out.println("Não é possivel subir o elevador com a porta aberta");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para  andar: "+andarAtual);
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void descer(){
        if (porta){
            System.out.println("Não é possivel descer com a porta aberta!");
        } else if (andarAtual > 0){
            andarAtual--;
            System.out.println("Desceu para o andar: "+ andarAtual);
        } else {
            System.out.println("O elevador já está no térreo!");
        }
    }

    public void mostrarAndarAtual(){
        System.out.println("O andar atual é: "+andarAtual);
    }

    public void mostrarEstadoDaPorta(){
        if (porta) {
            System.out.println("A porta no momento está aberta!");
        } else {
            System.out.println("A porta no momento está fechada!");
        }
    }

}
