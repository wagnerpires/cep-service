# service-cep

Serviço de busca de cep no backend

## Instruções de execução do docker do projeto

### Baixar a imagem do DockerHub
sudo docker pull wagnerpires/servicecep-wrtecnologia:v1

### Execução

* na primeira execucao

  sudo docker run -p 80:8080 --name servicecep-wrtecnologia wagnerpires/servicecep-wrtecnologia:v1

* a partir da primeira execucao

  sudo docker ps -a

  sudo docker logs + tres primeiros caractares do CONTAINER ID (listado no comando acima)
  
  sudo docker start + tres primeiros caractares do CONTAINER ID

* para parar a execução

  sudo docker stop + tres primeiros caractares do CONTAINER ID

### URL para teste

http://<ip_do_servidor>/endereco/<cep_desejado>
  
* substituir o <ip_do_servidor> pelo endereço IP do servidor onde o serviço foi iniciado
* substituir o <cep_desejado> pelo CEP desejado
