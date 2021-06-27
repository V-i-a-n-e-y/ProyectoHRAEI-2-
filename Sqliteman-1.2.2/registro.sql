PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
ANALYZE sqlite_master;
CREATE TABLE pdf (
    "id_documento" PK INTEGER NOT NULL,
    "folio" INTEGER
, "ruta_docum" BLOB, "ruta_cartsol" BLOB, "ruta_cartacep" BLOB);
CREATE TABLE "institucion" (
    "id_institucion" INTEGER PRIMARY KEY AUTOINCREMENT,
    "nom_inst" TEXT
);
INSERT INTO "institucion" VALUES(2,'ETAC');
INSERT INTO "institucion" VALUES(3,'UAEM');
INSERT INTO "institucion" VALUES(4,'UAEH');
INSERT INTO "institucion" VALUES(5,'FES Zaragoza');
CREATE TABLE "tutor" (
    "id_tutor" INTEGER PRIMARY KEY AUTOINCREMENT,
    "nom_tutor" TEXT,
    "correo" TEXT,
    "lada" INTEGER,
    "tel" INTEGER
);
INSERT INTO "tutor" VALUES(1,'Elsa Guzman LÃ³pez','elsa_tutora.gmail.com',55,56874125);
INSERT INTO "tutor" VALUES(2,'Ana Maria Regil Estrada','ana.tutora@gmail.com',55,56740213);
INSERT INTO "tutor" VALUES(3,'Gabriela Mendez lira','tutora-gabriela@hotmail.com',55,2457391);
INSERT INTO "tutor" VALUES(4,'Monica Astrid Castillo Dominguez','moni-tutora_fes@hotmail.com',55,78481255);
INSERT INTO "tutor" VALUES(5,NULL,NULL,NULL,NULL);
INSERT INTO "tutor" VALUES(6,NULL,NULL,NULL,NULL);
INSERT INTO "tutor" VALUES(7,NULL,NULL,NULL,NULL);
INSERT INTO "tutor" VALUES(8,NULL,NULL,NULL,NULL);
INSERT INTO "tutor" VALUES(9,NULL,NULL,NULL,NULL);
INSERT INTO "tutor" VALUES(10,NULL,NULL,NULL,NULL);
INSERT INTO "tutor" VALUES(11,NULL,NULL,NULL,NULL);
INSERT INTO "tutor" VALUES(12,NULL,NULL,NULL,NULL);
CREATE TABLE "licenciatura" (
    "folio" INTEGER PRIMARY KEY AUTOINCREMENT,
    "grado" TEXT,
    "practica" TEXT,
    "fecha_inicio" INTEGER,
    "fecha_termino" INTEGER,
    "no_alumnos" INTEGER,
    "semestre" INTEGER,
    "turno" TEXT,
    "hora_entrada" INTEGER,
    "hora_salida" INTEGER,
    "id_institucion" INTEGER,
    "id_tutor" INTEGER,
    "id_usuario" INTEGER
);
INSERT INTO "licenciatura" VALUES(1,'licenciatura','Adulto mayor','20/02/2021','20/05/2021',15,6,'Matutino','7:00','14:00',2,15,1);
INSERT INTO "licenciatura" VALUES(2,'Posgrado','Enfermeria administrativa','21/02/2021','21/05/2021',10,9,'Vespertino','14:00','22:00', 2, 10,2);
INSERT INTO "licenciatura" VALUES(3,'Licenciatura','Enfermeria administrativa','21/02/2021','21/05/2021',12,9,'Matutino','7:00','14:00',3,12,3);
INSERT INTO "licenciatura" VALUES(4,'Posgrado','Enfermeri­a medico quirurgica','12/05/2021','12/07/2021',14,6,'Matutino','7:00','14:00',5,14,4);
CREATE TABLE "persona" (
    "id_usuario" INTEGER PRIMARY KEY AUTOINCREMENT,
    "nombres" TEXT,
    "primer_apellido" TEXT,
    "segundo_apellido" TEXT,
    "user" TEXT,
    "pass" TEXT
);
INSERT INTO "persona" VALUES(1,'Ana Laura','Mendoza','Peralta','anita','ani78Men.la');
INSERT INTO "persona" VALUES(2,'Ximena','Sanchez','Nava','ximenanava','xime45_23Sanchez');
CREATE TABLE "servicios1" (
    "id_servicio" INTEGER PRIMARY KEY AUTOINCREMENT,
    "folio" INTEGER,
    "nombre_servicio" TEXT,
    "num_alumno" INTEGER,
    "fecha_de_inicio" INTEGER,
    "fecha_de_termino" INTEGER
);
INSERT INTO "servicios1" VALUES(1,2,'Urgencias',3,'20/02/2021','02/04/2021');
INSERT INTO "servicios1" VALUES(2,2,'UTIP',5,'03/04/2021','20/05/2021');
INSERT INTO "servicios1" VALUES(3,2,'2 piso',4,'20/02/2021','20/03/2021');
INSERT INTO "servicios1" VALUES(4,2,'Tococirugia',3,'20/03/2021','20/05/2021');

