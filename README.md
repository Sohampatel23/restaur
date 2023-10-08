
# Restaurant Application

A spring boot application to integrated with H2 Database for CRUD operations and maintain data in local database.


## Data Flow

1. Restaursnt Main Application File
2. user,food,order Controller class which is Autowired
3. user,food,order Model class with entities
4. user,food,order Service class extending Repo class
5. user,food,order Repo class extend JPA Repository 
6. Mapping functionality and enum class

## Data Structure

List structure to show data

## Summary

Whole Project is built in spring boot application with IDE of Intellij Idea. Which contains controller class configured with model class to provide data source and Service which has actual logic to API's which can be tested on localhost of your own PC.
And also Repo class extends CrudRepository for to simplify database operations
