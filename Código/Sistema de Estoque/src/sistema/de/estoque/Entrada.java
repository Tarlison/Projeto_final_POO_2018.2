
/*@author LuluTeam
*/
package sistema.de.estoque;


public class Entrada extends Relatorio {
    String fornecedor;

    public Entrada(Produto novo) {
        super(novo);
    }

  
    /*@Override*/
    
    
    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Quantidade do produto inserido: " + this.quantidade);
        System.out.println("Data da inserção:" + this.getDataES());
    }
}
