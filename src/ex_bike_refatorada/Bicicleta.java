package ex_bike_refatorada;
/**SABE
velocidade, cor e marcha atual
FAZ
define a velocidade, obtém a cor
obtém a marcha atual, obtém a velocidade
freia, acelera, diminui a marcha
 * @author jaline
 *
 */

public class Bicicleta {

    // Atributos
    private double velocidade;
    private String cor = "marrom";
    private int marchaAtual = 10;
    protected static int totalBikes=0;

    //Construtor
    Bicicleta(){
    	totalBikes++;
    }
    
    // Métodos
    public void setVelocidade(double v) {
        velocidade = v;
    }
    
    public String getCor() {
        return cor;
    }
    
    public int getMarchaAtual(){
        return marchaAtual;
    }
    
    public double getVelocidade() {
        return velocidade;
    }
    
    public void acelerar() {
        velocidade += velocidade+10;
    }
    public void frear() {
        velocidade = velocidade/2;
    }
    
    public void diminuirMarcha() {
         marchaAtual --;
    } 

}
