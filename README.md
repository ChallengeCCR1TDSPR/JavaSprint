
# Documentação da API - TecnoTrilho

## Sumário
- [Tecnico](#tecnico)
  - [POST /tecnicos](#post-tecnicos)
  - [GET /tecnicos](#get-tecnicos)
  - [DELETE /tecnicos/{id}](#delete-tecnicosid)
- [Estacao](#estacao)
  - [POST /estacoes](#post-estacoes)
  - [GET /estacoes](#get-estacoes)
  - [DELETE /estacoes/{id}](#delete-estacoesid)
- [Manutencao](#manutencao)
  - [POST /manutencoes](#post-manutencoes)
  - [GET /manutencoes](#get-manutencoes)
  - [DELETE /manutencoes/{id}](#delete-manutencoesid)

---

## Tecnico

### POST /tecnicos

- **Descrição:** Insere um novo técnico no sistema.
- **Request Body (JSON):**

```json
{
  "idTecnico": 1,
  "nomeTecnico": "João Silva",
  "telefoneTecnico": "123456789",
  "cargo": "Supervisor"
}
```

- **Respostas:**
  - 201 Created: `"Técnico cadastrado com sucesso!"`
  - 500 Internal Server Error: Mensagem de erro detalhada.

---

### GET /tecnicos

- **Descrição:** Retorna a lista de todos os técnicos cadastrados.
- **Resposta:**

```json
[
  {
    "idTecnico": 1,
    "nomeTecnico": "João Silva",
    "telefoneTecnico": "123456789",
    "cargo": "Supervisor"
  },
  {
    "idTecnico": 2,
    "nomeTecnico": "Maria Souza",
    "telefoneTecnico": "987654321",
    "cargo": "Técnico"
  }
]
```

- **Códigos de status:**
  - 200 OK: Lista de técnicos retornada.
  - 500 Internal Server Error: Caso ocorra erro no servidor.

---

### DELETE /tecnicos/{id}

- **Descrição:** Deleta o técnico com o ID especificado.
- **Parâmetros:**
  - `id` (path) - ID do técnico a ser deletado.
- **Respostas:**
  - 200 OK: `"Técnico deletado com sucesso!"`
  - 404 Not Found: `"Técnico não encontrado para deletar."`
  - 500 Internal Server Error: Mensagem de erro detalhada.

---

## Estacao

### POST /estacoes

- **Descrição:** Insere uma nova estação no sistema.
- **Request Body (JSON):**

```json
{
  "idEstacao": 1,
  "nomeEstacao": "Estação Central",
  "localEstacao": "São Paulo"
}
```

- **Respostas:**
  - 201 Created: `"Estação cadastrada com sucesso!"`
  - 500 Internal Server Error: Mensagem de erro detalhada.

---

### GET /estacoes

- **Descrição:** Retorna a lista de todas as estações cadastradas.
- **Resposta:**

```json
[
  {
    "idEstacao": 1,
    "nomeEstacao": "Estação Central",
    "localEstacao": "São Paulo"
  },
  {
    "idEstacao": 2,
    "nomeEstacao": "Estação Sul",
    "localEstacao": "Rio de Janeiro"
  }
]
```

- **Códigos de status:**
  - 200 OK: Lista de estações retornada.
  - 500 Internal Server Error: Caso ocorra erro no servidor.

---

### DELETE /estacoes/{id}

- **Descrição:** Deleta a estação com o ID especificado.
- **Parâmetros:**
  - `id` (path) - ID da estação a ser deletada.
- **Respostas:**
  - 200 OK: `"Estação deletada com sucesso!"`
  - 404 Not Found: `"Estação não encontrada para deletar."`
  - 500 Internal Server Error: Mensagem de erro detalhada.

---

## Manutencao

### POST /manutencoes

- **Descrição:** Insere uma nova manutenção no sistema.
- **Request Body (JSON):**

```json
{
  "idManutencao": 1,
  "dataManutencao": "2025-05-17",
  "tipoManutencao": "Corretiva",
  "descricaoManutencao": "Troca de peça X",
  "tempoInativo": 120,
  "causaFalha": "Falha mecânica"
}
```

- **Respostas:**
  - 201 Created: `"Manutenção cadastrada com sucesso!"`
  - 500 Internal Server Error: Mensagem de erro detalhada.

---

### GET /manutencoes

- **Descrição:** Retorna a lista de todas as manutenções registradas.
- **Resposta:**

```json
[
  {
    "idManutencao": 1,
    "dataManutencao": "2025-05-17",
    "tipoManutencao": "Corretiva",
    "descricaoManutencao": "Troca de peça X",
    "tempoInativo": 120,
    "causaFalha": "Falha mecânica"
  },
  {
    "idManutencao": 2,
    "dataManutencao": "2025-05-18",
    "tipoManutencao": "Preventiva",
    "descricaoManutencao": "Lubrificação",
    "tempoInativo": 30,
    "causaFalha": "Manutenção rotineira"
  }
]
```

- **Códigos de status:**
  - 200 OK: Lista de manutenções retornada.
  - 500 Internal Server Error: Caso ocorra erro no servidor.

---

### DELETE /manutencoes/{id}

- **Descrição:** Deleta a manutenção com o ID especificado.
- **Parâmetros:**
  - `id` (path) - ID da manutenção a ser deletada.
- **Respostas:**
  - 200 OK: `"Manutenção deletada com sucesso!"`
  - 404 Not Found: `"Manutenção não encontrada para deletar."`
  - 500 Internal Server Error: Mensagem de erro detalhada.

---

Se quiser, posso também montar o documento PDF ou te ajudar a gerar os prints e outros itens da sua Sprint 4, só falar!
