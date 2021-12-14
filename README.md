# ProjetoFinal-ATOS-UFN
Projeto desenvolvido para a Academia Java

O projeto é um CRUD de agendamentos. Esses agendamentos são de pessoas que precisam do transporte fornecido pela prefeitura para irem até clínicas e hospitais de uma mesma cidade. Esta ideia surgiu de uma experiência que eu tive quando fui acompanhante da minha avó numa dessas viagens. O motorista não sabia o endereço das pessoas, ficava ligando para elas e perguntando o endereço. Quando as mesmas entravam no veículo, ele perguntava qual seria o local de destino. Então esse sistema faz a organização dessas informações, para ajudar e agilizar o trabalho do motorista e proporcionar melhor qualidade no transporte para os passageiros.

# Tecnologias utilizadas para a aplicação:
<h3>Back-end:</h3>
-Spring Boot;<br>
-Maven;<br>
-h2 banco de dados;<br>
-JPA e HIbernate.<br>

<h3>Front-end</h3>
-Bootstrap;<br>
-Thymeleaf;<br>
-Spring Web.


A pasta ProjetoFinal corresponde a Rest API que foi desenvolvida, e a pasta FrontEnd corresponde a parte de front-end que através de uma classe de Service está consumindo a Rest API.

O backend deve ser executado em um workspace diferente do frontend, com portas de conexão diferentes também, neste projeto a API está sendo executada na porta 8080, enquanto o frontend esta executando na porta 9000!
<br>
Seguem as imagens da aplicação no frontend:

<h3>Página de formulário</h3><br>

![formulario](https://user-images.githubusercontent.com/86419207/146094927-f7e10a77-d5b5-4333-9276-a4119ce76502.PNG)

<h3>Página de listagem</h3><br>

![listaAgendametos](https://user-images.githubusercontent.com/86419207/146094943-3e00089c-9607-4e33-be90-6d3d161f188f.PNG)

<h3>Página inicial</h3><br>

![paginaInicial](https://user-images.githubusercontent.com/86419207/146094960-d11c1615-d781-4735-8e47-5848c716c22f.PNG)


Imagens da Rest API sendo testada no Postman:

<h3>Método Get</h3><br>

![GetPostman](https://user-images.githubusercontent.com/86419207/146094997-83b012e4-6993-47b0-94ca-50c81e6a93b1.PNG)

<h3>Método Delete</h3><br>

![DeletePostman](https://user-images.githubusercontent.com/86419207/146095009-3090c880-9122-4836-83d5-96e755cde677.PNG)

<h3>Verificando se foi deletado</h3><br>

![DespoisDoDelete](https://user-images.githubusercontent.com/86419207/146095015-8cf5c6b9-e720-4fb9-92bc-62390732d2f3.PNG)



