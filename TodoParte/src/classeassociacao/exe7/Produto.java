package classeassociacao.exe7;
/*Este exercício combina tudo o que vimos até agora:Agregação: Crie a classe Produto (id, nome, preco).
O Produto existe no estoque da loja independente de qualquer venda.Agregação: Crie a classe Cliente
(id, nome).Composição: Crie a classe ItemVenda (id, quantidade). O item de venda só existe dentro de
uma Venda.A Classe "Todo": Crie a classe Venda.
Ela agrega um Cliente.
Ela é composta por um ArrayList<ItemVenda>.
Cada ItemVenda dentro da lista, por sua vez, agrega um Produto.*/
public class Produto {
    private int id;
    private float preco;
    private String nome;

    public Produto(){
    }

    public Produto(int id, float preco, String nome){
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public String toString(){
        return "Produto{" +
                "id= " + id +
                ", preço= " + preco +
                ", nome= " + nome +
                "]";
    }
}
