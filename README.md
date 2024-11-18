# NomNomCo-OrderManagementSystem

## Project Description
This project was developed for NomNom Co., a confectionery store experiencing a sudden surge in orders due to its newfound popularity.  
The system aims to automate order management using several Object-Oriented Programming (OOP) design patterns:

1. **Factory Method**: Simplifies the creation of different types of confectionery (e.g., "Cupcake" or "Tart").
2. **Singleton**: Ensures only one database instance is active to maintain centralized, consistent data.
3. **Adapter**: Bridges different interfaces to ensure compatibility across program modules.

## Key Features
- **Interactive Menu**:
  - Users can create new confectionery items, view order lists, or exit the program.

- **Confectionery Creation**:
  - Validates input for type, name, texture, toppings, price, and payment method.
  - Converts prices based on payment method (Cash, Transfer, or Crypto).
  - Successfully created items are added to the database.

- **Order Display**:
  - Lists all orders with detailed information, including toppings (if any) and payment details (random account number for Transfer or Crypto address).

## Design Patterns Used
1. **Factory Method**:
   - Modularized the creation of various confectionery types, allowing flexibility in extending the menu.
   
2. **Singleton**:
   - Ensures a single instance of the database to avoid data duplication or inconsistency.
   
3. **Adapter**:
   - Bridges different payment interfaces (e.g., integrating cash, bank transfer, and crypto payments seamlessly).

