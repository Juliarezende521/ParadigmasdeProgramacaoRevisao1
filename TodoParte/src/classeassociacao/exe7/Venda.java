package classeassociacao.exe7;
import java.util.ArrayList;
/*Este exercício combina tudo o que vimos até agora:Agregação: Crie a classe Produto (id, nome, preco).
O Produto existe no estoque da loja independente de qualquer venda.Agregação: Crie a classe Cliente
(id, nome).Composição: Crie a classe ItemVenda (id, quantidade). O item de venda só existe dentro de
uma Venda.A Classe "Todo": Crie a classe Venda.
Ela agrega um Cliente.
Ela é composta por um ArrayList<ItemVenda>.
Cada ItemVenda dentro da lista, por sua vez, agrega um Produto.*/
public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda( int id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public void adicionarItem(int idItem, int quantidade, Produto produto){
        ItemVenda item = new ItemVenda(idItem, quantidade, produto);
        itens.add(item);
    }

    public String toString(){
        return "Venda{" +
                "id= " + id +
                ", cliente= " + cliente +
                ", itens= " + itens +
                "}";
    }

}
