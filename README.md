# cep-service

Serviço de busca de cep no backend

## Instruções de execução do docker do serviço

### Baixar a imagem do DockerHub
sudo docker pull wagnerpires/cepservice-wrtecnologia:v1

### Execução

* na primeira execução (criação do container)

  sudo docker run -p 80:8080 --name cepservice-wrtecnologia wagnerpires/cepservice-wrtecnologia:v1

* a partir da primeira execução

  sudo docker ps -a

  sudo docker logs + três primeiros caractares do CONTAINER ID (listado no comando acima)
  
  sudo docker start + três primeiros caractares do CONTAINER ID

* para parar a execução

  sudo docker stop + três primeiros caractares do CONTAINER ID

### URL para teste

http://<ip_do_servidor>/endereco/<cep_desejado>
  
* substituir o <ip_do_servidor> pelo endereço IP do servidor onde o serviço foi iniciado
* substituir o <cep_desejado> pelo CEP desejado
