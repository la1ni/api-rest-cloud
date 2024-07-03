# Api RESTful cloud


![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)![H2 Database](https://img.shields.io/badge/H2-003545?style=for-the-badge&logo=h2&logoColor=white)![Railway](https://img.shields.io/badge/Railway-0B0D0E?style=for-the-badge&logo=railway&logoColor=white)![OpenAPI](https://img.shields.io/badge/OpenAPI-6BA539?style=for-the-badge&logo=openapi-initiative&logoColor=white)![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)


![License](https://img.shields.io/badge/License-MIT-blue.svg)

## Descrição

Esta é uma API REST construída com Spring Boot, utilizando JPA Repository para persistência de dados. A aplicação é configurada para funcionar em dois ambientes: desenvolvimento e produção. No ambiente de desenvolvimento, a aplicação utiliza o banco de dados H2, enquanto no ambiente de produção utiliza o PostgreSQL. A API está documentada com OpenAPI e o deploy foi realizado via Railway.

## Funcionalidades

Essa API foi pensada para fornecer os dados para um sistema bancário, e suas funcionalidades permitem:

- Cadastro de usuários
- Consulta de usuários via id
- Consulta geral de usuários

#### Diagrama de Classes
O diagrama de classes a seguir descreve as principais classes do domínio da aplicação.

```mermaid
classDiagram
    class User {
        - name: String
        - account: Account
        - features: list[Feature]
        - card: Card
        - news: list[News]
    }
    
    class Account {
        - number: String 
        - agency: String 
        - balance: BigDecimal 
        - limit: BigDecimal 
    }
    
    class Card {
        - number: String 
        - limit: BigDecimal 
    }
    
    class Feature {
        - icon: String 
        - description: String 
    }
    
    class News {
        - icon: String 
        - description: String 
    }

    User "1" *--> "1" Account
    User "1" *--> "1" Card
    User "1" *--> "n" Feature 
    User "1" *--> "n" News 
```


## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para construção da API
- **JPA Repository**: Persistência de dados
- **H2 Database**: Banco de dados utilizado no ambiente de desenvolvimento
- **PostgreSQL**: Banco de dados utilizado no ambiente de produção
- **Railway**: Serviço de deploy e banco de dados na nuvem
- **OpenAPI**: Documentação da API

## Documentação da API

A documentação da API está disponível em `https://api-rest-cloud-production.up.railway.app/swagger-ui/index.html`. Esta documentação foi gerada utilizando OpenAPI e fornece detalhes sobre os endpoints disponíveis, incluindo exemplos de requisições e respostas.


## Licença

Este projeto está licenciado sob os termos da licença MIT.

---

Se precisar de mais alguma modificação ou detalhe adicional, estou à disposição!
