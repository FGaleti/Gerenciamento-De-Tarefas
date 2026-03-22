# API de Gerenciamento de Tarefas

Esta é uma API RESTful desenvolvida em **Spring Boot** para o gerenciamento de tarefas. O projeto serviu como base arquitetural para a prática de mapeamento objeto-relacional (ORM) com **JPA/Hibernate**, implementando operações CRUD e lidando com diferentes tipos de dados, como datas de vencimento e status de conclusão (booleano).

## 🚀 Tecnologias Utilizadas
* Java
* Spring Boot
* Spring Data JPA
* Banco de Dados Relacional

## 📌 Endpoints da API

A API expõe os seguintes endpoints na rota base `/tarefas`:

* `POST /tarefas`: Cria uma nova tarefa.
* `GET /tarefas`: Lista todas as tarefas cadastradas.
* `GET /tarefas/{id}`: Busca uma tarefa específica pelo seu ID.
* `DELETE /tarefas/{id}`: Deleta uma tarefa específica pelo seu ID.

## 👥 Contribuidores

* Felipe Galeti Gôngora - 24036480-2
* Breno Bertaglia Nosima - 24113673-2
