INSERT INTO "PRODUCT_TYPES" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,PRODUCT_TYPES_DESCRIPTION,PRODUCT_TYPES_NAME)
VALUES (9999 /*not nullable*/,'s',{ts '2016-05-03 20:05:23.890000'},'s','s',{ts '2016-05-03 20:05:23.890000'},0,'-','ผลิตภัณท์บำรุงผิว'),
(9998 /*not nullable*/,'s',{ts '2016-05-03 20:05:23.890000'},'s','s',{ts '2016-05-03 20:05:23.890000'},0,'-','ผลิตภัณท์เสริมอาหาร');

--INSERT INTO "PRODUCT" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,PRODUCT_DETAILS,PRODUCT_ID,PRODUCT_NAME,PRODUCT_PICTURE,PRODUCT_PRICE,PRODUCT_TYPES)
--VALUES (9999 /*not nullable*/,'s',{ts '2016-05-03 20:03:08.532000'},'s','s',{ts '2016-05-03 20:03:08.532000'},0,'test1','0001','test1','git.png',100,9999),
--(9998 /*not nullable*/,'s',{ts '2016-05-03 20:03:08.532000'},'s','s',{ts '2016-05-03 20:03:08.532000'},0,'test2','0002','test2','peace-sign.jpg',120,9999),
--(9997 /*not nullable*/,'s',{ts '2016-05-03 20:03:08.532000'},'s','s',{ts '2016-05-03 20:03:08.532000'},0,'test3','0003','test3','css3.jpg',200,9998);

INSERT INTO "EMPLOYEE" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,EMP_ADDR,EMP_CODE,EMP_EMAIL,EMP_NAME,EMP_TEL)
VALUES (9999 /*not nullable*/,'s',{ts '2016-05-12 14:36:19.767000'},'s','s',{ts '2016-05-12 14:36:19.767000'},0,'GGGGGGGGG','9999','test1','test1','080-0000000'),
(9998 /*not nullable*/,'s',{ts '2016-05-12 14:36:19.767000'},'s','s',{ts '2016-05-12 14:36:19.767000'},0,'GGGGGGGGG','9998','test2','test2','081-11111111'),
(9997 /*not nullable*/,'s',{ts '2016-05-12 14:36:19.767000'},'s','s',{ts '2016-05-12 14:36:19.767000'},0,'GGGGGGGGG','9997','test3','test3','082-22222222');



INSERT INTO "CUSTOMER_TYPE" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,CUSTOMER_PRIVILLEGE,CUSTOMER_TYPE_CODE,CUSTOMER_TYPE_NAME)
VALUES (9999 /*not nullable*/,'s',{ts '2016-05-15 14:52:43.782000'},'s','s',{ts '2016-05-15 14:52:43.782000'},0,'GG',1,'user');


INSERT INTO "CUSTOMER" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,CUSTOMER_ADDR,CUSTOMER_AGE,CUSTOMER_BIRTH_DAY,CUSTOMER_EMAIL,CUSTOMER_NAME,CUSTOMER_TEL,LOGINSTATUS,USER_ID,USER_PASSWORD,CUSTOMER_TYPES)
VALUES (9999 /*not nullable*/,'s',{ts '2016-05-15 13:28:43.240000'},'s','s',{ts '2016-05-15 13:28:43.240000'},0,'s',0,{ts '2016-05-15 13:28:43.240000'},'zazabi37@gmail.com','รวิพล ไกรศรีบวร','080-000-0000',0,'test1234','12345678',9999);


INSERT INTO "INFORMATION" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,INFORMATION_DETAIL,INFORMATION_NAME,INFORMATION_PICTURE_NAME)
VALUES (9999 /*not nullable*/,'s',{ts '2016-05-12 17:11:26.530000'},'s','s',{ts '2016-05-12 17:11:26.530000'},0,'bueaty Buffet','Beauty Buffet','pic_infor_1.jpg');

INSERT INTO "MASSAGE_TYPES" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,MASSAGE_TYPE_CODE,MASSAGE_TYPE_DETAIL,MASSAGE_TYPE_NAME)
Values (9999 /*not nullable*/,'s',{ts '2016-05-15 13:10:33.174000'},'s','s',{ts '2016-05-15 13:10:33.174000'},0,'mt-001','mt-001','นวดผ่อนคลาย'),
(9998 /*not nullable*/,'s',{ts '2016-05-15 13:10:33.174000'},'s','s',{ts '2016-05-15 13:10:33.174000'},0,'mt-002','mt-002','เสริมความงาม');


