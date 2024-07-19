Drop table member;
CREATE table member(
	mno NUMBER(5) CONSTRAINT MT_NO_PK PRIMARY KEY,
	id NVARCHAR2(8) CONSTRAINT MT_ID_UQ UNIQUE,
	pw NVARCHAR2(15) CONSTRAINT MT_PW_NN NOT NULL,
	name NVARCHAR2(5) CONSTRAINT MT_NAME_NN NOT NULL,
	nickName NVARCHAR2(10) CONSTRAINT MT_NICK_UQ UNIQUE,
	birth Date,
	sex NVARCHAR2(2),
	phone NVARCHAR2(20),
	mail NVARCHAR2(50),
	author NVARCHAR2(10) );
	
CREATE SEQUENCE mem_seq
	INCREMENT BY 1
	START WITH 1
	NOCACHE;
--alter table member MODIFY sex constraint MT_SEX_CK CHECK sex IN ('남','여'); 
--sql2는 도메인을 명시적으로 정의하지만, 오라클은 지원하지 않음

--alter table member rename Column author To authorname; --필드명 변경
--alter table member add constraint MT_AT_FK foreign key authorname REFERENCES author(authorname);

--member 생성완료

--더미데이터
insert into MEMBER (mno, id, pw, name, nickName, birth, sex, phone, mail, author) 
VALUES (mem_seq.nextval, 'aaa', 'aaa', 'aname', 'anick', TO_DATE('2020/01/01','YYYY/MM/DD'),'여','010-123-4567','aaa@mail.com','MANAGER');
insert into MEMBER (mno, id, pw, name, nickName, birth, sex, phone, mail, author) 
VALUES (mem_seq.nextval, 'bbb', 'bbb', 'bname', 'bnick', TO_DATE('1999/12/31','YYYY/MM/DD'),'남','010-123-4567','bbb@mail.com','USER');

update member set mail = 'bbb@mail.com' where id='bbb';

select * from MEMBER;
select * from author;

select * from show.board;
grant select on member to show;


--author테이블(외래키용으로 했으나 잘 연결되지 않아 사용하지 않음)
CREATE TABLE author(
	alevel NUMBER(2) NOT NULL,
	authorname NVARCHAR2(10) PRIMARY KEY
);

alter table author RENAME column alevel TO level; 
insert into author values(0,'GUEST');
insert into author values(1,'USER');
insert into author values(2,'MANAGER');
insert into author values(3,'ADMIN');

