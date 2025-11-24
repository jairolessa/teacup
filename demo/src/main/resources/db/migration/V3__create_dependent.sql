CREATE TABLE dependent (
    id BIGSERIAL PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    birth_date DATE NOT NULL,
    gender VARCHAR(20) NOT NULL,

    CONSTRAINT chk_dependent_gender CHECK (gender IN (
        'MASCULINO', 'FEMININO', 'OUTRO', 'NAO_INFORMADO'
    )),
    bond_nature VARCHAR(50) NOT NULL,
    CONSTRAINT chk_dependent_bond CHECK (bond_nature IN (
        'GENITOR',
        'CONJUGE',
        'FILHO',
        'RESPONSAVEL_LEGAL',
        'OUTRO'
    )),
    support_levels VARCHAR(50) NOT NULL,
    CONSTRAINT chk_dependent_support_levels CHECK (support_levels IN (
        'SUPORTE_LEVE',
        'SUPORTE_MODERADO',
        'SUPORTE_SEVERO',
        'NAO_INFORMADO'
    )),
    contact_number VARCHAR(20),
    education_institute VARCHAR(255),
    health_info TEXT,
    emergency_contact VARCHAR(255) NOT NULL,
    diagnostic TEXT,
    responsible_id BIGINT NOT NULL,
    CONSTRAINT fk_dependent_responsible
        FOREIGN KEY (responsible_id) REFERENCES responsible(id)
        ON DELETE CASCADE
);