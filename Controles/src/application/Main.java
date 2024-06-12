package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label dateLabel = new Label("Selecciona una fecha:");
        
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Selecciona un color:");
        
        ColorPicker colorPicker = new ColorPicker();

        Button confirmButton = new Button("Confirmar");
        confirmButton.setOnAction(e -> {
            java.time.LocalDate selectedDate = datePicker.getValue();
           
            javafx.scene.paint.Color selectedColor = colorPicker.getValue();
            
            System.out.println("Fecha seleccionada: " + selectedDate);
            System.out.println("Color seleccionado: " + selectedColor);
        });

        VBox vbox = new VBox(10); 
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton);

        Scene scene = new Scene(vbox, 300, 200);
        
        primaryStage.setTitle("Selector de Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}

