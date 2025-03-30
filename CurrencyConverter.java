import java.awt.EventQueue;
import javax.swing.*;

public class CurrencyConverter {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        EventQueue.invokeLater(() -> {
            Main mainWindow = new Main();
            mainWindow.setVisible(true);
        });
    }
}
