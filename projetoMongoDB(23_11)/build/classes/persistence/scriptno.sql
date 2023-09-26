#windows (c:/data/db) mkdir c:/data/db (É o lugar que eu gravo o meu banco)
# /data/db
#--------MongoDB (CRUD é rapido e facil), permissão(segurança)
#------------------


#start no mongo

terminal

sudo mongod (start no server) (porta27017)

terminal 2 #####################POSSUI SINAL DE MAIOR
sudo mongo (Entra no mongo)

 #################
 (Já cria e entra)
 
 use bdmongo;
 ###
 db
 ###
 db.aluno.drop();
 db.aluno.insertMany([
 {
 "codigo":1,
 "nome":"lu",
"email":"lu@gmail.com",
"sexo":"f",
"salario":12000
 },
{"codigo":2,
 "nome":"bruno",
"email":"bruno@gmail.com",
"sexo":"m",
"salario":800
},
{"codigo":3,
"nome":"surfista",
"email":"surfista@gmail.com",
"sexo":"m",
"salario":2000
} 
]);

#remover especifico 
 db.aluno.remove({codigo :3});
#remover tudo
 db.aluno.remove({});

db.aluno.find().pretty();

var consulta=db.aluno.find();
 while(consulta.hasNext()){
var posicao = consulta.next();
printjson(posicao.nome +", " +posicao.email);
}

db.aluno.insertOne({
"codigo":4,
"nome":"blake",
"email":"blake@gmail.com",
"sexo":"m"
})

1(aparecer e 0 não aparecer)
db.aluno.find({}, {nome:1, _id:0, codigo:1});

db.getCollectionNames();
  #Nomes das colecoes ... COLECAO É TABELA
db;

======================
TUDO QUE SE REPETE DA PARA SE AGRUPAR
db.aluno.group({
key: {'sexo':1},
reduce: function(registro, chave){
  chave.total += registro.salario;
},
 initial : { total:0 }
});

###select sexo, sum(salario) from aluno where group by (sexo); mysql

==========

db.aluno.find(
{nome:"lu"});
==========
db.aluno.update({nome:"lu"},
{$set : {salario:15000}},
{multi : true}
);

==================