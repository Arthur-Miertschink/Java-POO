import javax.xml.stream.events.EndElement;

public class ConstroiSuperRapido {
    public static void main(String[] args) {

        //Setando Endereços
        Endereco enderecoConstrutora = new Endereco();
        enderecoConstrutora.setCodigo(0);
        enderecoConstrutora.setCep("29101751");
        enderecoConstrutora.setBairro("Itapuã");
        enderecoConstrutora.setRua("Ameixeira");
        enderecoConstrutora.setNumero(68);

        Endereco enderecoCorretor1 = new Endereco();
        enderecoCorretor1.setCodigo(1);
        enderecoCorretor1.setCep("29126582");
        enderecoCorretor1.setBairro("Morada da Barra");
        enderecoCorretor1.setRua("José do Patrocínio");
        enderecoCorretor1.setNumero(15);

        Endereco enderecoCorretor2 = new Endereco();
        enderecoCorretor2.setCodigo(2);
        enderecoCorretor2.setCep("29104020");
        enderecoCorretor2.setBairro("Novo México");
        enderecoCorretor2.setRua("Rosa Amarela");
        enderecoCorretor2.setNumero(25);

        Endereco enderecoCorretor3 = new Endereco();
        enderecoCorretor3.setCodigo(3);
        enderecoCorretor3.setCep("29101290");
        enderecoCorretor3.setBairro("Praia da Costa");
        enderecoCorretor3.setRua("Ceará");
        enderecoCorretor3.setNumero(32);

        Endereco enderecoCorretor4 = new Endereco();
        enderecoCorretor4.setCodigo(4);
        enderecoCorretor4.setCep("29111103");
        enderecoCorretor4.setBairro("Cobilândia");
        enderecoCorretor4.setRua("Heraldo Laurentino");
        enderecoCorretor4.setNumero(5);

        Endereco enderecoCorretor5 = new Endereco();
        enderecoCorretor5.setCodigo(5);
        enderecoCorretor5.setCep("29112015");
        enderecoCorretor5.setBairro("Jardim Marilândia");
        enderecoCorretor5.setRua("Olíbia Moreira Rodrigues");
        enderecoCorretor5.setNumero(100);

        Endereco enderecoCorretor6 = new Endereco();
        enderecoCorretor6.setCodigo(6);
        enderecoCorretor6.setCep("29103619");
        enderecoCorretor6.setBairro("Guaranhuns");
        enderecoCorretor6.setRua("Betinho Souza");
        enderecoCorretor6.setNumero(33);

        Endereco enderecoCorretor7 = new Endereco();
        enderecoCorretor7.setCodigo(7);
        enderecoCorretor7.setCep("29108605");
        enderecoCorretor7.setBairro("IBES");
        enderecoCorretor7.setRua("Praça Ralth Salles");
        enderecoCorretor7.setNumero(21);

        Endereco enderecoCorretor8 = new Endereco();
        enderecoCorretor8.setCodigo(8);
        enderecoCorretor8.setCep("29128255");
        enderecoCorretor8.setBairro("Morro da Lagoa");
        enderecoCorretor8.setRua("Edimar Meneguelli");
        enderecoCorretor8.setNumero(15);

        Endereco enderecoCorretor9 = new Endereco();
        enderecoCorretor9.setCodigo(9);
        enderecoCorretor9.setCep("29129316");
        enderecoCorretor9.setBairro("Nova Ponta da Fruta");
        enderecoCorretor9.setRua("Beco Ribeirão Doce");
        enderecoCorretor9.setNumero(250);

        Endereco enderecoCorretor10 = new Endereco();
        enderecoCorretor10.setCodigo(10);
        enderecoCorretor10.setCep("29111067");
        enderecoCorretor10.setBairro("Cobilândia");
        enderecoCorretor10.setRua("Beco do Pavão");
        enderecoCorretor10.setNumero(376);

        Endereco enderecoCorretor11 = new Endereco();
        enderecoCorretor11.setCodigo(11);
        enderecoCorretor11.setCep("29112190");
        enderecoCorretor11.setBairro("Jardim Marilândia");
        enderecoCorretor11.setRua("Rua Dulcinópolis");
        enderecoCorretor11.setNumero(48);

        Endereco enderecoCorretor12 = new Endereco();
        enderecoCorretor12.setCodigo(12);
        enderecoCorretor12.setCep("29105550");
        enderecoCorretor12.setBairro("Santa Mônica Popular");
        enderecoCorretor12.setRua("Rua Trinta e Cinco");
        enderecoCorretor12.setNumero(51);

        Endereco enderecoCorretor13 = new Endereco();
        enderecoCorretor13.setCodigo(13);
        enderecoCorretor13.setCep("29114600");
        enderecoCorretor13.setBairro("Chácara do Conde");
        enderecoCorretor13.setRua("Rua José Paulino de Carvalho");
        enderecoCorretor13.setNumero(11);

        Endereco enderecoCorretor14 = new Endereco();
        enderecoCorretor14.setCodigo(14);
        enderecoCorretor14.setCep("29122400");
        enderecoCorretor14.setBairro("Glória");
        enderecoCorretor14.setRua("Rua Cafarnaum");
        enderecoCorretor14.setNumero(67);

        Endereco enderecoCorretor15 = new Endereco();
        enderecoCorretor15.setCodigo(15);
        enderecoCorretor15.setCep("29107160");
        enderecoCorretor15.setBairro("Divino Espírito Santo");
        enderecoCorretor15.setRua("Rua São Gabriel");
        enderecoCorretor15.setNumero(56);

        Endereco enderecoCorretor16 = new Endereco();
        enderecoCorretor16.setCodigo(16);
        enderecoCorretor16.setCep("29108820");
        enderecoCorretor16.setBairro("IBES");
        enderecoCorretor16.setRua("Rua Professor Manoel de Souza");
        enderecoCorretor16.setNumero(45);

        Endereco enderecoCorretor17 = new Endereco();
        enderecoCorretor17.setCodigo(17);
        enderecoCorretor17.setCep("29104555");
        enderecoCorretor17.setBairro("Jardim Asteca");
        enderecoCorretor17.setRua("Praça das Flores");
        enderecoCorretor17.setNumero(54);

        Endereco enderecoCorretor18 = new Endereco();
        enderecoCorretor18.setCodigo(18);
        enderecoCorretor18.setCep("29120565");
        enderecoCorretor18.setBairro("Aribiri");
        enderecoCorretor18.setRua("Travessa Antônio Bezerra de Faria");
        enderecoCorretor18.setNumero(75);

        Endereco enderecoCorretor19 = new Endereco();
        enderecoCorretor19.setCodigo(19);
        enderecoCorretor19.setCep("29124078");
        enderecoCorretor19.setBairro("São Conrado");
        enderecoCorretor19.setRua("Rua Olavo Bilac");
        enderecoCorretor19.setNumero(47);

        Endereco enderecoCorretor20 = new Endereco();
        enderecoCorretor20.setCodigo(20);
        enderecoCorretor20.setCep("29127370");
        enderecoCorretor20.setBairro("Terra Vermelha");
        enderecoCorretor20.setRua("Rua Nelson Bozone");
        enderecoCorretor20.setNumero(12);


        //Setando Construtora
        Construtora construtora = new Construtora();
        construtora.setCnpj("63394370000170");
        construtora.setEndereco(enderecoConstrutora);

        //Setando Corretores
        Corretor corretor1 = new Corretor();
        corretor1.setNome("Leandro dos Santos de Abreu");
        corretor1.setMatricula("20200810");
        corretor1.setMetaMensal(10000.00F);
        corretor1.setVendaMensal(8000.00F);
        corretor1.setEndereco(enderecoCorretor1);

        Corretor corretor2 = new Corretor();
        corretor2.setNome("Rafael Guimarães Vendros");
        corretor2.setMatricula("20200430");
        corretor2.setMetaMensal(8000.00F);
        corretor2.setVendaMensal(10000.00F);
        corretor2.setEndereco(enderecoCorretor2);

        Corretor corretor3 = new Corretor();
        corretor3.setNome("Gustavo Contarato Sant'Anna");
        corretor3.setMatricula("20200115");
        corretor3.setMetaMensal(5000.00F);
        corretor3.setVendaMensal(10000.00F);
        corretor3.setEndereco(enderecoCorretor3);

        Corretor corretor4 = new Corretor();
        corretor4.setNome("Arthur Stuhr Miertschink");
        corretor4.setMatricula("20200325");
        corretor4.setMetaMensal(15000.00F);
        corretor4.setVendaMensal(7000.00F);
        corretor4.setEndereco(enderecoCorretor4);

        Corretor corretor5 = new Corretor();
        corretor5.setNome("Caio Costa Passos");
        corretor5.setMatricula("20200425");
        corretor5.setMetaMensal(5000.00F);
        corretor5.setVendaMensal(2000.00F);
        corretor5.setEndereco(enderecoCorretor5);

        Corretor corretor6 = new Corretor();
        corretor6.setNome("Aurora Vitória Teixeir");
        corretor6.setMatricula("20200816");
        corretor6.setMetaMensal(25000.00F);
        corretor6.setVendaMensal(35000.00F);
        corretor6.setEndereco(enderecoCorretor6);

        Corretor corretor7 = new Corretor();
        corretor7.setNome("Natália Fabiana Mendes");
        corretor7.setMatricula("20200224");
        corretor7.setMetaMensal(2500.00F);
        corretor7.setVendaMensal(2000.00F);
        corretor7.setEndereco(enderecoCorretor7);

        Corretor corretor8 = new Corretor();
        corretor8.setNome("Sarah Emily Melo");
        corretor8.setMatricula("20200306");
        corretor8.setMetaMensal(6000.00F);
        corretor8.setVendaMensal(3500.00F);
        corretor8.setEndereco(enderecoCorretor8);

        Corretor corretor9 = new Corretor();
        corretor9.setNome("Fernanda Marli da Conceição");
        corretor9.setMatricula("20210105");
        corretor9.setMetaMensal(9500.00F);
        corretor9.setVendaMensal(6000.00F);
        corretor9.setEndereco(enderecoCorretor9);

        Corretor corretor10 = new Corretor();
        corretor10.setNome("Catarina Daiane Aragão");
        corretor10.setMatricula("20210109");
        corretor10.setMetaMensal(8300.00F);
        corretor10.setVendaMensal(4700.00F);
        corretor10.setEndereco(enderecoCorretor10);

        System.out.println(corretor10.getMatricula());
    }
}
