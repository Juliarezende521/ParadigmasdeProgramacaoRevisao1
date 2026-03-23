package classeassociacao.exe7;
/*Este exercício combina tudo o que vimos até agora:Agregação: Crie a classe Produto (id, nome, preco).
O Produto existe no estoque da loja independente de qualquer venda.Agregação: Crie a classe Cliente
(id, nome).Composição: Crie a classe ItemVenda (id, quantidade). O item de venda só existe dentro de
uma Venda.A Classe "Todo": Crie a classe Venda.
Ela agrega um Cliente.
Ela é composta por um ArrayList<ItemVenda>.
Cada ItemVenda dentro da lista, por sua vez, agrega um Produto.*/
public class ItemVenda {
    private int id, quantidade;
    private Produto produto;

    public ItemVenda(){
    }

    public ItemVenda(int id, int quantidade, Produto produto){
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Item da venda{" +
                "id= " + id +
                ", quantidade= " + quantidade +
                ", produto= " + produto +
                "}";
    }
}
