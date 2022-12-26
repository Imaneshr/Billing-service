# **Customer Service**
## Customer Service first commit

### Dependencies
- Actuator
- Eureka client
- Lombok
- JPA Repository


### Entities
# Creation de la classe Bill
- utilisation de lannotation entity pour mapper la classe dans la base de données
>![Bill class](https://user-images.githubusercontent.com/102327247/205364306-2df132a9-8911-403b-afbf-d942d7676c74.PNG)


- Creation de la classe ProductItem
>![ProductItem class](https://user-images.githubusercontent.com/102327247/205364344-36544743-cd04-4b17-b4ab-3d1667a6113f.PNG)


### feign
# Creation du rest client customer
- using @FeignClient pour communiquer les micros services entre eux
>![feigncustomer](https://user-images.githubusercontent.com/102327247/205364273-bca28bfe-5df5-4b7a-b9a5-d54fd71d0fa5.PNG)


# Creation du rest client productItem
- using @FeignClient pour communiquer les micros services entre eux
>![feignproduct](https://user-images.githubusercontent.com/102327247/205364283-97a84183-a5c5-4ca2-bc1e-6635647e220e.PNG)


### model

#creation de la classe customer 
- without using entity to not mapp it in database
>![model_customer](https://user-images.githubusercontent.com/102327247/205364664-78ed6238-b4cd-46ef-83f5-cc9cc8db1862.PNG)


#create class customer 
- without using entity to not mapp it in database
>![model_product](https://user-images.githubusercontent.com/102327247/205364670-845c350c-d641-40ba-86bc-6ac72506b085.PNG)



### Repository Bill and ProductItem
- Creation de la interface BillRepository 

>1
>![repository bill](https://user-images.githubusercontent.com/102327247/205364791-0bc02f30-143e-4a23-a061-ee44caf316d4.PNG)

- Creation de la interface ProductItemRepository 

>1
![repository product](https://user-images.githubusercontent.com/102327247/205365058-3e1f247a-a231-47d7-8365-04bd4b1cad63.PNG)


### Rest Controller BillingRestController
>1/2
>![restbilling1](https://user-images.githubusercontent.com/102327247/205365263-622f1844-3f93-4194-8e46-3232a7f4b86d.PNG)



>2/2
>![restbilling2](https://user-images.githubusercontent.com/102327247/205365269-0d64e991-e516-4e5a-af95-968f2e2b3aa0.PNG)




### Application.properties
> enable discovery pour que le micro service Customer s'enregistre dans le service d'enregistrement a travers eureka client

>![properties billing](https://user-images.githubusercontent.com/102327247/205365583-9e8170ed-a002-43a4-8049-d90a8d140810.PNG)







# **___________________________END FIRST COMMIT___________________________**


















