CREATE TABLE responsible (
    id BIGSERIAL PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    birth_date DATE NOT NULL,
    gender VARCHAR(20) NOT NULL,
    CONSTRAINT chk_responsible_gender CHECK (gender IN (
        'MASCULINO', 'FEMININO', 'OUTRO'
    )),
    contact_number VARCHAR(20),
    cep VARCHAR(20),
    public_place VARCHAR(255),
    house_number VARCHAR(50),
    neighbourhood VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(2),
    complement VARCHAR(255),
    email VARCHAR(255) NOT NULL,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    account_id BIGINT UNIQUE,
    CONSTRAINT fk_responsible_account
        FOREIGN KEY (account_id) REFERENCES account(id)
        ON DELETE CASCADE
);