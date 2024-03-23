package liste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import paziente.ModificaPaginaAnagrafica;
import paziente.VisualizzazionePaginaAnagrafica;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import model.DataService;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;

public class ListaPagineAnagrafiche extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String matricolaDipendente;
	private DataService dataService;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPagineAnagrafiche frame = new ListaPagineAnagrafiche("m001a");
					frame.setUndecorated(true);
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaPagineAnagrafiche(String codiceDipendente) {
		this.matricolaDipendente = codiceDipendente;
		dataService = new DataService();

		int contatoreAnagrafica = dataService.getContatoreCodice("Anagrafica");
		int posY = 2;

		setTitle("Portale digitale Personale Sanitario dell'ospedale Giovanni XIII");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ListaPagineAnagrafiche.class.getResource("/resources/LogoOspedale.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		for (int i = 1; i <= contatoreAnagrafica; i++) {

			final String codiceAnagrafica = String.valueOf(i);

			if (dataService.esisteAnagrafica(codiceAnagrafica)) {

				JButton bottoneAnagrafica = new JButton("Pagina Anagrafica N. " + i);
				bottoneAnagrafica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						visualizzaAnagrafica(codiceAnagrafica);
					}
				});
				GridBagConstraints gbc_btnListaAnagrafica_1 = new GridBagConstraints();
				gbc_btnListaAnagrafica_1.anchor = GridBagConstraints.NORTH;
				gbc_btnListaAnagrafica_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnListaAnagrafica_1.insets = new Insets(0, 0, 5, 5);
				gbc_btnListaAnagrafica_1.gridx = 0;
				gbc_btnListaAnagrafica_1.gridy = posY;
				contentPane.add(bottoneAnagrafica, gbc_btnListaAnagrafica_1);

				JButton bottoneModifica = new JButton("Modifica");
				bottoneModifica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						modificaAnagrafica(codiceAnagrafica);
					}
				});
				GridBagConstraints gbc_btnModifica = new GridBagConstraints();
				gbc_btnModifica.anchor = GridBagConstraints.NORTH;
				gbc_btnModifica.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnModifica.insets = new Insets(0, 0, 5, 5);
				gbc_btnModifica.gridx = 1;
				gbc_btnModifica.gridy = posY;
				contentPane.add(bottoneModifica, gbc_btnModifica);

				JButton bottoneElimina = new JButton("Elimina");
				bottoneElimina.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						eliminaAnagrafica(codiceAnagrafica);
					}
				});
				GridBagConstraints gbc_btnElimina = new GridBagConstraints();
				gbc_btnElimina.anchor = GridBagConstraints.NORTH;
				gbc_btnElimina.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnElimina.insets = new Insets(0, 0, 5, 0);
				gbc_btnElimina.gridx = 2;
				gbc_btnElimina.gridy = posY;
				contentPane.add(bottoneElimina, gbc_btnElimina);

				posY++;
			}
		}
		contentPane.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);

		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

		JLabel textListeAnagrafiche = new JLabel("Pagine Anagrafiche registrate:");
		textListeAnagrafiche.setBounds(10, 11, 266, 22);
		panel.add(textListeAnagrafiche);
		textListeAnagrafiche.setHorizontalAlignment(SwingConstants.CENTER);
		textListeAnagrafiche.setFont(new Font("Arial", Font.BOLD, 18));

		JButton btnChiudi = new JButton("Chiudi");
		btnChiudi.setBounds(40, 73, 83, 23);
		panel.add(btnChiudi);

		JButton btnAggiungiLista = new JButton("Crea nuova pagina anagrafica");
		btnAggiungiLista.setBounds(160, 72, 177, 23);
		panel.add(btnAggiungiLista);
		btnAggiungiLista.setVerticalAlignment(SwingConstants.BOTTOM);
		btnAggiungiLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aggiungiAnagrafica();
			}
		});
		btnChiudi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

	public void refresh() {
		ListaPagineAnagrafiche listaAnagrafiche = new ListaPagineAnagrafiche(matricolaDipendente);
		listaAnagrafiche.setVisible(true);
		dispose();
	}

	protected void eliminaAnagrafica(String codiceAnagrafica) {
		int scelta = JOptionPane.showConfirmDialog(null, "Confermi di voler eliminare la pagina anagrafica N. "
				+ codiceAnagrafica
				+ "?\nEliminando la pagina anagrafica eliminerai possibili operazioni e verbali associati ad essa",
				"Conferma eliminazione", JOptionPane.YES_NO_OPTION);

		if (scelta == JOptionPane.YES_OPTION) {
			dataService.eliminaAnagrafica(codiceAnagrafica);
			JOptionPane.showMessageDialog(null, "Anagrafica N. " + codiceAnagrafica + " eliminata");
			refresh();
		} else {
			JOptionPane.showMessageDialog(null, "Eliminazione annullata");
		}
	}

	protected void modificaAnagrafica(String codiceAnagrafica) {
		ModificaPaginaAnagrafica modificaAnagrafica = new ModificaPaginaAnagrafica(codiceAnagrafica, "", false);
		modificaAnagrafica.setVisible(true);

	}

	protected void visualizzaAnagrafica(String codiceAnagrafica) {
		VisualizzazionePaginaAnagrafica visualizzaAnagrafica = new VisualizzazionePaginaAnagrafica(codiceAnagrafica,
				matricolaDipendente);
		visualizzaAnagrafica.setVisible(true);

	}

	protected void aggiungiAnagrafica() {
		ModificaPaginaAnagrafica modificaAnagrafica = new ModificaPaginaAnagrafica("", matricolaDipendente, true);
		modificaAnagrafica.setUndecorated(true);
		modificaAnagrafica.setVisible(true);
		modificaAnagrafica.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
