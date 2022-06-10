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
("Sidney-Richland Airport", "-37.00", "174.47", (SELECT id FROM Cities WHERE name = "Sidney"));

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

INSERT INTO Flights (id, departure_airport_id, arrival_airport_id, hours_duration, price_in_usd, airline_id)
VALUES (21435, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 0.50, 200, (SELECT id FROM Airlines WHERE name = "FlyBondi")), 
(51916, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Haneda"), 24.00, 1500, (SELECT id FROM Airlines WHERE name = "Avianca")),
(41257, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Haneda"), 23.00, 1600, (SELECT id FROM Airlines WHERE name = "Air Europa")),
(61378, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Haneda"), 25.00, 1500, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(16432, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Minsk International"), 13.00, 1000, (SELECT id FROM Airlines WHERE name = "Air Europa")),
(14622, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 22.00, 1650, (SELECT id FROM Airlines WHERE name = "Avianca")),
(39127, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 21.00, 1800, (SELECT id FROM Airlines WHERE name = "British Airways")),
(14334, (SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 23.00, 1700, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(31546, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 0.50, 250, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(65263, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 23.00, 1600, (SELECT id FROM Airlines WHERE name = "British Airways")),
(72149, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 25.00, 1700, (SELECT id FROM Airlines WHERE name = "Air France")),
(98124, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 22.00, 1400, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(95781, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Haneda"), 23.50, 1650, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(17896, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Minsk International"), 11.00, 950, (SELECT id FROM Airlines WHERE name = "Air Europa")),
(62187, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Minsk International"), 12.00, 1050, (SELECT id FROM Airlines WHERE name = "British Airways")),
(26310, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 20.00, 2000, (SELECT id FROM Airlines WHERE name = "American Airlines")),
(17634, (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 21.00, 2200, (SELECT id FROM Airlines WHERE name = "Air Europa")),
(15634, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 25.00, 1400, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(53217, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 24.00, 1100, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(94966, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 24.00, 1200, (SELECT id FROM Airlines WHERE name = "British Airways")),
(49643, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Minsk International"), 7.00, 800, (SELECT id FROM Airlines WHERE name = "Jet Smart")),
(97841, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Minsk International"), 9.00, 950, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(37514, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Minsk International"), 10.00, 850, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(46532, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 4.00, 350, (SELECT id FROM Airlines WHERE name = "British Airways")),
(28751, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 6.00, 550, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(16434, (SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 4.50, 300, (SELECT id FROM Airlines WHERE name = "Air France")),
(94631, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 11.50, 1100, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(26345, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 13.50, 1250, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(99851, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 15.50, 1550, (SELECT id FROM Airlines WHERE name = "Air France")),
(18645, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 12.50, 1150, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(12636, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Haneda"), 9.50, 750, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(36941, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 12.00, 950, (SELECT id FROM Airlines WHERE name = "Avianca")),
(20741, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 13.00, 1050, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(91613, (SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 14.00, 1150, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(56594, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 24.50, 1500, (SELECT id FROM Airlines WHERE name = "Air France")),
(62462, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 24.00, 1600, (SELECT id FROM Airlines WHERE name = "Air France")),
(46492, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Haneda"), 3.50, 500, (SELECT id FROM Airlines WHERE name = "American Airlines")),
(01246, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Haneda"), 4.50, 600, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(26346, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Minsk International"), 10.00, 900, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(26643, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 0.50, 100, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(85410, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 1.00, 150, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(10009, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 2.00, 200, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(60235, (SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), 1.50, 50, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(25646, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 21.00, 2000, (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
(23058, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Islas Malvinas"), 22.00, 2200, (SELECT id FROM Airlines WHERE name = "American Airlines")),
(26329, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), 23.50, 2500, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(26292, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Haneda"), 5.50, 1000, (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
(23464, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Minsk International"), 11.50, 750, (SELECT id FROM Airlines WHERE name = "FlyBondi")),
(62008, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Minsk International"), 12.50, 950, (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
(49723, (SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airports WHERE name = "Perth Airport"), 1.50, 200, (SELECT id FROM Airlines WHERE name = "American Airlines"));

INSERT INTO Hired_Airlines (airport_id, airline_id)
VALUES ((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "FlyBondi")),
((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "Avianca")),
((SELECT id FROM Airports WHERE name = "Islas Malvinas"), (SELECT id FROM Airlines WHERE name = "Air Europa")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "Jet Smart")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "British Airways")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "Air France")),
((SELECT id FROM Airports WHERE name = "Ambrosio Taravella"), (SELECT id FROM Airlines WHERE name = "American Airlines")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "Avianca")),
((SELECT id FROM Airports WHERE name = "Haneda"), (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
((SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airlines WHERE name = "Air France")),
((SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airlines WHERE name = "Copa Airlines")),
((SELECT id FROM Airports WHERE name = "Minsk International"), (SELECT id FROM Airlines WHERE name = "Turkish Airlines")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "American Airlines")),
((SELECT id FROM Airports WHERE name = "Perth Airport"), (SELECT id FROM Airlines WHERE name = "Avianca")),
((SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airlines WHERE name = "Air France")),
((SELECT id FROM Airports WHERE name = "Sidney-Richland Airport"), (SELECT id FROM Airlines WHERE name = "Gol Linhas Aereas"));

INSERT INTO Fly_Tickets (flight_id, passenger_id)
VALUES ((SELECT id FROM Flights WHERE hours_duration = 25.00 and price_in_usd = 1500), (SELECT id FROM Passengers WHERE name = "Carlos Borda")),
((SELECT id FROM Flights WHERE hours_duration = 22.00 and price_in_usd = 2200), (SELECT id FROM Passengers WHERE name = "Analia Perini")),
((SELECT id FROM Flights WHERE hours_duration = 12.00 and price_in_usd = 950), (SELECT id FROM Passengers WHERE name = "Tatiana Mitchell")),
((SELECT id FROM Flights WHERE hours_duration = 2.00 and price_in_usd = 200), (SELECT id FROM Passengers WHERE name = "Martin Galperin")),
((SELECT id FROM Flights WHERE hours_duration = 24.50 and price_in_usd = 1500), (SELECT id FROM Passengers WHERE name = "Thomas Scamacca"));
