package main.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFrame extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear una etiqueta
        Label label = new Label("¡Hola, JavaFX!");

        // Crear un contenedor apilado (StackPane) y agregar la etiqueta
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Crear una escena y agregar el contenedor
        Scene scene = new Scene(root, 960, 540);

        // Configurar la ventana principal (escenario)
        primaryStage.setTitle("Ejemplo JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        double Amount = 100.0;
        int fIndex = 0;
        int sIndex = 2;
        double result = Currency.convertProcces(Amount, fIndex, sIndex);
        String fCurrencyName = Currency.getFirstCurrencyName(fIndex);
        String sCurrencyName = Currency.getSecondCurrencyName(sIndex);
        System.out.println(Amount + fCurrencyName + " equivalen a " + result + " " + sCurrencyName);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
