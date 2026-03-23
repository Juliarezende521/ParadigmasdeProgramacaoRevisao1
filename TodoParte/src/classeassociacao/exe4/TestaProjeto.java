package classeassociacao.exe4;

public class TestaProjeto {
    public static void main(String[] args){
        Programador p1 = new Programador(1, "Fulano", "Java");
        Programador p2 = new Programador(2, "Siclano", "Python");

        Projeto projeto1 = new Projeto(1, "Projeto 1");

        projeto1.agregarProgramador(p1);
        projeto1.agregarProgramador(p2);

        System.out.println(projeto1);
    }
}
