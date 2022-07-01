--
-- PostgreSQL database dump
--

-- Dumped from database version 14.4
-- Dumped by pg_dump version 14.2

-- Started on 2022-06-30 20:58:48

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 16427)
-- Name: curso; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.curso (
    id_curso integer NOT NULL,
    nombre character varying(45),
    docente character varying(45),
    facultad character varying(45),
    escuela character varying(45),
    plan character varying(45),
    periodo_academico character varying(45),
    fecha_inicio timestamp without time zone,
    fecha_fin timestamp without time zone,
    cantidad_semanas integer,
    ciclo integer,
    tipo character varying(45),
    creditos integer,
    id_programacion integer,
    trial441 character(1),
    trial824 character(1)
);


ALTER TABLE public.curso OWNER TO postgres;

--
-- TOC entry 3320 (class 0 OID 0)
-- Dependencies: 209
-- Name: TABLE curso; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.curso IS 'TRIAL';


--
-- TOC entry 3321 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.id_curso; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.id_curso IS 'TRIAL';


--
-- TOC entry 3322 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.nombre; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.nombre IS 'TRIAL';


--
-- TOC entry 3323 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.docente; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.docente IS 'TRIAL';


--
-- TOC entry 3324 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.facultad; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.facultad IS 'TRIAL';


--
-- TOC entry 3325 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.escuela; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.escuela IS 'TRIAL';


--
-- TOC entry 3326 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.plan; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.plan IS 'TRIAL';


--
-- TOC entry 3327 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.periodo_academico; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.periodo_academico IS 'TRIAL';


--
-- TOC entry 3328 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.fecha_inicio; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.fecha_inicio IS 'TRIAL';


--
-- TOC entry 3329 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.fecha_fin; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.fecha_fin IS 'TRIAL';


--
-- TOC entry 3330 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.cantidad_semanas; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.cantidad_semanas IS 'TRIAL';


--
-- TOC entry 3331 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.ciclo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.ciclo IS 'TRIAL';


--
-- TOC entry 3332 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.tipo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.tipo IS 'TRIAL';


--
-- TOC entry 3333 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.creditos; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.creditos IS 'TRIAL';


--
-- TOC entry 3334 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.id_programacion; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.id_programacion IS 'TRIAL';


--
-- TOC entry 3335 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.trial441; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.trial441 IS 'TRIAL';


--
-- TOC entry 3336 (class 0 OID 0)
-- Dependencies: 209
-- Name: COLUMN curso.trial824; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.curso.trial824 IS 'TRIAL';


--
-- TOC entry 211 (class 1259 OID 16433)
-- Name: estudiante; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estudiante (
    id_estudiante integer NOT NULL,
    nombre_apellido character varying(45),
    email character varying(45),
    "contraseña" character varying(45),
    facultad character varying(45),
    escuela character varying(45),
    plan character varying(45),
    trial824 character(1)
);


ALTER TABLE public.estudiante OWNER TO postgres;

--
-- TOC entry 3337 (class 0 OID 0)
-- Dependencies: 211
-- Name: TABLE estudiante; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.estudiante IS 'TRIAL';


--
-- TOC entry 3338 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante.id_estudiante; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante.id_estudiante IS 'TRIAL';


--
-- TOC entry 3339 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante.nombre_apellido; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante.nombre_apellido IS 'TRIAL';


--
-- TOC entry 3340 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante.email; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante.email IS 'TRIAL';


--
-- TOC entry 3341 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante."contraseña"; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante."contraseña" IS 'TRIAL';


--
-- TOC entry 3342 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante.facultad; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante.facultad IS 'TRIAL';


--
-- TOC entry 3343 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante.escuela; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante.escuela IS 'TRIAL';


--
-- TOC entry 3344 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante.plan; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante.plan IS 'TRIAL';


--
-- TOC entry 3345 (class 0 OID 0)
-- Dependencies: 211
-- Name: COLUMN estudiante.trial824; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.estudiante.trial824 IS 'TRIAL';


