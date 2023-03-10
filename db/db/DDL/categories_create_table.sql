--DROP TABLE IF EXISTS categories_table;

CREATE TABLE categories_table(
    id SMALLSERIAL NOT NULL,
	lineup_id SMALLSERIAL NOT NULL,
    "name" text NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(lineup_id)
        REFERENCES lineup_table (id)
        ON DELETE CASCADE
);



