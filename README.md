# Sistema de Gerenciamento de Atendimento ao Cliente

## Descrição do Projeto

Este projeto implementa um sistema completo de gerenciamento de atendimento ao cliente utilizando estruturas de dados personalizadas. O sistema emprega uma **pilha** para gerenciar o histórico de solicitações de serviço e uma **fila** para controlar a ordem de atendimento dos clientes, ambas implementadas através de listas encadeadas.

## Estrutura do Sistema

### 1. Classe `Cliente`

Representa um cliente aguardando atendimento na fila.

**Atributos:**
- `nome`: Nome completo do cliente
- `numeroIdentificacao`: Número único de identificação do cliente
- `motivoAtendimento`: Descrição do motivo do atendimento

**Construtor:**
- `Cliente(String nome, String numeroIdentificacao, String motivoAtendimento)`: Cria uma nova instância de cliente com todos os dados necessários

### 2. Classe `Solicitacao`

Representa uma solicitação de serviço no histórico.

**Atributos:**
- `id`: Identificador único da solicitação
- `descricao`: Descrição detalhada da solicitação
- `dataHora`: Data e hora do registro da solicitação

**Construtor:**
- `Solicitacao(String id, String descricao, String dataHora)`: Cria uma nova solicitação com dados completos

### 3. Classe `Node`

Nó genérico para implementação das estruturas de lista encadeada, podendo armazenar tanto `Cliente` quanto `Solicitacao`.

**Atributos:**
- `solicitacao`: Referência para um objeto Solicitacao (usado na pilha)
- `cliente`: Referência para um objeto Cliente (usado na fila)
- `proximo`: Ponteiro para o próximo nó na lista encadeada

**Construtores:**
- `Node(Solicitacao solicitacao)`: Cria nó para pilha de solicitações
- `Node(Cliente cliente)`: Cria nó para fila de clientes

### 4. Classe `Pilha`

Implementa uma pilha (LIFO - Last In, First Out) usando lista encadeada para gerenciar o histórico de solicitações.

**Atributos:**
- `topo`: Referência para o nó no topo da pilha

**Métodos:**

#### `empilhar(Solicitacao solicitacao)`
Adiciona uma nova solicitação ao topo da pilha.

**Funcionamento:**
1. Cria um novo nó com a solicitação
2. Define o próximo do novo nó como o atual topo
3. Atualiza o topo para o novo nó
4. Exibe mensagem de confirmação

#### `desempilhar()`
Remove e retorna a solicitação do topo da pilha.

**Funcionamento:**
1. Verifica se a pilha não está vazia
2. Armazena a solicitação do topo
3. Atualiza o topo para o próximo nó
4. Retorna a solicitação removida
5. Se vazia, exibe mensagem e retorna null

#### `estaVazia()`
Verifica se a pilha está vazia.

**Retorno:** `true` se topo for null, `false` caso contrário

#### `verTopo()`
Retorna a solicitação do topo sem removê-la.

**Retorno:** Solicitação do topo ou null se vazia

#### `exibirHistorico()`
Exibe todas as solicitações da pilha em ordem do topo para a base.

**Funcionamento:**
1. Percorre a lista encadeada do topo até o final
2. Exibe ID, descrição e data/hora de cada solicitação
3. Numera as solicitações sequencialmente

### 5. Classe `Fila`

Implementa uma fila (FIFO - First In, First Out) usando lista encadeada para gerenciar a ordem de atendimento.

**Atributos:**
- `frente`: Referência para o primeiro nó da fila
- `tras`: Referência para o último nó da fila

**Métodos:**

#### `enfileirar(Cliente cliente)`
Adiciona um cliente ao final da fila.

**Funcionamento:**
1. Cria um novo nó com o cliente
2. Se fila vazia, define frente e tras como o novo nó
3. Se não vazia, adiciona ao final e atualiza tras
4. Exibe mensagem de confirmação

#### `atender()`
Remove e retorna o cliente da frente da fila.

**Funcionamento:**
1. Verifica se a fila não está vazia
2. Armazena o cliente da frente
3. Atualiza a frente para o próximo nó
4. Se frente ficar null, atualiza tras para null
5. Retorna o cliente atendido
6. Se vazia, exibe mensagem e retorna null

#### `estaVazia()`
Verifica se a fila está vazia.

**Retorno:** `true` se frente for null, `false` caso contrário

#### `verProximo()`
Retorna o próximo cliente a ser atendido sem removê-lo.

**Retorno:** Cliente da frente ou null se vazia

#### `exibirFila()`
Exibe todos os clientes na fila em ordem de atendimento.

**Funcionamento:**
1. Percorre a lista encadeada da frente até o final
2. Exibe nome, ID e motivo de atendimento de cada cliente
3. Mostra a posição de cada cliente na fila

### 6. Classe `SistemaAtendimento`

Classe principal que demonstra o funcionamento do sistema.

**Funcionalidades Demonstradas:**

#### Inicialização do Sistema
- Cria instâncias da pilha (histórico) e fila (atendimento)
- Popula o histórico com 10 solicitações de exemplo
- Popula a fila com 10 clientes de exemplo

#### Operações Realizadas:
1. **Exibição do estado inicial**: Mostra histórico completo e fila de atendimento
2. **Atendimento de 3 clientes**: Remove e exibe informações dos 3 primeiros clientes
3. **Remoção de 3 solicitações**: Remove as 3 solicitações mais recentes do histórico
4. **Adição de novas entradas**: Adiciona novo cliente à fila e nova solicitação ao histórico
5. **Exibição do estado final**: Mostra o estado atualizado do sistema

## Exemplo de Uso

### Criando uma Solicitação:
```java
Solicitacao solic = new Solicitacao("REQ001", "Instalação de software", "2024-08-20 10:30");
historicoSolicitacoes.empilhar(solic);
```

### Adicionando um Cliente:
```java
Cliente cliente = new Cliente("Maria Silva", "CLI001", "Dúvida sobre produto");
filaAtendimento.enfileirar(cliente);
```

### Atendendo Clientes:
```java
Cliente atendido = filaAtendimento.atender();
System.out.println("Atendido: " + atendido.nome);
```

### Consultando Histórico:
```java
historicoSolicitacoes.exibirHistorico();
```

## Vantagens da Implementação

1. **Controle Total**: Implementação manual permite total controle sobre as operações
2. **Eficiência**: Operações O(1) para inserção e remoção em ambas estruturas
3. **Flexibilidade**: Fácil adaptação para diferentes tipos de dados
4. **Transparência**: Código claro e compreensível sem dependências externas

## Considerações Finais

Este sistema demonstra eficientemente o uso de estruturas de dados fundamentais (pilha e fila) em um contexto prático de gerenciamento de atendimento. A implementação manual garante o cumprimento das restrições do projeto enquanto mantém a funcionalidade completa necessária para operação do sistema.

## Autores

- Ricardo Lucas Kucek (ricardo.kucek@pucpr.edu.br)
- Renan da Silva Oliveira Andrade (renan.andrade@pucpr.edu.br)