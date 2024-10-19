![Finalizado](https://img.shields.io/badge/Status-Finalizado-brightgreen)
# API RESTful de Cadastro de Currículos 🎓

## Objetivo 🎯
Desenvolver uma API RESTful utilizando Spring e Java para gerenciar informações de um sistema de cadastro de currículos. A API permite a manipulação de dados relacionados aos candidatos a vagas em processos seletivos.

## Requisitos 📝

### 1. Modelagem de Dados
- **Candidato**: 
  - Atributos: `nome`, `dataNascimento`, `cpf`, `escolaridade`, `vagaDesejada`, `statusCurriculo`.
  - Tipos de escolaridade: `MEDIO`, `FUNDAMENTAL`, `GRADUACAO`, `POS_GRADUACAO`, `ESPECIALIZACAO`.
  - Tipos de vaga desejada: `ANALISTA`, `QA`, `DEV`, `TECH_LEAD`, `SUPORTE`, `UX`.
  - Tipos de status do currículo: `EM_ANALISE`, `REPROVADO`, `APROVADO`.

- Utilizar anotações do JPA para mapear as entidades às tabelas no banco de dados.

### 2. DTOs (Data Transfer Objects)
- Criar DTOs para representar os objetos que serão enviados e recebidos pela API.
- Garantir a separação entre a camada de apresentação e a camada de negócios para evitar vazamento de informações.

### 3. Repositories
- Implementar interfaces Repository para cada entidade, com métodos para operações básicas de CRUD (Create, Read, Update, Delete).
- **Plus**: Utilizar derived queries para consultas por vaga desejada ou escolaridade do candidato.

### 4. Services
- Criar classes de serviço para implementar a lógica de negócios relacionada ao cadastro de currículos.
- Implementar métodos para operações como adicionar um novo currículo e atualizar informações do status.

### 5. Controllers
- Implementar controllers para receber requisições HTTP e chamar os métodos apropriados nos serviços.
- Utilizar anotações do Spring, como `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`, etc.

## Funcionalidades ⚙️
- **Obter Todos os Candidatos**: Recupera uma lista de todos os candidatos cadastrados.
- **Obter Candidato por ID**: Permite buscar um candidato específico utilizando seu identificador.
- **Filtrar Candidatos por Vaga Desejada**: Retorna uma lista de candidatos que desejam uma vaga específica.
- **Filtrar Candidatos por Escolaridade**: Retorna candidatos com base em sua escolaridade.
- **Salvar Novo Candidato**: Adiciona um novo candidato ao sistema.
- **Alterar Informações de Candidato**: Atualiza os dados de um candidato existente.
- **Apagar Candidato**: Remove um candidato do sistema baseado em seu ID.

## Tecnologias Utilizadas 💻
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white) 
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white) 
![JPA](https://img.shields.io/badge/JPA-007396?style=for-the-badge&logo=java&logoColor=white) 
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white) 
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white) 

## Instalação e Execução 🚀
1. Clone o repositório.
2. Configure o banco de dados no arquivo de configuração do Spring.
3. Execute a aplicação.
4. Acesse a API em `http://localhost:8080/candidatos`.

## Contribuição 🤝
Sinta-se à vontade para abrir issues ou pull requests para melhorias e correções!
