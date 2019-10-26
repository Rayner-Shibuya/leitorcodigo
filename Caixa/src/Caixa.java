
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Caixa extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JLabel lblProduto;
	private JLabel lblMarcca;
	private JTextField txtProduto;
	private JTextField txtMarca;
	private JLabel lblNewLabel;
	private JTextField txtPreco;
	Image img = new ImageIcon(this.getClass().getResource("Axe.png")).getImage();
	private JLabel lblTotal;
	private JTextField txtTotal;
	private double valor, total = 0;
	private int id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caixa frame = new Caixa();
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
	public Caixa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoDeBarras = new JLabel("Codigo de barras");
		lblCodigoDeBarras.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCodigoDeBarras.setBounds(155, 11, 96, 14);
		contentPane.add(lblCodigoDeBarras);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(10, 11, 133, 148);
		contentPane.add(lblImagem);
		
		txtCodigo = new JTextField();
		txtCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float codigoDeBarras = Float.parseFloat(txtCodigo.getText());
				float axe = 7791293025797L;
				
				System.out.println(total);
				
					if (codigoDeBarras == axe) {
					JOptionPane.showMessageDialog(null, "O codigo " + codigoDeBarras + " foi enviado!");
					id = 1;
					lblImagem.setIcon(new ImageIcon(img.getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT)));
					txtProduto.setText("Desodorante");
					txtMarca.setText("AXE");
					valor = 10.5;
					total += valor;
					txtPreco.setText("" + valor);
					txtTotal.setText("" + total);
					txtCodigo.setText("");
					codigoDeBarras = 0;
					}
					
					System.out.println(total);
			}
		});
		txtCodigo.setBounds(261, 9, 245, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Arial", Font.PLAIN, 12));
		lblProduto.setBounds(155, 36, 46, 14);
		contentPane.add(lblProduto);
		
		lblMarcca = new JLabel("Marca");
		lblMarcca.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMarcca.setBounds(155, 61, 46, 14);
		contentPane.add(lblMarcca);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(261, 34, 122, 20);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(261, 59, 177, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		lblNewLabel = new JLabel("Pre\u00E7o");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(155, 86, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(261, 84, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTotal.setBounds(155, 111, 46, 14);
		contentPane.add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(261, 109, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
	}
}
