# ✅⚙️ Version 0.04 
# 🪄 Refactors

## CleanTerminal class
Refatoração no nome, agora se chama TERMINAL, para englobar novas
funções que alteram afetam o terminal

## Menu package
Refatoração na classe menu, foi separada novas classes para cada uma ter
sua propria responsabilidade no código. Entre elas: Header, Separator e Title

### Title class 
Serve exclusivamente para geração de titulos, nela possui:

funções: 

generateCenterTitle : Gera titulos centralizados
generateSorroundedTitle : Gera titulos centralizados e cercados por caracteres

### Header class
Nela é possível criar cabeçalhos simples

header() : gera o cabeçalho. Para mais informações veja a documentação da classe

### Separator
Classe exclusiva para gerar separadores

## 🆕 Features 

### Terminal Class (Antiga CleanTerminal)
Nova função chamada de sleep, ela pausa a thread principal que para o processo que estava acontecendo
fazendo um efeito de pausa do programa.

Exemplo:

```java
   import cpl.util.Terminal;

public static void main(String[] args) {
    System.out.println("Estou");
    Terminal.sleep(1000);
    System.out.println(" dormindo...");
}
```

# ✅⚙️ Version 0.033
## Refactors
### Write class
Refatoração das funções write(), agora passam a se chanar type().
### Menu Class 
Refatoração das funções da classe, foi removido de algumas o nome Menu do lado, facilitando a escrita

# ✅⚙️ Version 0.031
## Bug fix
### Módulo
Conserto do módulo do projeto, adicionada nela o pacote do menu, isso ajeita os projetos modulares

# ✅⚙️ Version 0.03
## Features
Adicionada a classe Menu
### Menu
- É possível agora criar menus utilizando a classe MENU

simpleMenu(String title, String options);
simpleTypeMenu(String title, String options, int delay);

Essas novas funções recebem como parâmetro o título do menu, um vetor de opções do menu e, a com efeito de escrita, o delay

exemplo:

```java
package cpl;

import cpl.menu.Menu;

public class Main {
    public static void main(String[] args) {
        String options[] = {"Login", "About", "Exit"};

        Menu.simpleMenu("PROGRAM", options);
    }
}
```

saida:
```text
==============
    PROGRAM
==============
1- Login
2- About
3- Exit
==============
```

# ✅⚙️ Version 0.02
## Features
Adicionada a classe Input e novas funções na Write
### Write
- É possível agora escrever colorido no terminal, chamando no parâmetro da função write o enum que indica a cor desejada
```java
public void genericFunction(){
    Write.write("Hello world!", WriteColor.RED, 10);
}
```
Assim como as outras, ela também nao necessita passar o delay como parametro, pois também usa o delay padrão da classe

- Também é possível mudar a cor de todo terminal com a função setWriteColor(), quando chamada, todas as saídas escritas  após elas, sairão com a cor definida pelo usuário. Para voltar a cor original, basta chamar resetWriteColor()

### Input
Essa nova classe tem como objetivo capturar alguns tipos de entrada definidas pelo usuário : boolean, double, int e string.
Exemplo:

```java

public void genericFunction(){
    String phrase = Input.catchString();
    Write.write(phrase, WriteColor.RED);
}

```

# ✅⚙️ Version 0.01
## Features
Adicionada as primeiras funções do código, CleanTerminal e Write
### Write
Nessa classe, ela possui uma função em que escreve letras por letras de uma palavra com o delaypré definido da classe ou com o parâmetro passado na função write();

### CleanTerminal
Nessa classe, possui apenas uma função, por agora, em que a função dela é limpar o terminal/consoleela não funciona em alguns consoles de ide, como por exemplo o Eclipse.
