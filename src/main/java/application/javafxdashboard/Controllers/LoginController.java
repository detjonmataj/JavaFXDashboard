package application.javafxdashboard.Controllers;

import application.javafxdashboard.Scenes.LoginScene.Login;
import application.javafxdashboard.Utils.User;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class LoginController extends Login implements EventHandler<ActionEvent> {

    LoginController() {
        Login.loginBtn.setOnAction(this);
    }

    public static void Login() {
        new LoginController();
    }

    @Override
    public void handle(ActionEvent event) {
        String text;
        Color color;
        // TODO: Getting user info / token from utils
        User user = new User(0, "detjon", "Detjon", "Mataj", "detjoni123", 1);

        if (usernameTF.getText().equals(user.getUsername()) && passwordTF.getText().equals(user.getPassword())) {
            text = "Login Successfully!";
            color = Color.LIGHTGREEN;
            Controller.Login(loginBtn, event, user);
        } else if (usernameTF.getText().isEmpty() && passwordTF.getText().isEmpty()) {
            text = "Please enter your username and password!";
            color = Color.RED;
            usernameTF.requestFocus();
        } else if (usernameTF.getText().isEmpty()) {
            text = "Username Field is missing";
            color = Color.RED;
            usernameTF.requestFocus();
        } else if (passwordTF.getText().isEmpty()) {
            text = "Password Field is missing";
            color = Color.RED;
            passwordTF.requestFocus();
        } else {
            text = "Wrong Username or Password!";
            color = Color.RED;
            usernameTF.setText("");
            passwordTF.setText("");
        }

        msg.setText(text);
        msg.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
    }
}
