package encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
       
        ControleRemoto c1 = new ControleRemoto();
        
        c1.ligar();
        c1.ligarMudo();
        c1.abrirMenu();
        
        c1.desligarMudo();
        c1.abrirMenu();
        
        c1.play();
        c1.menosVolume();
        c1.abrirMenu();
        c1.desligar();
        c1.maisVolume();
        
        c1.fecharMenu();
        
    }
    
}
