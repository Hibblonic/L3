public class Pessoa {
    public String nome;
    public int cpf;
    public Endereco[] enderecos;
    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    void mostraInfo(){
        System.out.println(nome);
        System.err.println(cpf);
    }

   public void addEndereco(Endereco end){
        for(int i=0; i< enderecos.length; i++)
        {
            if(enderecos[i] == null)
                {
                    enderecos[i] = end;
                    break;
                }
                
        }
    }
}
