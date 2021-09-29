DROP SCHEMA IF EXISTS laboratorna5 ;
CREATE SCHEMA IF NOT EXISTS laboratorna5 DEFAULT CHARACTER SET utf8 ;
USE laboratorna5 ;

DROP TABLE IF EXISTS laboratorna5.`room` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`room` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name_room` VARCHAR(15) NOT NULL,
  `square` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


DROP TABLE IF EXISTS laboratorna5.`zone` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`zone` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `quantity_rooms` INT NOT NULL,
  `level_range` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


DROP TABLE IF EXISTS laboratorna5.`access_level` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`access_level` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `range_sensor` DOUBLE NOT NULL,
  `resolution` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


DROP TABLE IF EXISTS laboratorna5.`sensor` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`sensor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `processing_time` DOUBLE NOT NULL,
  `name_model` VARCHAR(15) NOT NULL,
  `type_sensor` CHAR(10) NOT NULL,
  `calibration` INT NOT NULL,
  `classification` CHAR(15) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


DROP TABLE IF EXISTS laboratorna5.`system_control` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`system_control` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `quantity_control_processings` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


DROP TABLE IF EXISTS laboratorna5.`system_alert` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`system_alert` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `many_notifications` INT NOT NULL,
  `texts_notifications` VARCHAR(60) NOT NULL,
  `about_processings` VARCHAR(45) NOT NULL,
  `system_id` INT NOT NULL,
  PRIMARY KEY (`id`, `system_id`),
  CONSTRAINT `fk_system_alert_system1`
    FOREIGN KEY (`system_id`)
    REFERENCES laboratorna5.`system_control` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_system_alert_system1_idx` ON laboratorna5.`system_alert` (`system_id` ASC);


DROP TABLE IF EXISTS laboratorna5.`user` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(30) NOT NULL,
  `country` VARCHAR(30) NOT NULL,
  `system_id` INT NOT NULL,
  PRIMARY KEY (`id`, `system_id`),
  CONSTRAINT `fk_user_system1`
    FOREIGN KEY (`system_id`)
    REFERENCES laboratorna5.`system_control` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_user_system1_idx` ON laboratorna5.`user` (`system_id` ASC);


DROP TABLE IF EXISTS laboratorna5.`sensor_settings` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`sensor_settings` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `sensor_resolution` DOUBLE NOT NULL,
  `sensor_range` DOUBLE NOT NULL,
  `system_id` INT NOT NULL,
  PRIMARY KEY (`id`, `system_id`),
  CONSTRAINT `fk_sensor_settings_system1`
    FOREIGN KEY (`system_id`)
    REFERENCES laboratorna5.`system_control` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_sensor_settings_system1_idx` ON laboratorna5.`sensor_settings` (`system_id` ASC);


DROP TABLE IF EXISTS laboratorna5.`object_and_security` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`object_and_security` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `location` VARCHAR(25) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS laboratorna5.`sensor_notification` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`sensor_notification` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `range_level` DOUBLE NOT NULL,
  `resolution_level` DOUBLE NOT NULL,
  `system_id` INT NOT NULL,
  PRIMARY KEY (`id`, `system_id`),
  CONSTRAINT `fk_sensor_notification_system1`
    FOREIGN KEY (`system_id`)
    REFERENCES laboratorna5.`system_control` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_sensor_notification_system1_idx` ON laboratorna5.`sensor_notification` (`system_id` ASC);


DROP TABLE IF EXISTS laboratorna5.`notification_settings` ;

