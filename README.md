# DSList

DSList é uma aplicação desenvolvida em **Spring Boot** para a organização de listas de jogos. O sistema permite que os usuários criem e gerenciem suas listas personalizadas de games, oferecendo funcionalidades como organização, classificação e descrição de cada jogo.

## Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot**  
- **Spring Data JPA**  
- **H2 Database** (para ambiente de desenvolvimento)  
- **PostgreSQL** (para produção)  
- **Spring Validation**  
- **Model Mapper**  
- **Postman** (para testes de API)

## Funcionalidades

- **Criação de Listas de Jogos:** Os usuários podem criar listas personalizadas com jogos de sua preferência.
- **Organização:** Permite reordenar os jogos dentro de cada lista.
- **Detalhes do Jogo:** Cada jogo inclui título, gênero, descrição e imagem ilustrativa.
- **Gerenciamento de Dados:** Cadastro, edição e remoção de jogos e listas.
- **API RESTful:** A aplicação expõe endpoints para consumo por outras aplicações ou interfaces.

## Como Executar o Projeto

### 1. Clonar o Repositório
```bash
git clone https://github.com/ErikSilva08/DSList.git
cd DSList
```

### 2. Configurar o Banco de Dados
O projeto está configurado para usar o banco de dados H2 no ambiente de desenvolvimento. Se preferir usar PostgreSQL:

- Atualize o arquivo `application.properties` com suas credenciais do PostgreSQL.
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/dslist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 3. Executar a Aplicação
Certifique-se de ter o Maven instalado e execute:
```bash
./mvnw spring-boot:run
```
A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080)

## Endpoints Principais

### Jogos
- **GET** `/games` - Lista todos os jogos.
- **GET** `/games/{id}` - Detalhes de um jogo específico.
- **POST** `/games` - Adiciona um novo jogo.
- **PUT** `/games/{id}` - Atualiza os dados de um jogo.
- **DELETE** `/games/{id}` - Remove um jogo.

### Listas de Jogos
- **GET** `/lists` - Lista todas as listas de jogos.
- **POST** `/lists` - Cria uma nova lista de jogos.
- **PUT** `/lists/{id}/games` - Atualiza a ordem dos jogos em uma lista.
- **DELETE** `/lists/{id}` - Remove uma lista de jogos.

## Estrutura do Projeto

- **Entities:** Representam os modelos de dados (Jogo, Lista).
- **Repositories:** Camada de acesso aos dados com Spring Data JPA.
- **Services:** Contém a lógica de negócio.
- **Controllers:** Gerenciam as requisições e expõem os endpoints da API.
- **DTOs:** Transferem dados entre as camadas.

## Testes
A API foi testada utilizando o **Postman**, garantindo o funcionamento de todos os endpoints.

## Melhorias Futuras
- Implementar autenticação e autorização.
- Criar uma interface web responsiva para consumo da API.
- Adicionar suporte para busca por gêneros e tags.

## Contribuição
Contribuições são bem-vindas! Siga os passos abaixo:

1. Faça um fork deste repositório.
2. Crie um branch para sua feature: `git checkout -b minha-feature`
3. Faça commit das suas alterações: `git commit -m 'Adiciona minha feature'`
4. Envie para o branch principal: `git push origin minha-feature`
5. Abra um Pull Request.

## Licença
Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

---

Feito por [Erik Silva](https://github.com/ErikSilva08).

