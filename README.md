# Atendimento-Cliente-Atividade-Pratica

Resumo
- Projeto didático em Java que implementa estruturas de dados lineares simples (fila e pilha) para modelar um sistema de atendimento ao cliente.
- Contém implementações próprias de Node, Fila (queue) e Pilha (stack) e classes de domínio Cliente e Solicitacao.
- Arquivo de execução principal: [`SistemaAtendimento`](src/SistemaAtendimento.java).

Estrutura do repositório
- [src/Cliente.java](src/Cliente.java)
- [src/Solicitacao.java](src/Solicitacao.java)
- [src/Node.java](src/Node.java)
- [src/Fila.java](src/Fila.java)
- [src/Pilha.java](src/Pilha.java)
- [src/SistemaAtendimento.java](src/SistemaAtendimento.java)
- [AtendimentoCliente.iml](AtendimentoCliente.iml)
- [README.md](README.md)

Descrição dos arquivos e classes principais
- [`Cliente`](src/Cliente.java) — classe simples que modela um cliente com os campos:
  - [`Cliente.nome`](src/Cliente.java)
  - [`Cliente.numeroIdentificacao`](src/Cliente.java)
  - [`Cliente.motivoAtendimento`](src/Cliente.java)
  - Construtor: `new Cliente(String nome, String numeroIdentificacao, String motivoAtendimento)`

- [`Solicitacao`](src/Solicitacao.java) — classe que representa uma solicitação registrada no histórico:
  - [`Solicitacao.id`](src/Solicitacao.java)
  - [`Solicitacao.descricao`](src/Solicitacao.java)
  - [`Solicitacao.dataHora`](src/Solicitacao.java)
  - Construtor: `new Solicitacao(String id, String descricao, String dataHora)`

- [`Node`](src/Node.java) — nó genérico usado para construir listas encadeadas tanto para fila quanto para pilha:
  - Campos: `Solicitacao solicitacao`, `Cliente cliente`, `Node proximo`
  - Construtores: `Node(Solicitacao)` e `Node(Cliente)`

- [`Fila`](src/Fila.java) — implementação de fila (FIFO) com ponteiros `frente` e `tras`:
  - [`Fila.enfileirar`](src/Fila.java) — adiciona um `Cliente` ao final.
  - [`Fila.atender`](src/Fila.java) — remove e retorna o cliente da frente; atualiza `tras` quando fila fica vazia.
  - [`Fila.estaVazia`](src/Fila.java) — verifica se `frente == null`.
  - [`Fila.verProximo`](src/Fila.java) — retorna o cliente da frente sem remover.
  - [`Fila.exibirFila`](src/Fila.java) — percorre a fila e imprime informações de cada cliente.
  - Uso: a fila modela a sequência de atendimento.

- [`Pilha`](src/Pilha.java) — implementação de pilha (LIFO) com ponteiro `topo`:
  - [`Pilha.empilhar`](src/Pilha.java) — insere uma `Solicitacao` no topo (usa `Node(Solicitacao)`).
  - [`Pilha.desempilhar`](src/Pilha.java) — remove e retorna a solicitacao do topo.
  - [`Pilha.estaVazia`](src/Pilha.java) — verifica se `topo == null`.
  - [`Pilha.verTopo`](src/Pilha.java) — mostra a solicitacao no topo sem remover.
  - [`Pilha.exibirHistorico`](src/Pilha.java) — percorre a pilha do `topo` para baixo e imprime cada solicitação.
  - Uso: a pilha modela um histórico de solicitações onde a última solicitacao inserida é a primeira a ser removida.

- [`SistemaAtendimento`](src/SistemaAtendimento.java) — classe com o método `main` que demonstra o sistema:
  - Cria `Pilha historicoSolicitacoes` e `Fila filaAtendimento`.
  - Popula a pilha com 10 objetos [`Solicitacao`](src/Solicitacao.java) usando `Pilha.empilhar`.
  - Popula a fila com 10 objetos [`Cliente`](src/Cliente.java) usando `Fila.enfileirar`.
  - Exibe estado inicial (chama `exibirHistorico` e `exibirFila`).
  - Atende 3 clientes (chama `filaAtendimento.atender()` em loop) e imprime atendimento.
  - Desempilha 3 solicitações (chama `historicoSolicitacoes.desempilhar()` em loop) e imprime remoções.
  - Adiciona mais entradas e exibe novamente.

Como executar:

- Abra o projeto no IntelliJ IDEA e execute o `main` [`SistemaAtendimento`](src/SistemaAtendimento.java)