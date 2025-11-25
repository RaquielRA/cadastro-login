# Spring Boot Cadastro & Login API

Sistema de backend minimalista para **Cadastro (Registro) e Login (Autenticação)** de usuários, construído com foco em segurança e persistência de dados.

## 🚀 Tecnologias Utilizadas

| Tecnologia | Função Principal |
| :--- | :--- |
| **Java 17+** | Linguagem principal de desenvolvimento. |
| **Spring Boot 3** | Framework para construção rápida e eficiente da API REST. |
| **Spring Security** | Gerenciamento de Autenticação, Autorização e Criptografia (BCrypt). |
| **Hibernate JPA** | Camada de Mapeamento Objeto-Relacional (ORM) para o banco de dados. |
| **MySQL** | Banco de dados relacional para persistência de dados. |
| **Maven** | Gerenciador de dependências e build do projeto. |
| **Swagger / Springdoc** | Documentação interativa e testes de endpoints (`/swagger-ui/index.html`). |

## ⚙️ Como Executar o Projeto

### Pré-requisitos

* JDK 17 ou superior.
* Maven.
* MySQL Server (Rodando na porta 3306).
* MySQL Workbench ou Cliente CLI.

### Configuração do Banco de Dados

1.  **Crie o Schema (Database):** No seu MySQL Workbench ou terminal, execute o comando para criar o banco de dados que será utilizado pela aplicação:
    ```sql
    CREATE DATABASE IF NOT EXISTS cadastro_login_db;
    ```

2.  **Configurar Credenciais:** Como o arquivo `application.properties` está no `.gitignore` por motivos de segurança, crie um novo arquivo **localmente** em `src/main/resources/application.properties` ou `application-local.properties` com suas credenciais:

    ```properties
    # Credenciais do MySQL
    spring.datasource.url=jdbc:mysql://localhost:3306/cadastro_login_db?serverTimezone=America/Sao_Paulo
    spring.datasource.username=root
    spring.datasource.password=SUA_SENHA_AQUI
    
    # Configuração de persistência (Hibernate)
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    server.port=8080
    ```
    *Substitua `SUA_SENHA_AQUI` pela sua senha do MySQL.*

### Inicialização

Inicie a aplicação através do VS Code (Run/Debug na classe `[SeuProjeto]Application.java`) ou via Maven no terminal:

```bash
mvn spring-boot:run