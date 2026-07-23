# CleanTerminal

A classe `CleanTerminal` fornece um método simples para limpar a tela do terminal durante a execução de aplicações Java.

> **Pacote:** `CPL.util`

## Método

### `clean()`

Limpa a tela do terminal de acordo com o sistema operacional em que a aplicação está sendo executada.

#### Funcionamento

- **Windows:** executa o comando `cls`.
- **Linux/macOS:** executa o comando `clear`.

> **Importante**
>
> Este método funciona apenas quando a aplicação está sendo executada em um **terminal do sistema operacional**.
>
> Em consoles de IDEs como **Eclipse**, **IntelliJ IDEA**, **VS Code** e outras, o comportamento pode não funcionar, pois esses consoles normalmente não interpretam os comandos `cls` ou `clear`.

## Exemplo

```java
package exemplo;

import CPL.util.CleanTerminal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Texto antes da limpeza...");

        // Limpa o terminal
        CleanTerminal.clean();

        System.out.println("Terminal limpo!");
    }
}
```

## Compatibilidade

| Sistema Operacional | Suporte |
|----------------------|:-------:|
| Windows              | ✅ |
| Linux                | ✅ |
| macOS                | ✅ |
| Console de IDE       | ⚠️ Pode não funcionar |

## Observações

- O método é `static`, portanto não é necessário instanciar a classe.
- Caso ocorra algum erro durante a execução do comando de limpeza, a exceção será capturada e exibida no console.

### Exemplo de uso

```java
CleanTerminal.clean();
```