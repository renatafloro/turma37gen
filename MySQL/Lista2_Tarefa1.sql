CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
id INT auto_increment,
nome VARCHAR(255) NOT NULL,
codigo VARCHAR (255) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE tb_personagem(
id_personagem INT AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
poder_defesa INT,
poder_ataque INT,
agilidade INT,
fk_id INT,
PRIMARY KEY (id_personagem),
FOREIGN KEY (fk_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_classe (nome, codigo) VALUES
("Bruxa",13),
("Fada",12),
("Guerreiro", 11),
("Rainha",10),
("Oraculo",9);

INSERT INTO tb_personagem (nome, poder_defesa, poder_ataque, agilidade, fk_id) VALUES
("Alina",4000,3000,50,1),
("Hion",2500,4000,35,2),
("Lion",1800,1500,25,3),
("Kiara",1010,3500,18,4),
("Yunio",300,600, 24,5),
("Luino",1000,2800,70,2);


SELECT*FROM tb_personagem WHERE poder_ataque>2000;

SELECT*FROM tb_personagem WHERE poder_defesa>1000 AND poder_defesa<2000;

INSERT INTO tb_personagem (nome, poder_defesa, poder_ataque, agilidade, fk_id) VALUES
("Cavaleiro zero", 1000, 1000, 1000, 4);

SELECT*FROM tb_personagem WHERE nome LIKE 'c%';

SELECT*
FROM tb_classe
INNER JOIN tb_personagem
on tb_personagem.fk_id= tb_classe.id;

SELECT*FROM tb_classe
INNER JOIN tb_personagem
ON tb_personagem.fk_id= tb_classe.id
WHERE id=2;







