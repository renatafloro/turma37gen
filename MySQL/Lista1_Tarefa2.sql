CREATE DATABASE db_ecommerce;

USE db_ecommerce;
CREATE TABLE tb_produtos(
id_produto INT AUTO_INCREMENT,
nome VARCHAR (255),
preco DOUBLE NOT NULL,
estoque INT,
marca VARCHAR(255),

PRIMARY KEY (id_produto)
);

INSERT INTO tb_produtos(nome, preco, estoque, marca) VALUES
("Calça",80.00,25,"Handara"),
("Blusa",40.00,25,"C&A"),
("Vestido",120.00,30,"Zinzane"),
("Sapato",150.00,20,"Arezzo"),
("Cropped",50.00,15,"Riachuelo"),
("Short",40.00,14,"Renner"),
("Macacão",90.00,25,"Dona Flor"),
("Colar de pérolas",550.00,25,"Berloque");

SELECT*FROM tb_produtos WHERE preco > 500.00;
SELECT*FROM tb_produtos WHERE preco < 500.00;

UPDATE tb_produtos SET estoque= 50 WHERE id_produto=2;

SELECT*FROM tb_produtos;