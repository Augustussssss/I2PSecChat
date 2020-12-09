package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Encryptor.Encryptor;
import sample.Encryptor.LoginData;

import java.security.NoSuchAlgorithmException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        LoginData data = new LoginData("Login", "Password");
        try {
            String key = Encryptor.generateKey(data);
            System.out.println(key);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        launch(args);
    }
}
