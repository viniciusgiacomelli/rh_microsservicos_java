<!-- 

Ora ora, se não temos um curioso(a) aqui?! Brincadeira!
fique a vontade para ver meus códigos e tudo mais, a casa é nossa.
Se gostar do meu trabalho é só me chamar que é sucesso!

 ░░░░░░░▄▄▄█████▄▄▄░░░░░░░
░░░░░██░░░░░░░░░░░██░░░░░  
░░░██░░░░░░░░░░░░░░░██░░░  
░░█░░░░░░░░░░░░░░░░░░░█░░  
░█░▄▀▀▀▄░░░░░░▄▀▀▀▄░░░░█░  
░█▐░░▄██▌░░░░▐░░▄██▌░░░░█
█░▐▄▄███▌░░░░▐▄▄███▌░░░░█
█░░░░░░░░░░░░░░░░░░░░░░░█
█░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░█
█░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░█
░█░░█▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░█░
░░█░░█▒▒▒▒▒░░░░░░▒█░░░░█░
░░░█░░█▒▒▒░░░░░░░█░░░██░░
░░░░██░▀▀▀▀▀▀▀▀▀▀░░░█░░░░
░░░░░░▀▀▀▀██████▀▀▀▀░░░░░ 

-->

# Microsservicos com Java Spring

Este sistema mantém um registro dos funcionários de um determinado setor/empresa e é responsável por gerar folhas de pagamento baseado nas horas trabalhadas e salário/hora de cada funcionário. A segurança destas informações é mantida através de autenticação dos usuários autorizados e utilização de tokens de sessão com tempo de expiração.

### Índice:
* :world_map: [Visão geral do sistema](https://github.com/Giacomellivinicius/Microsservicos-Java/edit/main/README.md#world_map-vis%C3%A3o-geral-do-sistema)
* :hammer_and_wrench: [Utilização](https://github.com/Giacomellivinicius/Microsservicos-Java/edit/main/README.md#hammer_and_wrench-utiliza%C3%A7%C3%A3o)
* :dart: [Endpoints](https://github.com/Giacomellivinicius/Microsservicos-Java/edit/main/README.md#endpoints)

### Tecnologias utilizadas: 
[![Java, O brabo](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](#)
[![Spring framework](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](#)
[![Spring secutiry](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white)](#)
[![OAuth Security](https://img.shields.io/badge/-OAuth-3423A6?style=for-the-badge&logo=WebAuthn&logoColor=white)](#)
[![Cloud Heroku](https://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white)](#)
[![Json format](https://img.shields.io/badge/json-5E5C5C?style=for-the-badge&logo=json&logoColor=white)](#)   
[![Postman para requisições http](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white)](#)
[![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)](#)
[![Tokenização com JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white)](#)
[![Banco de dados PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](#)

# :world_map: Visão geral do sistema:

![ Esquema de funcionamento dos micrisserviços ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/Esquema.png?raw=true)

Este projeto foi feito com a arquitetura de API's REST.  
Este projeto possui 7 microsserviços que funcionam da seguinte forma:
- **rh-funcionario** - mantém o registro de trabalhadores e realiza o mapeamento das classes utilizando JPA
- **rh-pagamento** - acessa as informações do microsserviço de funcionários e gera uma folha de pagamento 
- **rh-users** - mantém um registro dos usuários cadastrados e suas permissões
- **rh-auth** - utiliza o protocolo OAuth e tokens JWT para liberar acesso aos serviços 
- **rh-eureka-server** - realiza o balanceamento de carga e comunicação entre os serviços
- **rh-api-gateway-zuul** - tem a responsabilidade de rotear as requisições entre as diversas intâncias dos serviços
- **rh-config-server** - responsável pela configuração centralizada do sistema

### Modelo conceitual
Representação do modelo UML das entidades contidas no banco e seus relacionamentos:   
![ Esquema UML da camada model ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/Model.png?raw=true)

# :hammer_and_wrench: Utilização

![Exemplo de instâncias dos microsserviços em funcionamento ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/VisaoGeral.png?raw=true)

## :dart: Endpoints:   

Aqui tem um conjunto de requisições e cabeçalhos predefinidos que vão te auxiliar a fazer as requisições de forma muito mais simples:   
[![Run in Postman](https://run.pstmn.io/button.svg)](https://god.postman.co/run-collection/db94b9c19d8a03e7f466?action=collection%2Fimport#?env%5BMicrosservi%C3%A7os%20Spring%5D=W3sia2V5IjoiQXBpLWdhdGV3YXkiLCJ2YWx1ZSI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODc2NSIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoiY29uZmlnLWhvc3QiLCJ2YWx1ZSI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODg4OCIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoiY2xpZW50LW5hbWUiLCJ2YWx1ZSI6Im15YXBwbmFtZTEyMyIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoiY2xpZW50LXNlY3JldCIsInZhbHVlIjoibXlhcHBzZWNyZXQxMjMiLCJlbmFibGVkIjp0cnVlfSx7ImtleSI6InVzZXJuYW1lIiwidmFsdWUiOiJsZWlhQGdtYWlsLmNvbSIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoicGFzc3dvcmQiLCJ2YWx1ZSI6IjEyMzQ1NiIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoidG9rZW4iLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWV9XQ==)
   
*{{Api-gateway}} é um endereço de porta de serviço gerada dinamicamente. O link acima cria um workspace com as configurações necessárias para acesso.*

- **{{Api-gateway}}/rh-oauth/oauth/token** - Gera as credenciais de acesso. O usuário e password são passados através do cabeçalho da requisição 
- **{{Api-gateway}}/rh-funcionario/workers** - Retorna uma lista com todos os funcionários cadastrados
- **{{Api-gateway}}/rh-user/users/search?email={{user-email}}** - Busca um usuário cadastrado através do email informado
- **{{Api-gateway}}/rh-user/users/{{user-id}}** - Busca um usuário através do ID 
- **{{Api-gateway}}/rh-pagamento/payments/{{worker-id}}/days/{{days}}** - Retorna o valor do salário do funcionário informado equivalente a quantidade de dias trabalhados   
   


