import java.net.SocketPermission;
import java.sql.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting

        //constante
        final int ANO = 2021;

        //classe operadores.java

        String nome = "Junior";
        int idade = 29;
        double peso = 92.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(idade);

        
    }
}
