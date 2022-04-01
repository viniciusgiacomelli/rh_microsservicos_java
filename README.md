# Microsservicos

Este sistema possui um API Gateway, um servidor de Discovery, um servidor com configuração centralizada que faz uso das tecnologias OAuth e JWT para segurança de microsserviços escaláveis e com balanceamento de carga. 

## Visão geral:

Este projeto foi feito com a arquitetura de API's REST, utilizando as camadas de entities, services e resources. 

**Tecnologias principais:**
- **Fegin** para requisições de API entre os microsserviços
- **Ribbon** para balancemanto de carga
- **Eureka** como servidor de registro 
- **Zull** como API Gateway de roteamento e autorização
- **Hystrix** para tolerância de falhas
- **OAuth** e **JWT** para autenticação e autorização 
- **JPA** para mapeamento da entidades

##Como utilizar o projeto
Este projeto mantém 7 microsserviços que funcionam da seguinte forma:
- **rh-funcionario** mantém o registro de trabalhadores que se conecta diretamente ao banco de dados, 
