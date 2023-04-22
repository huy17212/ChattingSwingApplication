
use DB_zola_fake

SELECT Ho_ten, Image_avatar FROM Other_user WHERE (Username_other_user = (SELECT Username_user FROM [User]))

select * from Other_user

-- INSERT INTO OTHER USER
delete from [OTHER_USER]
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('system','abc','1/1/2001',N'Nam','background1.jpg','avatar1.png',N'Hệ Thống')	
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('huy1721','abc','2/12/2005',N'Nam','background1.jpg','avatar1.png',N'Hà Huy Trí')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('baohan','abc','27/8/1997',N'Nữ','background1.jpg','avatar2.png',N'Lê Trần Bảo Hân')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('ngochan1','abc','14/3/2001',N'Nữ','background1.jpg','avatar3.png',N'Bùi Kim Ngọc Hân')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('KN','abc','14/3/2001',N'Nữ','background1.jpg','avatar3.png',N'Nguyễn Khánh Nguyên')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('yentrang','abc','10/6/2003',N'Nữ','background1.jpg','avatar4.png',N'Bùi Ngọc Yên Trang')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('bichthao','abc','16/3/2002',N'Nữ','background1.jpg','avatar5.png',N'Ngô Thị Bích Thảo')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('ngochan2','abc','29/3/2003',N'Nữ','background1.jpg','avatar6.png',N'Vũ Thị Ngọc Hân')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('khanhvy1','abc','29/3/2003',N'Nữ','background1.jpg','avatar7.png',N'Nguyễn Huỳnh Xuân Vy')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('linhthu','abc','28/08/1998',N'Nữ','background1.jpg','avatar8.png',N'Mai Nguyễn Thu Linh')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('khanhvy2','abc','29/3/2003',N'Nữ','background1.jpg','avatar9.png',N'Nguyễn Huỳnh Xuân Vy')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('nguyetanh','abc','29/7/1972',N'Nữ','background1.jpg','avatar10.png',N'Nguyễn Thị Nguyệt Ánh')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('minhanh','abc','29/3/2003',N'Nữ','background1.jpg','avatar11.png',N'Lương Thị Minh Anh')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('thuylinh','abc','17/5/2005',N'Nữ','background1.jpg','avatar12.png',N'Hoàng Thùy Linh')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('trinhhuyen','abc','29/7/2001',N'Nữ','background1.jpg','avatar13.png',N'Trịnh Thị Huyền')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('haiyen','abc','29/7/2001',N'Nữ','background1.jpg','avatar14.png',N'Phan Hồ Hải Yến')																		
INSERT INTO [OTHER_USER] ( Username_other_user,[Password],Birth_day,Gender,Image_back_ground,Image_avatar,Ho_ten) VALUES ('tranthu','abc','29/7/2001',N'Nữ','background1.jpg','avatar1.png',N'Nguyễn Ngọc Minh Thư')																		

-- INSERT INTO CAPCHA
select * From capcha
INSERT INTO Capcha (ID_capcha,Image_capcha,Code_capcha) VALUES (1,'capcha1.png','dxV2k3Zi9')
INSERT INTO Capcha (ID_capcha,Image_capcha,Code_capcha) VALUES (2,'capcha2.png','ReNaVc4tz')
INSERT INTO Capcha (ID_capcha,Image_capcha,Code_capcha) VALUES (3,'capcha3.png','v6t9jBCDs')
INSERT INTO Capcha (ID_capcha,Image_capcha,Code_capcha) VALUES (4,'capcha4.png','53t9jBCDs')

-- INSERT INTO USER

INSERT INTO [USER] VALUES ('huy1721','abc')
SELECT * FROM [USER]

SELECT * FROM [Other_user]

UPDATE [Other_user] SET Image_avatar = 'admin.png' WHERE Username_other_user = 'system'


DELETE FROM [Other_user] WHERE Username_other_user = 'bichthao'
SELECT * FROM [User]

SELECT * FROM Capcha

SELECT * FROM Friend_accept

UPDATE Exit_or_not set signal = 1;
SELECT * FROM Exit_or_not

select * from Exit_or_not
SELECT * FROM [USER]

-- INSERT INTO LIST_FRIEND


SELECT * FROM [USER]

INSERT INTO Exit_or_not VALUES 
(1)

INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','baohan')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','ngochan1')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','KN')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','yentrang')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','bichthao')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','ngochan2')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','khanhvy1')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','linhthu')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','khanhvy2')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','nguyetanh')
INSERT INTO LIST_FRIEND (Username_user,Username_other_user) VALUES ('huy1721','minhanh')

