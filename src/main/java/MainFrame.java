package main.java;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.converter.IntegerStringConverter;

public class MainFrame extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear una imagen
        Image image = new Image(getClass().getResourceAsStream("../resources/logo.png"));
        ImageView imageView = new ImageView(image);

        // Crear la sección de la imagen centrada
        StackPane imageSection = new StackPane(imageView);
        imageSection.setAlignment(Pos.CENTER);

        // Crear los botones
        Button button1 = new Button("Divisas");
        //Función de los botones
        button1.setOnAction(e -> cConverter(primaryStage));
        //Animación de hover de los botones
        configureButtonAnimation(button1);

        Button button2 = new Button("Temperatura");
        button2.setOnAction(e -> dConverter());
        configureButtonAnimation(button2);

        Button button3 = new Button("Distancia");
        button3.setOnAction(e -> tConverter());
        configureButtonAnimation(button3);
        
        //Adición de las clases de CSS de los botones para compartir estilos
        button1.getStyleClass().add("button-style");
        button2.getStyleClass().add("button-style");
        button3.getStyleClass().add("button-style");

        // Crear la sección de los botones
        HBox buttonsSection = new HBox(80, button1, button2, button3);
        buttonsSection.setAlignment(Pos.CENTER);

        //Crear el contenedor del los elementos principales
        VBox contentSection = new VBox(0, imageSection, buttonsSection);
        contentSection.setAlignment(Pos.TOP_CENTER);
        
        
        //Crear la sección del footer
        Text footerText = new Text("Por Antonio Guerrero para AluraLatam y Oracle, 2023");
        footerText.getStyleClass().add("footer-text");

        //Crear la sección del footer
        HBox footer = new HBox(footerText);
        footer.getStyleClass().add("footer");
        footer.setAlignment(Pos.BOTTOM_CENTER);
        /* footer.setPadding(new Insets(20, 0, 20, 0)); */
        
        // Crear el contenedor principal
        VBox root = new VBox(80, contentSection, footer);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getStyleClass().add("root");
        
        // Crear la escena y configurarla en el escenario
        Scene scene = new Scene(root, 960, 540);
        scene.getStylesheets().add("file:///A:/programacion/java/MyConversorbyAntonioGG/MyConverterAlura/src/main/resources/style.css");


        primaryStage.setTitle("My Converter Alura by Antonio Guerrero");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void cConverter(Stage primaryStage) {
        
        TextField number1 = new TextField();
        number1.getStyleClass().add("number");

        // Crear un TextFormatter que solo permita números
        TextFormatter<Integer> textFormatter = new TextFormatter<>(
            new IntegerStringConverter(),
            null,
            change -> {
                String newText = change.getControlNewText();
                if (newText.matches("[0-9]*|\\d+\\.\\d*")) { // Expresión regular para números
                    return change;
                }
                return null;
            }
        );
        
        number1.setTextFormatter(textFormatter);

        ComboBox<String> option1 = new ComboBox<>();
        option1.setPromptText("Moneda");
        option1.getItems().addAll(Currency.currencies);
        option1.getStyleClass().add("option");
        
        HBox input = new HBox(5, number1,option1);
        
        TextField number2 = new TextField();
        number2.getStyleClass().add("number");
        number2.setEditable(false);
        
        ComboBox<String> option2 = new ComboBox<>();
        option2.setPromptText("Moneda");
        option2.getItems().addAll(Currency.currencies);
        option2.getStyleClass().add("option");
        
        HBox output = new HBox(0, number2,option2);

        Text text = new Text("- Convertir a -");
        text.setFill(Color.WHITE);
        text.setFont(Font.font(20));

        // Crear la sección de las funciones
        HBox optionSection = new HBox(40, input, text,output);
        optionSection.setAlignment(Pos.CENTER);

        // Crear los botones
        Button button1 = new Button("Menú");
        button1.setOnAction(e -> start(primaryStage));
        button1.getStyleClass().add("button-style");
        configureButtonAnimation(button1);
        
        Button button2 = new Button("Convertir");
        /* button2.setOnAction(e -> ); */
        button2.getStyleClass().add("button-style");
        configureButtonAnimation(button2);
        
        // Crear la sección de los botones y el pie de página
        HBox buttonsSection = new HBox(70, button1, button2);
        buttonsSection.setAlignment(Pos.CENTER);

        //Crear el contenedor del los elementos principales
        VBox contentSection = new VBox(30, optionSection, buttonsSection);
        contentSection.setAlignment(Pos.TOP_CENTER);
        
        
        //Crear la sección del footer
        Text footerText = new Text("Por Antonio Guerrero para AluraLatam y Oracle, 2023");
        footerText.getStyleClass().add("footer-text");

        HBox footer = new HBox(footerText);
        footer.getStyleClass().add("footer");
        footer.setAlignment(Pos.BOTTOM_CENTER);
        
        // Crear el contenedor principal
        VBox root = new VBox(100, contentSection, footer);
        root.getStyleClass().add("root");
        root.setAlignment(Pos.BOTTOM_CENTER);
        

        // Crear la escena y configurarla en el escenario
        Scene sceneCurrency = new Scene(root, 960, 540);
        sceneCurrency.getStylesheets().add("file:///A:/programacion/java/MyConversorbyAntonioGG/MyConverterAlura/src/main/resources/style.css");

        primaryStage.setScene(sceneCurrency);
    }

private void dConverter() {
    
}

private void tConverter() {
    
}

public void configureButtonAnimation(Button button) {
    // Crear una transición de escala al hacer hover
    ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(400), button);
    scaleTransition.setToX(1.5);
    scaleTransition.setToY(1.5);

    // Configurar el evento de hover para activar la animación
    button.setOnMouseEntered(event -> scaleTransition.play());

    // Configurar el evento de salida del mouse para revertir la animación
    button.setOnMouseExited(event -> {
        ScaleTransition reverseTransition = new ScaleTransition(Duration.millis(400), button);
        reverseTransition.setToX(1.0);
        reverseTransition.setToY(1.0);
        reverseTransition.play();
    });
}

public static void main(String[] args) {
    launch(args);
}
}
