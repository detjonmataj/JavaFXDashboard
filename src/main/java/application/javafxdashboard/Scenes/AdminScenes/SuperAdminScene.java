package application.javafxdashboard.Scenes.AdminScenes;

import application.javafxdashboard.Controllers.SceneController;
import application.javafxdashboard.Scenes.LoginScene.Login;
import application.javafxdashboard.Utils.User;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class SuperAdminScene {

    public static AnchorPane display(User user) {
        AnchorPane root = new AnchorPane();

        MenuBar navbar = new MenuBar();

        // navbar children's
        Menu dashboard = new Menu("Dashboard");
        Menu clients = new Menu("Clients");
        Menu services = new Menu("Services");
        Menu billing = new Menu("Billing");
        Menu support = new Menu("Support");
        Menu tools = new Menu("Tools");
        Menu settings = new Menu("Settings");
        Menu about = new Menu("About");
        Menu help = new Menu("Help");

        // dashboard items
        Label lbl = new Label("Welcome " + user.getFirstname() + " " + user.getLastname() + "!");
        Button btn = new Button("Log out");
        btn.setOnAction(
                event -> SceneController.sceneSwitcher(Login.display(), Login.getPageTitle(), event)
        );


        // add children to navbar
        navbar.getMenus().addAll(dashboard, clients, services, billing, support, tools, settings, about, help);


        root.setPrefSize(948, 654);
        root.setMinSize(800, 600);
        Text txt = new Text("Welcome back " + user.getFirstname() + "!");
        txt.setLayoutX(512);
        txt.setLayoutY(331);
        txt.setFont(new Font("System", 26));


        BorderPane bp = new BorderPane();
        bp.setTop(navbar);
        VBox center = new VBox(10, lbl, btn);
        center.setAlignment(Pos.CENTER);
        bp.setCenter(center);
        AnchorPane.setTopAnchor(bp, 0.0);
        AnchorPane.setBottomAnchor(bp, 0.0);
        AnchorPane.setLeftAnchor(bp, 0.0);
        AnchorPane.setRightAnchor(bp, 0.0);
        root.getChildren().setAll(bp);


        return root;
    }


    public static String getPageTitle() {
        return "SuperAdmin Scene";
    }
}