-- INSERT INTO CHAT
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','baohan',1,N'Hello mah friend','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','ngochan1',1,N'Xin chào','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','KN',1,N'Chào bạn','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','yentrang',1,N'Mọi thứ vẫn ổn chứ','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','bichthao',1,N'Helu Trí ơi','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','ngochan2',1,N'Hello Hân','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','khanhvy1',1,N'Vy ưi, chào em','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','linhthu',1,N'Xin chào Linh','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','khanhvy2',1,N'Chào Vy','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','nguyetanh',1,N'eilo mate','huy1721')												
INSERT INTO CHAT (Username_user,Username_other_user,ID_type,[Text],Who_send) VALUES ('huy1721','minhanh',1,N'Chào em Minh Anh nhá','huy1721')	

-- INSERT INTO TYPE_MESS

INSERT INTO TYPE_MESS (ID_type,Type_mess) VALUES (1,'link')
INSERT INTO TYPE_MESS (ID_type,Type_mess) VALUES (2,'image')
INSERT INTO TYPE_MESS (ID_type,Type_mess) VALUES (3,'text')

INSERT INTO List_friend values 
('huy1721', 'baohan')



INSERT INTO [Group] VALUES 
( N'JAVA CAFE','Group_hoinhomjava.png'),
( N'Hội lập trình viên C++, Java, PHP,...','HoiNhomCppJavaPhp.png'),
( N'Grab VietNam','GrabVietNam.png'),
( N'VietNamese Sexy Beauty Group','VNSBG.jpg'),
( N'Fan cứng CR7','CR7Cry.png'),
( N'CafeF','CafeF.png'),
( N'Hội lướt sóng chứng khoán','LuotSong.png')

Delete FROM [Group]

INSERT INTO []



select  max(c.ID_chat), c.Username_other_user, o_u.Image_avatar, c.[Text] FROM Chat c LEFT JOIN Other_user o_u on c.Username_other_user = o_u.Username_other_user GROUP BY  c.Username_other_user, o_u.Image_avatar, c.[Text] ORDER BY MAX(ID_chat) desc

use DB_zola_fake

DELETE FROM 

SELECT * FROM Other_user
SELECT * FROM [Chat]
SELECT [text] FROM [CHAT]
SELECT * FROm [GROUP]
SELECT * FROM Group_list 
SELECT * FROM Group_chat_inventory
SELECT * FROm List_friend
SELECT * FROM [USER]
SELECT * FROM [Other_user] WHERE Username_other_user = 

SELECT * FROM [Other_user]
SELECT * FROm Group_chat_inventory

select max(c.ID_chat), c.Username_other_user, o_u.Image_avatar FROM Chat c LEFT JOIN Other_user o_u on c.Username_other_user = o_u.Username_other_user WHERE c.Username_other_user like '%' GROUP BY  c.Username_other_user, o_u.Image_avatar  ORDER BY MAX(ID_chat) desc
select * from Capcha



SELECT Chat.Text, Chat.Username_other_user, Other_user.Image_avatar FROM CHAT LEFT JOIN Other_user ON Other_user.Username_other_user = Chat.Username_other_user WHERE ID_chat  = (SELECT Max(ID_chat) FROM CHAT WHERE Username_other_user = 'bichthao')


SELECT ID_chat, Ou.Username_other_user FROM Chat C
LEFT JOIN Other_user Ou on C.Username_other_user = Ou.Username_other_user
WHERE

SELECT 
	Chat.Text, 
	Chat.Username_other_user, 
	Other_user.Image_avatar  
FROM CHAT LEFT JOIN Other_user ON Other_user.Username_other_user = Chat.Username_other_user
WHERE ID_chat  = (SELECT Max(ID_chat) FROM CHAT WHERE Username_other_user = 'bichthao')

SELECT"
                        + "	Chat.Text,"
                        + "	Chat.Username_other_user,"
                        + "	Other_user.Image_avatar "
                        + "FROM CHAT LEFT JOIN Other_user ON Other_user.Username_other_user = Chat.Username_other_user"
                        + "WHERE ID_chat  = (SELECT Max(ID_chat) FROM CHAT WHERE Username_other_user = ?)


GO
CREATE VIEW [table] AS
	SELECT 
		ID_chat, 
		Username_other_user 
	FROM CHAT
GO
SELECT * FROM [table]

