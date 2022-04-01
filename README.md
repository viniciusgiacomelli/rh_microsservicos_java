# Microsservicos

Este sistema possui um API Gateway, um servidor de Discovery, um servidor com configuração centralizada que faz uso das tecnologias OAuth e JWT para segurança de microsserviços escaláveis e com balanceamento de carga. 

## Visão geral:
![image](https://github.com/Giacomellivinicius/Microsservicos-Java/blob/main/images/VisaoGeral.png?raw=true)

**Tecnologias principais:**
- **Fegin** para requisições de API entre os microsserviços
- **Ribbon** para balancemanto de carga
- **Eureka** como servidor de registro 
- **Zull** como API Gateway de roteamento e autorização
- **Hystrix** para tolerância de falhas
- **OAuth** e **JWT** para autenticação e autorização  
