insert into BRAND(ID, NAME, DATE_CREATE, DATE_UPDATE) values (1, 'ZARA', '11/11/2020', '11/11/2020');

insert into PRODUCT(PROD_ID, NAME , DATE_CREATE , DATE_UPDATE)
    values(35455, 'T-Shirt', '2020-06-14-00.00.00', '2020-06-14-00.00.00');

insert into PRICES ( P_ID, P_BRAND_ID, START_DATE, END_DATE, PRICE_LIST, P_PROD_ID, PRIORITY, PRICE)
values (1, 1, '2020-06-14-00.00.00', '2020-12-31-23.59.59', 1, 35455, 0, 35.50);

insert into PRICES ( P_ID, P_BRAND_ID, START_DATE, END_DATE, PRICE_LIST, P_PROD_ID, PRIORITY, PRICE)
values (2, 1, '2020-06-14-15.00.00', '2020-06-14-00.00.00', 2, 35455, 1, 25.45);
insert into PRICES ( P_ID, P_BRAND_ID, START_DATE, END_DATE, PRICE_LIST, P_PROD_ID, PRIORITY, PRICE)
values (3, 1, '2020-06-15-00.00.00', '2020-06-14-00.00.00', 3, 35455, 1, 30.50);
insert into PRICES ( P_ID, P_BRAND_ID, START_DATE, END_DATE, PRICE_LIST, P_PROD_ID, PRIORITY, PRICE)
values (4, 1, '2020-06-15-16.00.00', '2020-06-14-00.00.00', 4, 35455, 1, 38.95);