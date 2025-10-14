class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    // Adiciona cliente no final da fila
    public void enfileirar(Cliente cliente) {
        Node novoNode = new Node(cliente);

        if (estaVazia()) {
            frente = novoNode;
            tras = novoNode;
        } else {
            tras.proximo = novoNode;
            tras = novoNode;
        }

        System.out.println("Cliente adicionado a fila: " + cliente.nome);
    }

    // Rremove da frente
    public Cliente atender(){
        if (!estaVazia()) {
            Cliente clienteAtendido = frente.cliente;
            frente = frente.proximo;

            if (frente == null) {
                tras = null;
            }

            return clienteAtendido;
        }

        System.out.println("Fila vazia");
        return null;
    }

    // Verifica se a fila esta vazia
    public boolean estaVazia() {
        return frente == null;
    }

    // Visualiza proximo cliente sem remover
    public Cliente verProximo(){
        if (!estaVazia())
            return frente.cliente;

        System.out.println("Fila vazia");
        return null;
        
    }

    // Exibir todos os clientes na fila
    public void exibirFila() {
        if (!estaVazia()) {
            System.out.println("\nOrdem atendimento: ");
            Node atual = frente;
            int posicao = 1;

            while (atual != null) {
                System.out.println("\nPosicao " + posicao + ":");
                System.out.println("  Nome: " + atual.cliente.nome);
                System.out.println("  ID: " + atual.cliente.numeroIdentificacao);
                System.out.println("  Motivo: " + atual.cliente.motivoAtendimento);
                atual = atual.proximo;
                posicao++;

            }

            System.out.println("============================\n");
        }
        else {
            System.out.println("Fila vazia");
        }
        
    }
}