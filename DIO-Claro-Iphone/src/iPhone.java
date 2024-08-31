public abstract class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    //Aparelho telefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando aparelho");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz");
    }

    // Navegador Internet
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }

    // Reprodutor música
    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada");
    }

}
