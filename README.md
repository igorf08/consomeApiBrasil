# 🇧🇷 Consome API Brasil

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3-6DB33F?style=for-the-badge&logo=spring)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf)
![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-38B2AC?style=for-the-badge&logo=tailwind-css)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

Uma aplicação Web elegante e de alto desempenho desenvolvida em **Spring Boot** para consultas de dados estruturados em APIs do governo/serviços públicos brasileiros, como CEPs e CNPJs. 

Este projeto foi desenhado com o objetivo de demonstrar boas práticas de arquitetura backend com Java, juntamente com uma interface de usuário inspirada em SAAS modernos. O deploy foi feito utilizando **Docker**.  

<img src="https://i.imgur.com/j0pgA6G.png" alt="Tela inicial do projeto" width="100%">

---

## ✨ Features

- 🔎 **Consulta de CEP**: Busque informações de endereços usando o CEP.
- 🏢 **Consulta de CNPJ**: Dados cadastrais da Receita Federal como Razão Social, Porte, Endereço e E-mail.
- 🎨 **Interface Moderna**: UI projetada com *Tailwind CSS* seguindo a estética "Glassmorphism" e Terminal Dark Mode.
- 📱 **Totalmente Responsivo**: Experiência fluida tanto no Desktop quanto no Mobile.
- 🐳 **Pronto para Nuvem**: A aplicação roda dentro de um container Docker, garantindo o mesmo comportamento em qualquer ambiente.

---

## 🛠️ Arquitetura e Padrões Aplicados

O projeto não se resume apenas a fazer chamadas HTTP. A base de código foi cuidadosamente construída seguindo Padrões de Projeto e Clean Code:

- **DTO Pattern (Data Transfer Object)**: Uso do recurso `records` do Java 14+ para separar o que é tráfego da API (`ResponseDTO`) do que é visualizado pelo thymeleaf (`ViewDTO`), garantindo imutabilidade e economia de recursos.
- **Service Layer**: Toda lógica de negócios e chamadas externas (via `RestTemplate`) centralizadas, retirando a complexidade dos Controllers.
- **Tratamento com `@ControllerAdvice`**: Tratamento global de exceções. Sem blocos `try/catch` repetitivos. Os erros (ex: 404 - CEP Inexistente) são capturados e mapeados graciosamente para a View, mantendo o "Happy Path" nos Controllers.
- **Utils sem Estado (Stateless)**: Formatações de strings complexas foram movidas para classes Utilitárias com métodos `static`, aliviando o Thymeleaf e mantendo a responsabilidade no Java.

---

## 🚀 Como Executar Localmente

### Opção 1: Rodando nativamente com Maven
*Pré-requisito: Java 17+*
1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/consome-api-brasil.git
   ```
2. Acesse a pasta do projeto e rode:
   ```bash
   ./mvnw spring-boot:run
   ```
3. Acesse no navegador: `http://localhost:8080`

### Opção 2: Rodando com Docker (Recomendado)
*Pré-requisito: Docker Desktop instalado*
1. Construa a imagem da aplicação:
   ```bash
   docker build -t consome-api-brasil .
   ```
2. Inicie o container:
   ```bash
   docker run -p 8080:8080 consome-api-brasil
   ```
3. Acesse no navegador: `http://localhost:8080`

---
*Desenvolvido com dedicação.*
