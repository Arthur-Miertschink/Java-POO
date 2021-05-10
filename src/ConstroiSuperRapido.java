

public class ConstroiSuperRapido {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Constructor Prog!!!");
        System.out.println("O que deseja fazer hoje:");
        System.out.println("1 - Inserir Endereco");
        System.out.println("2 - Cadastrar Construtora");
        System.out.println("3 - Inserir corretor");
        System.out.println("X - Sair do programa");

        String opcaoMenu = InOut.leString("Insira a opção desejada abaixo:");


        while (!opcaoMenu.toUpperCase().equals("X")){
            switch(opcaoMenu){

                case "1":
                    System.out.println("IE");
                    break;

                case "2":
                    System.out.println("CC");
                    break;

                case  "3":
                    System.out.println("IC");
                    break;
            }
        }





        System.out.println("A Opção digitada é: " + opcaoMenu);



    }
}
