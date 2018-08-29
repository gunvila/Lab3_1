import javax.swing.*;

public class Main {
    public static void main(String[] ags){

      //   String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1ตัว","0");
        //JOptionPane.showMessageDialog(null,"input","title",JOptionPane.INFORMATION_MESSAGE);
        int ans =JOptionPane.showConfirmDialog(null,"รักหรือเปล่้่า","ถามเธอ",JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_NO_OPTION){
        JOptionPane.showMessageDialog(null,"รักนะ");
        }else{
            JOptionPane.showMessageDialog(null,"จำไว้เลย");
        }

    }
}
