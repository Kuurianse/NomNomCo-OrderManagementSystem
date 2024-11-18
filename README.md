# NomNom Co. Order Management System: Implementing OOP Design Patterns for Production Automation

## Project Description  
This project was developed for **NomNom Co.**, a confectionary store experiencing a surge in orders due to sudden popularity. The system aims to automate the order management process by implementing several Object-Oriented Programming (OOP) design patterns, namely:  

1. **Factory Method**  
   - Implements an interface or abstract class to create various types of confectionaries (e.g., "Cupcake" or "Tart"). Subclasses are responsible for deciding which object type to create.

2. **Singleton**  
   - Restricts the instantiation of the database to only one instance throughout the program runtime, ensuring centralized and consistent order data.

3. **Adapter**  
   - Bridges different interfaces so various program components can work together without conflict.

## Key Features  
- **Interactive Menu:**  
  Users can choose to create a new confectionary, view the list of orders, or exit the program.  

- **Confectionary Creation:**  
  - Input validation for type, name, softness level, toppings, price, and payment method.  
  - Price conversion based on the payment method (Cash, Transfer, or Crypto).  
  - Successfully created confectionaries are added to the database.  

- **Order Viewing:**  
  - Displays all orders from the database with detailed information, including toppings (if any) and payment details (randomized account number for Transfer or a random Crypto address).  

- **Optimized Design Patterns:**  
  - **Factory Method** for modularity of confectionary types.  
  - **Singleton** to ensure a single database instance.  
  - **Adapter** for payment interface compatibility.  

## Advantages  
This system integrates OOP design patterns to ensure efficient data management, strict input validation, and an intuitive user experience. It demonstrates proficiency in problem analysis, software architecture design, and implementation of industry-standard coding practices.
