# _virtual-pets_

#### _virtual-pets, 03-30-2017_

#### By _**Dallas Slaughter and Mark Fisher**_

## Description
_Example text for the description of the project_


## Specifications

| Behavior                   | Input Example     | Output Example    |
| -------------------------- | -----------------:| -----------------:|



## Setup/Installation Requirements

* _Clone the repository_
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_

CREATE DATABASE virtual_pets;
CREATE TABLE persons (id serial PRIMARY KEY, name varchar, email varchar);
CREATE TABLE monsters (id serial PRIMARY KEY, name varchar, personID int, birthday timestamp, lastate timestamp, lastslept timestamp, lastplayed timestamp, type varchar, lastWater timestamp, lastKindling timestamp);
CREATE TABLE communities (id SERIAL PRIMARY KEY, name varchar, description varchar);
CREATE TABLE communities_persons (id serial PRIMARY KEY, community_id int, person_id int);



DROP DATABASE virtual_pets_test;
CREATE DATABASE virtual_pets_test WITH TEMPLATE virtual_pets;


### License

Copyright (c) 2017 **_Dallas Slaughter and Mark Fisher**

This software is licensed under the MIT license.
