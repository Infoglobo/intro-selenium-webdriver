# INTRO-SELENIUM-WEBDRIVER
Leia nosso artigo no [Medium](https://medium.com/editora-globo/introdu%C3%A7%C3%A3o-ao-selenium-webdriver-8ac2f9a8d9d0) e conheça um pouco sobre o Selenium WebDriver. 
Esse repositório foi construído para armazenar os códigos presentes no artigo.

## Tecnologias utilizadas
* Java 8;
* Maven;
* Selenium WebDriver;
* JUnit 5;
* AssertJ;
* WebDriverManager.

## Testes contemplados
Como o objetivo do artigo é a introdução ao Selenium WebDriver, foi construído apenas um teste. 
Esse teste consiste em acessar a página do Google, procurar por "Editora Globo" e realizar verificações para garantir que a pesquisa foi feita.

## Executando o teste
Infelizmente o projeto ainda não está rodando no Docker, portanto é necessário executar localmente. Para isso, é um pré requisito que as seguintes ferramentas sejam instaladas:
* JDK 8 ou superior;
* Maven 3.3.9 ou superior;
* Google Chrome na versão mais atual.

Tendo os pré requisitos instalados, basta executar o comando `mvn clean test -Dtest=Google`.