--
-- TOC entry 210 (class 1259 OID 16432)
-- Name: estudiante_id_estudiante_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.estudiante_id_estudiante_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.estudiante_id_estudiante_seq OWNER TO postgres;

--
-- TOC entry 3346 (class 0 OID 0)
-- Dependencies: 210
-- Name: estudiante_id_estudiante_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.estudiante_id_estudiante_seq OWNED BY public.estudiante.id_estudiante;


--
-- TOC entry 3168 (class 2604 OID 16436)
-- Name: estudiante id_estudiante; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estudiante ALTER COLUMN id_estudiante SET DEFAULT nextval('public.estudiante_id_estudiante_seq'::regclass);


--
-- TOC entry 3312 (class 0 OID 16427)
-- Dependencies: 209
-- Data for Name: curso; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.curso (id_curso, nombre, docente, facultad, escuela, plan, periodo_academico, fecha_inicio, fecha_fin, cantidad_semanas, ciclo, tipo, creditos, id_programacion, trial441, trial824) FROM stdin;
2	ALGORÍTMICA I	Mota Alva, Lazaro Florian	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	3	O	4	\N	T	T
3	ESTADÍSTICA	Depaz Apestegui, Rosario	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	3	O	3	\N	T	T
4	FÍSICA ELECTRÓNICA	Mejía Santillán, Mirian Esther	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	3	O	3	\N	T	T
5	INGENIERÍA ECONÓMICA	Reátegui Sánchez, Lleyni	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	3	O	3	\N	T	T
6	INTRODUCCIÓN AL DESARROLLO DE SOFTWARE	Romero Naupari, Pablo Jesus	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	3	O	3	\N	T	T
7	MATEMÁTICA BÁSICA	Chavez Machado, Elfren	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	3	O	4	\N	T	T
8	ORGANIZACIÓN Y ADMINISTRACIÓN	Chavez Herrera, Carlos Ernesto	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	3	O	3	\N	T	T
9	REDACCIÓN Y TÉCNICAS COMUNICACIÓN EFECTIVA II	Mamani Quispe, Luis Alberto	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	2	O	3	\N	T	T
10	ANÁLISIS Y DISEÑO DE ALGORITMOS	Prudencio Vidal, Javier Antonio	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	3	\N	T	T
11	CALIDAD DE SOFTWARE	Bartra More, Arturo Alejandro	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	3	\N	T	T
12	ARQUITECTURA DE COMPUTADORAS	Fermin Perez, Felix Armando	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	3	\N	T	T
13	ECONOMÍA PARA LA GESTIÓN	Pinglo Ramirez, Miguel Ángel	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	3	\N	T	T
14	INGENIERÍA DE REQUISITOS	Prudencio Vidal, Javier Antonio	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	4	\N	T	T
15	GESTIÓN DE LA CONFIGRACIÓN	Rodriguez Rodriguez, Ciro	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	6	O	3	\N	T	T
16	ESTRUCTURA DE DATOS	Salinas Azaña, Gilberto Aníbal	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	4	\N	T	T
17	GARANTÍA DE SOFTWARE	Collantes Inga, Zoila Mercedes	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	9	O	3	\N	T	T
18	GERENCIA DE TECNOLOGÍA DE LA INFORMACIÓN	Machado Vicente, Joel Fernando	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	9	O	3	\N	T	T
19	GESTIÓN DE MANTENIMIENTO DEL SOFTWARE	Inga López, Wilder Alex	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	9	O	3	\N	T	T
20	GESTIÓN DE RIESGO DEL SOFTWARE	Machado Vicente, Joel Fernando	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	9	O	3	\N	T	T
21	INTERNET DE LAS COSAS	Limachi Cartolin, Yury	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	9	O	3	\N	T	T
22	TALLER DE CONSTRUCCIÓN DE SOFTWARE MÓVIL	Petrlik Azabache, Ivan Carlo	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	9	O	3	\N	T	T
23	SOFTWARE INTELIGENTE	Calderon Vilca, Hugo David	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	9	O	3	\N	T	T
24	AUTOMATIZACIÓN Y CONTROL DE SOFTWARE	Vasquez Reyes, Eduardo Angel	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	3	\N	T	T
25	INTELIGENCIA DE NEGOCIOS	Cancho Rodriguez, Ernesto David	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	3	\N	T	T
26	METODOLOGÍA DELA INVESTIGACIÓN	Wong Portillo, Lenis Rossi	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	2	\N	T	T
27	MINERÍA DE DATOS	Calderón Vilca, Hugo David	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	3	\N	T	T
28	PROGRAMACIÓN CONCURRENTE Y PARALELA	Petrlik Azabache, Ivan Carlo	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	3	\N	T	T
29	SEGURIDAD DEL SOFTWARE	Collantes Inga, Zoila Mercedes	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	3	\N	T	T
30	TALLER DE CONSTRUCCIÓN DE SOFTWARE WEB	Alarcón Loayza, Luis Alberto	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	3	\N	T	T
31	VERIFICACIÓN Y VALIDACIÓN DE SOFTWARE	Inga López, Wilder Alex	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	8	O	3	\N	T	T
32	ARQUITECTURA DE SOFTWARE	Cordero Sánchez, Hugo Rafael	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	7	O	4	\N	T	T
33	BASE DE DATOS II	Gamarra Moreno, Juan	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	7	O	4	\N	T	T
34	EXPERIENCIA DE USUARIO Y USABILIDAD	Reyes Huamán, Anita Marlene	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	7	O	3	\N	T	T
35	GESTIÓN DE PROYECTO DE SOFTWARE	Bartra More, Arturo Alejandro	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	7	O	3	\N	T	T
36	INTELIGENCIA ARTIFICIAL	Gamarra Moreno, Juan	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	7	O	3	\N	T	T
37	MÉTODOS FORMALES PARA PRUEBAS	Bartra More, Arturo Alejandro	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	7	O	3	\N	T	T
38	REDES Y TRANSMISIÓN DE DATOS	Ugaz Cachay, Winston Ignacio	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	7	O	3	\N	T	T
39	ASEGURAMIENTO DE LA CALIDAD DEL SOFTWARE	Huapaya Chumpitaz, Mario Agustin	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	6	O	3	\N	T	T
40	BASE DE DATOS I	Murakami de la Cruz, Sumiko Elizabeth	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	6	O	4	\N	T	T
41	DISEÑO DE SOFTWARE	Menéndez Mueras, Rosa	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	6	O	4	\N	T	T
42	FORMACIÓN DE EMPRESAS DE SOFTWARE	Bayona Oré, Luz Sussy	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	6	O	3	\N	T	T
43	INTERACCIÓN HOMBRE COMPUTADOR	Moreno Sucre, Fanny Analy	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	6	O	3	\N	T	T
44	SISTEMAS OPERATIVOS	Vasquez Reyes, Eduardo Angel	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	6	O	3	\N	T	T
45	ANÁLISIS Y DISEÑO DE ALGORITMOS	Prudencio Vidal, Javier Antonio	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	3	\N	T	T
46	ARQUITECTURA DE COMPUTADORAS	Fermin Perez, Felix Armando	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	4	\N	T	T
47	CALIDAD DE SOFTWARE	Bartra More, Arturo Alejandro	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	4	\N	T	T
48	COMPUTACIÓN VISUAL	Trujillo Trejo, Ledgard	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	3	\N	T	T
49	ESTRUCTURA DE DATOS	Salinas, Azaña, Gilberto Aníbal	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	4	\N	T	T
50	ECONOMÍA PARA LA GESTIÓN	Pinglo Ramírez, Miguel Ángel	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	3	\N	T	T
51	INGENIERÍA DE REQUISITOS	Rodriguez Rodriguez, Ciro	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	5	O	4	\N	T	T
52	ALGORÍTMICA II	Zavaleta Campos, Jorge Luis	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	4	O	4	\N	T	T
53	CONTABILIDAD PARA LA GESTIÓN	Mercado Philco Fausto Franklin	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	4	O	3	\N	T	T
54	INNOVACIÓN, TECNOLOGÍA Y EMPRENDIMIENTO	Bayona Oré, Luz Sussy	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	4	O	3	\N	T	T
55	MATEMÁTICA DISCRETA	Flores Lopez, Oscar Mauricio	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	4	O	3	\N	T	T
56	PROBABILIDADES	Huaroto Sumari, Justa Caridad	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	4	O	3	\N	T	T
57	PROCESOS DE SOFTWARE	Pantoja Collantes, Jorge Santiago	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	4	O	3	\N	T	T
58	SISTEMAS DIGITALES	Flores Lopez, Oscar Mauricio	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	4	O	3	\N	T	T
59	INVESTIGACIÓN FORMATIVA	Nuñez, Medrano, Elizabeth Jessica	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	2	O	3	\N	T	T
60	REALIDAD NACIONAL Y MUNDIAL	Valle Castro, Deissy Elizabeth	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	2	O	2	\N	T	T
61	CÁLCULO II	Zorrilla Masías, Henry	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	2	O	4	\N	T	T
62	FÍSICA I	Rocha Cabrera, Ronald David	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	2	O	4	\N	T	T
63	QUÍMICA GENERAL	Gómez Galvez, Susana Teresa	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	2	O	4	\N	T	T
64	INTRODUCCIÓN A LAS CIENCIAS E INGENIERÍAS	Villaverde Medrano, Hugo	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	2	O	2	\N	T	T
65	REDACCIÓN Y TÉCNICAS COMUNICACIÓN EFECTIVA I	Nuñez, Medrano, Elizabeth Jessica	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	1	O	3	\N	T	T
66	MÉTODOS DE ESTUDIOS UNIVERSITARIOS	Nuñez, Medrano, Elizabeth Jessica	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	1	O	2	\N	T	T
67	DESARROLLO PERSONAL Y LIDERAZGO	Chincaro Egusquiza, Lucy Cristina	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	1	O	2	\N	T	T
68	CÁLCULO I		Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	1	O	4	\N	T	T
69	BIOLOGÍA PARA CIENCIAS E INGENIERÍA	Arias Ramirez, Angela Renee	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	1	O	4	\N	T	T
70	ÁLGEBRA Y GEOMETRÍA ANALÍTICA	Bocanegra Rodriguez, Lito Edinson	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	1	O	4	\N	T	T
71	MEDIO AMBIENTE Y DESARROLLO SOSTENIBLE	Valle Castro, Deissy Elizabeth	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	2022-1	\N	\N	\N	1	O	3	\N	T	T
\.


