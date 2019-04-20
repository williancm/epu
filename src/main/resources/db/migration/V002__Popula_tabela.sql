INSERT INTO responsavel (nome, cpf, telefone, email) VALUES
  ('Willian', '041.809.700-31', '53984577631', 'willianmatheuscm@gmail.com'),
  ('Júlia',   '041.809.700-32', '53999484497', 'juliabfluz@gmail.com'),
  ('Ricardo', '041.809.700-33', '53984577633', 'rsferro@gmail.com');

INSERT INTO turma (nivel, sala) VALUES
  ('K3', 'A'),
  ('K3', 'B'),
  ('K4', 'A'),
  ('K4', 'B'),
  ('K4', 'C');

INSERT INTO aluno (nome, nascimento, matricula, foto, responsavel_id, turma_id) VALUES
  ('João da Silva',      '2014-12-19', '123ABC456', 'joao.jpg',  1, 1),
  ('Maria da Silva',     '2013-02-09', '124BCD457', 'maria.jpg', 1, 3),
  ('Gabriel Pereira',    '2014-07-22', '234CDE567', 'gabe.jpg',  2, 2),
  ('Valentina Ferreira', '2013-10-05', '321CBA654', 'valen.jpg', 3, 4),
  ('Enzo Ferreira',      '2013-10-05', '222BBB444', 'enzo.jpg',  3, 3);

INSERT INTO autorizado (nome, cpf, telefone, relacao, foto, aluno_id, responsavel_id)VALUES
  ('Willian',  '041.809.700-31', '53984577631', 'Pai',   'pai.jpg',   1, 1),
  ('Matheus',  '741.809.700-31', '53999577631', 'Tio',   'tio.jpg',   1, 1),
  ('Rosa',     '555.809.700-31', '53984577631', 'Avó',   'vo.jpg',    1, 1),
  ('Willian',  '041.809.700-31', '53984577699', 'Pai',   'pai.jpg',   2, 1),
  ('Jessica',  '085.809.700-31', '53976577631', 'Babá',  'baba.jpg',  2, 1),
  ('Júlia',    '041.809.700-32', '53999484497', 'Tia',   'tia.jpg',   3, 2),
  ('Ricardo',  '041.809.700-33', '53984577633', 'Mãe',   'mae.jpg',   4, 3),
  ('Henrique', '641.809.700-44', '53984577633', 'Dindo', 'dindo.jpg', 4, 3),
  ('Ricardo',  '041.809.700-33', '53984577633', 'Mãe',   'mae.jpg',   5, 3),
  ('Henrique', '641.809.700-44', '53984577633', 'Dindo', 'dindo.jpg', 5, 3);

INSERT INTO prof (nome, emailInst, senha, cpf, telefone, foto) VALUES
  ('Maisa Silva',       'maisasilva@marioquintana.com.br',    'padrao', '123.456.789-10', '53999887766', 'maisa.jpg'),
  ('Marielen Cardoso',  'maricardoso@marioquintana.com.br',   'padrao', '321.456.789-10', '53999557722', 'mari.jpg'),
  ('Juliana Carvalho',  'jucarvalho@marioquintana.com.br',    'padrao', '333.456.789-10', '53977887766', 'juliana.jpg'),
  ('Denise Lima',       'deniselima@marioquintana.com.br',    'padrao', '111.456.789-10', '53988112233', 'denise.jpg'),
  ('Marcia Tavares',    'marciatavares@marioquintana.com.br', 'padrao', '999.456.789-10', '53996556677', 'marcia.jpg'),
  ('Júlia Bittencourt', 'juliabitten@marioquintana.com.br',   'padrao', '777.456.789-48', '53999484497', 'julia.jpg');

INSERT INTO registro (dia, autorizado_id, prof_id, aluno_id) VALUES
  ('2019-04-15 11:31:06', 1,  1, 1),
  ('2019-04-15 11:32:06', 4,  1, 2),
  ('2019-04-15 11:33:06', 6,  1, 3),
  ('2019-04-15 11:34:06', 7,  1, 4),
  ('2019-04-15 11:35:06', 9,  1, 5),
  ('2019-04-17 11:36:14', 2,  3, 1),
  ('2019-04-17 11:35:14', 5,  3, 2),
  ('2019-04-17 11:34:14', 6,  3, 3),
  ('2019-04-17 11:33:14', 8,  3, 4),
  ('2019-04-17 11:32:14', 10, 3, 5),
  ('2019-04-19 11:31:51', 3,  5, 1),
  ('2019-04-19 11:30:51', 4,  5, 2),
  ('2019-04-19 11:31:31', 6,  5, 3),
  ('2019-04-19 11:33:51', 8,  5, 4),
  ('2019-04-19 11:35:51', 9,  5, 5);

INSERT INTO prof_turma (turma_id, prof_id) VALUES
  (3, 1),
  (3, 2),
  (4, 3),
  (4, 4),
  (5, 5),
  (5, 6);