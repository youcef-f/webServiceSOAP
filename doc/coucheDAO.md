## Couche DAO

La couche dao est une couche technique qui représente la couche d'accès aux données de l'application
- Si les données sont stockées dans une base de données de type **SGBD** Relationnelle, cette couche utilise un FrameWork de **Mapping Object Relationnel (ORM)** implémentant la spécification **JPA** comme **Hibernate**, **TopLink**, etc ...

- Si les données sont stockées sur une base de type document noSQL ( mongoDB) , il faudra utilisé des FrameWork de **Mapping Objet Document** ou utiliser Spring Data pour mongoDB. 