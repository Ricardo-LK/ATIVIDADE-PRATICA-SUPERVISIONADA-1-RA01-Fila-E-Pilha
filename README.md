# Sistema de Atendimento ao Cliente

Este é um projeto didático em Java que implementa estruturas de dados lineares (fila e pilha) para simular um sistema de atendimento ao cliente. O projeto contém implementações próprias das estruturas básicas e classes de domínio para representar clientes e solicitações.

## Sobre o Projeto

O sistema modela dois componentes principais:
- **Fila de atendimento**: Gerencia clientes em ordem de chegada (FIFO - First In, First Out)
- **Histórico de solicitações**: Armazena solicitações em ordem reversa (LIFO - Last In, First Out)

## Estrutura do Projeto

### Arquivos Principais

- **`Cliente.java`** - Representa um cliente com:
  - `nome`, `numeroIdentificacao`, `motivoAtendimento`
  - Construtor: `Cliente(String nome, String numeroIdentificacao, String motivoAtendimento)`

- **`Solicitacao.java`** - Representa uma solicitação no histórico:
  - `id`, `descricao`, `dataHora`
  - Construtor: `Solicitacao(String id, String descricao, String dataHora)`

- **`Node.java`** - Nó genérico para construir listas encadeadas
- **`Fila.java`** - Implementação de fila (FIFO) para gerenciar clientes
- **`Pilha.java`** - Implementação de pilha (LIFO) para histórico de solicitações
- **`SistemaAtendimento.java`** - Classe principal com método `main` para demonstração

### Funcionalidades da Fila

- `enfileirar()` - Adiciona cliente ao final da fila
- `atender()` - Remove e retorna o próximo cliente
- `verProximo()` - Mostra o próximo cliente sem remover
- `exibirFila()` - Lista todos os clientes na fila
- `estaVazia()` - Verifica se a fila está vazia

### Funcionalidades da Pilha

- `empilhar()` - Adiciona solicitação ao topo
- `desempilhar()` - Remove e retorna a solicitação do topo
- `verTopo()` - Mostra a solicitação do topo sem remover
- `exibirHistorico()` - Lista todo o histórico
- `estaVazia()` - Verifica se a pilha está vazia

## Como Executar

1. Abra o projeto no IntelliJ IDEA
2. Execute o arquivo `SistemaAtendimento.java`
3. O programa demonstrará automaticamente:
   - Criação de fila e pilha com 10 elementos cada
   - Exibição do estado inicial
   - Atendimento de 3 clientes
   - Remoção de 3 solicitações do histórico
   - Adição de novas entradas
   - Exibição do estado final

## Objetivo Educacional

Este projeto tem como objetivo praticar conceitos fundamentais de programação:
- Estruturas de dados lineares
- Listas encadeadas
- Manipulação de ponteiros
- Encapsulamento e orientação a objetos
- Desenvolvimento de algoritmos básicos

O código é totalmente didático e implementa manualmente estruturas que normalmente seriam fornecidas pela biblioteca padrão do Java.