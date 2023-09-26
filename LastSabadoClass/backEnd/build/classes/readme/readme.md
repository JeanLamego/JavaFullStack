Web-Content
pages
 sistema.jsp
 
 libs 40 jar
  application.xml
  web.xml
  
config
  main
  mysql_hibernate.cfg.xml
 
 entity
  Produto.java
 
 persistence
  HibernateUtil
  ProdutoDao.java
 
 controller
  ProdutoController
  CorsFilter(libera a rede) dontpad.com/cors
  
  ===========
  
  Banco de Dados
   persistence
   HibernateUtil
   Produto Dao
   
    -u root -p
   ===================
   use endofend;
   insert into produto (id,nome,preco,imagem) values (null, 'filme koringa', 20,'koringa');
   insert into produto (id,nome,preco,imagem) values (null, 'filme joker', 40,'Joker');
   insert into produto (id,nome,preco,imagem) values (null, 'filme benevola', 60,'malev');
   
   