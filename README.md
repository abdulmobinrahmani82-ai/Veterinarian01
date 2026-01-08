 1. Introduction

In this project, I made a small program in Java to manage pets, owners, and veterinarians. The goal was to practice OOP concepts like classes, inheritance, and methods.

 2. Classes

Person: Base class with name and phone.
Owner: Inherits Person, has address and a pet. Can show info and vaccinate the pet.
Veterinarian: Inherits Person, has specialization and availability. Can treat pets and change status.
Pet: Has name, type, age, and vaccination status. Can be vaccinated and show info.


 3. How It Works

1. I created one owner (`Ali`) with a pet (`Max`) and one veterinarian (`Sara`).
2. All people are stored in a list.
3. The program goes through the list:

   * If it’s an owner, it shows info and vaccinates the pet.
   * If it’s a vet, it treats the pet (changes availability after first treatment).


 4. Concepts Learned

Inheritance: Owner and Veterinarian extend Person.
Polymorphism: `getRole()` works differently in each class.
Encapsulation: Variables are private and used with methods.
ArrayList & instanceof: To store and use different objects in one list.
  
 5. Conclusion

I learned how to make classes, use inheritance, and connect objects like owners and pets. This project helped me understand OOP better and practice Java basics.

