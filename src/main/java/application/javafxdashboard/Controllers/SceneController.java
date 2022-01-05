package application.javafxdashboard.Controllers;

import application.javafxdashboard.Scenes.LoginScene.Login;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneController {

    private static Scene scene;

    public static void LoadInitialScene(Stage stage) {
        createLoginScene(stage);
    }

    public static void createLoginScene(Stage stage) {
        stage.setTitle(Login.getPageTitle());
        AnchorPane root = Login.display();
        scene = new Scene(root);
        stage.setMinWidth(root.getMinWidth());
        stage.setMinHeight(root.getMinHeight());
        stage.setWidth(root.getPrefWidth());
        stage.setHeight(root.getPrefHeight());
        stage.setScene(scene);
    }

    public static void sceneSwitcher(AnchorPane root, String title, ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.hide();
        scene = new Scene(root);
        stage.setMinWidth(root.getMinWidth());
        stage.setMinHeight(root.getMinHeight());
        stage.setWidth(root.getPrefWidth());
        stage.setHeight(root.getPrefHeight());
        stage.setScene(scene);
        stage.show();
    }

}
