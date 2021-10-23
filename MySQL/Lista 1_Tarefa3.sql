CREATE DATABASE db_escola;

USE db_escola;
CREATE TABLE tb_alunos(
id_aluno INT AUTO_INCREMENT,
matricula VARCHAR(255),
cpf VARCHAR(255) NOT NULL,
nome VARCHAR (255),
nota DOUBLE NOT NULL,

PRIMARY KEY (id_aluno)
);

INSERT INTO tb_alunos(matricula, cpf, nome, nota) VALUES
(105, 111222233-44, "Ana Laura",8.0),
(225, 555678987-00, "Marina Alonzo", 5.0),
(002, 123456789-11, "Ian Clarke", 10.0),
(123, 000000000-00, "Sofia Alonzo", 6.0),
(456, 107108109-10, "Eliza Clarke", 7.0);

SELECT*FROM tb_alunos WHERE nota > 7.0;
SELECT*FROM tb_alunos WHERE nota < 7.0;

UPDATE tb_alunos SET nota= 8.0 WHERE id_aluno=5;

SELECT*FROM tb_alunos;

