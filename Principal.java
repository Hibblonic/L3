public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Davi", 158268, 2);
        Endereco e1 = new Endereco("Rua Vereador Jose Wagner Ribeiro","Matadouro", 45);
        p1.addEndereco(e1);
        Endereco e2 = new Endereco("Rua Erasmo Cabral","Centro", 145);
        p1.addEndereco(e2);
        p1.mostraInfo();
        for(int i = 0;i<p1.enderecos.length;i++)
        {
            System.out.println("Endereco "+ i + ":");
            p1.enderecos[i].mostraInfo();
        }
        

    }
}
