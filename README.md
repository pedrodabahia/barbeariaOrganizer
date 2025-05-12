# ✂️ BarberOrganizer API

API REST desenvolvida em Java com Spring Boot para gerenciamento de serviços e cortes de uma barbearia. O projeto permite cadastrar, listar e excluir cortes e serviços via endpoints HTTP.

---

## 📌 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Maven

---

## 📁 Estrutura do Projeto

```

src
└── main
└── java
└── barberOrganizer
└── barbearia
├── controller
│   ├── cortesController.java
│   └── servicesController.java
├── entity
│   ├── cortesBarber.java
│   └── serviceBarber.java
└── repository
├── cortesRepository.java
└── serviceRepository.java

````

---

## 📖 Endpoints Disponíveis

### 📌 Cortes

- `GET /api/cortes` → Lista todos os cortes cadastrados.
- `POST /api/cortes` → Cadastra um novo corte.
- `DELETE /api/cortes/delete/{corte}` → Deleta um corte pelo nome.

### 📌 Serviços

- `GET /api/services` → Lista todos os serviços cadastrados.
- `POST /api/services` → Cadastra um novo serviço.

---

## 📦 Como Executar o Projeto Localmente

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/barberorganizer-api.git
   cd barberorganizer-api
````

2. Configure o `application.properties` com suas credenciais do banco de dados PostgreSQL:

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/sua_base
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Rode a aplicação:

   ```bash
   mvn spring-boot:run
   ```

4. Acesse:

   ```
   http://localhost:8080/api/cortes
   http://localhost:8080/api/services
   ```

---

## 📌 Possibilidades de Deploy

* [x] Localhost
* [ ] Render
* [ ] Railway
* [ ] VPS (DigitalOcean, Oracle Free Tier, etc)

---

## 📸 Exemplos de JSON para Teste

### Cortes

```json
{
  "corte": "Degradê"
}
```

### Serviços

```json
{
  "cliente": "João",
  "servico": "Barba",
  "valor": 30.00
}
```

---

## 📃 Licença

Este projeto é livre para fins de estudo e pode ser usado e modificado sem restrições.

---

## 💻 Autor

**Seu Nome**
Instagram: [@seuuser](https://instagram.com/seuuser)
LinkedIn: [Seu Nome](https://linkedin.com/in/seuuser)

```

---

Se quiser, me manda o link do teu GitHub ou o nome de usuário que eu já deixo isso personalizado também! Quer?
```
