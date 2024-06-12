public class Iphone {
    public static void main(String[] args) throws Exception {
        // Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}
// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}
// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
// Classe iPhone que implementa todas as interfaces
@SuppressWarnings("unused")
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
    }
    @Override
    public void pausar() {
    }
    @Override
    public void selecionarMusica(String musica) {
   
    }
    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) { 
    }
    @Override
    public void atender() {    
    }
    @Override
    public void iniciarCorreioVoz() {
            
    }
    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {    
    }
    @Override
    public void adicionarNovaAba() {

    }
    @Override
    public void atualizarPagina() {
       
    }
}

    }
}
