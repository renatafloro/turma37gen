CREATE DATABASE db_farmacia_do_bem;

USE  db_farmacia_do_bem;

CREATE TABLE tb_categoria(
id_categoria INT auto_increment,
tipo_produto VARCHAR (255),
marca VARCHAR(255),
receita BOOLEAN,
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
id_produto INT AUTO_INCREMENT,
cliente VARCHAR (255),
nome_produto VARCHAR(255) NOT NULL,
quantidade INT NOT NULL,
preco DOUBLE NOT NULL,
fk_id_categoria INT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (tipo_produto, marca, receita) VALUES
('Coméstico','Risqué',0),
('Medicamento','Roche',1),
('Cosmético','Nivea',0),
('Medicamento','Boehringer Ingelheim',0),
('Medicamento','Neo Química',0);


INSERT INTO tb_produto (cliente, nome_produto, quantidade, preco, fk_id_categoria) VALUES
('Ana','Hidratante',2,25.00,3),
('Luis','Roacutan',1,65.00,2),
('José','Histamin',2,10.00,5),
('Ruan','Buscopan',3,20.00,4),
('Maria','Esmalte',5,5.00,1),
('Pedro','Dipirona',2,4.00,5),
('Marcio','Protetor Solar',1,62.00,3);

SELECT*FROM tb_produto WHERE preco>50;

SELECT*FROM tb_produto WHERE preco>3 AND preco<60;

SELECT * FROM tb_produto WHERE nome_produto LIKE 'b%';

SELECT*FROM tb_categoria INNER JOIN tb_produto
on tb_produto.fk_id_categoria= tb_categoria.id_categoria;

SELECT*FROM tb_categoria INNER JOIN tb_produto
on tb_produto.fk_id_categoria= tb_categoria.id_categoria WHERE tipo_produto= 'Medicamento';
