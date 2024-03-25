package ntu_62130519;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MangHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWeight;
	private JTextField txtHeight;
	private JTextField txtNumberBMI;
	private JTextField txtKQ;

	public MangHinhTinhToan() {
		setTitle("Chương trình tính toán BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập cân nặng:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(39, 49, 96, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpChiuCao = new JLabel("Nhập chiều cao:");
		lblNhpChiuCao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNhpChiuCao.setBounds(39, 101, 96, 28);
		contentPane.add(lblNhpChiuCao);
		
		JLabel lblNhpThngTin = new JLabel("NHẬP THÔNG TIN ĐỂ TÍNH BMI");
		lblNhpThngTin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNhpThngTin.setBounds(119, 10, 191, 28);
		contentPane.add(lblNhpThngTin);
		
		txtWeight = new JTextField();
		txtWeight.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		txtWeight.setBounds(142, 50, 191, 28);
		contentPane.add(txtWeight);
		txtWeight.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		txtHeight.setColumns(10);
		txtHeight.setBounds(145, 101, 191, 28);
		contentPane.add(txtHeight);
		
		JButton btnBMI = new JButton("TÍNH BMI");
		btnBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str_a = txtWeight.getText();
				String str_b = txtHeight.getText();
				Double a = Double.parseDouble(str_a);
				Double b = Double.parseDouble(str_b);
				Double KQ = a /b *b;
				txtNumberBMI.setText(String.valueOf(KQ));
				
				
				
			}
		});
		
		btnBMI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBMI.setBounds(142, 140, 96, 35);
		contentPane.add(btnBMI);
		
		JLabel lblKtQu = new JLabel("Kết Quả BMI:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKtQu.setBounds(23, 193, 86, 35);
		contentPane.add(lblKtQu);
		
		txtNumberBMI = new JTextField();
		txtNumberBMI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNumberBMI.setBounds(119, 198, 96, 27);
		contentPane.add(txtNumberBMI);
		txtNumberBMI.setColumns(10);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtKQ.setColumns(10);
		txtKQ.setBounds(225, 198, 142, 27);
		contentPane.add(txtKQ);
	}
}
