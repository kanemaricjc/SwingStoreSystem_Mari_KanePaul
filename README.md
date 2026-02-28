# SwingStoreSystem_Mari_KanePaul
This is a project made by Kane Paul A. Mari - BSCpE-1.
## System Overview
This project is a Java Swing-based application. This is an inventory management system and uses a centralized data architecture, which means that all the data is stored in one place which is the DataService class.
When a user buys an item in the main window, the central data is updated and when the two other JFrames are opened, they pull the latest numbers from that central data.
## Frame & Class Responsibilities

SwingStoreSystem.java - Contains the main method, which sets the visual theme and launches the MainSystem window.

MainSystem.java - Allows the user to select products from a list, specify a quantity, and add them to a shopping cart, which is a UnitTable. Also calculates the running total and handles the Checkout process, which runs the reduceStock() method and records the sales. Also contains the buttons to open the other two JFrames.

Inventory.java - The warehouse frame. When opened, it shows the current stock from the central data and populates a table in it, which shows the product name price, and how many are left.

Transaction.java - The receipt frame. When opened, it reads the history of completed checkouts from the central data. Shows what was sold, at what price, and the quantity sold at the order they were bought.

Information.java - The data frame. This holds the product name, price, and quantity. Used to represent the inventory and the transactions.

DataService.java - The database of the project. It holds the master lists of all products and past sales. It also provides methods for the MainSystem to reduce stock and add transaction records.

## How arrays are used

This project uses fixed-size arrays, as asked by Sir Jamie Rosal. An example of this is "private Information[] inventory = new Information[4]" which means the project can only hold 4 distinct products, while "private Information[] transactions = new Information[50]" means the system can remember a maximum of 50 checkout actions.
