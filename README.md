# SpringBootMovie
# 🎮 MovieDB Backend

This is the **backend** for the MovieDB application, built using **Spring Boot** and **MongoDB**. It provides RESTful APIs to fetch movie details and trailer links.

---

## 🚀 Features

✅ Fetch all movies  
✅ Get movie details by IMDb ID  
✅ Store movie data in MongoDB  
✅ REST API using Spring Boot  

---

## 🧪 Tech Stack

- **Backend**: Spring Boot  
- **Database**: MongoDB  
- **Build Tool**: Maven  
- **API Testing**: Postman  

---

## 📌 Installation

### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/vishnu169/SpringBoot-MovieApp.git
cd SpringBoot-MovieApp
```

### **2️⃣ Setup MongoDB**

- **Windows:** Download and install MongoDB from [MongoDB Official Site](https://www.mongodb.com/try/download/community).  
- **Mac/Linux:** Install using Homebrew:
  ```bash
  brew install mongodb-community
  ```
- **Start MongoDB Server Locally:**
  ```bash
  mongod --dbpath /data/db
  ```
- **Using Docker (Alternative Method)**  
  ```bash
  docker run -d -p 27017:27017 --name mongodb mongo
  ```
- **Verify MongoDB is Running**  
  ```bash
  mongo
  ```

### **3️⃣ Configure MongoDB in Spring Boot**
Add the following to `src/main/resources/application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/moviedb
```

---

## ▶️ Running the Project

### **1️⃣ Build the Project**
Run the following Maven command:
```bash
mvn clean install
```

### **2️⃣ Start the Spring Boot Application**
```bash
mvn spring-boot:run
```
The server will start at:  
📍 **http://localhost:8080/api/v1/movies**

---

## 🤦🏻 API Endpoints

### **🎮 Get All Movies**
```http
GET /api/v1/movies
```
🔹 **Response:** Returns a list of all movies.  

### **🎮 Get a Movie by IMDb ID**
```http
GET /api/v1/movies/{imdbId}
```
🔹 **Example:** `/api/v1/movies/tt0111161`  
🔹 **Response:** Returns movie details.  

---

## 📩 Testing the API with Postman

1. Open **Postman**.  
2. Create a new **GET request** with the API endpoint.  
3. Click **Send** and check the response.  

---

## 🐝 License

This project is open-source and available under the **MIT License**.  

---

👉 **Now, your backend README is complete!** 🎉  
Let me know if you need any modifications. 🚀😊

