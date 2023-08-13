package main.java;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
        button1.setOnAction(e -> cConverter(primaryStage));
        Button button2 = new Button("Temperatura");
        button2.setOnAction(e -> dConverter());
        Button button3 = new Button("Distancia");
        button3.setOnAction(e -> tConverter());
        
        // Establecer el estilo normal del botón
        button1.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");
        button2.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");
        button3.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");

        // Agregar un efecto hover utilizando eventos de mouse
        button1.setOnMouseEntered(event -> {
            button1.setStyle("-fx-background-color: #050505; -fx-text-fill: white;");
        });
        button2.setOnMouseEntered(event -> {
            button2.setStyle("-fx-background-color: #050505; -fx-text-fill: white;");
        });
        button3.setOnMouseEntered(event -> {
            button3.setStyle("-fx-background-color: #050505; -fx-text-fill: white;");
        });

        button1.setOnMouseExited(event -> {
            button1.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");
        });
        button2.setOnMouseExited(event -> {
            button2.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");
        });
        button3.setOnMouseExited(event -> {
            button3.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");
        });
        
        // Cambia el tamaño de fuente del botón
        button1.setFont(new Font(20));
        button2.setFont(new Font(20));
        button3.setFont(new Font(20));


        // Crear la sección de los botones y el pie de página
        HBox buttonsSection = new HBox(80, button1, button2, button3);
        buttonsSection.setAlignment(Pos.CENTER);

        //Crear el contenedor del los elementos principales
        VBox contentSection = new VBox(0, imageSection, buttonsSection);
        contentSection.setAlignment(Pos.TOP_CENTER);
        
        
        //Crear la sección del footer
        Text footerText = new Text("Por Antonio Guerrero para AluraLatam y Oracle, 2023");
        footerText.setFont(Font.font(18));
        HBox footer = new HBox(footerText);
        footer.setAlignment(Pos.BOTTOM_CENTER);
        footer.setPadding(new Insets(20, 0, 20, 0));
        
        //color del footer
        BackgroundFill backgroundF = new BackgroundFill(Color.rgb(199,70,52), null, null);
        Background background2 = new Background(backgroundF);
        footer.setBackground(background2);
        
        
        // Crear el contenedor principal
        VBox root = new VBox(80, contentSection, footer);
        root.setAlignment(Pos.BOTTOM_CENTER);
        
        //Color del Root
        BackgroundFill backgroundR = new BackgroundFill(Color.rgb(22,21,19), null, null);
        Background background1 = new Background(backgroundR);
        root.setBackground(background1);

        // Crear la escena y configurarla en el escenario
        Scene scene = new Scene(root, 960, 540);

        primaryStage.setTitle("My Converter Alura by Antonio Guerrero");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void cConverter(Stage primaryStage) {
        // Crear una imagen
        Label label = new Label("cagada");

        // Crear la sección de la imagen centrada
        StackPane imageSection = new StackPane(label);
        imageSection.setAlignment(Pos.CENTER);

        // Crear los botones
        Button button1 = new Button("Divisas");
        button1.setOnAction(e -> start(primaryStage));
        
        // Asignar la clase de estilo a los botones
        button1.getStyleClass().add("button-style");
        
        // Establecer el estilo normal del botón
        button1.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");
        
        // Agregar un efecto hover utilizando eventos de mouse
        button1.setOnMouseEntered(event -> {
            button1.setStyle("-fx-background-color: #050505; -fx-text-fill: white;");
        });
        

        button1.setOnMouseExited(event -> {
            button1.setStyle("-fx-background-color: #c74634; -fx-text-fill: black;");
        });
        
        // Cambia el tamaño de fuente del botón
        button1.setFont(new Font(20));
        
        // Crear la sección de los botones y el pie de página
        HBox buttonsSection = new HBox(80, button1);
        buttonsSection.setAlignment(Pos.CENTER);

        //Crear el contenedor del los elementos principales
        VBox contentSection = new VBox(0, imageSection, buttonsSection);
        contentSection.setAlignment(Pos.TOP_CENTER);
        
        
        //Crear la sección del footer
        Text footerText = new Text("Por Antonio Guerrero para AluraLatam y Oracle, 2023");
        footerText.setFont(Font.font(18));
        HBox footer = new HBox(footerText);
        footer.setAlignment(Pos.BOTTOM_CENTER);
        footer.setPadding(new Insets(20, 0, 20, 0));
        
        //color del footer
        BackgroundFill backgroundF = new BackgroundFill(Color.rgb(199,70,52), null, null);
        Background background2 = new Background(backgroundF);
        footer.setBackground(background2);
        
        
        // Crear el contenedor principal
        VBox root = new VBox(80, contentSection, footer);
        root.setAlignment(Pos.BOTTOM_CENTER);
        
        //Color del Root
        BackgroundFill backgroundR = new BackgroundFill(Color.rgb(22,21,19), null, null);
        Background background1 = new Background(backgroundR);
        root.setBackground(background1);

        // Crear la escena y configurarla en el escenario
        Scene sceneCurrency = new Scene(root, 960, 540);

        primaryStage.setScene(sceneCurrency);
    }

    private void dConverter() {
        
    }

    private void tConverter() {
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
