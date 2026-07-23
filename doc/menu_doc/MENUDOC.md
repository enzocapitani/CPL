# Menu

A classe `Menu` permite criar menus simples para aplicações executadas no terminal, com suporte a exibição instantânea ou efeito de digitação.

> **Pacote:** `CPL.menu`

## Métodos

### `simpleMenu(String title, String[] options)`

Exibe um menu simples no terminal.

#### Parâmetros

| Parâmetro | Tipo | Descrição |
|-----------|------|-----------|
| `title` | `String` | Título exibido no topo do menu. |
| `options` | `String[]` | Vetor contendo as opções do menu. |

#### Exemplo

```java
import CPL.menu.Menu;

public class Main {

    public static void main(String[] args) {

        String[] options = {
            "Iniciar",
            "Configurações",
            "Sair"
        };

        Menu.simpleMenu("MENU PRINCIPAL", options);

    }
}
```

**Saída:**

```text
==============================
        MENU PRINCIPAL
==============================
1- Iniciar
2- Configurações
3- Sair
==============================
```

---

### `simpleTypeMenu(String title, String[] options, int delay)`

Exibe um menu utilizando o efeito de digitação da classe `Write`.

#### Parâmetros

| Parâmetro | Tipo | Descrição |
|-----------|------|-----------|
| `title` | `String` | Título do menu. |
| `options` | `String[]` | Vetor contendo as opções. |
| `delay` | `int` | Tempo (em milissegundos) entre cada caractere exibido. |

#### Exemplo

```java
import CPL.menu.Menu;

public class Main {

    public static void main(String[] args) {

        String[] options = {
            "Novo Jogo",
            "Carregar",
            "Sair"
        };

        Menu.simpleTypeMenu("RPG", options, 30);

    }
}
```

---

## Métodos auxiliares

Esses métodos fazem parte da implementação da classe e normalmente não precisam ser utilizados diretamente.

### `generateSeparator(String title, String[] options)`

Gera automaticamente a linha separadora (`=`) utilizada no menu.

O tamanho da linha é calculado utilizando o maior texto entre o título e as opções.

**Retorna**

```java
String
```

---

### `generateCenterTitle(String separator, String title)`

Centraliza o título utilizando o tamanho da linha separadora.

**Retorna**

```java
String
```

---

## Características

- ✅ Criação rápida de menus para aplicações de terminal.
- ✅ Numeração automática das opções.
- ✅ Separador gerado automaticamente.
- ✅ Título centralizado.
- ✅ Suporte ao efeito de digitação através da classe `Write`.
- ✅ Não requer criação de objetos (todos os métodos são `static`).

## Exemplo completo

```java
import CPL.menu.Menu;

public class Main {

    public static void main(String[] args) {

        String[] menu = {
            "Cadastrar usuário",
            "Listar usuários",
            "Remover usuário",
            "Sair"
        };

        Menu.simpleMenu("SISTEMA", menu);

    }
}
```

**Saída:**

```text
========================================
                SISTEMA
========================================
1- Cadastrar usuário
2- Listar usuários
3- Remover usuário
4- Sair
========================================
```

## Observações

- A largura do menu é calculada automaticamente com base no maior texto informado.
- O título é centralizado em relação ao tamanho do separador.
- Para utilizar `simpleTypeMenu()`, é necessário que a classe `Write` esteja disponível no projeto.