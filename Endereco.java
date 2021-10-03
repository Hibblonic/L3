public class Endereco {
    public String rua;
    public String bairro;
    public int num;

    public Endereco(String rua, String bairro, int num) {
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }
    void mostraInfo(){
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("Numero: " + num);
    }
}




    