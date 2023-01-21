public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();

        //up cast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Funcionario();


        //down cast
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
    
}
