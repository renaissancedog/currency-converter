import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main extends JFrame {
    private final JPanel contentPane;

    private final JTextField fieldAmount;

    private final ArrayList<Currency> currencies = Currency.init();

    public Main() {
        setTitle(("Currency Converter"));
        setDefaultCloseOperation(3);
        setBounds(100, 100, 600, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.contentPane);
        this.contentPane.setLayout(null);

        JLabel update = new JLabel();
        update.setText("Data last updated April 4, 2024 20:10 UTC");
        update.setBounds(147, 200, 250, 100);
        contentPane.add(update);

        JLabel lblConvert = new JLabel(("Currency From"));
        lblConvert.setHorizontalAlignment(4);
        lblConvert.setBounds(0, 14, 92, 15);
        this.contentPane.add(lblConvert);

        final JComboBox<String> comboBoxCountry1 = new JComboBox<>();
        comboBoxCountry1.setBounds(147, 7, 250, 28);
        populate(comboBoxCountry1, this.currencies);

        this.contentPane.add(comboBoxCountry1);
        JLabel lblTo = new JLabel(("Currency To"));
        lblTo.setHorizontalAlignment(4);
        lblTo.setBounds(0, 54, 92, 15);
        this.contentPane.add(lblTo);

        final JComboBox<String> comboBoxCountry2 = new JComboBox<>();
        comboBoxCountry2.setBounds(147, 47, 250, 28);
        populate(comboBoxCountry2, this.currencies);

        this.contentPane.add(comboBoxCountry2);
        JLabel lblAmount = new JLabel(("Amount"));
        lblAmount.setHorizontalAlignment(4);
        lblAmount.setBounds(23, 108, 69, 15);
        this.contentPane.add(lblAmount);

        this.fieldAmount = new JTextField();
        this.fieldAmount.setText("0.00");
        this.fieldAmount.setBounds(147, 101, 103, 29);
        this.contentPane.add(this.fieldAmount);
        this.fieldAmount.setColumns(10);

        final JLabel lblResult = new JLabel("");
        lblResult.setHorizontalAlignment(2);
        lblResult.setBounds(147, 188, 428, 38);
        this.contentPane.add(lblResult);

        JButton btnConvert = new JButton(("Convert"));
        btnConvert.setBounds(147, 142, 129, 38);
        btnConvert.addActionListener((ActionEvent arg0) -> {
            String nameCurrency1 = comboBoxCountry1.getSelectedItem().toString();
            String nameCurrency2 = comboBoxCountry2.getSelectedItem().toString();
            Double amount;
            DecimalFormat format = new DecimalFormat("#0.00");
            try {
                amount = Double.valueOf(Main.this.fieldAmount.getText());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                amount = 0.0;
            }
            Double price = Main.convert(nameCurrency1, nameCurrency2, Main.this.currencies, amount);
            String formattedPrice = format.format(price);
            String formattedAmount = format.format(amount);
            String result = formattedAmount + " " + nameCurrency1 + " = " + formattedPrice + " " + nameCurrency2;
            lblResult.setText(result);
        });
        this.contentPane.add(btnConvert);
    }

    public static void populate(JComboBox<String> comboBox, ArrayList<Currency> currencies) {
        for (Currency currency : currencies) {
            comboBox.addItem(currency.getName());
        }
    }

    public static Double convert(String currency1, String currency2, ArrayList<Currency> currencies, Double amount) {
        Currency c2 = null;
        double price = 0.0;
        for (Currency currency : currencies) {
            if (Objects.equals(currency.getName(), currency2)) {
                c2=currency;
                break;
            }
        }
        if (c2 != null){
            for (Currency currency : currencies) {
                if (Objects.equals(currency.getName(), currency1)) {
                    Currency c1=currency;
                    price = c2.value/c1.value*amount;
                    break;
                }
            }
        }
        return price;
    }
}
