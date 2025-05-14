# 🍽️ Restaurant System

📄 **Description - Exercise Statement**

This Java application combines two exercises into a single project that demonstrates core concepts of object uniqueness and sorting within collections.

**Exercise 1**  
Create a class named `Restaurant` with two attributes: `name` (String) and `score` (int).  
Implement the necessary methods to prevent insertion of `Restaurant` objects with the **same name and same score** into a `HashSet`.  
Note: Restaurants with the same name but different scores **are allowed**.

**Exercise 2**  
Using the `Restaurant` class from Exercise 1, implement functionality to sort a list of restaurants **by name and score in descending order**.

**Example sorted output:**
```
Name: restaurant1, Score: 8  
Name: restaurant1, Score: 7
```

---

💻 **Technologies Used**

- Java 17+
- Java Collections Framework (`HashSet`, `ArrayList`, `Comparator`)
- IDE (e.g., IntelliJ IDEA, Eclipse)

---

📋 **Requirements**

- JDK 17 or higher installed
- A Java IDE (IntelliJ IDEA, Eclipse, or others)
- No external libraries required

---

🛠️ **Installation**

1. Clone the repository:
   ```bash
   git clone https://github.com/Javierdolo/S1.03.Level2_JavaCollections.git
   ```
2. Open the project in your preferred Java IDE.
3. Make sure the JDK is set to version 17 or higher.

---

▶️ **Execution**

1. Locate and open the `Main.java` file.
2. Run the `main()` method.
3. The following will be printed to the console:
    - A first list of restaurants.
    - A second list showing how `HashSet` prevents adding duplicates.
    - The `HashSet` converted to an `ArrayList`.
    - The list sorted by restaurant name and score in descending order.

---

✅ **Features Demonstrated**

- Proper use of `equals()` and `hashCode()` to manage uniqueness in `HashSet`
- Handling of duplicate objects
- Conversion between collection types (`HashSet` → `ArrayList`)
- Custom sorting using `Comparator` and `Collections.sort()`
- Neat and readable `toString()` output for each restaurant

---

📌 **Example Output**
```
This is the first list of restaurants
========================
 RESTAURANT
========================
 Name     : Bulli
 Rating   : 5
========================


📁 **Project Structure**
```
📆 restaurant-management
├ 📌 Main.java
├ 📌 Restaurant.java
└ 📌 README.md
```