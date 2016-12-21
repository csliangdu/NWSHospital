package team.nwsh.nwshospital.DirectorSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class DirectorSystem extends JFrame {

	private JPanel DirectorMianMeau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {  
					DirectorSystem frame = new DirectorSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DirectorSystem() {
		setTitle("\u9662\u957F\u67E5\u8BE2\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		DirectorMianMeau = new JPanel();
		DirectorMianMeau.setBorder(new EmptyBorder(5, 5, 5, 5));
		DirectorMianMeau.setLayout(new BorderLayout(0, 0));
		setContentPane(DirectorMianMeau);
		
		JPanel panel = new JPanel();
		DirectorMianMeau.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton PharmacyQuery = new JButton("\u836F\u623F\u60C5\u51B5\u67E5\u8BE2");
		PharmacyQuery.setFont(new Font("宋体", Font.BOLD, 20));
		PharmacyQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectorPharmacyQuery newframe = new DirectorPharmacyQuery();//页面跳转
				newframe.setVisible(true);
			}
		});
		PharmacyQuery.setBounds(28, 121, 193, 78);
		panel.add(PharmacyQuery);
		
		JButton SectionQuery = new JButton("\u79D1\u5BA4\u60C5\u51B5\u67E5\u8BE2");
		SectionQuery.setFont(new Font("宋体", Font.BOLD, 20));
		SectionQuery.setBounds(28, 228, 193, 78);
		SectionQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectorSectionQuery newframe = new DirectorSectionQuery();//页面跳转
			newframe.setVisible(true);
			}
		});
		panel.add(SectionQuery);
		
		JButton DoctorQuery = new JButton("\u533B\u751F\u60C5\u51B5\u67E5\u8BE2");
		DoctorQuery.setFont(new Font("宋体", Font.BOLD, 20));
		DoctorQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DirectorDoctorQuery newframe = new DirectorDoctorQuery();//页面跳转
				newframe.setVisible(true);
			}
		});
		DoctorQuery.setBounds(28, 334, 193, 78);
		panel.add(DoctorQuery);
		
		JLabel MedicineAlarm = new JLabel("");
		MedicineAlarm.setBounds(284, 31, 443, 78);
		panel.add(MedicineAlarm);
		
		JButton CreatReport = new JButton("\u751F\u6210\u62A5\u544A");
		CreatReport.setFont(new Font("宋体", Font.BOLD, 20));
		CreatReport.setBounds(400, 121, 158, 78);
		panel.add(CreatReport);
		
		JButton PublishReport = new JButton("\u5BFC\u51FA\u62A5\u544A");
		PublishReport.setFont(new Font("宋体", Font.BOLD, 20));
		PublishReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		PublishReport.setBounds(400, 228, 158, 78);
		panel.add(PublishReport);
		
		JButton MainMeauQuitButton = new JButton("\u9000\u51FA");
		MainMeauQuitButton.setFont(new Font("宋体", Font.BOLD, 20));
		MainMeauQuitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MainMeauQuitButton.setBounds(400, 334, 158, 78);
		panel.add(MainMeauQuitButton);
		
		JLabel MainMeauTitle = new JLabel("\u9662\u957F\u67E5\u8BE2\u7CFB\u7EDF");
		MainMeauTitle.setFont(new Font("宋体", Font.BOLD, 30));
		MainMeauTitle.setBounds(28, 22, 378, 68);
		panel.add(MainMeauTitle);
		
		JLabel label = new JLabel("\u67E5\u8BE2\u836F\u623F\u836F\u54C1\u4F7F\u7528\u60C5\u51B5");
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		label.setBounds(231, 141, 172, 41);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u67E5\u8BE2\u79D1\u5BA4\u6302\u53F7\u60C5\u51B5");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(231, 235, 148, 41);
		panel.add(label_1);
	}
}
