--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.3
-- Dumped by pg_dump version 9.6.3

-- Started on 2017-05-21 10:27:05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12387)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2135 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 186 (class 1259 OID 16403)
-- Name: szkolenia; Type: TABLE; Schema: public; Owner: patryk
--

CREATE TABLE szkolenia (
    id_szkolenia integer NOT NULL,
    tytul character varying(60) NOT NULL,
    start date NOT NULL,
    koniec date NOT NULL,
    miasto character varying(50) NOT NULL,
    id_trenera integer
);


ALTER TABLE szkolenia OWNER TO patryk;

--
-- TOC entry 185 (class 1259 OID 16395)
-- Name: trenerzy; Type: TABLE; Schema: public; Owner: patryk
--

CREATE TABLE trenerzy (
    id_trenera integer NOT NULL,
    imie character varying(30) NOT NULL,
    nazwisko character varying(40) NOT NULL,
    motto text,
    data_ur date
);


ALTER TABLE trenerzy OWNER TO patryk;

--
-- TOC entry 2128 (class 0 OID 16403)
-- Dependencies: 186
-- Data for Name: szkolenia; Type: TABLE DATA; Schema: public; Owner: patryk
--

COPY szkolenia (id_szkolenia, tytul, start, koniec, miasto, id_trenera) FROM stdin;
15	Bazy danych	2017-05-04	2017-05-09	Łódź	2
13	Programowanie w Javie	2017-04-20	2017-04-30	Gdańsk	1
16	Excel	2016-08-02	2016-08-14	Warszawa	2
\.


--
-- TOC entry 2127 (class 0 OID 16395)
-- Dependencies: 185
-- Data for Name: trenerzy; Type: TABLE DATA; Schema: public; Owner: patryk
--

COPY trenerzy (id_trenera, imie, nazwisko, motto, data_ur) FROM stdin;
1	Adam	Kowalski	\N	1981-12-13
2	Kasia	Bardzomądra	Znam się na tym i na tamtym.	\N
\.


--
-- TOC entry 2008 (class 2606 OID 16407)
-- Name: szkolenia szkolenia_pkey; Type: CONSTRAINT; Schema: public; Owner: patryk
--

ALTER TABLE ONLY szkolenia
    ADD CONSTRAINT szkolenia_pkey PRIMARY KEY (id_szkolenia);


--
-- TOC entry 2005 (class 2606 OID 16402)
-- Name: trenerzy trenerzy_pkey; Type: CONSTRAINT; Schema: public; Owner: patryk
--

ALTER TABLE ONLY trenerzy
    ADD CONSTRAINT trenerzy_pkey PRIMARY KEY (id_trenera);


--
-- TOC entry 2006 (class 1259 OID 16413)
-- Name: fki_szkolenia_fk_trenerzy; Type: INDEX; Schema: public; Owner: patryk
--

CREATE INDEX fki_szkolenia_fk_trenerzy ON szkolenia USING btree (id_trenera);


--
-- TOC entry 2009 (class 2606 OID 16408)
-- Name: szkolenia szkolenia_fk_trenerzy; Type: FK CONSTRAINT; Schema: public; Owner: patryk
--

ALTER TABLE ONLY szkolenia
    ADD CONSTRAINT szkolenia_fk_trenerzy FOREIGN KEY (id_trenera) REFERENCES trenerzy(id_trenera);


-- Completed on 2017-05-21 10:27:05

--
-- PostgreSQL database dump complete
--

