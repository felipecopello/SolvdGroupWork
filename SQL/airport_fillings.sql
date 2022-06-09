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
VALUES ("Islas Malvinas", "32°54′13″ S", "60°47′04″ W", (SELECT id FROM Cities WHERE name = "Rosario")),
("Ambrosio Taravella", "31°18′36″ S", "64°12′30″ W", (SELECT id FROM Cities WHERE name = "Cordoba")),
("Alfonso Pena", "25°31′54″ S", "49°10′34″ W", (SELECT id FROM Cities WHERE name = "Coritiba")),
("Hercilio Luz", "27°40′13″ S", "48°33′9″ W", (SELECT id FROM Cities WHERE name = "Florianopolis")),
("Itami", "34°51′30″ N", "136°48′19″ E", (SELECT id FROM Cities WHERE name = "Kyoto")),
("Haneda", "35°33′12″ N", "139°46′52″ E", (SELECT id FROM Cities WHERE name = "Tokyo")),
("Minsk International", "53°52′57″ N", "28°1′57″ E", (SELECT id FROM Cities WHERE name = "Minsk")),
("Hrodna", "53°57′18″ N", "30°5′42″ E", (SELECT id FROM Cities WHERE name = "Grodno")),
("Josep Tarradellas", "41°17′49″ N", "2°4′42″ E", (SELECT id FROM Cities WHERE name = "Barcelona")),
("Barajas", "40°28′20″ N", "3°33′39″ W", (SELECT id FROM Cities WHERE name = "Madrid")),
("Perth Airport", "31°56′25″ S", "115°58′1″ E", (SELECT id FROM Cities WHERE name = "Perth")),
("Sidney-Richland Airport", "37°0′29″ S", "174°47′30″ E", (SELECT id FROM Cities WHERE name = "Sidney"));

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