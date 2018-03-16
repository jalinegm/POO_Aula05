package outroPacote;

import pacote.Referencia;

public class Outra {
    Referencia r = new Referencia();
    public void testeAcesso() {
        //r.modificadorDefault = 0;
        r.modificadorPublico = 0;
        //r.modificadorProtegido = 0;
        //r.modificadorPrivado = 0;
        /* modificadores padrão, protegido e privado não podem ser acessados */
    }
}
