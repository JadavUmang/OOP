import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class LoginPage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        Text mail = new Text("Email");
        Text pass = new Text("Password");

        final TextField tf = new TextField();

        final PasswordField pf = new PasswordField();

        Button b1 = new Button("Submit");
        Button b2 = new Button("Clear");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10,10,10,10));

        gp.setVgap(5);
        gp.setHgap(5);
        gp.setAlignment(Pos.CENTER);

        gp.add(mail,0,0);
        gp.add(tf,1,0);
        gp.add(pass,0,1);
        gp.add(pf,1,1);
        gp.add(b1,0,2);
        gp.add(b2,1,2);

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String m = tf.getText();
                String p = pf.getText();
                if ( m == "abc" && p == "abc" ) {
                    System.out.println("Submitted.");
                    primaryStage.close();
                }else {
                    System.out.println("Invalid Password.");
                }
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Closed....");
                primaryStage.close();
            }
        });
        Scene s = new Scene(gp);
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
