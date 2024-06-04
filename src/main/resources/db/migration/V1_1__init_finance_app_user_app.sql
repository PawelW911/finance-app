CREATE TABLE user_app
(
    user_app_id     SERIAL          NOT NULL,
    user_app_name   VARCHAR(32)     NOT NULL,
    email       VARCHAR(32)     NOT NULL,
    password    VARCHAR(128)    NOT NULL,
    active      BOOLEAN         NOT NULL,
    PRIMARY KEY (user_app_id)
);