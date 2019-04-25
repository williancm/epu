/*DROP DATABASE [IF EXISTS] epu;*/

CREATE TABLE IF NOT EXISTS responsavel (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    email VARCHAR(100) NOT NULL
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS turma (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nivel VARCHAR(45) NOT NULL,
    sala VARCHAR(10) NOT NULL
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS aluno (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    nascimento DATE NOT NULL,
    matricula VARCHAR(20) NOT NULL,
    foto TINYBLOB NULL,
    responsavel_id INT NOT NULL,
    turma_id INT NOT NULL,
    FOREIGN KEY (responsavel_id) REFERENCES responsavel (id),
    FOREIGN KEY (turma_id)       REFERENCES turma (id)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS autorizado (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    relacao VARCHAR(20) NOT NULL,
    foto TINYBLOB NOT NULL,
    aluno_id INT NOT NULL,
    responsavel_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (aluno_id)       REFERENCES aluno (id),
    FOREIGN KEY (responsavel_id) REFERENCES responsavel (id)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS prof (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email_inst VARCHAR(100) NOT NULL,
    senha VARCHAR(20) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    foto TINYBLOB NOT NULL
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS registro (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    dia DATETIME NOT NULL,
    autorizado_id INT NOT NULL,
    prof_id INT NOT NULL,
    aluno_id INT NOT NULL,
    FOREIGN KEY (autorizado_id) REFERENCES autorizado (id),
    FOREIGN KEY (prof_id)       REFERENCES prof (id),
    FOREIGN KEY (aluno_id)      REFERENCES aluno (id)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS prof_turma (
    turma_id INT NOT NULL,
    prof_id INT NOT NULL,
    FOREIGN KEY (turma_id) REFERENCES turma (id),
    FOREIGN KEY (prof_id)  REFERENCES prof (id),
    PRIMARY KEY (turma_id, prof_id)
)ENGINE = InnoDB;