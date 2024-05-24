CREATE TABLE fiat
(
    fiat_id             SERIAL          NOT NULL,
    name                VARCHAR(32)     NOT NULL,
    price_in_other_fiat NUMERIC(7,2)    NOT NULL,
    quantity            NUMERIC(7,2)    NOT NULL,
    user_app_id         INT             NOT NULL,
    PRIMARY KEY (fiat_id),
    CONSTRAINT fk_fiat_app_user
        FOREIGN KEY (user_app_id)
            REFERENCES user_app (user_app_id)
);