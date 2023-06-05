package fundamentos.controlador;

import fundamentos.logica.Serie;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SerieController extends Application
{
    @FXML
    TextField txtNumero;
    @FXML
    TextField txtSerie;
    @FXML
    Button btnGenerarSerie;
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("../vistas/frmSerieFibonacci.fxml"));
        
        Scene ventana = new Scene(root, 650, 450);

        pantalla.setScene(ventana);
        pantalla.setTitle("Serie Fibonacci");
        pantalla.show();       
    }
    
    @FXML
    public void onGenerarSerie()
    {
        int numero = 0;
        String cadenaSerie;
        //! 1. Recuperar el dato de Textfiled txtNumero
        numero = Integer.parseInt(txtNumero.getText());
        
        //? 2. Llamar al metodo seriefibonacci y recuperar la cadena y presentarla en txtseriefibonacci
        cadenaSerie = Serie.fibonacci(numero);

        //System.out.println("Se disparo la accion del boton generar serie...");
        //System.out.println("Numero: " + txtNumero.getText());
        txtSerie.setText(cadenaSerie);
    }

}
