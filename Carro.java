
package Aula3;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro is:" + capCombustivel * consumoCombustivel + " km");
    }
    
    double obterAutonomia() {
        System.out.println("Metodo obter autonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
    
}
