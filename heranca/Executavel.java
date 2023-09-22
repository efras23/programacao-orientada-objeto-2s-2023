package heranca;
import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;

public class Executavel {
    public static void main(String[] args){

        Engenheiro eng1 = new Engenheiro("Jota",057,123,"456","opa");
        Gerente ger1 = new Gerente("Agar", 111, 33337778, 1);
        Diretor dir1 = new Diretor("Ata", 875, 99998888,10);

        System.out.println(eng1);
        System.out.println(ger1);
        System.out.println(dir1);

    }
}