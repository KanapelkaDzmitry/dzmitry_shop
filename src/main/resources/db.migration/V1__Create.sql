create table category
(
    id      bigserial not null,
    name    varchar(255),
    created timestamp,
    updated timestamp,
    sub_category_id int8,
    primary key (id)
);


create table characteristics
(
    id      bigserial not null,
    name    varchar(255),
    created timestamp,
    updated timestamp,
    primary key (id)
);

create table product
(
    id          bigserial not null,
    name        varchar(255),
    description varchar(255),
    cost        int8,
    quantity    int8,
    created     timestamp,
    updated     timestamp,
    sub_category_id int8,
    primary key (id)
);

create table sub_category
(
    id          bigserial not null,
    name        varchar(255),
    created     timestamp,
    updated     timestamp,
    category_id int8,
    primary key (id)

);

