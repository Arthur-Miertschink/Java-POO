public class ConstroiSuperRapido {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCodigo(0);
        endereco.setCep("29101751");
        endereco.setBairro("Itapuã");
        endereco.setRua("Ameixeira");
        endereco.setNumero(68);

        Construtora construtora = new Construtora();
        construtora.setCnpj("63394370000170");
        construtora.setEndereco(endereco);



        System.out.println(construtora.getEndereco());
    }
}
