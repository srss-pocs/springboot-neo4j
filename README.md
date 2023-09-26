# springboot-neo4j

Download Neo4J from https://neo4j.com/download/
Copy Activation Key and paste while installation

Open Neo4j desktop and create a project

![image](https://github.com/srss-pocs/springboot-neo4j/assets/145287517/c97d62e2-1975-41c1-892c-5b6b9ed4fa3a)


Start the project

Open Browser type http://localhost:7474
User Name : Neo4j
Password : enter the password while we created at the time of project creation

![image](https://github.com/srss-pocs/springboot-neo4j/assets/145287517/1b5fd5b6-4e40-46aa-8ae1-b758f40218c2)


APIS

http://localhost:8080/addBook
{
    "isbn": "1",
    "id":"1",
    "title": "Test Java",
    "year": 2022,
    "author": {
        "id": "1",
        "title": "By RKB"
    }
}

{
    "id": "2",
    "isbn": "2",
    "title": "Test Python",
    "year": 2022,
    "author": {
        "id": "1",
        "title": "By RKB"
    }
}

{
    "id": "2",
    "isbn": "2",
    "title": "Test Python",
    "year": 2022,
    "author": {
        "id": "2",
        "title": "By Ravi"
    }
}

![image](https://github.com/srss-pocs/springboot-neo4j/assets/145287517/96786389-0e12-4abc-ad0d-521b08da0528)




