drop table if exists hquer;
drop table if exists message;
create table hquer (
  id identity,
  firstname varchar(25) not null,
  lastname varchar(25)  not null,
  username varchar(25) not null,
  email varchar(50) not null,
  password varchar(25) not null
);

create table message (
  id integer identity primary key,
  hquerId integer not null,
  message varchar(2000) not null,
  postedTime datetime not null,
  foreign key(hquerId) references hquer(id)
);