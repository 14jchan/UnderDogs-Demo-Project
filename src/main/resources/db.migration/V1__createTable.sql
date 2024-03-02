CREATE TABLE if not exists `employee` (
      `ID` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
      `firstName` varchar(320),
      `lastName` varchar(320),
      `dob` datetime
);