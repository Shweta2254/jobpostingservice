CREATE TABLE `JobPosting` (
    `JobID` INT PRIMARY KEY AUTO_INCREMENT,
    `Description` TEXT NOT NULL,
    `Designation` VARCHAR(100) NOT NULL,
    `Location` VARCHAR(100) NOT NULL,
    `RequiredSkillSet` VARCHAR(255),
    `YearsOfExperience` INT,
    `LanguagesKnown` VARCHAR(255),
    `SalaryRange` VARCHAR(50),
    `PostedBy` VARCHAR(30)
);