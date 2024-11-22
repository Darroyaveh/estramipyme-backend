CREATE TABLE users
(
    id            BIGSERIAL PRIMARY KEY,
    fullName      VARCHAR(255) NOT NULL,
    email         VARCHAR(255) NOT NULL UNIQUE,
    password      VARCHAR(255) NOT NULL,
    person_type   VARCHAR(50)  NOT NULL,
    doc_type      VARCHAR(50)  NOT NULL,
    doc_number    VARCHAR(50)  NOT NULL,
    sector        VARCHAR(255) NOT NULL,
    accept_policy BOOLEAN      NOT NULL,
    created_at    TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);