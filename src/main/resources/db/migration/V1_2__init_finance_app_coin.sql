CREATE TABLE coin
(
    coin_id             SERIAL          NOT NULL,
    name                VARCHAR(32)     NOT NULL,
    price               NUMERIC(7,2)    NOT NULL,
    quantity            NUMERIC(7,2)    NOT NULL,
    value_in_fiat       NUMERIC(7,2)    NOT NULL,
    user_app_id         INT             NOT NULL,
    PRIMARY KEY (coin_id),
    CONSTRAINT fk_coin_app_user
        FOREIGN KEY (user_app_id)
            REFERENCES user_app (user_app_id)
);