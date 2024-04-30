public class UsaFuncionario {
    public static void main(String[] args){
    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Pahblo");
    funcionario.setRg("49.654.153-x");
    funcionario.setCartao("RH274");
    System.out.println(funcionario.getNome());
    System.out.println(funcionario.getRg());
    System.out.println(funcionario.getCartao());
    }
}
