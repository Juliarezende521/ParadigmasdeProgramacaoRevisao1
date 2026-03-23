package classeassociacao.exe7;

public class TestaVenda {
    public static void main(String[] args) {

            // Criando produtos (agregação)
            Produto p1 = new Produto(1, 20, "Arroz");
            Produto p2 = new Produto(2, 10, "Feijão");

            // Criando cliente (agregação)
            Cliente cliente = new Cliente(1, "Maria");

            // Criando venda
            Venda venda = new Venda(100, cliente);

            // Adicionando itens (composição)
            venda.adicionarItem(1, 2, p1);
            venda.adicionarItem(2, 3, p2);

            // Mostrando venda
            System.out.println("Dados da venda:");
            System.out.println(venda);

            // "Deletando" venda
            venda = null;

            System.out.println("\nVenda foi anulada.");

            // ✔ Produto e Cliente ainda existem (agregação)
            System.out.println("\nProduto ainda existe:");
            System.out.println(p1);

            System.out.println("\nCliente ainda existe:");
            System.out.println(cliente);

        }

    }
