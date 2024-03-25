package ntu_62130519;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MangHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWeight;
	private JTextField txtHeight;

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
		btnBMI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBMI.setBounds(142, 163, 96, 35);
		contentPane.add(btnBMI);
	}
}