INSERT INTO "MASSAGE" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,MASSAGE_CODE,MASSAGE_DETAIL,MASSAGE_NAME,MASSAGE_TIME,MASSAGE_TYPES)
VALUES (9999 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'001','การอบสมุนไพรช่วยล้างพิษทางเหงื่อ ช่วยให้เลือดเลี้ยงที่ผิวหนังมากขึ้น','วารีบำบัด',30,9998),
(9998 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'002','ขัดผิวหนังโดยใช้สมุนไพรนานาชนิด เช่น ว่านนางคำ ไพล ใบมะขาม ตำลึง ทองพันชั่ง ว่านหางจะเข้ กระเจี๊ยบ มะรุม อีกทั้งยังมีน้ำผึ้งเป็นส่วนผสม ช่วยทำความสะอาดผิวกาย กระชับรูขุมขนและช่วยทำความสะอาดผิวกาย กระชับรูขุมขนทำให้ผิวนุ่มและลดอาการผื่นคัน','ขัดผิวหนัง',60,9998),
(9997 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'003','การนวดผ่าเท้า','นวดเท้า',60,9999),
(9996 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'004','นวดกดจุดสะท้อนฝ่าเท้า+ประคบร้อนเท้า','นวดกดจุดสะท้อนฝ่าเท้า+ประคบร้อนเท้า',60,9999),
(9995 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'005','นวดอโรม่า','นวดอโรม่า',60,9999),
(9994 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'006','นวดน้ำมันรีดเส้น','นวดน้ำมันรีดเส้น',90,9999),
(9993 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'007','นวดคอบ่าไหล','นวดคอบ่าไหล่',45,9999),
(9992 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'008','นวดไทย','นวดไทย',60,9999),
(9991 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'009','นวดไทย(นวดบำบัดฉบับบัวสปา)+ประคบสมุนไพร','นวดไทย(นวดบำบัดฉบับบัวสปา)+ประคบสมุนไพร',90,9999),
(9990 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'010','นวดศรีษะและเส้นผม','นวดศรีษะและเส้นผม',60,9999),
(9989 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'011','นวดศรีษะสไตล์อินเดีย','นวดศรีษะสไตล์อินเดีย',90,9999),
(9988 /*not nullable*/,'s',{ts '2016-05-15 23:21:18.720000'},'s','s',{ts '2016-05-15 23:21:18.720000'},0,'012','นวดกระชับสัดส่วน','นวดกระชับสัดส่วน',60,9999);


INSERT INTO "MASSAGE_EVENT" (ID,CREATED_BY,CREATED_DATE,STATUS,UPDATED_BY,UPDATED_DATE,VERSION,EVENT_END_TIME,EVENT_START_TIME,RESERVE_DATE,EMPLOYEE,MASSAGE,USER_RESERVE)
VALUES (9999 /*not nullable*/,'s',{ts '2016-05-15 13:27:50.845000'},'s','s',{ts '2016-05-15 13:27:50.845000'},0,{ts '2016-05-20 15:00:00.000000'},{ts '2016-05-20 13:00:00.000000'},{ts '2016-05-20 00:00:00.000000'},9999,9998,9999),
(9998 /*not nullable*/,'s',{ts '2016-05-15 13:27:50.845000'},'s','s',{ts '2016-05-15 13:27:50.845000'},0,{ts '2016-05-20 12:00:00.000000'},{ts '2016-05-20 09:00:00.000000'},{ts '2016-05-20 00:00:00.000000'},9998,9999,9999),
(9997 /*not nullable*/,'s',{ts '2016-05-15 13:27:50.845000'},'s','s',{ts '2016-05-15 13:27:50.845000'},0,{ts '2016-05-21 14:00:00.000000'},{ts '2016-05-21 13:00:00.000000'},{ts '2016-05-19 00:00:00.000000'},9998,9997,9999),
(9996 /*not nullable*/,'s',{ts '2016-05-15 13:27:50.845000'},'s','s',{ts '2016-05-15 13:27:50.845000'},0,{ts '2016-05-21 15:30:00.000000'},{ts '2016-05-21 14:00:00.000000'},{ts '2016-05-11 00:00:00.000000'},9997,9996,9999),
(9995 /*not nullable*/,'s',{ts '2016-05-15 13:27:50.845000'},'s','s',{ts '2016-05-15 13:27:50.845000'},0,{ts '2016-05-21 14:30:00.000000'},{ts '2016-05-21 13:00:00.000000'},{ts '2016-05-11 00:00:00.000000'},9999,9995,9999),
(9994 /*not nullable*/,'s',{ts '2016-05-15 13:27:50.845000'},'s','s',{ts '2016-05-15 13:27:50.845000'},0,{ts '2016-05-21 12:30:00.000000'},{ts '2016-05-21 11:00:00.000000'},{ts '2016-05-16 00:00:00.000000'},9997,9994,9999);

