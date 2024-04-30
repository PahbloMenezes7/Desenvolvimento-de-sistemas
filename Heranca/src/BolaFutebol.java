public class BolaFutebol extends Bola{
    private String tipo;
    public BolaFutebol(String cor, int tamanho, String tipo){
        super(cor, tamanho);
        this.tipo = tipo;
    }
    public void mostar(){
        super.mostrar();
        System.out.println(tipo);
    }
}
