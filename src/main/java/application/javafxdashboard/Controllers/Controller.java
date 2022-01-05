package application.javafxdashboard.Controllers;

import application.javafxdashboard.Scenes.AdminScenes.SuperAdminScene;
import application.javafxdashboard.Utils.User;
import javafx.event.ActionEvent;
import javafx.scene.control.Control;

public class Controller {

    public static void Login(Control btn, ActionEvent event, User user) {
        // TODO: Maybe passing user id instead of whole user info to display
        if (user.getPrivileges() == 1) {
            SceneController.sceneSwitcher(SuperAdminScene.display(user), SuperAdminScene.getPageTitle(), event);
        }
    }

}
