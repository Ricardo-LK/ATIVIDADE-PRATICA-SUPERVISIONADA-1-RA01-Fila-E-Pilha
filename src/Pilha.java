class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    // Adicionar solicitacao ao topo
    public void empilhar(Solicitacao solicitacao) {
        Node novoNode = new Node(solicitacao);
        novoNode.proximo = topo;
        topo = novoNode;
        System.out.println("Solicitacao adicionada ao historico - ID " + solicitacao.id);
    }

    // Remover solicitacao do topo
    public Solicitacao desempilhar() {
        if (!estaVazia()) {
            Solicitacao solicitacaoRemovida = topo.solicitacao;
            topo = topo.proximo;
            return solicitacaoRemovida;
        }

        System.out.println("Pilha vazia");
        return null;
    }

    // Verifica se a pilha esta vazia
    public boolean estaVazia() {
        return topo == null;
    }

    // Visualiza topo da pilha sem remover
    public Solicitacao verTopo() {
        if (!estaVazia()) return topo.solicitacao;

        System.out.println("Pilha vazia");
        return null;

    }

    // Exibir todas as solicitações no histórico
    public void exibirHistorico() {
        if (!estaVazia()) {
            System.out.println("\nHistorico de solicitacoes: ");
            Node atual = topo;
            int posicao = 1;

            while (atual != null) {
                System.out.println("\nSolicitacao " + posicao + ":");
                System.out.println("  ID: " + atual.solicitacao.id);
                System.out.println("  Descricao: " + atual.solicitacao.descricao);
                System.out.println("  Data/Hora: " + atual.solicitacao.dataHora);
                atual = atual.proximo;
                posicao++;

            }
            System.out.println("=================================\n");

        } else {
            System.out.println("Historico vazio");
        }
    }

}