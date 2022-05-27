
-- 회원가입 table
CREATE TABLE SignUp
(
    user_id VARCHAR(10) NOT NULL PRIMARY KEY COMMENT '회원 아이디',
    user_password VARCHAR(200) NOT null COMMENT '회원 비밀번호',
    user_name VARCHAR(30) COMMENT '성명',
    user_sex VARCHAR(6) COMMENT '성별',
    user_phone VARCHAR(15) COMMENT '전화번호',
    user_email VARCHAR(30) COMMENT '이메일 주소',
    user_create_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '회원가입 일시'
)