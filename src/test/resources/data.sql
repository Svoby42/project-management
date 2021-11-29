insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Béda', 'Hudeček', 'hudecek@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Jiří', 'Kroupa st.', 'vykuk@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Viktor', 'Hujer', 'hujer@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Leopold', 'Brašnář', 'brasnar@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'František', 'Koudelka', 'stschvojkovicebrod@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Lumír', 'Práskal', 'telprestavky@ct.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Josef', 'Šumfrle', 'sumfrle@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Josef', 'Prokouk', 'prokouk@gmail.com');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (nextval('zamestnanec_seq'), 'Franta', 'Jouda', 'jouda@yahoo.com');

insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Šití bot do rakve', 'Nezahájen', 'Šití bot do rakve horkou jehlou');
insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Televizní přestávky', 'Nezahájen', 'Návrh televizních přestávek');
insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Správa hřbitova', 'Nezahájen', 'Správa hřbitova, zodpovídání dotazů pozůstalých');
insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Shánění kamaráda', 'Nezahájen', 'Nějaký Jouda tady někoho shánel');
insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Podlézání vedoucím', 'Nezahájen', 'Úkol: podlézat vedoucím za jakoukoli cenu');
insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Studování večerní školy', 'Nezahájen', 'Vystudovat večerní průmyslovou školu');
insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Vykradení spořitelny', 'Nezahájen', 'Vykrást spořitelnu');
insert into projekt (projekt_id, nazev, stav, popis) values (nextval('projekt_seq'), 'Kondiciogram', 'Nezahájen', 'Pořídit si kondiciogram od Výpočetního střediska Jih');


insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Šumfrle' AND p.nazev='Vykradení spořitelny');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Hujer' AND p.nazev='Studování večerní školy');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Kroupa st.' AND p.nazev='Studování večerní školy');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Prokouk' AND p.nazev='Správa hřbitova');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Jouda' AND p.nazev='Shánění kamaráda');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Hujer' AND p.nazev='Podlézání vedoucím');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Práskal' AND p.nazev='Televizní přestávky');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Brašnář' AND p.nazev='Šití bot do rakve');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Koudelka' AND p.nazev='Kondiciogram');
insert into projekt_zamestnanec(zamestnanec_id, projekt_id) (select z.zamestnanec_id, p.projekt_id from zamestnanec z, projekt p where z.prijmeni='Hudeček' AND p.nazev='Kondiciogram');

