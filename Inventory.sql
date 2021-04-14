create database Inventory;
use Inventory;
show tables;

create table typePerson(
idTypePerson int not null primary key auto_increment,
typePerson varchar(45)
);

create table Person(
idPerson int not null primary key auto_increment,
firstName varchar(45),
lastName varchar(45),
wallet double,
typePerson int,
constraint fk_typePerson foreign key (typePerson) references typePerson(idTypePerson)
);


create table product(
idProduct int not null primary key auto_increment,
code varchar(45),
nameProduct varchar(45),
amount int,
price double
);

/*Relacion * a * entre productos y venta (products and sale)*/
create table sale(
idSale int not null primary key auto_increment,
dateSale date,
amount int,
total double,
customer int ,
constraint fk_client foreign key (customer) references person(idPerson)
);

create table Buy(
idBuy int not null primary key auto_increment,
dateBuy date,
amount int,
price double,
supplier int ,
constraint fk_supplier foreign key (supplier) references person(idPerson)
);

show tables ;

select * from typeperson;
insert into typeperson values (1,"Customer");
insert into typeperson values (2,"Supplier");
select * from person;

select idPerson , firstName , lastName , wallet, p.typeperson as "Type Person"
from person per
inner join typeperson p on p.idTypePerson = per.typeperson;

SELECT * FROM person WhERE typePerson = 1 ;
select * from product;
select * from person;

select idPerson , firstName , lastName , wallet, typeperson as supplier from persSon where typeperson = 2;

select * from product;
select * from person;
select * from typeperson;
select * from buy;
select * from BuyDetail;
select * from sale;
select * from SaleDetail;

select idBuy, dateBuy, b.amount, b.price, supplier, p.firstName,
t.typePerson, bp.product_idproduct, pro.code , pro.nameProduct
from buy b
inner join person p on b.supplier = p.idperson
inner join BuyDetail bp on bp.buy_idbuy = b.idbuy
inner join product pro on pro.idProduct = bp.product_idproduct
inner join typeperson t on t.idTypePerson = p.typeperson;

select idsale, datesale , s.amount, total, customer,
p.firstname, t.typeperson, sale_idsale , pro.nameproduct
from sale s
inner join person p on s.customer = p.idperson
inner join SaleDetail sp on sp.sale_idsale = s.idsale
inner join product pro on pro.idproduct = sp.product_idproduct
inner join typeperson t on t.idTypePerson = p.typeperson;


alter table saledetail add column idSaleDetail int not null primary key auto_increment;
describe saledetail;
drop table saledetail;
select * from saledetail;

create table saledetail(
idSaleDetail int not null primary key auto_increment,
sale_idSale int,
product_idProduct int,
amount int,
constraint fk_idSale foreign key (sale_idSale) references Sale(idSale),
constraint fk_idProduct foreign key (product_idProduct) references product(idProduct)
);