	DROP TABLE T_WEDDING_GIFT_CART PURGE;
	DROP SEQUENCE T_WEDDING_GIFT_CART_SEQ;
	
	CREATE TABLE  T_WEDDING_GIFT_CART (
		NUM NUMBER(6,0) NOT NULL ENABLE, 
		NAME VARCHAR2(100) NOT NULL ENABLE, 
		EMAIL VARCHAR2(200) NOT NULL ENABLE, 
		TYPE VARCHAR2(100) NOT NULL ENABLE, 
		PRICE NUMBER(8,0) NOT NULL ENABLE, 
		BUYQUANTITY NUMBER(6,0) NOT NULL ENABLE, 
		TOTAL NUMBER(10,0) NOT NULL ENABLE, 
		PAYCHECK VARCHAR2(50)
   	);
   	
   	SELECT * FROM T_WEDDING_GIFT_CART;
  	 
  	CREATE SEQUENCE T_WEDDING_GIFT_CART_SEQ INCREMENT BY 1 START WITH 1 NOCYCLE NOCACHE;

  	ALTER TABLE T_WEDDING_GIFT_CART ADD CONSTRAINT T_WEDDING_GIFT_CART_PK PRIMARY KEY(NUM);
  	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'가나 초콜렛','wastty@naver.com','Food',1000,11,11000,'');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'GAS 커피','wastty@naver.com','Food',9000,19,171000,'ok');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'GAS 커피','wastty@naver.com','Food',9000,11,99000,'ok');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'GAS 커피','wastty@naver.com','Food',9000,9,81000,'ok');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'GAS 커피','wastty@naver.com','Food',9000,20,180000,'');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'장미향 디퓨저','wastty@naver.com','Useful',2500,15,37500,'ok');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'무지개 비누','wastty@naver.com','Kitchen',2000,7,14000,'');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'기본형 소이캔들','wastty@naver.com','Useful',2000,10,20000,'ok');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'아로마향 양초','wastty@naver.com','Useful',2500,10,25000,'ok');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'고급 컴받침','wastty@naver.com','Kitchen',4000,20,80000,'');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'커플 컵','wastty@naver.com','Kitchen',4000,5,20000,'ok');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'세련&고급 텀블러','ektha920@naver.com','Useful',5000,5,25000,'');
	
	INSERT INTO T_WEDDING_GIFT_CART 
	VALUES(T_WEDDING_GIFT_CART_SEQ.NEXTVAL,'와인 오프너','wastty@naver.com','Useful',2000,20,40000,'');

