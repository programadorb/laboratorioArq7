connect 'jdbc:derby://localhost:1530/laboratorio7;user=root;password=root;create=true;';
create table clima(
    id int PRIMARY KEY  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
    gradosCentigrados varchar(128), 
    gradosFarenheit varchar(128), 
    humedadRelativa varchar(32), 
    tipoNubosidad varchar(32), 
    ciudad varchar(256), 
    dia bigint, 
    mes bigint, 
    probabilidadPrecipitaciones varchar(3)
);

insert into clima (gradosCentigrados,gradosFarenheit,humedadRelativa,tipoNubosidad,ciudad,dia,mes,probabilidadPrecipitaciones) values ('10','26','10','alta','medellin',1,1,'0.5');