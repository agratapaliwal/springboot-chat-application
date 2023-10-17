# Chatroom App with Social Login and Avatar Selection
<http://webchatapp-env.eba-iy2mq3br.eu-north-1.elasticbeanstalk.com/>

This is a simple chatroom application that allows users to log in using their GitHub or Google accounts, choose an avatar, set a username, participate in chat, and log out.

## Technologies Used

- Java
- Spring Boot
- WebSocket
- Thymeleaf
- HTML
- CSS
- JavaScript
- Maven
- Spring MVC
- Spring Security
- OAuth2 (GitHub and Google)

## How to Run

To run this chatroom application, follow these steps:

1. Clone this repository to your local machine:
git clone https://github.com/yourusername/chatroom-app.git
2. Navigate to the project directory:
cd chatroom-app
3. Build and run the application using Maven.
mvn spring-boot:run
4. Once the application is up and running, you can access it in your web browser at 'http://localhost:8080'.

## Usage
1. Visit the application in your web browser at http://localhost:8080.
2. You can choose to log in using your GitHub or Google account.
3. After logging in, you will be prompted to select an avatar and set a username.
4. Once you have chosen an avatar and set a username, you can participate in the chat.
5. In the chatroom, you can send messages and interact with other users.
6. To leave the chat and log out, simply click the "Logout" button.

## Additional Notes
- This application uses OAuth2 for authentication with GitHub and Google. You will need to configure OAuth2 client credentials for both services in the application properties or configuration.
- Make sure you have the necessary environment variables and API keys set up for GitHub and Google OAuth2 integration.
- Feel free to customize the look and feel of the application by modifying the HTML, CSS, and JavaScript files in the project.
- Enjoy chatting with other users in the chatroom!

If you have any questions or run into any issues, please feel free to reach out for assistance.