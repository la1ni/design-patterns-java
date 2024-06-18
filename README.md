# Design Patterns em Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)

Este repositório contém implementações simples de alguns dos padrões de projeto mais conhecidos em Java. Cada padrão é implementado em um pacote separado. Este projeto foi criado para fins de estudo tendo como base o curso Santander Coders provido pelo banco Santander em parceria com a [Ada Tech](https://www.adatech.com.br/).

## Padrões de Projeto Implementados

1. **Adapter**
    - O Adapter permite que interfaces incompatíveis trabalhem juntas. Ele envolve um objeto existente em uma interface de adaptador para que outra classe possa usá-lo.

2. **Builder**
    - Builder permite a criação de objetos complexos passo a passo. Ele é particularmente útil quando há muitos parâmetros para inicializar em um objeto.

3. **Chain of Responsibility**
    - O Chain of Responsibility passa uma solicitação ao longo de uma cadeia de handlers. Cada handler decide se processa a solicitação ou a passa para o próximo handler na cadeia.

4. **Prototype**
    - Prototype permite a criação de novos objetos copiando instâncias existentes, ou "protótipos", em vez de criar novos objetos do zero.

5. **Template Method**
    - O padrão Template Method define o esqueleto de um algoritmo em uma operação, deixando alguns passos para subclasses. Ele permite que subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura.

6. **Factory**
    - A Factory define uma interface para criar objetos, mas deixa as subclasses decidirem quais classes instanciar. Ele promove a criação de objetos sem expor a lógica de criação ao cliente.

7. **Proxy**
    - O padrão Proxy fornece um substituto ou marcador para outro objeto. Um proxy controla o acesso ao objeto original, permitindo adicionar funcionalidades antes ou depois da solicitação ser processada.

8. **Singleton**
    - Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.

9. **Strategy**
    - O Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Estrutura do Projeto

Cada padrão está implementado em seu próprio pacote, contendo:

- **Classes principais**: Implementação do padrão.
- **Classe de teste**: onde os resultados da aplicação do padrão são demonstrados