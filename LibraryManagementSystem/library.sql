create table member(
member_id int CONSTRAINT mem_id_pk PRIMARY KEY,
m_name VARCHAR(30),
m_address VARCHAR(30),
m_gender VARCHAR(30),
DOB VARCHAR(30),
DOJ VARCHAR(30),
phn_no VARCHAR(30));

create table librarian(
l_id int CONSTRAINT lib_lid_pk PRIMARY KEY,
l_address varchar(30),
l_name varchar(30),
l_number int);

create table book(bookid number,
bookt varchar(30),
booka1 varchar(30),
booka2 varchar(30) ,
bookp varchar(30));

create table lending(Mem_ID int,
LibId int, 
bookid1 VARCHAR(30),
bookid2 VARCHAR(30),
bookid3 VARCHAR(30),
bookid4 VARCHAR(30),
bookid5 VARCHAR(30),
lnddate VARCHAR(30),
rtrndate VARCHAR(30));