public class SistemaAtendimento {

    public static void main(String[] args) {
        Pilha historicoSolicitacoes = new Pilha();
        Fila filaAtendimento = new Fila();

        System.out.println("=== SISTEMA DE GERENCIAMENTO DE ATENDIMENTO ===\n");

        // Pilha de historico de solicitacao
        System.out.println("Historico de solicitacoes: ");
        historicoSolicitacoes.empilhar(new Solicitacao("REQ001", "Instalacao de software", "2024-08-20 10:30"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ002", "Manutencao preventiva", "2024-08-20 11:00"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ003", "Atualizacao de sistema", "2024-08-20 11:30"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ004", "Suporte tecnico", "2024-08-20 12:00"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ005", "Troca de equipamento", "2024-08-20 12:30"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ006", "Consulta de garantia", "2024-08-20 13:00"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ007", "Reparo de impressora", "2024-08-20 13:30"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ008", "Configuracao de rede", "2024-08-20 14:00"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ009", "Restauracao de dados", "2024-08-20 14:30"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ010", "Consulta tecnica", "2024-08-20 15:00"));

        // Fila de atendimento
        System.out.println("\nFila de atendimento: ");
        filaAtendimento.enfileirar(new Cliente("Maria Silva", "CLI001", "Duvida sobre produto"));
        filaAtendimento.enfileirar(new Cliente("Joao Souza", "CLI002", "Reclamacao de servico"));
        filaAtendimento.enfileirar(new Cliente("Ana Costa", "CLI003", "Solicitacao de reembolso"));
        filaAtendimento.enfileirar(new Cliente("Pedro Alves", "CLI004", "Informacoes de entrega"));
        filaAtendimento.enfileirar(new Cliente("Carla Dias", "CLI005", "Agendamento de visita"));
        filaAtendimento.enfileirar(new Cliente("Lucas Martins", "CLI006", "Alteracao de pedido"));
        filaAtendimento.enfileirar(new Cliente("Patricia Rocha", "CLI007", "Cancelamento de contrato"));
        filaAtendimento.enfileirar(new Cliente("Rafael Lima", "CLI008", "Renovacao de assinatura"));
        filaAtendimento.enfileirar(new Cliente("Fernanda Gomes", "CLI009", "Suporte para instalacao"));
        filaAtendimento.enfileirar(new Cliente("Carlos Eduardo", "CLI010", "Pedido de orcamento"));

        // Exibindo estado inicial
        historicoSolicitacoes.exibirHistorico();
        filaAtendimento.exibirFila();

        // Atendendo 3 clientes
        for (int i = 0; i < 3; i++) {
            if (!filaAtendimento.estaVazia()) {
                Cliente clienteAtendido = filaAtendimento.atender();
                System.out.println("Atendido: " + clienteAtendido.nome + " - " + clienteAtendido.motivoAtendimento);
            } else {
                System.out.println("Fila vazia");
            }
        }

        filaAtendimento.exibirFila();

        // Removendo 3 solicitações
        for (int i = 0; i < 3; i++) {
            if (!historicoSolicitacoes.estaVazia()) {
                Solicitacao solicitacaoRemovida = historicoSolicitacoes.desempilhar();
                System.out.println("Solicitacao removida: " + solicitacaoRemovida.id + " - " + solicitacaoRemovida.descricao);
            } else {
                System.out.println("Historico vazio");
            }
        }

        historicoSolicitacoes.exibirHistorico();

        // Adicionando novas entradas
        filaAtendimento.enfileirar(new Cliente("Roberto Mendes", "CLI011", "Troca de produto"));
        historicoSolicitacoes.empilhar(new Solicitacao("REQ011", "Backup de dados", "2024-08-20 15:30"));

        filaAtendimento.exibirFila();
        historicoSolicitacoes.exibirHistorico();
    }
}