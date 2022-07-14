SELECT * FROM db_loja.fornecedor;

INSERT INTO fornecedor (razaoSocial, nomeFantasia, inscricaoEstadual, cnpj, produtoServico, endereco, cep, cidade, estado, email, website, observacoes)
VALUES ('Diego', 'Armazém Itália', 26410055, 36129061000109, 'Alimentos', 'Marechal deodoro', 89802140, 'Chapecó', 'SC', 'armazem@hotmail.com', 'armazemitalia.com.br', 'vendas');

INSERT INTO fornecedor (razaoSocial, nomeFantasia, inscricaoEstadual, cnpj, produtoServico, endereco, cep, cidade, estado, email, website, observacoes)
VALUES ('Titiana', 'Zini', 26410088, 69785125400014, 'Bebidas', 'Centro', 89802140, 'Chapecó', 'SC', 'zini@hotmail.com', 'zinibebidas.com.br', 'vendas');

SELECT distinct * FROM fornecedor;

DELETE FROM fornecedor;
