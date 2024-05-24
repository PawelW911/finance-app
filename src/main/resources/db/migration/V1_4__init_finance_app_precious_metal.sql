CREATE TABLE precious_metal
(
    precious_metal_id   SERIAL          NOT NULL,
    name                VARCHAR(32)     NOT NULL,
    price               NUMERIC(7,2)    NOT NULL,
    quantity_in_ounce   NUMERIC(7,2)    NOT NULL,
    user_app_id         INT             NOT NULL,
    PRIMARY KEY (precious_metal_id),
    CONSTRAINT fk_precious_metal_app_user
        FOREIGN KEY (user_app_id)
            REFERENCES user_app (user_app_id)
);