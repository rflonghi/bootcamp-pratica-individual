-- 1
-- Normalização é a padronização do banco de dados com o intuito de evitar redundâncias, garantir a integridade referencial e obter otimizações de desempenho.

-- 2
INSERT INTO movies (title, rating, awards, release_date, length, genre_id) VALUES ("Filme", 10, 1, now(), 100, 3);

-- 3
INSERT INTO genres (name, ranking, active) VALUES ("genero", 10, 1);

-- 4
UPDATE movies
SET genre_id = (SELECT genres.id FROM genres WHERE name = "genero")
WHERE movies.title = "Filme";

-- 5
UPDATE actors
SET actors.favorite_movie_id = (SELECT movies.id FROM movies WHERE movies.title = "Filme")
WHERE actors.id = 1;

-- 6
CREATE TEMPORARY TABLE movies_temp SELECT * FROM movies;

-- 7
DELETE FROM movies_temp WHERE awards < 5;

-- 8
SELECT DISTINCT genres.name 
FROM genres 
INNER JOIN movies ON genres.id = movies.genre_id;

-- 9
SELECT actors.first_name, actors.last_name 
FROM actors 
INNER JOIN movies ON movies.id = actors.favorite_movie_id 
WHERE movies.awards > 3;

-- 10
EXPLAIN FORMAT=tree DELETE FROM movies_temp WHERE awards < 5;

-- 11
-- Índice é uma estrutura auxiliar associada a uma tabela afim de ordenar dados em uma determinada sequência. Serve para acelerar o tempo de acessos as linhas de uma tabela.

-- 12
CREATE INDEX idx_movie_name ON movies (title);

-- 13 
DESCRIBE movies;