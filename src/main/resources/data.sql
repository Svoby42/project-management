insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (1, 'Béda', 'Hudeček', 'hudecek@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (2, 'Jiří', 'Kroupa st.', 'vykuk@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (3, 'Viktor', 'Hujer', 'hujer@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (4, 'Leopold', 'Brašnář', 'brasnar@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (5, 'František', 'Koudelka', 'stschvojkovicebrod@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (6, 'Lumír', 'Práskal', 'telprestavky@ct.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (7, 'Josef', 'Šumfrle', 'sumfrle@seznam.cz');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (8, 'Josef', 'Prokouk', 'prokouk@gmail.com');
insert into zamestnanec (zamestnanec_id, jmeno, prijmeni, email) values (9, 'Franta', 'Jouda', 'jouda@yahoo.com');

insert into projekt (projekt_id, nazev, stav, popis) values (1000, 'Šití bot do rakve', 'Nezahájen', 'Šití bot do rakve horkou jehlou');
insert into projekt (projekt_id, nazev, stav, popis) values (1001, 'Televizní přestávky', 'Nezahájen', 'Návrh televizních přestávek');
insert into projekt (projekt_id, nazev, stav, popis) values (1002, 'Správa hřbitova', 'Nezahájen', 'Správa hřbitova, zodpovídání dotazů pozůstalých');
insert into projekt (projekt_id, nazev, stav, popis) values (1003, 'Shánění kamaráda', 'Nezahájen', 'Nějaký Jouda tady někoho shánel');
insert into projekt (projekt_id, nazev, stav, popis) values (1004, 'Podlézání vedoucím', 'Nezahájen', 'Úkol: podlézat vedoucím za jakoukoli cenu');
insert into projekt (projekt_id, nazev, stav, popis) values (1005, 'Studování večerní školy', 'Nezahájen', 'Vystudovat večerní průmyslovou školu');
insert into projekt (projekt_id, nazev, stav, popis) values (1006, 'Vykradení spořitelny', 'Nezahájen', 'Vykrást spořitelnu');
insert into projekt (projekt_id, nazev, stav, popis) values (1007, 'Kondiciogram', 'Nezahájen', 'Pořídit si kondiciogram od Výpočetního střediska Jih');

insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (4, 1000);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (6, 1001);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (8, 1002);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (9, 1003);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (3, 1004);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (2, 1005);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (3, 1005);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (7, 1006);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (1, 1007);
insert into projekt_zamestnanec (zamestnanec_id, projekt_id) values (5, 1007);
