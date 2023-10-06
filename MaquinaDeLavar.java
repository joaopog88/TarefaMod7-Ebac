/**
 * Essa é minha classe Maquina de Lavar.
 * Propriedades: Marca, Cor, Capacidade.
 * Esses são os métodos: Iniciar, Encerrar, Getters/Setters
 */
public class MaquinaDeLavar {
    //Propriedades
    private String marca;
    private String cor;
    private int capacidade;

    //métodos máquina de lavar. 1-iniciar. 2-encerrar. 3-getters/setters
    public void iniciar(){System.out.println("Iniciando Lavagem.");}
    public void encerrar(){System.out.println("Lavagem encerrada.");}

    public void setMarca(String m) {marca = m;}
    public getMarca(){return marca;}
    public void setCor(String c){cor = c;}
    public String getCor() {return cor;}
    public void setCapacidade(int qtdkilos){capacidade = qtdkilos;}
    public int getCapacidade(){return capacidade;}

}
