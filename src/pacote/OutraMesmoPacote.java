package pacote;

public class OutraMesmoPacote {

    Referencia r = new Referencia();
    public void testeAcesso() {
        r.modificadorDefault = 0;
        r.modificadorPublico = 0;
        r.modificadorProtegido = 0;
        //r.modificadorPrivado = 0; modificador privado não pode ser acessado por outra classe
    }

}