SELECT * FROM [Chat]

	select max(c.ID_chat), c.Username_other_user, o_u.Image_avatar FROM Chat c LEFT JOIN Other_user o_u on c.Username_other_user = o_u.Username_other_user GROUP BY  c.Username_other_user, o_u.Image_avatar ORDER BY MAX(ID_chat) desc

select max(c.ID_chat), c.Username_other_user, o_u.Image_avatar FROM Chat c LEFT JOIN Other_user o_u on c.Username_other_user = o_u.Username_other_user WHERE c.Username_other_user like '%a%' GROUP BY  c.Username_other_user, o_u.Image_avatar  ORDER BY MAX(ID_chat) desc
															
Select [Text] FROM [Group_chat] WHERE ID_Group_chat = 5

SELECT * FROM Other_user
SELECT * FROM List_friend

INSERT INTO Friend_accept 
VALUES 
('trinhhuyen'),
('tranthu')

INSERT INTO Friend_send 
VALUES 
('nguyetanh')


use DB_zola_fake
SELECT * FROM Accept_temp

SELECT * FROm [Group_chat_inventory]
SELECT * FROM Other_chat
SELECT * FROM List_friend
SELECT * FROM Friend_send
SELECT * FROM Friend_accept
SELECT * FROM Capcha
SELECT * FROM Chat
SELECT * FROM Other_user
SELECT * FROM SEND_TEMP
SELECT * FROM Friend_accept
SELECT * FROm [Group]
SELECT * FROM [Group_list]
SELECT * FROM [Group_chat]

SELECT ID_group FROM [Group] WHERE Name_group = 'VietNamese Sexy Beauty Group'

DELETE FROM [Group]


DELETE FROM [Send_temp] Where Username_other_user = 'huy1721'
SELECT * FROM CHAT WHERE Username_other_user = 'system'

SELECT * FROM List_friend_temp
DELETE FROm Group_chat_inventory

DELETE FROM [Group_list]
DELETE FROM [Group_chat]
DELETE FROM Chat
DELETE FROM List_friend
DELETE FROM [User]
DELETE FROM Friend_accept
DELETE FROM Friend_send
DELETE FROM [SEND_Temp]
UPDATE Exit_or_not set signal = 1;
DELETE FROM Chat WHERE Username_other_user = 'haiyen'
DELETE FROM List_friend WHERE Username_other_user = 'haiyen'
DELETE FROM Friend_accept WHERE Username_other_user = 'haiyen'




SELECT O_u.Username_other_user, Image_avatar FROM Other_user O_u WHERE O_u.Username_other_user like ? and O_u.Username_other_user not in (SELECT Username_other_user FROM List_friend) and O_u.Username_other_user not in (?, ?) and O_u.Username_other_user not in (SELECT * FROM Friend_send)

use DB_zola_fake


SELECT * FROM OTHER_USER
DELETE FROM OTHER_USER WHERE Username_other_user = 'huy1746'
INSERT INTO Who_login 
Values 
('')

SELECT * FROM [Group]

SELECT O_u.Username_other_user, Image_avatar FROM Other_user O_u WHERE O_u.Username_other_user like '%%' and O_u.Username_other_user not in (SELECT Username_other_user FROM List_friend) and O_u.Username_other_user not in ('huy1721', 'system') and O_u.Username_other_user not in (SELECT * FROM Friend_send) and O_u.Username_other_user not in (SELECT * FROM Friend_accept)

select max(c.ID_chat), c.Username_other_user, o_u.Image_avatar FROM Chat c LEFT JOIN Other_user o_u on c.Username_other_user = o_u.Username_other_user GROUP BY  c.Username_other_user, o_u.Image_avatar ORDER BY MAX(ID_chat) desc

select  MAX(G_c.ID_group_chat) as 'ID' , G.name_group, G.Image_group FROM Group_chat G_c LEFT JOIN Group_list G_l ON G_l.ID_group = G_c.ID_group LEFT JOIN [Group] G ON G.ID_group = G_c.ID_group WHERE G.ID_group = G_c.ID_group and G_c.ID_group in (SELECT ID_group FROM Group_chat) GROUP BY G.name_group, G.Image_group ORDER BY  MAX(G_c.ID_group_chat) desc

SELECT * FROM [Group]
SELECT * FROM [Group_list]


SELECT ID_group FROM [Group] WHERE Name_group = 'CafeF'



	Update other_user set [Password] = ?, Birth_day = ?, Gender = ?, Image_back_ground = ?, Image_avatar = ? Ho_ten = ?  where Username_other_user = ?