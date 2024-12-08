### **Pokémon Database Application**

Este projeto é uma aplicação Java para gerenciar uma base de dados de Pokémon, utilizando Hibernate para integração com o banco de dados PostgreSQL. A aplicação também importa dados de um arquivo CSV para popular a base de dados.

---

### **Funcionalidades**

1. **Gerenciamento de Pokémon**:
   - Inserir novos Pokémon no banco de dados.
   - Remover Pokémon pelo ID.

2. **Importação de Arquivo CSV**:
   - Ler um arquivo CSV contendo dados de Pokémon.
   - Processar e salvar os dados no banco de dados.

3. **Manipulação de Arquivo CSV**:
   - Reescrever o CSV corrigindo formatações nos campos de tipo dos Pokémon.

---

### **Requisitos**

- **Java 11+**
- **PostgreSQL** (banco de dados configurado e em execução)
- **Maven** (para gerenciar dependências)
- **Bibliotecas adicionais**:
  - Hibernate Core
  - PostgreSQL JDBC Driver

---

### **Estrutura do Projeto**

```
src/
└── main/
    ├── java/
    │   └── com.matdev/
    │       ├── model/
    │       │   └── Pokemon.java      # Classe que representa o Pokémon
    │       ├── dao/
    │       │   └── PokemonDAO.java   # DAO para interagir com o banco de dados
    │       ├── service/
    │       │   └── PokemonService.java  # Lógica de negócios para Pokémon
    │       |   └── CsvService.java       # Serviço que processa o arquivo CSV
    │       └── utils/
    │           └── CsvUtils.java     # Utilitário para leitura e manipulação de CSV
    └── resources/
        ├── hibernate.cfg.xml         # Configuração do Hibernate
        └── data/
            └── Pokedex.csv           # Arquivo CSV com dados de Pokémon
```

---

### **Como Configurar**

1. **Clonar o Repositório**
   ```bash
   git clone https://github.com/KaiqueZulu/PokedexImport.git
   cd pokemon-database-application
   ```

2. **Configurar o Banco de Dados**
   - Certifique-se de que o PostgreSQL está em execução.
   - Crie um banco de dados chamado `pokemondb`.
   - Atualize as credenciais de conexão no arquivo `hibernate.cfg.xml` (localizado em `src/main/resources`).

   ```xml
   <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/pokemondb</property>
   <property name="hibernate.connection.username">SEU_USUARIO</property>
   <property name="hibernate.connection.password">SUA_SENHA</property>
   ```

3. **Compilar o Projeto**
   - Navegue até a pasta do projeto e execute:
     ```bash
     mvn clean install
     ```

4. **Executar a Aplicação**
   - Para importar o CSV e salvar os dados:
     ```java
     CsvService csvService = new CsvService();
     csvService.importPokemonDataFromCsv();
     ```

---

### **Contribuição**

Se encontrar algum bug ou desejar sugerir melhorias:
1. Crie um *fork* deste repositório.
2. Submeta um *pull request* com as alterações propostas.

---

### **Contato**

- **Autor**: Kaique Pires  
- **Email**: kaiqueroberto.pires@gmail.com  
- **LinkedIn**: [Kaique Pires](https://www.linkedin.com/in/kaique-pires)  

--- 

Sinta-se à vontade para ajustar conforme sua preferência! 🚀
