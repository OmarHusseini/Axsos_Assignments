-- select city.city_id, customer.first_name, customer.last_name, customer.email, address.address, address.address2, city.city, country.country
-- from city
-- join country on city.country_id= country.country_id
-- join address on address.city_id= city.city_id
-- join customer on customer.address_id= address.address_id
-- where city.city_id=312;



-- select film.film_id, film.title, 
-- film.description, 
-- film.release_year,
--  film.rating, 
--  film.special_features, 
--  category.name as genre
-- from film
-- JOIN film_category ON film.film_id = film_category.film_id
-- JOIN category ON film_category.category_id = category.category_id;
 
 
 
 
 
-- select actor.actor_id,
-- actor.first_name,
-- film.title, 
-- film.description, 
-- film.release_year
-- from film
-- JOIN film_actor ON film.film_id = film_actor.film_id
-- JOIN actor ON film_actor.actor_id = actor.actor_id
-- where actor.actor_id=5;
 
 
--  select customer.first_name, customer.last_name, customer.email, address.address
--  from customer
--  join address  on customer.address_id = address.address_id
--  join store   on customer.store_id = store.store_id
-- join city  on address.city_id= city.city_id
-- where customer.store_id = 1 AND city.city_id IN (1, 42, 312, 459);



-- SELECT 
--     film.title, 
--     film.description, 
--     film.release_year, 
--     film.rating, 
--     film.special_features
-- FROM film
-- JOIN film_actor ON film.film_id = film_actor.film_id
-- JOIN actor ON film_actor.actor_id = actor.actor_id
-- WHERE film.rating = 'G'--     AND film.special_features LIKE '%behind the scenes%'-- AND actor.actor_id = 15;


-- SELECT 
--     film.film_id, 
--     film.title, 
--     actor.actor_id, 
--     CONCAT(actor.first_name, ' ', actor.last_name) AS actor_name
-- FROM film
-- JOIN film_actor ON film.film_id = film_actor.film_id
-- JOIN actor ON film_actor.actor_id = actor.actor_id
-- WHERE film.film_id = 369;


-- SELECT 
--     film.title, 
--     film.description, 
--     film.release_year, 
--     film.rating, 
--     film.special_features, 
--     category.name AS genre
-- FROM film
-- JOIN film_category ON film.film_id = film_category.film_id
-- JOIN category ON film_category.category_id = category.category_id
-- WHERE category.name = 'Drama'AND film.rental_rate = 2.99;


SELECT 
    film.title, 
    film.description, 
    film.release_year, 
    film.rating, 
    film.special_features, 
    category.name AS genre, 
    actor.first_name, 
    actor.last_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE category.name = 'Action'AND actor.first_name = 'Sandra'AND actor.last_name = 'Kilmer';



 
 
 
 
 