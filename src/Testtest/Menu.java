
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.text.*;
import java.awt.*;

public class Menu extends JFrame {

    private JLayeredPane layeredPane;

    private JLabel titleLabel;

    private JLabel mainBG;
    private ImageIcon posterImage;

    private JLabel logoLabel;
    private ImageIcon logoImage;

    private JScrollPane scrollPane;
    private JPanel scrollPanel;

    private JLabel stageImageLabel;
    private ImageIcon stageImage;
    private JLabel stageNameLabel;
    private JLabel stagePriceLabel;
    private JLabel stageIngredientsLabel;

    private NumberFormat NumberFormat;
    private JTextField amountTextField;

    private JButton addToCart;
    private JButton goToCart;
    
    
    public Menu(){
        
        this.setSize(500,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);


        layeredPane=new JLayeredPane();
        mainBG = new JLabel();
        posterImage= new ImageIcon(this.getClass().getResource("./Images/mainBG menu.png"));

        logoLabel = new JLabel();
        logoImage= new ImageIcon(this.getClass().getResource("./Images/menuLogo.png"));

        scrollPanel= new JPanel();
        scrollPane = new JScrollPane(scrollPanel);



        ///////////
        /// 
        /// 
        layeredPane.setPreferredSize(new Dimension(500,750));
        mainBG.setBounds(0, 0, 500, 750);
        mainBG.setIcon(posterImage);
        layeredPane.add(mainBG,JLayeredPane.DEFAULT_LAYER);

        //title
        titleLabel = new JLabel("Menu");
        titleLabel.setBounds(125, 50, 250, 50);
        titleLabel.setForeground(new Color(242,186,0));
        titleLabel.setBackground(new Color(31,25,27));
        // titleLabel.setBorder(new LineBorder(new Color(242,186,0),3));
        titleLabel.setFont(new Font("Matura MT Script Capitals",Font.BOLD,40));
        titleLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        layeredPane.add(titleLabel,JLayeredPane.PALETTE_LAYER);

        //logo
        logoLabel.setBounds(0, 0, 100, 100);
        logoLabel.setIcon(logoImage);
        layeredPane.add(logoLabel,JLayeredPane.PALETTE_LAYER);

        //scroll panel
        scrollPanel.setLayout(new BoxLayout(scrollPanel, BoxLayout.X_AXIS));
        scrollPanel.setBackground(new Color(31,25,27));

        //add labels to scroll panel
        for (int i = 1; i <= 40; i++) {
            JLabel label = new JLabel("Label " + i+"    ");
            label.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
            label.setForeground(new Color(242,186,0));
            scrollPanel.add(label);
        }

        //scrollpane theem and added it to the layeredpane 
        scrollPane.getHorizontalScrollBar().setBackground(new Color(31,25,27));
        scrollPane.setBorder(new LineBorder(new Color(242,186,0),4));
        scrollPane.setBounds(50, 110, 400 , 75); 
        layeredPane.add(scrollPane, JLayeredPane.PALETTE_LAYER);


        ///////stage//////////
        /// Image
        stageImageLabel = new JLabel();
        stageImage= new ImageIcon(this.getClass().getResource("./Images/mealsImagess/SeasonsPiza.jpg"));
        stageImageLabel.setBounds(125, 200, 250, 166);
        stageImageLabel.setIcon(stageImage);
        stageImageLabel.setBorder(new LineBorder(new Color(242,186,0),5));
        layeredPane.add(stageImageLabel,JLayeredPane.PALETTE_LAYER);
        /// Name
        stageNameLabel = new JLabel();
        stageNameLabel.setText("lsdkfh");
        stageNameLabel.setBounds(125, 370, 250, 50);
        stageNameLabel.setForeground(new Color(242,186,0));
        stageNameLabel.setBackground(new Color(31,25,27));
        stageNameLabel.setBorder(new LineBorder(new Color(242,186,0),3));
        stageNameLabel.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        stageNameLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        layeredPane.add(stageNameLabel,JLayeredPane.PALETTE_LAYER);
        /// Price
        stagePriceLabel = new JLabel();
        stagePriceLabel.setText("200$");
        stagePriceLabel.setBounds(125, 425, 250, 50);
        stagePriceLabel.setForeground(new Color(242,186,0));
        stagePriceLabel.setBackground(new Color(31,25,27));
        stagePriceLabel.setBorder(new LineBorder(new Color(242,186,0),3));
        stagePriceLabel.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        stagePriceLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        layeredPane.add(stagePriceLabel,JLayeredPane.PALETTE_LAYER);
        /// Ingredients
        stageIngredientsLabel = new JLabel();
        stageIngredientsLabel.setText("Ingredients");
        stageIngredientsLabel.setBounds(125, 480, 250, 50);
        stageIngredientsLabel.setForeground(new Color(242,186,0));
        stageIngredientsLabel.setBackground(new Color(31,25,27));
        stageIngredientsLabel.setBorder(new LineBorder(new Color(242,186,0),3));
        stageIngredientsLabel.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        stageIngredientsLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        layeredPane.add(stageIngredientsLabel,JLayeredPane.PALETTE_LAYER);
        // Number Field
        NumberFormat= NumberFormat.getIntegerInstance();
        amountTextField= new JFormattedTextField(NumberFormat);
        amountTextField.setColumns(10);
        amountTextField.setBounds(125, 535, 250, 50);
        amountTextField.setForeground(new Color(242,186,0));
        amountTextField.setBackground(new Color(31,25,27));
        amountTextField.setBorder(new LineBorder(new Color(242,186,0),3));
        amountTextField.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        amountTextField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        amountTextField.setCaretColor(Color.white);
        amountTextField.setToolTipText("amount");
        amountTextField.setText("Amount: ");
        layeredPane.add(amountTextField,JLayeredPane.PALETTE_LAYER);
        // add to cart
        addToCart = new JButton();
        addToCart.setText("Add To Cart");
        addToCart.setBounds(125, 590, 250, 50);
        addToCart.setBackground(new Color(242,186,0));
        addToCart.setForeground(new Color(31,25,27));
        addToCart.setBorder(new LineBorder(new Color(242,186,0),3));
        addToCart.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        addToCart.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        addToCart.setFocusable(false);

        layeredPane.add(addToCart,JLayeredPane.PALETTE_LAYER);
        // go to cart
        goToCart = new JButton();
        goToCart.setText("Go To Cart");
        goToCart.setBounds(125, 645, 250, 50);
        goToCart.setBackground(new Color(150,50,10));
        goToCart.setForeground(new Color(242,186,0));
        goToCart.setBorder(new LineBorder(new Color(150,50,10),3));
        goToCart.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        goToCart.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        goToCart.setFocusable(false);
        layeredPane.add(goToCart,JLayeredPane.PALETTE_LAYER);




        this.add(layeredPane);
        this.setVisible(true);
        //
    }

}