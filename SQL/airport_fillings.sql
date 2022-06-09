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
VALUES ("Islas Malvinas", -33, -61, (SELECT id FROM Cities WHERE name = "Rosario")),
("Ambrosio Taravella", 0, -78, (SELECT id FROM Cities WHERE name = "Cordoba")),
("Alfonso Pena", 35, 24, (SELECT id FROM Cities WHERE name = "Coritiba")),
("Hercilio Luz", 45, 2, (SELECT id FROM Cities WHERE name = "Florianopolis")),
("Itami", 89, 43, (SELECT id FROM Cities WHERE name = "Kyoto")),
("Haneda", 23, 2, (SELECT id FROM Cities WHERE name = "Tokyo")),
("Minsk International", 1, 78, (SELECT id FROM Cities WHERE name = "Minsk")),
("Hrodna", 34, 87, (SELECT id FROM Cities WHERE name = "Grodno")),
("Josep Tarradellas", 45, 86, (SELECT id FROM Cities WHERE name = "Barcelona")),
("Barajas", 80, 54, (SELECT id FROM Cities WHERE name = "Madrid")),
("Perth Airport", 5, 2, (SELECT id FROM Cities WHERE name = "Perth")),
("Sidney-Richland Airport", 65, 6, (SELECT id FROM Cities WHERE name = "Sidney"));