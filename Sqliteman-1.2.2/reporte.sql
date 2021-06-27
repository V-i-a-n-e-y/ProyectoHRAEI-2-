select * from posgrado; 
select  T1.Institucion, T2.Servicio, T2.Alumnos  from posgrado AS T1 inner Join servicios AS T2 on T1.Institucion = T2.Institucion;
select * from servicios;
select * from servicios1;
select  T1.Institucion, T2.Servicio, T2.Alumnos  from licenciatura AS T1 inner Join servicios1 AS T2 on T1.Institucion = T2.Institucion where T1.Institucion = "uaem";
select * from posgrado;
select Max(folio) from licenciatura;
select * from licenciatura;
select * from Licenciatura;
select * from persona;
select Max(id) from persona;
select id, primer_nombre, user, pass from Persona where user="Admin";
select Max(codigopdf) from pdf;
select * from pdf;
DELETE FROM pdf WHERE codigopdf = 1;