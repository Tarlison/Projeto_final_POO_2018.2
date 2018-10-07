/**Classe que será o modelo para os objetos do tipo Produto
 * @author LuluTeam
 */
package sistema.de.estoque;
import java.util.Date;
import java.util.Scanner;
        
public class Produto {
    Integer ID; // ok
    Date validade = new Date(); //ok
    String lote; //ok
    int quantidade = 0; //ok
    int quantidadeMinima; //ok
    String nome; //ok
    double preco; //ok
    String categoria; //ok
    
     private Scanner scanf = new Scanner(System.in);
    
    public Produto(){
        this.cadastrarProduto();
    }
    /**Método para cadastrar as informações quando o produto for inserido.
     * Como é um cadastro, todas as informações são inseridas agora.
     */
    
    

    public Produto(Integer ID, String lote,int quantidade, int quantidadeMinima, String nome, double preco, String categoria) {
        
        this.ID = ID;
        this.lote = lote;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void cadastrarProduto() {
        System.out.println("Digite o nome do produto:");
        this.nome = scanf.next();
        this.nome = this.nome.toUpperCase();
        
        System.out.println("Digite o ID do produto:");
        this.ID = scanf.nextInt();
        
        System.out.println("Digite o dia de validade:");
        this.validade.setDate(scanf.nextInt());
        
        System.out.println("Digite o mês de validade:");
        this.validade.setMonth(scanf.nextInt());
        
        System.out.println("Digite o ano de validade:");
        this.validade.setYear(scanf.nextInt());
        scanf.nextLine();//isso corrige o erro de pular a próxima inserção
        
        System.out.println("Digite o lote do produto:");
        this.lote = scanf.nextLine();
        
        do{
            System.out.println("Digite a quantidade mínima tolerável:");
            this.quantidadeMinima = scanf.nextInt();
        }while(this.quantidadeMinima < 0);
        
        do{
            System.out.println("Digite a quantidade que será cadastrada:");
            this.quantidade = scanf.nextInt();
        }while(this.quantidade < 0);

        do{
            System.out.println("Digite o preço do produto (use vírgula para separar a parte inteira):");
            this.preco = scanf.nextDouble();
        }while(this.preco <= 0);
        
        do{
            System.out.println("Digite o tipo a ser selecionado (higiene, alimento ou medicamento): ");
            this.categoria = scanf.next();
        }while(this.setCategoria(this.categoria) == false); //analisa se a resposta se encontra nos padrões
        
        if (this.quantidadeMinima > this.quantidade){
            System.out.println("Quantidade abaixo do mínimo!");
        }
        System.out.println();
    }
    
    /**A função recebe o nome da categoria e valida caso esteja nas categorias.
     * @param valor String - recebe o nome da categoria.
     * @return boolean - retorna true caso o argumento valor seja uma das categorias.
     */
    public boolean setCategoria(String valor){
        String aux = valor.toUpperCase();
        if(aux.equals("HIGIENE")){
            this.categoria = "HIGIENE";
            return true;
        }
        if(aux.equals("ALIMENTO")){
            this.categoria = "ALIMENTO";
            return true;
        }
        if(aux.equals("MEDICAMENTO")){
            this.categoria = "MEDICAMENTO";
            return true;
        }
        return false;
    }
    
    public void alterarProduto(){
        
    }
    
    /**Retorna a quantidade do produto no estoque.
     * @return int - valor da quantidade do produto.
     */
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public boolean reporQuantia(int valor){
        if(valor > 0){
            this.quantidade += valor;
            return true;
        }
        return false;
    }
    
    public boolean retirarQuantia(int valor){
        if(valor > 0 && valor < this.quantidade){
            this.quantidade -= valor;
            if (this.quantidadeMinima > this.quantidade){//analisa se a quantidade atual é menor que a do mínimo
                System.out.println("Quantidade abaixo do mínimo!");
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Produto{" + "ID = " + ID + ", validade = " + validade + ", lote = " + lote + ",\n quantidade = " + quantidade + 
                ", quantidade Minima = " + quantidadeMinima + ", nome = " + nome + ", preco = " + preco + ", categoria = " + categoria + '}';
    }
        
    public String getValidade(){
        return this.validade.getDate() + "/" + this.validade.getMonth() + "/" + this.validade.getYear();
    }

    public Integer getID() {
        return ID;
    }

    public String getLote() {
        return lote;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
}
