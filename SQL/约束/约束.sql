#常见约束
/*
含义：一种限制。用于限制表中的数据，为了保证表中的数据的准确和可靠性

分类：六大约束
    not null：非空。用于保证该字段的值不为空；
    default：默认。用于保证该字段有默认值；
    primary key：主键。用于保证该字段的值具有唯一性并且非空；
    unique：唯一。用于保证该字段的值具有唯一性，可以为空；
    check：检查。【mysql不支持】
    foreign key：外键。用于限制两个表的关系，保证该字段的值必须来自于主表的关联列的值

添加约束的时机：
    1.创建表的时候
    2.修改表的时候

约束的添加分类：
    列级约束：六种约束都支持，但是外键约束没效果
    表级约束：除了非空、默认，其他都支持

主键和唯一 的区别：
                        唯一性         是否允许为空      一个表中个数      是否允许组合（不推荐）
    主键              √                           ×                   至多有1个                   √
    唯一              √                           √                   可以有多个                 √

外键：
    ①要求在从表设置外键关系
    ②从表的外键列的类型和主表的关系列的类型要求一致或兼容，名称无要求
    ③主表的关联列必须是一个key（一般是主键或唯一）
    ⑤插入数据时，先插入主表，再插入从表
       删除数据时，先删除从表，再删除主表
*/

#一、创建表时添加约束
#1.添加列级约束
/*
语法：
    直接在字段名和类型后面追加约束类型即可。
    只支持默认、非空、主键、唯一
*/
CREATE TABLE stuinfo(
    id INT PRIMARY KEY,#主键
    stuName VARCHAR(10) NOT NULL DEFAULT 'empty',#非空
    gender CHAR(1) CHECK(gender='男' OR gender='女'),#检查
    seat INT UNIQUE,#唯一
    age INT DEFAULT 18,#默认
    majorId INT REFERENCES major(id)#外键
);

CREATE TABLE major(
    id INT PRIMARY KEY,
    majorName VARCHAR(20)
);

#2.添加表级约束
/*
语法：在字段下面最下面
    【constraint 约束名】 约束类型(字段名)
*/
CREATE TABLE stuinfo(
    id INT,
    stuName VARCHAR(10),
    gender CHAR(1),
    seat INT ,
    age INT,
    majorId INT,
    PRIMARY KEY(id),
    UNIQUE(seat),
    FOREIGN KEY(majorId) REFERENCES major(id)
);


CREATE TABLE stuinfo(
    id INT,
    stuName VARCHAR(10),
    gender CHAR(1),
    seat INT ,
    age INT,
    majorId INT
);
#二、修改表时添加约束
/*
语法：
    列级约束：ALTER TABLE 表名 MODIFY 字段名 字段类型 约束;
    表级约束：ALTER TABLE 表名 ADD 约束类型(字段名);
*/
#1.添加非空约束
ALTER TABLE stuinfo MODIFY stuName VARCHAR(10) NOT NULL;

#2.添加默认约束
ALTER TABLE stuinfo MODIFY age INT DEFAULT 18;

#3.添加主键
ALTER TABLE stuinfo MODIFY id INT PRIMARY KEY;

#4.添加唯一约束
ALTER TABLE stuinfo MODIFY seat INT UNIQUE;

#5.添加外键
ALTER TABLE stuinfo ADD FOREIGN KEY(majorId) REFERENCES major(id);



#三、修改表时删除约束
#1、删除非空约束
ALTER TABLE stuinfo MODIFY stuName VARCHAR(10);

#2、删除默认约束
ALTER TABLE stuinfo MODIFY age INT;

#3、删除主键
ALTER TABLE stuinfo DROP PRIMARY KEY;

#4、删除唯一
ALTER TABLE stuinfo DROP INDEX seat;

#5、删除外键
ALTER TABLE stuinfo DROP FOREIGN KEY stuinfo_ibfk_4;
