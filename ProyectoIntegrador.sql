CREATE DATABASE ProyectoIntegrador CHARACTER SET Latin1 COLLATE latin1_spanish_ci;
use ProyectoIntegrador;

create table users(
usr varchar(20),
nombre varchar (30),
apellido varchar (20),
email varchar (50),
pwd varchar (30),
Fecha_nac date,
FotoPerfil Blob,
descripcion varchar (200),
DeporteFav varchar(30),
valoraciones integer,
cod_recuperacion varchar(20),
rol varchar(20),
primary key (usr)
)engine = innodb;

create table foro(
cod_foro varchar (10),
primary key (cod_foro)
)engine = innodb;

create table Eventos(
Cod_Evento varchar(20),
fecha_creacion DATE,
fecha_evento Date,
Tipo_Dep varchar (30),
Descripcion varchar (50),
nombre_evento varchar(30),
usr varchar(20), 
privacidad varchar (30),
Localizacion varchar (60),
cod_foro varchar(20),
foreign key (cod_foro) references foro(cod_foro) on delete cascade on update cascade,
foreign key (usr) references users(usr) on delete cascade on update cascade,
primary key (Cod_Evento)
)engine = innodb;

create table participa_evento(
cod_user varchar(20),
Cod_Evento varchar(20),
foreign key (Cod_Evento) references Eventos(Cod_Evento) on delete cascade on update cascade,
foreign key (cod_user) references users(usr) on delete cascade on update cascade,
primary key (Cod_Evento, cod_user)
)engine = innodb;

create table valoracion_users(
cod_user varchar (20),
cod_companero varchar(20),
cod_evento varchar(20),
primary key (cod_user, cod_companero, cod_evento),
foreign key (cod_user) references users(usr) on delete cascade on update cascade,
foreign key (cod_companero) references users(usr) on delete cascade on update cascade,
foreign key (cod_evento) references eventos(cod_evento) on delete cascade on update cascade
)engine = innodb;

create table mensaje_foro(
cod_mensaje varchar (20),
cod_foro varchar (20),
cod_user varchar(20),
mensaje varchar(200),
fecha datetime,
primary key(cod_mensaje),
foreign key (cod_foro) references foro(cod_foro) on delete cascade on update cascade,
foreign key (cod_user) references users(usr) on delete cascade on update cascade
)engine = innodb;

