# ProjetoFinal-ATOS-UFN
Projeto desenvolvido para a Academia Java

O projeto é um CRUD de agendamentos. Esses agendamentos são de pessoas que precisam do transporte fornecido pela prefeitura para irem até clínicas e hospitais de uma mesma cidade. Esta ideia surgiu de uma experiência que eu tive quando fui acompanhante da minha avó numa dessas viagens. O motorista não sabia o endereço das pessoas, ficava ligando para elas e perguntando e quando as mesmas entravam no veículo, ele perguntava qual seria o local de destino. Então esse sitema faz a organização dessas informações, para ajudar e agilizar o trablho do motorista e proporcionar melhor qualidade no transporte para os passageiros.

# Tecnologias utilizadas para a aplicação:
<h3>Back-end:</h3>
-Spring Boot;
-Maven;
-h2 banco de dados;
-JPA e HIbernate.

<h3>Front-end</h3>
-Bootstrap;
-Thymeleaf;
-Spring Web.

A pasta ProjetoFinal corresponde a Rest API que foi desenvolvida, e a pasta FrontEnd corresponde a parte de front-end que através de uma classe de Service está consumindo a Rest API.

O backend deve está sendo executado em um workspace diferente do frontend, com portas diferentes também!

Seguem as imagens da aplicação no frontend:

![formulario](https://user-images.githubusercontent.com/86419207/146093640-a42d40ed-5e6f-4ef3-803d-dafd48c77332.PNG)
<br>
<br>
![listaAgendametos](https://user-images.githubusercontent.com/86419207/146093694-722a6ff0-228d-444a-ac6e-bb7a470e64b1.PNG)
<br>
<br>
![paginaInicial](https://user-images.githubusercontent.com/86419207/146093759-96bee031-09f5-4cfa-8454-afae64285540.PNG)

Imagens da Rest API sendo testada no Postman:

![GetPostman](https://user-images.githubusercontent.com/86419207/146093839-41333ac3-171d-4f70-bc56-c13f5c43cbc5.PNG)
<br>
<br>
![DeletePostman](https://user-images.githubusercontent.com/86419207/146093869-95f69a34-2f88-4062-aac1-7572690d0fa4.PNG)
<br>
<br>
![DespoisDoDelete](https://user-images.githubusercontent.com/86419207/146093892-2a58e7c4-3d3c-4160-9b7d-0de39a5220b2.PNG)



