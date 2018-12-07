* Extract Hsqldb *(It's in the common share)*
* Go to **bin** folder
* Click **runServer** to start the server
* Click **runManager** to start the client

* create a database **training**
* create a table **persons**

```sql
create database training;
create table training.persons(
	id int(4) primary key not null auto_increment,
	name varchar(40),
	age int(4)
	);
```


 