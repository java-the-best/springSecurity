CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(80) NOT NULL,
    email VARCHAR(50) UNIQUE);

INSERT INTO users (username, password, email)
VALUES('user', '$2y$12$MWkDQY1LpJ3.YeZ/tuExI.oLO/sXvkQzOgIIf9P4FHP7..I/vKH6q', 'user@mail.ru');



CREATE TABLE roles (id BIGSERIAL PRIMARY KEY, name VARCHAR(50) NOT NULL);

INSERT INTO roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');



CREATE TABLE users_roles (
    users_id BIGSERIAL NOT NULL,
    role_id BIGSERIAL NOT NULL,
    PRIMARY KEY (users_id, role_id),
    FOREIGN KEY (users_id) REFERENCES users (id),
    FOREIGN KEY (role_id) REFERENCES roles (id));

INSERT INTO users_roles (users_id, role_id) VALUES (1, 1);
