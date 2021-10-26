CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
id_categoria INT auto_increment,
tamanho ENUM ('Pequeno', 'Medio', 'Grande'),
tipo_massa ENUM ('Tradicional', 'Fina'), 
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizza(
id_pizza INT AUTO_INCREMENT,
sabor VARCHAR(255) NOT NULL,
preco DOUBLE,
borda ENUM ('Cheddar', 'Catupiry', 'Sem borda'),
adicional BOOLEAN NOT NULL,
fk_id_categoria INT,
PRIMARY KEY (id_pizza),
FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (tamanho, tipo_massa) VALUES
('Pequeno', 'Tradicional'),
('Medio', "Fina"),
('Grande','Tradicional'),
('Medio','Tradicional'),
('Grande', 'Fina');

INSERT INTO tb_pizza (sabor, preco, borda,adicional, fk_id_categoria) VALUES
("Calabresa",45.00,"Catupiry",1,1),
("Nordestina",30.00,"Cheddar",0,2),
("Frango e Bacon",50.00,"Catupiry",1,3),
("Cartola",30.00,"Sem borda",0,4),
("Frango",48.00,"Cheddar",1,5),
("Brigadeiro",32.00,"Sem borda",1,3);

SELECT*FROM tb_pizza;

SELECT*FROM tb_pizza WHERE preco>45.00;

SELECT*FROM tb_pizza WHERE preco>29.00 AND preco<60.00;

SELECT*FROM tb_pizza WHERE sabor LIKE 'c%';

SELECT*FROM tb_categoria INNER JOIN tb_pizza
ON tb_pizza.fk_id_categoria= tb_categoria.id_categoria;

SELECT*FROM tb_categoria INNER JOIN tb_pizza
ON tb_pizza.fk_id_categoria= tb_categoria.id_categoria WHERE id_categoria=1;
