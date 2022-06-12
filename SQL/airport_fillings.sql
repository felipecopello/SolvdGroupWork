USE airportlaba;

INSERT INTO Countries (name)
VALUES ("Argentina"),
("Japan"),
("Belarus"),
("Australia");

INSERT INTO Cities (name, country_id)
VALUES ("Rosario", (SELECT id FROM Countries WHERE name = "Argentina")),
("Cordoba", (SELECT id FROM Countries WHERE name = "Argentina")),
("Tokyo", (SELECT id FROM Countries WHERE name = "Japan")),
("Minsk", (SELECT id FROM Countries WHERE name = "Belarus")),
("Perth", (SELECT id FROM Countries WHERE name = "Australia")),
("Sidney", (SELECT id FROM Countries WHERE name = "Australia"));

INSERT INTO Airports (name, latitude, longitude, city_id)
VALUES ("Islas Malvinas", "-32.90", "-60.79", (SELECT id FROM Cities WHERE name = "Rosario")),
("Ambrosio Taravella", "-31.18", "-64.12", (SELECT id FROM Cities WHERE name = "Cordoba")),
("Haneda", "35.33", "139.46", (SELECT id FROM Cities WHERE name = "Tokyo")),
("Minsk International", "53.52", "28.01", (SELECT id FROM Cities WHERE name = "Minsk")),
("Perth Airport", "-31.56", "115.58", (SELECT id FROM Cities WHERE name = "Perth")),
("Sidney-Richland Airport", "-33.95", "151.18", (SELECT id FROM Cities WHERE name = "Sidney"));

INSERT INTO Airlines (name)
VALUES ("FlyBondi"),
("Jet Smart"),
("Air Europa"),
("Air France"),
("American Airlines"),
("Avianca"),
("British Airways"),
("Gol Linhas Aereas"),
("Copa Airlines"),
("Turkish Airlines");

INSERT INTO Passengers (name, age)
VALUES ("Mirta Delville", 56),
("Analia Perini", 34),
("Lula da Silva", 59),
("Martin Galperin", 45),
("Gokhan Tore", 19),
("Thomas Scamacca", 29),
("Tatiana Mitchell", 27),
("Cinthia Pardo", 50),
("Pablo Duran", 72),
("Carlos Borda", 34);


INSERT INTO Flights (id, departure_airport_id, arrival_airport_id, price_in_usd, airline_id)
VALUES (21435, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 211, (SELECT id FROM Airlines WHERE name = "FlyBondi")), 
(51916, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Haneda"), 1500, (SELECT id FROM Airlines WHERE name = "Avianca")),
(41257, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Haneda"), 1609, (SELECT id FROM Airlines WHERE name = "Air Europa")),
(61378, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Haneda"), 1500, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(14622, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 1655, (SELECT id FROM Airlines WHERE name = "Avianca")),
(39127, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 1807, (SELECT id FROM Airlines WHERE name = "British Airways")),
(31546, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 250, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(65263, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 1678, (SELECT id FROM Airlines WHERE name = "British Airways")),
(72149, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 1700, (SELECT id FROM Airlines WHERE name = "Air France")),
(98124, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 1400, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(95781, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 1650, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(17896, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Minsk International"), 950, (SELECT id FROM Airlines WHERE name = "Air Europa")),
(62187, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Minsk International"), 1058, (SELECT id FROM Airlines WHERE name = "British Airways")),
(15634, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 1470, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(53217, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 1100, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(49643, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Minsk International"), 800, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(97841, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Minsk International"), 950, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(37514, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Minsk International"), 850, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(46532, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 350, (SELECT id FROM Airlines WHERE name = "British Airways")),
(28751, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 550, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(26345, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 1251, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(99851, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 1530, (SELECT id FROM Airlines WHERE name = "Air France")),
(18645, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 1159, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(12636, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Haneda"), 750, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(36941, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 950, (SELECT id FROM Airlines WHERE name = "Avianca")),
(20741, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 1050, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(62462, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 1600, (SELECT id FROM Airlines WHERE name = "Air France")),
(46492, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Haneda"), 500, (SELECT id FROM Airlines WHERE name = "American Airlines")),
(01246, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Haneda"), 602, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(26643, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 119, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(85410, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 150, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(10009, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 229, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(60235, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 50, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(25646, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 2000, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(23058, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 2200, (SELECT id FROM Airlines WHERE name = "American Airlines")),
(26329, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 2504, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(23464, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Minsk International"), 750, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(62008, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Minsk International"), 950, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(49723, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 200, (SELECT id FROM Airlines WHERE name = "American Airlines"));


INSERT INTO Hired_Airlines (airport_id, airline_id)
VALUES ((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "FlyBondi")),
((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "Avianca")),
((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "Air Europa")),
((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "Jet Smart")),
((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "British Airways")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "Jet Smart")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "British Airways")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "Air France")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "FlyBondi")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "Air Europa")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "FlyBondi")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "Jet Smart")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "British Airways")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
((SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airlines WHERE name = "FlyBondi")),
((SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airlines WHERE name = "Air France")),
((SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
((SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airlines WHERE name = "Avianca")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "American Airlines")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "Air France")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "FlyBondi")),
((SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
((SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airlines WHERE name = "American Airlines")),
((SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
((SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airlines WHERE name = "FlyBondi"));

INSERT INTO Fly_Tickets (flight_id, passenger_id)
VALUES ((SELECT id FROM Flights WHERE price_in_usd = 211), (SELECT id FROM Passengers WHERE name = "Carlos Borda")),
((SELECT id FROM Flights WHERE price_in_usd = 1609), (SELECT id FROM Passengers WHERE name = "Analia Perini")),
((SELECT id FROM Flights WHERE price_in_usd = 1655), (SELECT id FROM Passengers WHERE name = "Tatiana Mitchell")),
((SELECT id FROM Flights WHERE price_in_usd = 1807), (SELECT id FROM Passengers WHERE name = "Martin Galperin")),
((SELECT id FROM Flights WHERE price_in_usd = 1678), (SELECT id FROM Passengers WHERE name = "Mirta Delville")),
((SELECT id FROM Flights WHERE price_in_usd = 1058), (SELECT id FROM Passengers WHERE name = "Analia Perini")),
((SELECT id FROM Flights WHERE price_in_usd = 1470), (SELECT id FROM Passengers WHERE name = "Lula da Silva")),
((SELECT id FROM Flights WHERE price_in_usd = 1251), (SELECT id FROM Passengers WHERE name = "Martin Galperin")),
((SELECT id FROM Flights WHERE price_in_usd = 1530), (SELECT id FROM Passengers WHERE name = "Gokhan Tore")),
((SELECT id FROM Flights WHERE price_in_usd = 1159), (SELECT id FROM Passengers WHERE name = "Thomas Scamacca")),
((SELECT id FROM Flights WHERE price_in_usd = 602), (SELECT id FROM Passengers WHERE name = "Tatiana Mitchell")),
((SELECT id FROM Flights WHERE price_in_usd = 119), (SELECT id FROM Passengers WHERE name = "Cinthia Pardo")),
((SELECT id FROM Flights WHERE price_in_usd = 229), (SELECT id FROM Passengers WHERE name = "Martin Galperin")),
((SELECT id FROM Flights WHERE price_in_usd = 2504), (SELECT id FROM Passengers WHERE name = "Thomas Scamacca"));