import java.awt.BorderLayout;
import java.io.*;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Window.Type;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

public class Restaurant2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant2 frame = new Restaurant2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
							
	}
	
	

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	
	public Restaurant2() throws IOException {
		setTitle("ChoiceView");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String soup = "";
		
		JLabel lblNewLabel = new JLabel("Soup");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 102, 0));
		lblNewLabel.setBounds(10, 11, 70, 23);
		contentPane.add(lblNewLabel);
		
		JCheckBox fishsoupCh = new JCheckBox("Fish Soup");
		fishsoupCh.setBounds(6, 44, 97, 23);
		contentPane.add(fishsoupCh);
		
		
        /*fishsoupCh.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					System.out.println("Fish Soup is chosen");
					
				}
				else {
					System.out.println("Fish Soup deleted");
				}		
				
				
			}
		});*/
		
		JCheckBox italiansoupCh = new JCheckBox("Italian Soup");
		italiansoupCh.setBounds(6, 88, 97, 23);
		contentPane.add(italiansoupCh);
        /*italiansoupCh.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					System.out.println("Italian Soup is chosen");
					String soup = italiansoupCh.getText();
				}
				else {
					System.out.println("Italian Soup Deleted");
				}
								
								
			}
		});*/
		
		JLabel lblSeafood = new JLabel("SeaFood");
		lblSeafood.setForeground(new Color(0, 204, 204));
		lblSeafood.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSeafood.setBounds(112, 11, 70, 23);
		contentPane.add(lblSeafood);
        
		
		JCheckBox squidCh = new JCheckBox("Squid");
		squidCh.setBounds(102, 44, 97, 23);
		contentPane.add(squidCh);
        /*squidCh.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					System.out.println("Squid is chosen");
				}
				else {
					System.out.println("Squid Deleted");
				}
								
								
			}
		});*/
		
		JCheckBox salmonCh = new JCheckBox("Salmon");
		salmonCh.setBounds(102, 88, 97, 23);
		contentPane.add(salmonCh);
        /*salmonCh.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					System.out.println("Salmon is chosen");
				}
				else {
					System.out.println("Salmon Deleted");
				}
							
								
			}
		});*/
		
		JCheckBox shrimpstewCh = new JCheckBox("Shrimp Stew");
		shrimpstewCh.setBounds(102, 133, 102, 23);
		contentPane.add(shrimpstewCh);
        /*shrimpstewCh.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					System.out.println("Shrimp Stew is chosen");
				}
				else {
					System.out.println("Shrimp Stew Deleted");
				}
								
			 }
		 });*/
        
        
		
		JLabel lblBeverage = new JLabel("Beverage");
		lblBeverage.setForeground(new Color(102, 102, 153));
		lblBeverage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBeverage.setBounds(206, 11, 70, 23);
		contentPane.add(lblBeverage);
		
		JRadioButton rWater = new JRadioButton("Water");
		rWater.setBounds(201, 44, 109, 23);
		contentPane.add(rWater);
		rWater.setActionCommand("Water");
		
		JRadioButton rCoke = new JRadioButton("Coke");
		rCoke.setBounds(201, 75, 109, 23);
		contentPane.add(rCoke);
		rCoke.setActionCommand("Coke");
		
		JRadioButton rCocktail = new JRadioButton("Cocktail");
		rCocktail.setBounds(201, 107, 109, 23);
		contentPane.add(rCocktail);
		rCocktail.setActionCommand("Cocktail");
		
		JRadioButton rFreshJuice = new JRadioButton("Fresh Juice");
		rFreshJuice.setBounds(201, 143, 109, 23);
		contentPane.add(rFreshJuice);
		rFreshJuice.setActionCommand("Fresh Juice");
		
		ButtonGroup bg = new ButtonGroup(); // 4 Buton Ayný Grupta yani 4 butondan sadece 1'i seçilebilir.
		bg.add(rWater);
		bg.add(rCoke);
		bg.add(rCocktail);
		bg.add(rFreshJuice);
		
		/*JButton saveBtn = new JButton("Soup+SeaFood+Beverage");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Soup CheckBox'da olanlarý yazdýr.
				if(fishsoupCh.isSelected()) {
					System.out.println(fishsoupCh.getText() + " is choosen"); //Soup CheckBoxda seçileni basar.
				}
				if(italiansoupCh.isSelected()) {
					System.out.println(italiansoupCh.getText() + " is choosen");//Soup CheckBoxda seçileni basar.
				}
				//SeaFood CheckBox'da olanlarý yazdýr.
				if(squidCh.isSelected()) {
					System.out.println(squidCh.getText() + "is choosen");
				}
				if(salmonCh.isSelected()) {
					System.out.println(salmonCh.getText() + "is choosen");
				}
				if(shrimpstewCh.isSelected()) {
					System.out.println(shrimpstewCh.getText() + "is choosen");
				}				
				
				System.out.println(bg.getSelection().getActionCommand());//RadioButton'da seçilenleri basar.
				
				
			}
		});
		saveBtn.setBounds(165, 227, 259, 23);
		contentPane.add(saveBtn);*/
		
		JLabel lblDessert = new JLabel("Dessert");
		lblDessert.setForeground(new Color(255, 0, 0));
		lblDessert.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDessert.setBounds(324, 11, 70, 23);
		contentPane.add(lblDessert);
		
		String arr[] = {"Chees Cake", "Cookie", "Macaron", "Baklava", "Ice cream", "No Dessert "};
		JComboBox comboBox = new JComboBox(arr); // arr'yi ComboBox'ýn içine attýk.
		comboBox.setBounds(316, 44, 97, 23);
		contentPane.add(comboBox);
		
		JButton writeandreadbtn = new JButton("Write-Read");
		writeandreadbtn.setBounds(10, 185, 130, 23);
		contentPane.add(writeandreadbtn);
		
		JButton showbtn = new JButton("ShowOrder");
		showbtn.setBounds(290, 185, 123, 23);
		contentPane.add(showbtn);
		
		
		JProgressBar jb = new JProgressBar(0,2000);		
		jb.setStringPainted(true);
		jb.setBounds(10, 224, 130, 14);
		jb.setValue(0);		
		contentPane.add(jb); // jb isimli ProgressBar f isimli frameme eklendi.
		
		
		
		String text = "";
		
		writeandreadbtn.addActionListener(new ActionListener() { //WriteRead butonuna bastýðýmda çalýþýr
			//Dosya Yazma ve Okuma yapar.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//String text = "Choosen Dessert :" +comboBox.getSelectedItem();
				//String text = "Choosen Dessert : " + cb.getItemAt(cb.getSelectedIndex()); Yukardaki kodla ayný iþi yapar.
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e2) {
					
					e2.printStackTrace();
				}
				JOptionPane.showMessageDialog(contentPane, "Writing has been done !", "Writing", JOptionPane.WARNING_MESSAGE);
				int i = 0;
				while(i<=2000) {
					jb.setValue(i);					
					
					
					// Alttaki kod, kodun okunmasýný biraz yavaþlatýr böylece progress barýn ilerlemesi gözükür.
					try {
						Thread.sleep(10);
					} catch (InterruptedException e2) {
						
						e2.printStackTrace();
					}
					i=i+20; // i 20 olduðunda progress bar %1 yapar çünkü 20 , 2000'in yüzde 1 i
				}
				String text = "";
				if(fishsoupCh.isSelected()) {
					text = (fishsoupCh.getText()); //Soup CheckBoxda seçileni basar.
				}
				if(italiansoupCh.isSelected()) {
					text = (italiansoupCh.getText()); //Soup CheckBoxda seçileni basar.
				}
				//SeaFood CheckBox'da olanlarýda ekler.
				if(squidCh.isSelected()) {
					text = (text + ", " + squidCh.getText());
				}
				if(salmonCh.isSelected()) {
					text = (text + ", " + salmonCh.getText());
				}
				if(shrimpstewCh.isSelected()) {
					text = (text + ", " + shrimpstewCh.getText());
				}
				// CheckBox + RadioButton + ComboBox
				text = text + ", " + (bg.getSelection().getActionCommand()) + " and " + (comboBox.getSelectedItem()); 
				
				
				
				
				File textdosyasi = new File("Orders.txt");//Orders isminde text file oluþturdum.
				if(!textdosyasi.exists()) {
					try {
						
						textdosyasi.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}		 		
				}
				
				
				
				
				
				FileWriter fWriter = null;
				try {
					fWriter = new FileWriter(textdosyasi,false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BufferedWriter bWriter = new BufferedWriter(fWriter);
				try {
					bWriter.write(text);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bWriter.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//System.out.println("Orders have been written to the Orders file !");
				// Dosyaya veriyi yazdýk
				JOptionPane.showMessageDialog(contentPane, "Reading has been done !", "Reading", JOptionPane.WARNING_MESSAGE);
				
				
				FileReader fokuyucu = null;
				try {
					fokuyucu = new FileReader(textdosyasi);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} //FileReader sýnýfý dosyayý okumamý saðlýyor. 
				//hangi dosyayý okumak istiyorsam içine atýyorum. file dosyasýný attým.
				String line = "";
				
				BufferedReader bReader = new BufferedReader(fokuyucu);
				
				try {
					while((line = bReader.readLine()) != null) {//bReader'in readLine() adýnda methodu var.Her satýrý tek tek okuyor.
						//Dosyayý okuyup line' ýn içine atýyorum.
						// null a eþitse okuyacak deðer kalmamýþ demektir.
						//System.out.println(line);
						//System.out.println("Orders have been read from the Orders file !");
						
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bReader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(text + " has been read from the Orders file !");
				
								
			}
		});	
		
		showbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //ShowOrder butonuna bastýðýnda yapýlacak fonksiyon.
				String text = "";
				if(fishsoupCh.isSelected()) {
					text = (fishsoupCh.getText()); //Soup CheckBoxda seçileni basar.
				}
				if(italiansoupCh.isSelected()) {
					text = (italiansoupCh.getText()); //Soup CheckBoxda seçileni basar.
				}
				//SeaFood CheckBox'da olanlarýda ekler.
				if(squidCh.isSelected()) {
					text = (text + ", " + squidCh.getText());
				}
				if(salmonCh.isSelected()) {
					text = (text + ", " + salmonCh.getText());
				}
				if(shrimpstewCh.isSelected()) {
					text = (text + ", " + shrimpstewCh.getText());
				}
				// CheckBox + RadioButton + ComboBox
				text = text + ", " + (bg.getSelection().getActionCommand()) + " and " + (comboBox.getSelectedItem());
				JOptionPane.showMessageDialog(contentPane, text);
				
				
				
				System.out.println("Orders : " +text); // Sipariþleri consolda gösterir
				
				
			}
		});
		
		
		
        
	
	
	}
}
