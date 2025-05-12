
## 🚆 **Train Ticket Booking System – Project Report**

### 🔖 **1. Title Page**

**Project Title**: *Train Ticket Booking System*<br>
**Course**: JAVA OOPS CONCEPT<br>
**Submitted by**: S. Prethiga<br>
**Register Number**: 927622BCS078<br>
**Institution**: M.Kumarasamy College of Engineering<br>
**Department**: Computer Science and Engineering

---

### 📄 **2. Abstract**

This project implements a basic **Train Ticket Booking System** using Java. It allows users to view available trains and book tickets for specific dates. The system checks for seat availability based on train ID and travel date before confirming the booking. The program ensures a structured data approach using Java classes, date handling using `SimpleDateFormat`, and stores booking data in a dynamic list.

---

### 🎯 **3. Objective**

* To design a console-based train reservation system.
* To understand object-oriented programming concepts such as classes, objects, encapsulation, and collections in Java.
* To handle user input, data validation, and implement basic seat booking logic.

---

### 📁 **4. Project Modules**

#### ➤ a. `TRAIN.java`

* Represents train information.
* Attributes:

  * `tid`: Train ID
  * `ac`: AC availability
  * `capacity`: Total number of seats
* Methods:

  * `get_train()`, `get_type()`, `get_capacity()`
  * `display()`: Displays train details.

#### ➤ b. `BOOKING.java`

* Handles user booking.
* Attributes:

  * `name`: Passenger name
  * `id`: Train number
  * `date`: Date of travel
* Constructor:

  * Accepts input from user and parses the travel date.
* Method:

  * `isavailable()`: Checks if a seat is available for a given train and date.

#### ➤ c. `MAIN.java`

* Entry point of the program.
* Displays train list.
* Accepts bookings in a loop until the user exits.
* Adds a booking if seats are available; otherwise shows a seat-full message.

---

### 🛠️ **5. Tools & Technologies Used**

* **Programming Language**: Java
* **JDK Version**: Java 8+
* **IDE**: Eclipse 
* **Libraries**: `java.util.*`, `java.text.*`

---

### 💡 **6. Sample Output**

```
----------
train id:1
ac??:true
capacity:25
----------
train id:2
ac??:true
capacity:50
----------
train id:3
ac??:true
capacity:2
Enter 1 to book ,Enter 2 to exit
Enter Passenger name:
John
Enter train no:
1
Enter date (dd-mm-yyyy):
12-05-2025
Your Booking is Confirmed
```

---

### 📈 **7. Scope for Improvement**

* Add GUI using JavaFX or Swing.
* Persist booking and train data using file I/O or a database.
* Add login functionality for admin and users.
* Allow cancellation and modification of bookings.

---

### ✅ **8. Conclusion**

The project successfully demonstrates a basic railway ticket reservation system using object-oriented principles in Java. It provides a foundation for further enhancements like real-time booking, GUI support, and database integration.

---

### 📚 **9. References**

* Java Documentation – [https://docs.oracle.com/javase/8/docs/](https://docs.oracle.com/javase/8/docs/)
* GeeksforGeeks Java Tutorials
* Oracle Java Tutorials

---

