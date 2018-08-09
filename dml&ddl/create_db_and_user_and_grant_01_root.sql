create DATABASE nface_manage_db;

create user nface_manage_server identified by 'manage_server_123';

GRANT select,insert,update,delete on nface_manage_db.* TO 'nface_manage_server';

grant select,insert,update,delete on nface_app_server_db.* to 'nface_manage_server';