-- users 
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('dglmn', 'Luis', 'Vallejo', 'mejorApp@SportChoice.com', 'dglmn', '2020-11-25', '', '', 0, 6969, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('adminAlvar', 'Alvaro', 'Rodriguez', 'admin-suport@SportChoice.com', 'admin123', '2020-11-25', '', '', 0, 666, 'admin');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('wsurgen0', 'Willdon', 'Surgen', 'wsurgen0@mit.edu', 'fJiZh3jwm', '2021-11-25', 'evolve B2B platforms', 'Baloncesto', 667, 5777, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('bmonroe1', 'Britney', 'Monroe', 'bmonroe1@scribd.com', '0cgNCr', '2021-07-17', 'innovate transparent portals', 'Baloncesto', 680, 5124, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('iruxton2', 'Ilyssa', 'Ruxton', 'iruxton2@ning.com', 'LhuzdW', '2022-03-05', 'leverage efficient vortals', 'Baloncesto', 87, 9831, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('mdixcee3', 'Mart', 'Dixcee', 'mdixcee3@themeforest.net', 'Um6z4GgCQki', '2022-01-06', 'incentivize turn-key models', 'Padel', 697, 9312, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('telcox4', 'Tatiania', 'Elcox', 'telcox4@barnesandnoble.com', 'yxyggRs0AMW', '2021-12-20', 'brand killer e-markets', 'Baloncesto', 405, 1967, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('dtattersall5', 'Deck', 'Tattersall', 'dtattersall5@indiegogo.com', 'vbYuZMtu3M3', '2021-08-14', 'drive enterprise e-markets', 'Baloncesto', 205, 912, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('askase6', 'Amelita', 'Skase', 'askase6@multiply.com', '31PM5sCMr9p', '2021-10-29', 'orchestrate plug-and-play content', 'Baloncesto', 83, 9268, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('pcattenach7', 'Paulita', 'Cattenach', 'pcattenach7@amazon.co.uk', 'IHBxpDNRxsw', '2022-03-14', 'synergize vertical paradigms', 'Baloncesto', 194, 1350, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('sscanlon8', 'Sinclare', 'Scanlon', 'sscanlon8@addthis.com', 'pZSGZZYSD', '2021-12-04', 'iterate mission-critical supply-chains', 'Baloncesto', 371, 7709, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('mstudholme9', 'Mirilla', 'Studholme', 'mstudholme9@desdev.cn', 'N1gIdLpSFXw', '2021-11-17', 'synergize compelling users', 'Baloncesto', 71, 7325, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('cwingfielda', 'Christoforo', 'Wingfield', 'cwingfielda@smh.com.au', 'C6zOAgFV5Htn', '2022-01-23', 'extend e-business technologies', 'Baloncesto', 802, 7325, 'user');
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac, descripcion, DeporteFav, Valoraciones, cod_recuperacion, rol) values ('lpiccardb', 'Lorri', 'Piccard', 'lpiccardb@shop-pro.jp', 'ZU5R9t', '2021-10-31', 'empower visionary bandwidth', 'Baloncesto', 926, 1216, 'user');

-- foro
insert into foro (cod_foro) values (1394);
insert into foro (cod_foro) values (5613);
insert into foro (cod_foro) values (9000);
insert into foro (cod_foro) values (8384);
insert into foro (cod_foro) values (4571);
insert into foro (cod_foro) values (5289);
insert into foro (cod_foro) values (4264);
insert into foro (cod_foro) values (5298);
insert into foro (cod_foro) values (6206);
insert into foro (cod_foro) values (3922);
insert into foro (cod_foro) values (4964);
insert into foro (cod_foro) values (8478);

-- Evento
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e12353', '2021-08-26', '2022-01-31', 'Tenis', 'Synchronised needs-based budgetary management', 'slanglois0', 'wsurgen0', 'Publico', '66 Kedzie Court', 1394);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e17063', '2022-04-18', '2021-10-21', 'Tenis', 'Programmable composite concept', 'oroose1', 'bmonroe1', 'Publico', '14 Pennsylvania Hill', 5613);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e16048', '2021-08-03', '2021-07-30', 'Futbol', 'Virtual heuristic product', 'kmarkushkin2', 'iruxton2', 'Publico', '7 West Road', 9000);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e18979', '2021-05-23', '2022-08-30', 'Baloncesto', 'Re-engineered tangible leverage', 'acrossland3', 'mdixcee3', 'Publico', '14035 Weeping Birch Terrace', 8384);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e14244', '2021-08-15', '2023-06-20', 'Tenis', 'Polarised zero tolerance array', 'omolan4', 'dtattersall5', 'Publico', '4 Quincy Junction', 4571);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e10111', '2022-01-16', '2023-04-17', 'Tenis', 'Enterprise-wide tertiary approach', 'rmcgennis5', 'askase6', 'Publico', '640 Algoma Circle', 5289);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e11586', '2021-08-24', '2021-09-29', 'Tenis', 'Team-oriented optimal knowledge user', 'cmartins6', 'pcattenach7', 'Privado', '322 East Terrace', 4264);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e18274', '2022-03-11', '2022-12-05', 'Futbol', 'Reverse-engineered background complexity', 'ogillum7', 'sscanlon8', 'Publico', '59 Pennsylvania Center', 5298);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e16237', '2022-02-19', '2021-11-14', 'Tenis', 'Enhanced context-sensitive Graphic Interface', 'nwolters8', 'mstudholme9', 'Publico', '4780 Petterle Trail', 6206);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e18851', '2022-03-06', '2022-09-18', 'Futbol', 'Fully-configurable dedicated functionalities', 'wstoade9', 'cwingfielda', 'Privado', '2539 Bartelt Court', 3922);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e12606', '2021-08-28', '2022-08-30', 'Tenis', 'Cloned systemic ability', 'cpethybridgea', 'lpiccardb', 'Privado', '74258 Sutherland Hill', 4964);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e12607', '2021-08-01', '2022-09-07', 'Tenis', 'Right-sized optimizing synergy', 'wputtergillb', 'telcox4', 'Publico', '8 4th Place', null);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e12699', '2021-08-01', '2022-11-17', 'Baloncesto', 'Cloned dedicated functionalities', 'wputtergillb', 'dglmn', 'Publico', '74258 Sutherland Place', null);
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion, cod_foro) values ('e17627', '2021-08-01', '2022-7-17', 'Baloncesto', 'Team-oriented optimal knowledge Interface', 'wputtergillb', 'dglmn', 'Publico', '74258 Sutherland Place', null);
 
-- participa_evento
insert into participa_evento (cod_user, Cod_Evento) values ('wsurgen0', 'e12353');
insert into participa_evento (cod_user, Cod_Evento) values ('bmonroe1', 'e17063');
insert into participa_evento (cod_user, Cod_Evento) values ('iruxton2', 'e16048');
insert into participa_evento (cod_user, Cod_Evento) values ('mdixcee3', 'e18979');
insert into participa_evento (cod_user, Cod_Evento) values ('dtattersall5', 'e14244');
insert into participa_evento (cod_user, Cod_Evento) values ('askase6', 'e10111');
insert into participa_evento (cod_user, Cod_Evento) values ('pcattenach7', 'e11586');
insert into participa_evento (cod_user, Cod_Evento) values ('sscanlon8', 'e18274');
insert into participa_evento (cod_user, Cod_Evento) values ('mstudholme9', 'e16237');
insert into participa_evento (cod_user, Cod_Evento) values ('cwingfielda', 'e18851');
insert into participa_evento (cod_user, Cod_Evento) values ('lpiccardb', 'e12606');
insert into participa_evento (cod_user, Cod_Evento) values ('telcox4', 'e17627');
insert into participa_evento (cod_user, Cod_Evento) values ('lpiccardb', 'e17627');
insert into participa_evento (cod_user, Cod_Evento) values ('cwingfielda', 'e17627');
insert into participa_evento (cod_user, Cod_Evento) values ('dglmn', 'e17627');
insert into participa_evento (cod_user, Cod_Evento) values ('dglmn', 'e12699');
insert into participa_evento (cod_user, Cod_Evento) values ('dglmn', 'e12607');

-- valoracion
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('wsurgen0', 'lpiccardb', 'e12353');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('bmonroe1', 'cwingfielda', 'e17063');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('iruxton2', 'mstudholme9', 'e16048');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('mdixcee3', 'sscanlon8', 'e18979');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('telcox4', 'pcattenach7', 'e14244');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('dtattersall5', 'askase6', 'e10111');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('askase6', 'dtattersall5', 'e11586');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('pcattenach7', 'telcox4', 'e18274');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('sscanlon8', 'mdixcee3', 'e16237');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('mstudholme9', 'iruxton2', 'e18851');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('cwingfielda', 'bmonroe1', 'e12606');
insert into valoracion_users (cod_user, cod_companero, cod_evento) values ('lpiccardb', 'wsurgen0', 'e17627');

-- mensaje
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m5241', 1394, 'wsurgen0', 'Optimizedsystemiccapability', '2021-07-24');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m5324', 5613, 'bmonroe1', 'Front-line transitional capability', '2022-01-18');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m6497', 9000, 'iruxton2', 'Exclusive asynchronous function', '2022-03-30');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m6743', 8384, 'mdixcee3', 'Configurable modular algorithm', '2022-05-01');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m3224', 4571, 'dtattersall5', 'Multi-lateral eco-centric info-mediaries', '2021-10-26');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m4835', 5289, 'askase6', 'Operative zero administration website', '2021-08-09');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m7147', 4264, 'pcattenach7', 'Operative modular encryption', '2022-01-11');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m1547', 5298, 'sscanlon8', 'Multi-lateral uniform core', '2022-01-13');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m8428', 6206, 'mstudholme9', 'Face to face methodical core', '2022-03-04');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m7158', 3922, 'cwingfielda', 'Ameliorated mobile analyzer', '2022-05-01');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m1511', 4964, 'lpiccardb', 'Reactive zero administration time-frame', '2021-06-09');
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m2025', 8478, 'telcox4', 'Adaptive 24 hour orchestration', '2021-08-08');


