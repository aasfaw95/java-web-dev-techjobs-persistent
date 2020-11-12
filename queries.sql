## Part 1: Test it with SQL
CREATE TABLE job (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
employer VARCHAR(),
skills VARCHAR(),
name VARCHAR(),
)

## Part 2: Test it with SQL
SELECT *
FROM employer
WHERE location >= "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT skill
FROM job
WHERE skills.job IS NOT NULL
