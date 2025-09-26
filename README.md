# Projeto de Gerenciamento de Tarefas

Este projeto é uma API REST desenvolvida em Java com Spring Boot para gerenciar tarefas. Ele permite criar, listar, atualizar e remover tarefas em memória.

## Estrutura do Projeto

- **Controller**: `TarefaController`  
  Define os endpoints da API (`/tarefas`) para CRUD de tarefas.

- **DTO**: `TarefaDTO`  
  Representa a estrutura da tarefa com `id`, `titulo`, `descricao` e `concluida`.

- **Repository**: `TarefaRepository`  
  Gerencia os dados em memória (lista de tarefas).

## Endpoints da API

```http
POST /tarefas/salvar
GET /tarefas/listar
GET /tarefas/{id}
PUT /tarefas/{id}
DELETE /tarefas/{id}
