CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT,
tipo VARCHAR(255),
marca VARCHAR(255),
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
id_produto INT AUTO_INCREMENT,
cliente VARCHAR(255),
nome_produto VARCHAR(255),
preco DOUBLE,
quantidade INT,
fk_id_categoria INT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (tipo, marca) VALUES
('Tinta','Coral'),
('Massas','Poty'),
('Cerâmica','Porto Rico'),
('Encanamento','Tigre');

INSERT INTO tb_produto (cliente,nome_produto,preco,quantidade,fk_id_categoria) VALUES
('Ana','Tinta óleo',25.00,2,1),
('Julio','Cimento',50.00,3,2),
('Paulo','Pisos',120.00,1,3),
('Maria','Tinta Azul',22.00,4,1),
('Carla','Cano PVC',52.00,2,4);

SELECT*FROM tb_produto WHERE preco>50.00;

SELECT*FROM tb_produto WHERE preco>3.00 AND preco<60.00;



