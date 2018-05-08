package it.polito.tdp.HelloWorld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloWorldController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtResult;
    
    @FXML
    void clicca(ActionEvent event) {
    //	System.out.println("ciao");
    	String nome= txtNome.getText();
    	if(nome.length()==0) {
    		txtResult.setText("Inserisci il tuo nome, pollo");
    	}
    	else {
    		String msg= "Ciao "+nome+" come va il percorso di crescita?\nMattia Nolli re dei polli <3";
    		txtResult.setText(msg);
    	
    		String msgOsceno="Ciao "+nome+", frustami (cit Mauri)";
    		txtResult.setText(msgOsceno);
    	
    		String msgPollo="Ciao "+nome+", mandi una foto dei piedi al tipo di fronte a te? <3 \n ps. per favore, non interrompere il tuo percorso di crescita";
    		txtResult.setText(msgPollo);
    		
    		
    	}
    	
    }

}