/* -- QUERYS POR PANTALLA
-- Eventos Administrador 
select cod_evento as 'Evento actual', nombre_evento as 'Nombre evento', usr as Creador, fecha_evento as Fecha, tipo_dep as Deporte, (select count(*) as participantes from participa_evento where cod_evento = 'Evento actual' group by cod_evento) as participantes from eventos natural join participa_evento group by cod_evento order by fecha_evento desc;

-- Usuarios Administrador
select usr  as 'Usuario', nombre as 'Nombre', apellido  as 'Apellido', email  as 'E-mail', fecha_nac as 'Fecha nacimiento' from users where rol = 'user';

-- Inicio Sesion
select email, usr, pwd from users where (usr = 'usuario-conectado' || email = 'usuario-conectado@example.com') && pwd = 'password';

-- Registro & Confirmar Perfil
insert into users (usr, nombre, apellido, email, pwd, Fecha_nac) values ('usuario-conectado', 'Willdon', 'Surgen', 'usuario-conectado@example.com', 'password', '2021-11-25');

-- Confirma tu email
select email from users where email = 'usuario-conectado@example.com';

-- Recuperar pwd 
select cod_recuperacion from users where email = 'usuario-conectado@example.com';
UPDATE users SET pwd = 'nuevaPassword';

-- Perfil 
select nombre, usr, localizacion, sexo, deporteFav, fecha_nac, valoraciones, descripcion from registrados where usr = 'usuario-conectado'; 

-- Editar perfil 
	-- Si se ha cambiado la foto de perfil aplicariamos esta query: 
	Update users set nombre = 'usuario', apellido = 'apellidos', deporteFav = 'Futbol', localizacion = 'Madrid', sexo = 'Hombre', descripccion = 'Nueva descripccion...', FotoPerfil =  LOAD_FILE('data.png') where usr = 'usuario-conectado';
	-- Si no se ha cambiado la foto aplicariamos esta otra:
	Update users set nombre = 'usuario', apellido = 'apellidos', deporteFav = 'Futbol', localizacion = 'Madrid', sexo = 'Hombre', descripccion = 'Nueva descripccion...' where usr = 'usuario-conectado';

-- Cambiar pwd
select pwd from users where usr = 'usuario-conectado';
update users set pwd = 'passwordCambiada' where usr = 'usuario-conectado';

-- Historial
select eventos.nom_creador, fecha_evento, nombre_evento from eventos natural join participa_evento
where participa_evento.cod_user = 'usuario-conectado' && fecha_evento < current_date();
	-- para cada evento hay que hacer recuento de participantes
select count(*) from participa_evento where nom_evento = 'eventoEjemplo';

-- Valoraciones 
	-- Solo contemplanos una unica valoracion positiva
select * from valoracion_users where cod_user ='usuario-conectado' && cod_Evento = 'eventoEjemplo';
insert into valoracion_users values ('usuario-conectado', 'otro usuario',  'eventoEjemplo');
update registrados set valoraciones = valoraciones + 1 where cod_user ='otro usuario'; 

-- Main Page 
select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento',
(select count(*) from participa_evento natural join eventos where cod_evento = Evento group by cod_evento) as Participantes 
from eventos natural join participa_evento group by cod_evento order by fecha_evento desc;

-- Mis eventos 
select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento as 'Nombre evento', 
(select count(*) from participa_evento natural join eventos where cod_evento = Evento group by cod_evento) as participantes 
from eventos natural join participa_evento where participa_evento.cod_user = 'dglmn' && fecha_evento > current_date() group by cod_evento;

-- Crear evento
insert into Eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, nom_creador, privacidad, Localizacion, cod_foro) 
values ('e123993', current_date(), '2021-08-26',  'Tenis', 'Synchronised needs-based budgetary management', 'evento tenis amigos', 'wsurgen0', 'Publico', '66 Kedzie Court', 1394);

-- ver evento y unirse a evento
select fecha_evento,Tipo_Dep,Descripcion,nombre_evento,nom_creador,privacidad,Localizacion from eventos where cod_evento = 'e12353';
	-- hay que hacer recuento de participantes
select count(*) from participa_evento where cod_evento = 'e12353';

-- Modificar evento
update eventos set fecha_evento = '2022-05-17', Tipo_Dep = 'Futbol', Descripcion = 'nueva descripcion', Localizacion = 'madrid', nombre_evento = 'Partido colegas';

-- foro 
	-- Para mostrar los mensajes
select mensaje, fecha, cod_usuario from mensaje_foro where cod_Evento = 'e12353';
	-- Para escribir mensajes
insert into mensaje_foro (cod_mensaje, cod_foro, cod_user, mensaje, fecha) values ('m5241', 1394, 'wsurgen0', 'Optimizedsystemiccapability', current_date());
*/

delete from Eventos where Cod_Evento = 'e14244';
