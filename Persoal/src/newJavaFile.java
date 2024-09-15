import java.awt.*;

 class FontTextLabel extends Frame
{
    // Declare component Label
    Label lbl1,lbl2;

    public FontTextLabel()
    {
        setLayout(new FlowLayout());

        // construct Label
        lbl1 = new Label("I Love you");
        lbl2 =new Label("Marjia");

        // "super" Frame adds Label
        add(lbl1);
        add(lbl2);

        Font myFont = new Font("Serif",Font.BOLD,12);
        lbl1.setFont(myFont);

        setTitle("AWT Elements");
        setSize(400, 400);
        setVisible(true);
    }

     public static void main(String[] args)
    {
        // allocating an instance
        FontTextLabel fntlbl = new FontTextLabel();

    }
}