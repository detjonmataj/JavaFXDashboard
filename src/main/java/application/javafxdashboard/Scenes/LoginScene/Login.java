package application.javafxdashboard.Scenes.LoginScene;

import application.javafxdashboard.Controllers.LoginController;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Login {


    public static Button loginBtn;
    public static Hyperlink forgetPasswordLink;
    public static Label msg;
    public static TextField usernameTF;
    public static PasswordField passwordTF;

    public static AnchorPane display() {
        AnchorPane root = new AnchorPane();
        BorderPane bp = new BorderPane();
        Color color = Color.web("#0598ff");

        Background tfStyling = new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(color, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(0, 0, 2, 0)));


        // Top
        Text header = new Text("User Login");
        header.setFont(new Font("System", 25));
        header.setFill(color);
        FontAwesomeIconView usersIcon = new FontAwesomeIconView(FontAwesomeIcon.USERS, "45");
        usersIcon.setTabSize(8);
        usersIcon.setFill(color);
        VBox top = new VBox(10, header, usersIcon);
        top.setAlignment(Pos.CENTER);
        top.setSpacing(10);
        top.setPrefSize(400, 202);


        // Login Message
        msg = new Label("");
        msg.setFont(new Font("System", 10));
        HBox loginMsgBox = new HBox(msg);
        msg.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        msg.setPadding(new Insets(6, 110, 6, 110));
        loginMsgBox.setAlignment(Pos.CENTER);


        // Center
        FontAwesomeIconView userIcon = new FontAwesomeIconView(FontAwesomeIcon.USER, "20");
        userIcon.setTabSize(8);
        userIcon.setFill(color);

        FontAwesomeIconView lockIcon = new FontAwesomeIconView(FontAwesomeIcon.LOCK, "20");
        lockIcon.setTabSize(8);
        lockIcon.setFill(color);

        usernameTF = new TextField();
        usernameTF.setPromptText("Email or Username");
        usernameTF.setFont(new Font("System", 13));
        usernameTF.setBackground(tfStyling);
        usernameTF.setBorder(border);
        usernameTF.setPrefSize(162.4, 29.6);

        passwordTF = new PasswordField();
        passwordTF.setPromptText("Password");
        passwordTF.setFont(new Font("System", 13));
        passwordTF.setBackground(tfStyling);
        passwordTF.setBorder(border);


        HBox usernameBox = new HBox(userIcon, usernameTF);
        usernameBox.setAlignment(Pos.CENTER);
        usernameBox.setSpacing(8);
        usernameBox.setPrefWidth(400);
        usernameBox.setPrefHeight(71.2);

        HBox passwordBox = new HBox(lockIcon, passwordTF);
        passwordBox.setAlignment(Pos.CENTER);
        passwordBox.setSpacing(8);
        passwordBox.setPrefWidth(400);
        passwordBox.setPrefHeight(71.2);


        VBox center = new VBox(10, loginMsgBox, usernameBox, passwordBox);
        center.setAlignment(Pos.CENTER);
        center.setSpacing(10);
        center.setPrefWidth(400);
        center.prefHeight(152);

        // bottom part
        loginBtn = new Button("Login");
        loginBtn.setFont(new Font("System", 15));
        loginBtn.setTextFill(Color.WHITE);
        loginBtn.setBackground(new Background(new BackgroundFill(color, new CornerRadii(4), loginBtn.getInsets())));
        loginBtn.setOnAction(t -> LoginController.Login());
        forgetPasswordLink = new Hyperlink("Forgot Your Password?");
        forgetPasswordLink.setFont(new Font("System", 14));
        forgetPasswordLink.setPrefSize(152, 26.4);


        VBox bottom = new VBox(10, loginBtn, forgetPasswordLink);
        bottom.setAlignment(Pos.TOP_CENTER);
        bottom.setPrefSize(400, 246.4);
        bottom.setPadding(new Insets(15, 0, 0, 0));


        root.setPrefSize(424, 606);
        root.setMinSize(424, 606);
        bp.setTop(top);
        bp.setCenter(center);
        bp.setBottom(bottom);
        AnchorPane.setTopAnchor(bp, 0.0);
        AnchorPane.setBottomAnchor(bp, 0.0);
        AnchorPane.setLeftAnchor(bp, 0.0);
        AnchorPane.setRightAnchor(bp, 0.0);
        root.getChildren().setAll(bp);

        root.setOnMousePressed(event -> root.requestFocus());
        return root;
    }

    public static String getPageTitle() {
        return "Login Scene";
    }

}
