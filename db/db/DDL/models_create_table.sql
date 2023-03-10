--DROP TABLE IF EXISTS model_table;

CREATE TABLE models_table(
    id SMALLSERIAL NOT NULL,
	category_id SMALLSERIAL NOT NULL,
    "name" text NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(category_id)
        REFERENCES categories_table (id)
        ON DELETE CASCADE
);


