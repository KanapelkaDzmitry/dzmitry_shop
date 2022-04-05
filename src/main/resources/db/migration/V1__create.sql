create sequence hibernate_sequence start 1 increment 1;

create table category
(
    id        int8 not null,
    is_active boolean,
    name      varchar(255),
    primary key (id)
);

create table characteristic
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);

create table link_subcategory_characteristic
(
    subcategory_id    int8 not null,
    characteristic_id int8 not null,
    primary key (subcategory_id, characteristic_id)
);

create table product
(
    id              int8 not null,
    cost            int4 not null,
    description     varchar(255),
    name            varchar(255),
    quantity        int4 not null,
    seller_code     int4,
    sub_category_id int8,
    primary key (id)
);

create table sub_category
(
    id          int8    not null,
    is_active   boolean not null,
    name        varchar(255),
    category_id int8,
    primary key (id)
);

alter table category
    add constraint UK_46ccwnsi9409t36lurvtyljak unique (name);

alter table characteristic
    add constraint UK_9r0uiwdfk26smpyokptibd84l unique (name);

alter table product
    add constraint UK_jmivyxk9rmgysrmsqw15lqr5b unique (name);

alter table product
    add constraint UK_evyiai4q5mnstbt1g0s49glpj unique (seller_code);

alter table sub_category
    add constraint UK_pxgji9v439t19r7qg0henfshu unique (name);

alter table link_subcategory_characteristic
    add constraint FKm9cvpfip0otkfr3m5v604qaj3
        foreign key (characteristic_id)
            references characteristic;

alter table link_subcategory_characteristic
    add constraint fk_subcategory_to_characteristic
        foreign key (subcategory_id)
            references sub_category;

alter table product
    add constraint FKd9gfnsjgfwjtaxl57udrbocsp
        foreign key (sub_category_id)
            references sub_category;

alter table sub_category
    add constraint FKl65dyy5me2ypoyj8ou1hnt64e
        foreign key (category_id)
            references category;





