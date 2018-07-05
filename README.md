# luncher
Lunch ordering for offices

start database by
```
docker run -d -p 5432:5432 --name postgres -e POSTGRES_USER=pg -e POSTGRES_PASSWORD=pggg -e POSTGRES_DB=luncher postgres
```

create tables for pre JPA version
```sql
create table users
(
  id   serial      not null
    constraint users_pkey
    primary key,
  nick varchar(30) not null,
  uid  varchar(128)
);

create unique index users_id_uindex
  on users (id);
```