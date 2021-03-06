
/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table nface_manage_db.user_info
(
   id_user              varchar(32) not null,
   user_name            varchar(20) comment '用户名',
   password             varchar(30) comment '用户密码',
   department_code      varchar(10) comment '机构编码',
   mobile               varchar(15) comment '手机号码',
   email                varchar(40) comment '电子邮箱地址',
   ch_name               varchar(30) comment '姓名',
   primary key (id_user)
);

alter table nface_manage_db.user_info comment '用户表';

/*==============================================================*/
/* Index: Idx_user                                              */
/*==============================================================*/
create unique index Idx_user on nface_manage_db.user_info
(
user_name
);
