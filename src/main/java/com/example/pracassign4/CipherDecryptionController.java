package com.example.pracassign4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CipherDecryptionController {
    @FXML
    private Label DecryptedText;

    @FXML
    private Label MostCommonLettersLabel;

    @FXML
    private TextArea TextZone;

    @FXML
    protected void onDecryptButtonClick(ActionEvent event) {
        String text = TextZone.getText();
        CountLetters c = new CountLetters();
        DecryptedText.setText(Decryptor.decryptText(text, c.LetterCounter(text)));
    }
    @FXML
    protected void CountLetterButtonOnCick(ActionEvent event) {
        String text = TextZone.getText();
        CountLetters c = new CountLetters();
        char[] result = c.LetterCounter(text);
        String str = String.valueOf(result);
        MostCommonLettersLabel.setText(str);
    }




}