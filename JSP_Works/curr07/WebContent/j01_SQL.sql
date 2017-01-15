

	drop table t_board purge;
	drop sequence t_board_seq;
	
	create table t_board(
		num			number(6) primary key,
		groupNum 	number(6) not null,
		replySeq	number(6) not null,
		replyLevel  number(6) not null,
		viewCnt 	number(6) not null,
		title		varchar2(200),
		writer		varchar2(200),
		contents	varchar2(200),
		saveDate	date
	);
	
	create sequence t_board_seq
		increment by 1 start with 1 nocycle nocache;
		
	select rownum rnum, tt.* from t_board tt;
	
	select rownum rnum, tt.* from
		(select * from t_board 
			order by groupNum desc, replySeq asc) tt;
			
	select * from
	(select rownum rnum, tt.* from
		(select * from t_board 
			order by groupNum desc, replySeq asc) tt)
			where rnum >=1 and rnum <= 5;
	
			
			
			
			
	select count(*) as cnt from t_board;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	