class Node {
    Solicitacao solicitacao;
    Cliente cliente;
    Node proximo;

    public Node(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
        this.proximo = null;
    }

    public Node(Cliente cliente) {
        this.cliente = cliente;
        this.proximo = null;
    }
}
