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
<br>
A pasta ProjetoFinal corresponde a Rest API que foi desenvolvida, e a pasta FrontEnd corresponde a parte de front-end que através de uma classe de Service está consumindo a Rest API.
<br>
O backend deve ser executado em um workspace diferente do frontend, com portas de conexão diferentes também, neste projeto a API está sendo executada na porta 8080, enquanto o frontend esta executando na porta 9000!
<br>
Seguem as imagens da aplicação no frontend:

<h3>Página de formulário</h3><br>
![formulario](https://user-images.githubusercontent.com/86419207/146093640-a42d40ed-5e6f-4ef3-803d-dafd48c77332.PNG)
<h3>Página de listagem</h3><br>
![listaAgendametos](https://user-images.githubusercontent.com/86419207/146093694-722a6ff0-228d-444a-ac6e-bb7a470e64b1.PNG)
<h3>Página inicial</h3><br>
![paginaInicial](https://user-images.githubusercontent.com/86419207/146093759-96bee031-09f5-4cfa-8454-afae64285540.PNG)

Imagens da Rest API sendo testada no Postman:

<h3>Método Get</h3><br>
![GetPostman](https://user-images.githubusercontent.com/86419207/146093839-41333ac3-171d-4f70-bc56-c13f5c43cbc5.PNG)
<h3>Método Delete</h3><br>
![DeletePostman](https://user-images.githubusercontent.com/86419207/146093869-95f69a34-2f88-4062-aac1-7572690d0fa4.PNG)
<h3>Verificando se foi deletado</h3><br>
![DespoisDoDelete](https://user-images.githubusercontent.com/86419207/146093892-2a58e7c4-3d3c-4160-9b7d-0de39a5220b2.PNG)



