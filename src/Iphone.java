public class Iphone {

    // Interface ReprodutorMusical
    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    // Interface AparelhoTelefonico
    public interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarCorreioVoz();
    }

    // Interface NavegadorInternet
    public interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }

    // Classe iPhone implementando todas as interfaces
    public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        private String musicaAtual;
        private String paginaAtual;

        // Reprodutor Musical
        @Override
        public void tocar() {
            System.out.println("Tocando música: " + musicaAtual);
        }

        @Override
        public void pausar() {
            System.out.println("Música pausada.");
        }

        @Override
        public void selecionarMusica(String musica) {
            this.musicaAtual = musica;
            System.out.println("Música selecionada: " + musica);
        }

        // Aparelho Telefônico
        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para " + numero + "...");
        }

        @Override
        public void atender() {
            System.out.println("Chamando atendido.");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }

        // Navegador na Internet
        @Override
        public void exibirPagina(String url) {
            this.paginaAtual = url;
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Nova aba adicionada.");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando página: " + paginaAtual);
        }
    }

}
