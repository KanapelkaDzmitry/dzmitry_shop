INSERT INTO characteristic (id, name)
VALUES (1, 'Объем оперативной памяти');

INSERT INTO characteristic (id, name)
VALUES (2, 'Тип оперативной памяти');

INSERT INTO characteristic (id, name)
VALUES (3, 'Тактовая частота');

INSERT INTO characteristic (id, name)
VALUES (4, 'Бренд');

INSERT INTO characteristic (id, name)
VALUES (5, 'Бренд видеокарты');

INSERT INTO characteristic (id, name)
VALUES (6, 'Тип накопителя');

INSERT INTO characteristic (id, name)
VALUES (7, 'Диагональ экрана');

INSERT INTO characteristic (id, name)
VALUES (8, 'Разрешение экрана');

INSERT INTO characteristic (id, name)
VALUES (9, 'Год выхода модели');

INSERT INTO characteristic (id, name)
VALUES (10, 'Поверхность экрана');





INSERT INTO category (id, is_active, name)
VALUES (1, true, 'Ноутбуки и компьютерная техника');

INSERT INTO category (id, is_active, name)
VALUES (2, true, 'Смартфоны и гаджеты');

INSERT INTO category (id, is_active, name)
VALUES (3, true, 'Телевизоры и видео');





INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (1, true, 'Ноутбуки', 1);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (2, true, 'Моноблоки', 1);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (3, true, 'Системные блоки', 1);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (4, true, 'Мониторы', 1);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (5, true, 'Смартфоны', 2);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (6, true, 'Сотовые телефоны', 2);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (7, true, 'Радио телефоны', 2);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (8, true, 'Проводные телефоны', 2);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (9, true, 'Телевизоры', 3);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (10, true, 'Smart телевизоры', 3);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (11, true, 'LED телевизоры', 3);

INSERT INTO sub_category (id, is_active, name, category_id)
VALUES (12, true, 'Видеопроекторы', 3);





INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (1,1);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (1,2);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (1,3);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (2,1);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (2,8);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (2,4);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (3,1);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (3,7);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (3,9);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (4,5);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (4,10);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (4,6);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (5,3);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (5,8);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (5,5);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (6,3);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (6,6);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (6,1);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (7,8);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (7,4);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (7,5);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (8,2);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (8,7);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (8,6);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (9,1);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (9,5);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (9,10);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (10,2);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (10,4);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (10,9);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (11,10);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (11,5);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (11,4);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (12,2);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (12,1);

INSERT INTO link_subcategory_characteristic (subcategory_id, characteristic_id)
VALUES (12,7);