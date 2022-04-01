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

**Tecnologias utilizadas:**
- **Feign** para requisições de API entre os microsserviços
- **Ribbon** para balancemanto de carga
- **Eureka** como servidor de registro 
- **Zull** como API Gateway de roteamento e autorização de acesso
- **Hystrix** para tolerância de falhas
- **OAuth** e **JWT** para autenticação e autorização de usuários
- **JPA** para mapeamento da entidades
- **PostreSQL** como banco de dados relacional

# :world_map: Visão geral do sistema:

![ Esquema de funcionamento dos micrisserviços ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/Esquema.png?raw=true)

Este projeto foi feito com a arquitetura de API's REST, utilizando as camadas de entities, services e resources. 
Este projeto possui 7 microsserviços que funcionam da seguinte forma:
- **rh-funcionario** - mantém o registro de trabalhadores e realiza o mapeamento utilizando JPA
- **rh-pagamento** - acessa as informações do microsserviço de funcionários e gera uma folha de pagamento 
- **rh-users** - mantém um registro dos usuários cadastrados e suas permissões
- **rh-auth** - utiliza o protocolo OAuth e tokens JWT para liberar acesso aos serviços 
- **rh-eureka-server** - realiza o balancemaento de carga e comunicação entre os serviços
- **rh-api-gateway-zuul** - tem a responsabilidade de rotear as requisições entre as diversas intâncias dos serviços
- **rh-config-server** - responsável pela configuração centralizada do sistema

### Modelo conceitual

![ Esquema UML da camada model ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/Model.png?raw=true)

# :hammer_and_wrench: Utilização

![Exemplo de instâncias dos microsserviços em funcionamento ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/VisaoGeral.png?raw=true)

## Como rodar o projeto

[ ] descrever como rodar o projeto

## Endpoints:

[![Run in Postman](https://run.pstmn.io/button.svg)](https://god.postman.co/run-collection/db94b9c19d8a03e7f466?action=collection%2Fimport#?env%5BMicrosservi%C3%A7os%20Spring%5D=W3sia2V5IjoiQXBpLWdhdGV3YXkiLCJ2YWx1ZSI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODc2NSIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoiY29uZmlnLWhvc3QiLCJ2YWx1ZSI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODg4OCIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoiY2xpZW50LW5hbWUiLCJ2YWx1ZSI6Im15YXBwbmFtZTEyMyIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoiY2xpZW50LXNlY3JldCIsInZhbHVlIjoibXlhcHBzZWNyZXQxMjMiLCJlbmFibGVkIjp0cnVlfSx7ImtleSI6InVzZXJuYW1lIiwidmFsdWUiOiJsZWlhQGdtYWlsLmNvbSIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoicGFzc3dvcmQiLCJ2YWx1ZSI6IjEyMzQ1NiIsImVuYWJsZWQiOnRydWV9LHsia2V5IjoidG9rZW4iLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWV9XQ==)

*{{Api-gateway}} é um endereço de porta de serviço gerada dinamicamente. O link acima cria um workspace com as configurações necessárias para acesso.*

- **{{Api-gateway}}/rh-oauth/oauth/token** - Gera as credenciais de acesso. O usuário e password são passados através do cabeçalho da requisição 
- **{{Api-gateway}}/rh-funcionario/workers** - Retorna uma lista com todos os funcionários cadastrados
- **{{Api-gateway}}/rh-user/users/search?email={{user-email}}** - Busca um usuário cadastrado através do email informado
- **{{Api-gateway}}/rh-user/users/{{user-id}}** - Busca um usuário através do ID 
- **{{Api-gateway}}/rh-pagamento/payments/{{worker-id}}/days/{{days}}** - Retorna o valor do salário do funcionário informado equeivalente a quantidade de dias trabalhados


