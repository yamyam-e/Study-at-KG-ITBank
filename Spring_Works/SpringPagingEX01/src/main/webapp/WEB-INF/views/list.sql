	drop table t_list purge;
	drop sequence t_list_seq;
	
	create table t_list(
		num number(5) primary key,
		title varchar2(100),
		content varchar2(200)
	);
	
	create sequence t_list_seq
	increment by 1 start with 1 nocycle nocache;
	
	select * from t_list;
	
	insert into t_list 
	values(t_list_seq.nextval, 1, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 2, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 3, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 4, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 5, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 6, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 7, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 8, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 9, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 10, 11111);
	insert into t_list 
	values(t_list_seq.nextval, 1, 11111);