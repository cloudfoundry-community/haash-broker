insert into services (id, name, description, bindable) values (LOCALTIME, LOCALTIME, 'HaaSh - HashMap as a Service', true);
insert into plans (id, name, description, service_id) values ('1', 'basic', 'Basic Plan', LOCALTIME);
