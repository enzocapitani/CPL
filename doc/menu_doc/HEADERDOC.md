# `Header`

A classe `Header` fornece métodos para criação e exibição de **cabeçalhos formatados no terminal**.

Os cabeçalhos são compostos por uma linha divisória e um título centralizado. A classe também oferece uma versão animada, utilizando a classe `Write` para exibir o cabeçalho caractere por caractere.

---

## 📦 Pacote

```java
CPL.menu
```

---

## 🔧 Características

A classe possui as seguintes funcionalidades:

* 📌 Criar cabeçalhos centralizados.
* ➖ Gerar automaticamente divisórias de acordo com o tamanho do título.
* ✏️ Permitir uma divisória personalizada.
* ⏱️ Exibir cabeçalhos com animação de digitação.
* 🎨 Permitir o uso das funcionalidades de escrita da classe `Write`.

---

## Dependências

A classe utiliza:

```java
import CPL.style.Write;
```

Além disso, utiliza as classes `Separator` e `Title` do pacote `CPL.menu` para gerar a estrutura do cabeçalho.

---

# Métodos

## `header(String title)`

Cria e exibe um cabeçalho utilizando uma **divisória gerada automaticamente**.

A largura da divisória é determinada com base no tamanho do título.

### Parâmetros

| Parâmetro | Tipo     | Descrição                             |
| --------- | -------- | ------------------------------------- |
| `title`   | `String` | Título que será exibido no cabeçalho. |

### Exemplo

```java
Header.header("Sistema de Biblioteca");
```

Saída aproximada:

```text
-------------------------------------
       Sistema de Biblioteca
-------------------------------------
```

A divisória é gerada automaticamente através de:

```java
Separator.generateSeparator(title);
```

O título é centralizado através de:

```java
Title.generateCenterTitle(separator, title);
```

---

## `header(String title, String separator)`

Cria e exibe um cabeçalho utilizando uma **divisória definida pelo usuário**.

Essa versão permite maior controle sobre a aparência do cabeçalho.

### Parâmetros

| Parâmetro   | Tipo     | Descrição                                     |
| ----------- | -------- | --------------------------------------------- |
| `title`     | `String` | Título que será exibido.                      |
| `separator` | `String` | Divisória utilizada acima e abaixo do título. |

### Exemplo

```java
Header.header("Menu Principal", "==============================");
```

Saída:

```text
==============================
        Menu Principal
==============================
```

Também é possível utilizar diferentes caracteres:

```java
Header.header("Configurações", "##############################");
```

Saída:

```text
##############################
        Configurações
##############################
```

---

## `typeHeader(String title)`

Cria e exibe um cabeçalho com **animação de digitação**.

A divisória é gerada automaticamente e todos os elementos do cabeçalho são exibidos utilizando o delay padrão da classe `Write`.

### Parâmetros

| Parâmetro | Tipo     | Descrição                |
| --------- | -------- | ------------------------ |
| `title`   | `String` | Título que será exibido. |

### Exemplo

```java
Header.typeHeader("Sistema de Biblioteca");
```

O cabeçalho será exibido de forma animada:

```text
-------------------------------------
       Sistema de Biblioteca
-------------------------------------
```

Porém, cada caractere será apresentado gradualmente.

Internamente, o método utiliza:

```java
Write.type(separator);
Write.type(Title.generateCenterTitle(separator, title));
Write.type(separator);
```

---

## `typeHeader(String title, int delay)`

Cria e exibe um cabeçalho animado utilizando um **delay personalizado**.

O delay é aplicado individualmente a cada parte do cabeçalho.

### Parâmetros

| Parâmetro | Tipo     | Descrição                                         |
| --------- | -------- | ------------------------------------------------- |
| `title`   | `String` | Título que será exibido.                          |
| `delay`   | `int`    | Intervalo entre cada caractere, em milissegundos. |

### Exemplo

```java
Header.typeHeader("Carregando sistema...", 75);
```

Nesse caso, cada caractere será exibido com um intervalo de `75 ms`.

Para uma animação mais rápida:

```java
Header.typeHeader("Carregando...", 20);
```

Para uma animação mais lenta:

```java
Header.typeHeader("Carregando...", 150);
```

---

# 📋 Resumo da API

| Método                    | Divisória     | Animação | Delay         |
| ------------------------- | ------------- | -------- | ------------- |
| `header(String)`          | Automática    | ❌        | —             |
| `header(String, String)`  | Personalizada | ❌        | —             |
| `typeHeader(String)`      | Automática    | ✅        | Padrão        |
| `typeHeader(String, int)` | Automática    | ✅        | Personalizado |

---

# 🧩 Exemplos de utilização

## Cabeçalho simples

```java
Header.header("MENU PRINCIPAL");
```

---

## Cabeçalho com divisória personalizada

```java
Header.header(
    "MENU PRINCIPAL",
    "================================"
);
```

---

## Cabeçalho animado

```java
Header.typeHeader("MENU PRINCIPAL");
```

---

## Cabeçalho animado com velocidade personalizada

```java
Header.typeHeader("MENU PRINCIPAL", 50);
```

---

# 🔗 Integração com outras classes

A classe `Header` funciona como uma camada de abstração sobre outras funcionalidades da CPL.

### `Separator`

Responsável por gerar automaticamente a divisória:

```java
String separator = Separator.generateSeparator(title);
```

### `Title`

Responsável por centralizar o título de acordo com o tamanho da divisória:

```java
Title.generateCenterTitle(separator, title);
```

### `Write`

Utilizada pelos métodos `typeHeader()` para adicionar a animação de digitação:

```java
Write.type(separator);
```

Dessa forma, `Header` combina diferentes funcionalidades da biblioteca para simplificar a criação de interfaces de terminal.

---

# 💡 Exemplo em uma aplicação

A classe pode ser utilizada para estruturar diferentes partes de uma aplicação de console:

```java
Header.header("SISTEMA DE BIBLIOTECA");

System.out.println("1 - Cadastrar livro");
System.out.println("2 - Listar livros");
System.out.println("3 - Emprestar livro");
System.out.println("4 - Devolver livro");
System.out.println("0 - Sair");
```

Também pode ser utilizada junto à animação:

```java
Header.typeHeader("SISTEMA DE BIBLIOTECA", 30);

Write.type("1 - Cadastrar livro");
Write.type("2 - Listar livros");
Write.type("3 - Emprestar livro");
Write.type("4 - Devolver livro");
Write.type("0 - Sair");
```

---

## ⚠️ Observações

* A centralização do título depende do tamanho da `separator`.
* Quando nenhuma divisória é fornecida, ela é gerada automaticamente através de `Separator`.
* `typeHeader()` utiliza a classe `Write`, portanto possui o mesmo comportamento de delay dessa classe.
* O delay é informado em **milissegundos**.
* A classe possui apenas métodos `static`, portanto não é necessário criar uma instância de `Header`.

### Exemplo

Não é necessário:

```java
Header header = new Header();
```

Basta utilizar:

```java
Header.header("Meu Sistema");
```

---

## 📄 Estrutura da classe

De forma simplificada, a classe pode ser representada da seguinte maneira:

```text
Header
│
├── header(String)
│   ├── Separator
│   └── Title
│
├── header(String, String)
│   └── Title
│
├── typeHeader(String)
│   ├── Separator
│   ├── Title
│   └── Write
│
└── typeHeader(String, int)
    ├── Separator
    ├── Title
    └── Write
```

A principal finalidade da classe é **simplificar a criação de cabeçalhos padronizados em aplicações de terminal**, evitando que o desenvolvedor precise implementar manualmente a geração das divisórias e o alinhamento dos títulos.
