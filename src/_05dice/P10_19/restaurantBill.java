package _05dice.P10_19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class restaurantBill {
    private JPanel mPanel;
    private JButton totalPrice;
    private JButton chicken;
    private JLabel subLabel;
    private JButton fish;
    private JTextField dishName;
    private JTextField dishPrice;
    private JButton addButton;
    private JLabel totLabel;
    private JLabel taxLabel;
    private JLabel tipLabel;
    private JButton pizza;
    private JButton lobster;
    private JButton salad;
    private JButton cake;
    private JButton redWine;
    private JButton ginAndTonic;
    private JButton beer;
    private JButton noodle;
    private double sum = 0;
    private ArrayList<String> selected = new ArrayList<>();


    public static void main(String[] args) {
        JFrame frame = new JFrame("restaurantBill");
        frame.setContentPane(new restaurantBill().mPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static String printArrList(ArrayList<String> arrList){
        String result = "";
        for (String element : arrList){
            result += element + "\n";
        }
        return result;
    }

    public void setLabels(double sum){
        DecimalFormat df = new DecimalFormat("#0.00");
        subLabel.setText(df.format(sum));
        taxLabel.setText(df.format(sum * 0.1));
        tipLabel.setText(df.format(sum * 0.15));
        totLabel.setText(df.format(sum * (1+0.1+0.15)));
    }


    public restaurantBill() {
        chicken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 10;
                selected.add("Fried Chicken $10.00");
                setLabels(sum);
            }
        });

        fish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 11.59;
                selected.add("Grilled Fish $11.59");
                setLabels(sum);
            }
        });

        pizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 8.99;
                selected.add("Pizza $8.99");
                setLabels(sum);
            }
        });

        lobster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 23.99;
                selected.add("Boston Lobster $23.99");
                setLabels(sum);
            }
        });

        salad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 4.89;
                selected.add("Greek Salad $4.89");
                setLabels(sum);
            }
        });

        noodle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 6.85;
                selected.add("Soup noodle $6.85");
                setLabels(sum);
            }
        });

        cake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 6.50;
                selected.add("Cheese Cake $6.50");
                setLabels(sum);
            }
        });

        redWine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 5.87;
                selected.add("Red Wine $5.87");
                setLabels(sum);
            }
        });

        ginAndTonic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 7.99;
                selected.add("Gin and Tonic $7.99");
                setLabels(sum);
            }
        });

        beer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum += 5.99;
                selected.add("Beer $5.99");
                setLabels(sum);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double addPrice = Double.parseDouble(dishPrice.getText());
                sum += addPrice;
                selected.add(dishName.getText()+" $"+dishPrice.getText());
                setLabels(sum);
            }
        });


        totalPrice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,printArrList(selected)
                        + "----------------"
                        + "\nSubtotal: $" + subLabel.getText()
                        + "\nTax: $"+taxLabel.getText()
                        + "\nSuggested Tip: $"+tipLabel.getText()
                        + "\nTotal: $"+totLabel.getText());
            }
        });
    }
}
