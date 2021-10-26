CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT,
tipo VARCHAR(255),
cor VARCHAR(255),
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
id_produto INT AUTO_INCREMENT,
nome_produto VARCHAR(255),
preco DOUBLE,
quantidade INT,
organico BOOLEAN,
fk_id_categoria INT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (tipo, cor) VALUES
('Verdura', 'Verde'),
('Fruta','Vermelha'),
('Legumes','Laranja'),
('Fruta','Amarelo');

INSERT INTO tb_produto (nome_produto,preco,quantidade,organico,fk_id_categoria) VALUES
('Brócolis',7.00,2,1,1),
('Couve',3.00,3,1,1),
('Maçã',5.00,2,0,2),
('Cenoura',8.00,1,0,3),
('Kiwi',62.00,1,1,4),
('Maracujá',30.00,1,1,4),
('Morango',25.00,2,0,2);

SELECT*FROM tb_produto WHERE preco>50.00;

SELECT*FROM tb_produto WHERE preco>3 AND preco<60;

SELECT*FROM tb_produto WHERE nome_produto LIKE 'c%';

SELECT*FROM tb_categoria INNER JOIN tb_produto
on tb_produto.fk_id_categoria= tb_categoria.id_categoria;

SELECT*FROM tb_categoria INNER JOIN tb_produto
on tb_produto.fk_id_categoria= tb_categoria.id_categoria WHERE tipo= 'Fruta';

