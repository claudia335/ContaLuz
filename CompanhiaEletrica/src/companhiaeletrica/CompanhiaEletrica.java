
package companhiaeletrica;

import javax.swing.JOptionPane;

public class CompanhiaEletrica {

    public static void main(String[] args) {
        Sistema dados = new Sistema();
        
        dados.setAnterior(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua leitura anterior: ")));
        dados.setAtual(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua leitura atual: ")));
        
        dados.validar();
    }
    
}
