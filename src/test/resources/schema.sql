CREATE SEQUENCE IF NOT EXISTS zamestnanec_seq;

CREATE TABLE IF NOT EXISTS zamestnanec(

    zamestnanec_id BIGINT NOT NULL DEFAULT nextval('zamestnanec_seq') PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    jmeno VARCHAR(100) NOT NULL,
    prijmeni VARCHAR(100) NOT NULL

);

CREATE SEQUENCE IF NOT EXISTS projekt_seq;

CREATE TABLE IF NOT EXISTS projekt(

    projekt_id BIGINT NOT NULL DEFAULT nextval('projekt_seq') PRIMARY KEY,
    nazev VARCHAR(100) NOT NULL,
    stav VARCHAR(100) NOT NULL,
    popis VARCHAR(500) NOT NULL

);

CREATE TABLE IF NOT EXISTS projekt_zamestnanec(

    projekt_id BIGINT REFERENCES projekt,
    zamestnanec_id BIGINT REFERENCES zamestnanec

);