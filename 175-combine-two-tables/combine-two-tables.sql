# Write your MySQL query statement belon
select firstName, lastName, city, state from person left join address on person.personId = address.personId;