CREATE TABLE IF NOT EXISTS laboratorna5.`notification_settings` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `control_access_level` DOUBLE NOT NULL,
  `system_id` INT NOT NULL,
  PRIMARY KEY (`id`, `system_id`),
  CONSTRAINT `fk_notification_settings_system1`
    FOREIGN KEY (`system_id`)
    REFERENCES laboratorna5.`system_control` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_notification_settings_system1_idx` ON laboratorna5.`notification_settings` (`system_id` ASC);


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (1, 'hall', 7.8);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (2, 'bedroom', 14.6);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (3, 'hallway', 5.7);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (4, 'hall', 10.4);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (5, 'hall', 12.5);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (6, 'living room', 14.5);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (7, 'bedroom', 17.8);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (8, 'hallway', 8.4);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (9, 'kitchen', 8.9);
INSERT INTO laboratorna5.`room` (`id`, `name_room`, `square`) VALUES (10, 'living room', 12.4);

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (1, 4, 78.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (2, 7, 120.6);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (3, 5, 80.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (4, 6, 116.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (5, 3, 62.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (6, 7, 132.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (7, 5, 92.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (8, 4, 73.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (9, 7, 127.5);
INSERT INTO laboratorna5.`zone` (`id`, `quantity_rooms`, `level_range`) VALUES (10, 8, 156.8);

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (1, 87.5, 64.5);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (2, 135.4, 97.5);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (3, 70.5, 54.6);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (4, 67.4, 52.5);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (5, 124.5, 96.4);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (6, 86.5, 77.4);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (7, 78.5, 65.8);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (8, 116.4, 107.5);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (9, 89.5, 74.3);
INSERT INTO laboratorna5.`access_level` (`id`, `range_sensor`, `resolution`) VALUES (10, 87.5, 78.4);

COMMIT;



START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (1, 1.7, 'EX-NA', 'inductive', 67, 'active');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (2, 1.9, 'EX-HD', 'capacitive', 48, 'passive');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (3, 2.4, 'EX-DA', 'capacitive', 56, 'active');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (4, 1.4, 'TL-QMC', 'inductive', 98, 'active');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (5, 2.1, 'E-XME', 'capacitive', 76, 'passive');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (6, 0.4, 'T-MS', 'capacitive', 110, 'active');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (7, 0.9, 'ET-MS', 'inductive', 89, 'passive');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (8, 1.5, 'ET-WT', 'inductive', 107, 'active');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (9, 2.5, 'RT-QF', 'capacitive', 123, 'passive');
INSERT INTO laboratorna5.`sensor` (`id`, `processing_time`, `name_model`, `type_sensor`, `calibration`, `classification`) VALUES (10, 1.5, 'BT-WX', 'capacitive', 75, 'active');

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (1, 5);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (2, 7);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (3, 4);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (4, 9);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (5, 12);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (6, 8);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (7, 4);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (8, 2);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (9, 8);
INSERT INTO laboratorna5.`system_control` (`id`, `quantity_control_processings`) VALUES (10, 5);

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (1, 5, 'good', 'successfully', 1);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (2, 7, 'good', 'successfully', 2);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (3, 4, 'not good', 'error', 3);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (4, 8, 'good', 'successfully', 4);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (5, 12, 'good', 'successfully', 5);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (6, 14, 'good', 'successfully', 6);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (7, 4, 'not good', 'error', 7);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (8, 5, 'not good', 'error', 8);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (9, 6, 'good', 'successfully', 9);
INSERT INTO laboratorna5.`system_alert` (`id`, `many_notifications`, `texts_notifications`, `about_processings`, `system_id`) VALUES (10, 12, 'good', 'successfully', 10);

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (1, 'Mykhailo', 'Pazyniuk', 'Ukraine', 1);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (2, 'Liza', 'Dudyk', 'Italy', 2);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (3, 'Roman', 'Oprysk', 'Great Britain', 3);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (4, 'Sofia', 'Didula', 'Great Britain', 4);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (5, 'Maxym', 'Nykyforuk', 'Italy', 5);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (6, 'Andrii', 'Peleno', 'France', 6);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (7, 'Khrystyna', 'Vysotska', 'France', 7);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (8, 'Yefym', 'Chirochkin', 'Germany', 8);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (9, 'Maxym', 'Levytskiy', 'Ukraine', 9);
INSERT INTO laboratorna5.`user` (`id`, `first_name`, `last_name`, `country`, `system_id`) VALUES (10, 'Volodymyr', 'Kasaraba', 'Italy', 10);

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (1, 54.7, 85.9, 1);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (2, 73.7, 98.4, 2);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (3, 67.7, 92.5, 3);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (4, 97.4, 130.5, 4);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (5, 78.5, 107.9, 5);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (6, 95.7, 134.7, 6);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (7, 56.7, 84.2, 7);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (8, 78.3, 95.4, 8);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (9, 54.9, 74.8, 9);
INSERT INTO laboratorna5.`sensor_settings` (`id`, `sensor_resolution`, `sensor_range`, `system_id`) VALUES (10, 85.4, 115.7, 10);

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (1, 'Lviv');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (2, 'Turin');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (3, 'London');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (4, 'Manchester');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (5, 'Milan');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (6, 'Paris');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (7, 'Bordo');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (8, 'Dortmund');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (9, 'Kyiv');
INSERT INTO laboratorna5.`object_and_security` (`id`, `location`) VALUES (10, 'Neapol');

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (1, 78.5, 52.5, 1);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (2, 76.4, 69.4, 2);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (3, 115.7, 107.5, 3);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (4, 109.5, 97.5, 4);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (5, 67.4, 54.9, 5);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (6, 85.6, 65.6, 6);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (7, 79.4, 71.6, 7);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (8, 124.7, 116.7, 8);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (9, 96.5, 85.7, 9);
INSERT INTO laboratorna5.`sensor_notification` (`id`, `range_level`, `resolution_level`, `system_id`) VALUES (10, 85.8, 75.2, 10);

COMMIT;


START TRANSACTION;
USE laboratorna5;
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (1, 50.6, 1);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (2, 45.7, 2);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (3, 95.2, 3);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (4, 76.4, 4);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (5, 82.6, 5);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (6, 76.5, 6);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (7, 80.7, 7);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (8, 57.8, 8);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (9, 75.8, 9);
INSERT INTO laboratorna5.`notification_settings` (`id`, `control_access_level`, `system_id`) VALUES (10, 85.4, 10);

COMMIT;
