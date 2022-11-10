package ch.bbw.pr.cluedo;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class CluedoApplication extends Application {
	
	@Override
	public void start(Stage primaryStage) {

		try {
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource("MainView.fxml"));
			AnchorPane root = (AnchorPane) myLoader.load();
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ViewController controller = (ViewController) myLoader.getController();
			controller.printAll();
			
			primaryStage.setTitle("Cluedo");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("JavaFX " + System.getProperty("javafx.version") + ", running on Java " + System.getProperty("java.version") + ".");
		launch(args);
	}
}
