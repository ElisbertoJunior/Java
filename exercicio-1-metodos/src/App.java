public class App {
    public static void main(String[] args) throws Exception {

       System.out.println("Exercicio calculadora.");
        
       Calculadora.soma(2, 3);
       Calculadora.subtracao(10, 4);
       Calculadora.multiplicacao(2, 3);
       Calculadora.divisao(10, 4);

       System.out.println("Exercicio menagem.");

       Mensagem.obterMensagem(9);
       Mensagem.obterMensagem(14);
       Mensagem.obterMensagem(20);

       System.out.println("Exercicio Emprestimo.");

       Emprestimo.calcular(1000, 2);
       Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
       Emprestimo.calcular(1000, 5);

       
    }

    

}