--
-- TOC entry 3314 (class 0 OID 16433)
-- Dependencies: 211
-- Data for Name: estudiante; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.estudiante (id_estudiante, nombre_apellido, email, "contraseña", facultad, escuela, plan, trial824) FROM stdin;
1	Bianca Romero	bianca.romero@unmsm.edu.pe	123456	Ingeniería de Sistemas e Informática	Ingeniería de Software	2018	T
2	fadsf	addsfsd	134	Ciencias Físicas	Arte.	2015	T
3	Oscar Salazar	oscar.Salazar@unmsm.edu.pe	159	Ciencias Biológicas	Conservación y Restauración.	2015	T
4	Jose	jose.cesar@unmsm.edu.pe	123	Ciencias Biológicas	Bibliotecología y Ciencias de la Información.	2015	T
\.


--
-- TOC entry 3347 (class 0 OID 0)
-- Dependencies: 210
-- Name: estudiante_id_estudiante_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.estudiante_id_estudiante_seq', 4, true);


--
-- TOC entry 3170 (class 2606 OID 16431)
-- Name: curso pk_curso; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso
    ADD CONSTRAINT pk_curso PRIMARY KEY (id_curso);


--
-- TOC entry 3172 (class 2606 OID 16438)
-- Name: estudiante pk_estudiante; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estudiante
    ADD CONSTRAINT pk_estudiante PRIMARY KEY (id_estudiante);


-- Completed on 2022-06-30 20:58:48

--
-- PostgreSQL database dump complete
--

