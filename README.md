LP3A5

Repositório com os códigos de exercícios e trabalho final de 
disciplina LP3A5

# Trabalho Final

Foi criado um projeto, Mars (por uma piada com o sistema do trabalho,\
que se chama Vênus), com o framework Spring Boot para facilitar a criação\
de interfaces da aplicação.
As seguintes funcionalidades forma implementadas:
* Controle de transações, mantendo-se um histórico das transações cadastradas;
* Controle de categorias, que podem ser associadas à transações.
* Controle de saldo, levando em conta as transações cadastradas.

Uma coleção de chamadas do postman esta sendo [incluída](https://www.getpostman.com/collections/067bed49775c1cfadac1)
para testes da API,\
recomenda-se postar algumas categorias, de ínicio, em seguida algumas transações,\
que contenham a categoria retornada, apesar de isto não ser necessário.\
Em seguida, excutar um post no endpoint conta, que inicia a atualização assíncrona \
do saldo, e apenas em seguida consultar o saldo por meio do método get deste endpoint.