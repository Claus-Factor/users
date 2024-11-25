SELECT id, name, birth_date, email
FROM users;

INSERT INTO users (id, name, birth_date, email, salary)
VALUES (4, 'Василий', DATE('2001-08-25'), 'vas@mail.com', 5000);

INSERT INTO users (id, name, birth_date, email, salary)
VALUES (3, 'Петр', DATE('2007-12-17'), 'peter@mail.com', 5000);

DELETE FROM users WHERE id IN (52,53,102,103)