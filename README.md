# Simplilearn_Phase3
As a Full Stack Developer, design and develop an e-commerce portal sportyshoes.com for company that manufactures and sells sports shoes. It helps to create, insert, delete, list and update products in admin log in .To purchase sports shoes, user can view all the products in the user portal. 

Developed By Aishwarya S Shetty

Following the below steps to run the SportyShoes Applications:

1)Download the zip file and extract the files and folders.

2)Run the Extracted Application in the Eclipse IDE.

3)Run the below queries in MySQL to create Admin, User and Product database.

create table Admin(admincode varchar(20),username varchar(20),password varchar(20));

create table Product(product_id varchar(20), catagories varchar(20),brand varchar(20),price int(20),sz int(20));

create table User(first_name varchar(20),last_name varchar(20),username varchar(20),password varchar(20));
