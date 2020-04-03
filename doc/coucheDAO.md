## Couche DAO

La couche dao est une couche technique qui repr�sente la couche d'acc�s aux donn�es de l'application
- Si les donn�es sont stock�es dans une base de donn�es de type **SGBD** Relationnelle, cette couche utilise un FrameWork de **Mapping Object Relationnel (ORM)** impl�mentant la sp�cification **JPA** comme **Hibernate**, **TopLink**, etc ...

- Si les donn�es sont stock�es sur une base de type document noSQL ( mongoDB) , il faudra utilis� des FrameWork de **Mapping Objet Document** ou utiliser Spring Data pour mongoDB. 