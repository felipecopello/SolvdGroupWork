USE airportlaba;

INSERT INTO Countries (name)
VALUES ("Argentina"),
("Brazil"),
("Japan"),
("Belarus"),
("Spain"),
("Australia");

INSERT INTO Cities (name, country_id)
VALUES ("Rosario", (SELECT id FROM Countries WHERE name = "Argentina")),
("Cordoba", (SELECT id FROM Countries WHERE name = "Argentina")),
("Coritiba", (SELECT id FROM Countries WHERE name = "Brazil")),
("Florianopolis", (SELECT id FROM Countries WHERE name = "Brazil")),
("Kyoto", (SELECT id FROM Countries WHERE name = "Japan")),
("Tokyo", (SELECT id FROM Countries WHERE name = "Japan")),
("Minsk", (SELECT id FROM Countries WHERE name = "Belarus")),
("Grodno", (SELECT id FROM Countries WHERE name = "Belarus")),
("Barcelona", (SELECT id FROM Countries WHERE name = "Spain")),
("Madrid", (SELECT id FROM Countries WHERE name = "Spain")),
("Perth", (SELECT id FROM Countries WHERE name = "Australia")),
("Sidney", (SELECT id FROM Countries WHERE name = "Australia"));

INSERT INTO Airports (name, latitude, longitude, city_id)
VALUES ("Islas Malvinas", "-32.90", "-60.79", (SELECT id FROM Cities WHERE name = "Rosario")),
("Ambrosio Taravella", "-31.18", "-64.12", (SELECT id FROM Cities WHERE name = "Cordoba")),
("Alfonso Pena", "-25.31", "-49.10", (SELECT id FROM Cities WHERE name = "Coritiba")),
("Hercilio Luz", "-27.40", "-48.33", (SELECT id FROM Cities WHERE name = "Florianopolis")),
("Itami", "34.51", "136.48", (SELECT id FROM Cities WHERE name = "Kyoto")),
("Haneda", "35.33", "139.46", (SELECT id FROM Cities WHERE name = "Tokyo")),
("Minsk International", "53.52", "28.01", (SELECT id FROM Cities WHERE name = "Minsk")),
("Hrodna", "53.57", "30.05", (SELECT id FROM Cities WHERE name = "Grodno")),
("Josep Tarradellas", "41.17", "02.04", (SELECT id FROM Cities WHERE name = "Barcelona")),
("Barajas", "40.28", "03.33", (SELECT id FROM Cities WHERE name = "Madrid")),
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