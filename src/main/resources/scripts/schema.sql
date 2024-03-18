create user TEST_USER PASSWORD 'TEST_USER';
CREATE SCHEMA SMART_ASSETS AUTHORIZATION TEST_USER;
create table BRAND (
    BRAND_ID int,
    NAME varchar(255),
    DATE_CREATE varchar(100),
    DATE_UPDATE varchar(100),
    PRIMARY KEY (BRAND_ID)
);

create table PRODUCT (
    PROD_ID int,
    NAME varchar(255),
    DATE_CREATE varchar(100),
    DATE_UPDATE varchar(100),
    PRIMARY KEY (PROD_ID)
);

create table PRICES (
    P_ID int,
    P_BRAND_ID int,
    START_DATE varchar(100),
    END_DATE varchar(100),
    P_PROD_ID int,
    PRICE_LIST int,
    PRIORITY int,
    PRICE float,
    PRIMARY KEY (P_ID),
    FOREIGN KEY (P_BRAND_ID) REFERENCES BRAND(BRAND_ID),
    FOREIGN KEY (P_PROD_ID) REFERENCES PRODUCT(PROD_ID)
);