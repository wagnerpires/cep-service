# cep-service

Serviço de busca de cep (backend)

## INSTRUÇÕES PARA EXECUÇÃO PADRÃO

$ mvn clean install

$ java -jar ./target/cepservice-wrtecnologia-0.0.1-SNAPSHOT.jar

### URL para teste
http://localhost:8080/endereco/72870237 (qualquer cep pode ser passado)

### Swagger UI (API Documentation)
http://localhost:8080/swagger-ui/index.html


## INSTRUÇÕES DE EXECUÇÃO VIA IMAGEM DOCKER

### Baixar a imagem do DockerHub
$ sudo docker pull wagnerpires/cepservice-wrtecnologia:v2

### Execução

* na primeira execução (criação do container)

  $ sudo docker run -p 80:8080 --name cepservice-wrtecnologia wagnerpires/cepservice-wrtecnologia:v2

* a partir da primeira execução

  $ sudo docker ps -a

  $ sudo docker logs + três primeiros caractares do CONTAINER ID (listado no comando acima)
  
  $ sudo docker start + três primeiros caractares do CONTAINER ID

* para parar a execução

  $ sudo docker stop + três primeiros caractares do CONTAINER ID

### URL para teste

http://<ip_do_servidor>/endereco/<cep_desejado>
  
* substituir o <ip_do_servidor> pelo endereço IP do servidor onde o serviço foi iniciado
* substituir o <cep_desejado> pelo CEP desejado

### Swagger UI (API Documentation)

http://<ip_do_servidor>/swagger-ui/index.html