INSERT INTO "servicios1" VALUES(5,3,'Piso3',2,'21/02/2021','21/04/2021');
INSERT INTO "servicios1" VALUES(6,3,'Epidemiologia',4,'21/02/2021','21/05/2021');
INSERT INTO "servicios1" VALUES(7,3,'Urgencias',2,'21/02/2021','21/5/2021');
INSERT INTO "servicios1" VALUES(8,3,'Tococirugia',2,'21/03/2021','21/05/2021');

INSERT INTO "servicios1" VALUES(9,4,'UTIP',5,'21/02/2021','21/05/2021');
INSERT INTO "servicios1" VALUES(10,4,'3 piso',3,'21/02/2021','21/03/2021');
INSERT INTO "servicios1" VALUES(11,4,'Tococirujia',3,'21/02/2021','21/4/2021');
INSERT INTO "servicios1" VALUES(12,4,'Urgencias',1,'21/02/2021','21/04/2021');

INSERT INTO "servicios1" VALUES(13,5,'Clinica de la mujer',4,'12/02/2021','12/07/2021');
INSERT INTO "servicios1" VALUES(14,5,'Hospitalización',4,'12/02/2021','12/03/2021');
INSERT INTO "servicios1" VALUES(15,5,'CEyE',3,'12/02/2021','12/04/2021');
INSERT INTO "servicios1" VALUES(16,5,'Clínica de heridas',3,'12/05/2021','12/07/2021');




insert into servicios1 ('folio', 'nombre_servicio') values (4,'3 piso')

delete from servicios1 where id_servicio=1;

DELETE FROM sqlite_sequence where name='servicios1';

DELETE FROM sqlite_sequence;
INSERT INTO "sqlite_sequence" VALUES('institucion',5);
INSERT INTO "sqlite_sequence" VALUES('tutor',12);
INSERT INTO "sqlite_sequence" VALUES('licenciatura',4);
INSERT INTO "sqlite_sequence" VALUES('persona',2);
INSERT INTO "sqlite_sequence" VALUES('servicios1',4);
COMMIT;

CREATE TABLE licenciatura ("folio" integer primary key autoincrement, "grado" text, "parctica" text, "fecha_inicio" integer, "fecha_termino" integer, "no_alumnos" integer, "semestre" integer, "turno" text, "hora_entrada" integer, "hora_salida" integer, "id_institucion" integer, "id_tutor" integer, "id_usuario" integer, foreign key(id_institucion) references institucion(id_institucion), foreign key(id_tutor) references tutor(id_tutor), foreign key(id_usuario) references persona(id_usuario))

CREATE TABLE pdf ("id_documento" PK INTEGER NOT NULL, "folio" INTEGER, "ruta_docum" BLOB, "ruta_cartsol" BLOB, "ruta_cartacep" BLOB, foreign key(folio) references licenciatura(folio))

CREATE TABLE "servicios1" ("id_servicio" INTEGER PRIMARY KEY AUTOINCREMENT, "folio" INTEGER, "nombre_servicio" TEXT, foreign key(folio) references licenciatura(folio))

select  practica as Campo_clínico, no_alumnos as numero_de_alumnos, nom_inst as institucion, nom_tutor, apellidoPaterno, apellidoMaterno, nombre_servicio from licenciatura inner join institucion on  institucion.id_institución = licenciatura.id_institucion inner join tutor on tutor.id_tutor= licenciatura.id_tutor inner join servicios1 on servicios1.folio = licenciatura.folio where institucion.nom_inst = "ETAC"

select ruta_docum as ruta_cartasol, ruta_cartacep, ruta_docum, ruta_docum as nom_inst, fecha_inicio, fecha_termino,turno from licenciatura inner join institucion on institucion.id_institución = licenciatura.id_institucion inner join pdf on pdf.folio = licenciatura.folio = 'UAEM'

select  nombre_servicio as  nombre_servicio, num_alumno, fecha_de_inicio as fecha_de_inicio, fecha_de_termino,  nom_inst  as institución from licenciatura inner join institucion on  institucion.id_institución = licenciatura.id_institucion inner join tutor on tutor.id_tutor= licenciatura.id_tutor inner join servicios1 on servicios1.folio = licenciatura.folio where institucion.nom_inst = "ETAC"


select nom_inst, nombre_servicio, num_alumnos as  fecha_inicio, fecha_termino  from servicios1 inner join institucion on  institucion.id_institución = servicios1.id_servicio inner join servicios1 on servicios1.folio = licenciatura.folio where institucion.nom_inst = "ETAC"

insert into persona  ('nombres', 'primer_apellido', 'segundo_apellido', 'user', 'pass') values  ('Luis'. 'Mendez', 'Rodriguez', 'luis', 'lu1223');

select id_usuario, nombres, user, pass from Persona where user=?;

select nombres, primer_apellido, segundo_apellido, user from persona;

select Max(id_institución) from institucion;

select id_usuario, nombres, user, pass from persona where user= ;

alter table persona rename COLUMN "user" to "usuario";

insert into persona ('id_usuario', 'usuario') values (1,'Luis');

delete from persona where usuario= 'Luis';

update persona set usuario = 'luis'  where id_usuario = 1;
update persona set usuario = 'Ana'  where id_usuario = 2;
update persona set usuario = 'Isa'  where id_usuario = 3;

select id_usuario, nombres, usuario, pass from Persona where usuario= ' ';


select id_usuario, nombres, pass, usuario from Persona  ;