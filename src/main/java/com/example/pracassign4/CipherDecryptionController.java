package com.example.pracassign4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

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

    @FXML
    protected void CopyButtonOnClick(ActionEvent event){
        String text = DecryptedText.getText();
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(text);
        clipboard.setContent(content);
    }

    @FXML
    protected void CopyButtonOnClick2(ActionEvent event){
        String text = MostCommonLettersLabel.getText();
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(text);
        clipboard.setContent(content);
    }


}