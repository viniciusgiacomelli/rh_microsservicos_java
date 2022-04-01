# Microsservicos

Este sistema possui um API Gateway, um servidor de Discovery, um servidor com configuração centralizada que faz uso das tecnologias OAuth e JWT para segurança de microsserviços escaláveis e com balanceamento de carga. 

**Tecnologias principais:**
- **Fegin** para requisições de API entre os microsserviços
- **Ribbon** para balancemanto de carga
- **Eureka** como servidor de registro 
- **Zull** como API Gateway de roteamento e autorização
- **Hystrix** para tolerância de falhas
- **OAuth** e **JWT** para autenticação e autorização 
- **JPA** para mapeamento da entidades

## Visão geral:

![ Esquema de funcionamento dos micrisserviços ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/Esquema.png?raw=true)

## Model



Este projeto foi feito com a arquitetura de API's REST, utilizando as camadas de entities, services e resources. 
Este projeto possui 7 microsserviços que funcionam da seguinte forma:
- **rh-funcionario** mantém o registro de trabalhadores e realiza o mapeamento utilizando JPA
- **rh-pagamento** acessa as informações do microsserviço de funcionários e gera uma folha de pagamento 
- 

## Como utilizar o projeto

![Exemplo de instâncias dos microsserviços em funcionamento ](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/VisaoGeral.png?raw=true)

### Endepoints

[ ] Conjunto requisições no Postman

