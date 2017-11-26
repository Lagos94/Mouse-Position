import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 15 Chapter 15
* Mouse Position
* Due Date: 11/12/17*/

public class MouseSpot extends Application{

    @Override
    public void start(Stage primaryStage) {
        double width = 350;
        double height = 200;
        Text micePosition = new Text();
        Pane screen = new Pane(micePosition);
        screen.setOnMousePressed(e -> {refreshPosition(e,micePosition); });
        screen.setOnMouseDragged(e -> { refreshPosition(e,micePosition); });
        screen.setOnMouseReleased(e -> micePosition.setVisible(false));
        primaryStage.setScene(new Scene(screen, width, height));
        primaryStage.setTitle("Click & Drag within this window!");
        primaryStage.show();
    }

    public void refreshPosition(MouseEvent e, Text micePosition) {
        micePosition.setX(e.getX() + 0);
        micePosition.setY(e.getY() - 0);
        micePosition.setText("(" + e.getX() + ", " + e.getY() + ")");
        micePosition.setVisible(true);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}