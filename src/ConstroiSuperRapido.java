

public class ConstroiSuperRapido {
    public static void main(String[] args) {

        String opcaoUsuario = PegarOpcaoUsuario();


        while (!opcaoUsuario.toUpperCase().equals("X")){

            Endereco metodosEndereco = new Endereco();
            int totalEnderecos = Endereco.ContagemEnderecos();
            System.out.println(totalEnderecos);

            switch(opcaoUsuario){

                case "1":

                    int idEndereco = 0;

                    int codigoEndereco    = InOut.leInt("Insira o código referente ao endereço:");
                    String cepEndereco    = InOut.leString("Insira o CEP referente ao endereço:");
                    String ruaEndereco    = InOut.leString("Insira a rua referente ao endereço:");
                    String bairroEndereco = InOut.leString("Insira o bairro referente ao endereço:");
                    int numeroEndereco    = InOut.leInt("Insira o número referente ao endereço:");

                    Endereco baseEndereco = new Endereco(codigoEndereco,cepEndereco,ruaEndereco,bairroEndereco,numeroEndereco);

                    metodosEndereco.InserirEndereco(idEndereco, baseEndereco);
                    idEndereco++;

                    break;

                case "2":

                    String cnpj  = InOut.leString("Insira o código referente ao CNPJ:");
                    int enderecoConstrutora = InOut.leInt("Insira o código referente ao endereço:");

                    ValidaCPNJ validarCNPJ = new ValidaCPNJ();
                    boolean resultadoValidacao = validarCNPJ.isCNPJ(cnpj);

                    System.out.println(totalEnderecos);
                    break;

                case  "3":

                    String nome          = InOut.leString("Insira o nome do corretor:");
                    String matricula     = InOut.leString("Insira o número da matrícula do corretor:");
                    float metaMensal     = InOut.leFloat("Insira o valor da meta mensal do corretor:");
                    float vendaMensal    = InOut.leFloat("Insira o o valor da venda mensal do corretor:");
                    int enderecoCorretor = InOut.leInt("Insira o código referente ao endereço:");

                    System.out.println(totalEnderecos);
                    break;
            }
             opcaoUsuario = PegarOpcaoUsuario();
        }



        System.out.println("A Opção digitada é: " + opcaoUsuario);

    }

    private static String PegarOpcaoUsuario(){
        System.out.println("Bem vindo ao Constructor Prog!!!");
        System.out.println("O que deseja fazer hoje:");
        System.out.println("1 - Inserir Endereco");
        System.out.println("2 - Cadastrar Construtora");
        System.out.println("3 - Inserir corretor");
        System.out.println("X - Sair do programa");

        String opcaoMenu = InOut.leString("Insira a opção desejada abaixo:");

        return opcaoMenu;


    }




}
