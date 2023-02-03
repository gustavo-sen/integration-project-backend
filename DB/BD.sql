
DROP TABLE IF EXISTS model_table;
DROP TABLE IF EXISTS categories_table;
DROP TABLE IF EXISTS lineup_table;


CREATE TABLE lineup_table(
    lineup_name text NOT NULL,
    PRIMARY KEY(lineup_name)
);

CREATE TABLE categories_table(
    category_name text NOT NULL,
    id_lineup text,
    PRIMARY KEY(category_name),
    FOREIGN KEY(id_lineup)
        REFERENCES lineup_table (lineup_name)
        ON DELETE CASCADE
);

CREATE TABLE model_table(
    model_name text NOT NULL,
    id_category text,
    PRIMARY KEY(model_name),
    FOREIGN KEY(id_category)
        REFERENCES categories_table (category_name)
        ON DELETE CASCADE
);

INSERT INTO lineup_table (lineup_name)
VALUES
	('Ares'),
	('Cronos');

INSERT INTO categories_table (id_lineup, category_name)
VALUES
    ('Cronos', 'Cronos Old'),
    ('Cronos', 'Cronos L'),
    ('Cronos', 'Cronos NG'),
    ('Ares',   'Ares TB'),
    ('Ares',   'Ares THS');

INSERT INTO models_table(id_category, model_name)
VALUES
    ('Cronos Old', 'Cronos 6001-A'),
    ('Cronos Old', 'Cronos 6003'),
    ('Cronos Old', 'Cronos 7023'),
    ('Cronos L',   'Cronos 6021L'),
    ('Cronos L',   'Cronos 7023L'),
    ('Cronos NG',  'Cronos 6001-NG'),
    ('Cronos NG',  'Cronos 6003-NG'),
    ('Cronos NG',  'Cronos 6021-NG'),
    ('Cronos NG',  'Cronos 6031-NG'),
    ('Cronos NG',  'Cronos 7021-NG'),
    ('Cronos NG',  'Cronos 7023-NG'),
    ('Ares TB',    'Ares 7021'),
    ('Ares TB',    'Ares 7031'),
    ('Ares TB',    'Ares 7023'),
    ('Ares THS',   'Ares 8023 15'),
    ('Ares THS',   'Ares 8023 200'),
    ('Ares THS',   'Ares 8023 2,5');

