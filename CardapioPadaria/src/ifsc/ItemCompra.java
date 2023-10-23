package ifsc;

class ItemCompra {
    private String nome;
    private double preco;

    public ItemCompra(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
