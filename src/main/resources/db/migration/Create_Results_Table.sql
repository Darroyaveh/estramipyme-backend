
CREATE TABLE results (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    result_data JSONB NOT NULL,  -- PostgreSQL usa JSONB en lugar de JSON para mejor rendimiento
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
        ON DELETE CASCADE