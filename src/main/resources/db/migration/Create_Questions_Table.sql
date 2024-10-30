
CREATE TABLE questions (
    id BIGSERIAL PRIMARY KEY,
    section VARCHAR(50) NOT NULL,
    question TEXT NOT NULL,
    subsection VARCHAR(50),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);