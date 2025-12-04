this simple examle project has some point that I want to explain to yours :
its simple project without database ,instead of that one list saves data when our project is up .
it has one service layer that use from spring and there objects creat by springDI ,this service get names from  url like queryParam and save them in list .
controller layer: it use rest for make connection with client .
in postman when you write  "Localhost:8080/hellow?name=ali" it saves this name and when you use :localhost:8080/hellow/allNames"it return all names .
