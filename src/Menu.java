public class Menu {

    public static void main(String[] args) {

        String opcaoMenu = PegarOpcaoUsuario();

        Construtora construtora = new Construtora();

        while (!opcaoMenu.equalsIgnoreCase("X")){

            switch (opcaoMenu){

                case "1" -> construtora.criarConstrutora();

                case "2" -> construtora.adicionarCorretor();

                case "3" -> construtora.exibirTotalVendido();

                case "4" -> construtora.exibirCorretores();

                case "5" -> construtora.atualizarVendasCorretor();

            }

            opcaoMenu = PegarOpcaoUsuario();

        }


    }

    private static String PegarOpcaoUsuario(){

        return InOut.leString(
                """
                        Bem vindo ao Constructor Prog!!!

                        O que deseja fazer hoje:
                        1 - Cadastrar construtora
                        2 - Cadastrar corretor
                        3 - Visualizar total vendido pela construtora
                        4 - Exibir todos os corretores
                        5 - Atualizar venda mensal do corretor
                        X - Sair do programa

                        """
        );


    }




}
