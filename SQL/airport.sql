CREATE SCHEMA IF NOT EXISTS `airportlaba` DEFAULT CHARACTER SET utf8 ;
USE `airportlaba` ;

CREATE TABLE IF NOT EXISTS `airportlaba`.`Countries` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE IF NOT EXISTS `airportlaba`.`Cities` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `country_id` INT NOT NULL,
  PRIMARY KEY (`id`),
	FOREIGN KEY (`country_id`)
    REFERENCES `airportlaba`.`Countries` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- Latitude and longitude roundep up to closest number on grades --
CREATE TABLE IF NOT EXISTS `airportlaba`.`Airports` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `latitude` INT NOT NULL,
  `longitude` INT NOT NULL,
  `city_id` INT NOT NULL,
  PRIMARY KEY (`id`),
	FOREIGN KEY (`city_id`)
    REFERENCES `airportlaba`.`Cities` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE IF NOT EXISTS `airportlaba`.`Airlines` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `airportlaba`.`Flights` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `departure_airport_id` INT NOT NULL,
  `arrival_airport_id` INT NOT NULL,
  `time_duration` INT NOT NULL,
  `price` INT NOT NULL,
  `airline_id` INT NOT NULL,
  PRIMARY KEY (`id`),
	FOREIGN KEY (`departure_airport_id`)
    REFERENCES `airportlaba`.`Airports` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (`arrival_airport_id`)
    REFERENCES `airportlaba`.`Airports` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (`airline_id`)
    REFERENCES `airportlaba`.`Airlines` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE IF NOT EXISTS `airportlaba`.`Passengers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  PRIMARY KEY (`id`));
  
-- Many to many (intermediate table) --
CREATE TABLE IF NOT EXISTS `airportlaba`.`Hired_Airlines` (
  `contract_id` INT NOT NULL AUTO_INCREMENT,
  `airport_id` INT NOT NULL,
  `airline_id` INT NOT NULL,
  PRIMARY KEY (`contract_id`),
	FOREIGN KEY (`airport_id`)
    REFERENCES `airportlaba`.`Airports` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (`airline_id`)
    REFERENCES `airportlaba`.`Airlines` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
  
-- Many to many (intermediate table) --
CREATE TABLE IF NOT EXISTS `airportlaba`.`Fly_Tickets` (
  `ticket_id` INT NOT NULL AUTO_INCREMENT,
  `flight_id` INT NOT NULL,
  `passenger_id` INT NOT NULL,
  PRIMARY KEY (`ticket_id`),
    FOREIGN KEY (`flight_id`)
    REFERENCES `airportlaba`.`Flights` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (`passenger_id`)
    REFERENCES `airportlaba`.`Passengers` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)



