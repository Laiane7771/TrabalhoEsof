package edu.ifg.formosa.esof.principal.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PainelTabelaeBotaoView  extends  Composite{
	
	private HorizontalPanel hpPainelTabela;
	private HorizontalPanel hpPainelBotaoCadastrarNovo;
	private VerticalPanel vpPainelTroca;
	private VerticalPanel vpPainelTelaInicial;
	private Button btnCadastrarNovo;
	private FlexTable ftTabelaContatos;
	private Label tftNome = new Label("Nome");
	private Label tftApelido = new Label("Apelido");
	private Label tftTelefone = new Label("Telefone");
	private Label tftEmail = new Label("Email");
	private Label tftDataNasci = new Label("Data de Nascimento");
	private Label tftRedesSociais = new Label("Redes Sociais");
	
	
	public PainelTabelaeBotaoView(){
		
		hpPainelTabela = new HorizontalPanel();
		hpPainelTabela.setStyleName("hpPainelTabela");
		
		ftTabelaContatos = new FlexTable();
		ftTabelaContatos.setStyleName("ftTabelaContatos");
		ftTabelaContatos.getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		ftTabelaContatos.getFlexCellFormatter().setVerticalAlignment(0, 1, DockPanel.ALIGN_TOP);
		ftTabelaContatos.getFlexCellFormatter().setVerticalAlignment(0, 2, DockPanel.ALIGN_TOP);
		ftTabelaContatos.getFlexCellFormatter().setVerticalAlignment(0, 3, DockPanel.ALIGN_TOP);
		ftTabelaContatos.getFlexCellFormatter().setVerticalAlignment(0, 4, DockPanel.ALIGN_TOP);
		ftTabelaContatos.getFlexCellFormatter().setVerticalAlignment(0, 5, DockPanel.ALIGN_TOP);
		ftTabelaContatos.setBorderWidth(1); 
		
		hpPainelTabela.add(ftTabelaContatos);
		hpPainelTabela.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
		hpPainelTabela.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		
		//-----------------------------------------------------
		
		hpPainelBotaoCadastrarNovo = new HorizontalPanel();
		hpPainelBotaoCadastrarNovo.setStyleName("hpPainelBotaoCadastrarNovo");
		
		btnCadastrarNovo = new Button("Cadastrar Novo");
		btnCadastrarNovo.setStyleName("btnCadastrarNovo");

		hpPainelBotaoCadastrarNovo.add(btnCadastrarNovo);
		
		//--------------------------------------------------------
		
		vpPainelTroca  = new VerticalPanel();
		vpPainelTroca.setStyleName("vpPainelTroca");
		
		vpPainelTroca.add(hpPainelTabela);
		vpPainelTroca.add(hpPainelBotaoCadastrarNovo);
		
		//---------------------------------------------------------
		vpPainelTelaInicial = new VerticalPanel();
		vpPainelTelaInicial.setStyleName("vpPainelTroca");
		vpPainelTelaInicial.add(vpPainelTroca);
		
		tftNome.setStyleName("tftNome");
		tftApelido.setStyleName("tftApelido");
		tftTelefone.setStyleName("tftTelefone");
		tftEmail.setStyleName("tftEmail");
		tftDataNasci.setStyleName("tftDataNasci");
		tftRedesSociais.setStyleName("tftRedesSociais");
		
		initWidget(vpPainelTelaInicial);
	}


	public HorizontalPanel getHpPainelTabela() {
		return hpPainelTabela;
	}


	public void setHpPainelTabela(HorizontalPanel hpPainelTabela) {
		this.hpPainelTabela = hpPainelTabela;
	}


	public HorizontalPanel getHpPainelBotaoCadastrarNovo() {
		return hpPainelBotaoCadastrarNovo;
	}


	public void setHpPainelBotaoCadastrarNovo(
			HorizontalPanel hpPainelBotaoCadastrarNovo) {
		this.hpPainelBotaoCadastrarNovo = hpPainelBotaoCadastrarNovo;
	}


	public VerticalPanel getVpPainelTroca() {
		return vpPainelTroca;
	}


	public void setVpPainelTroca(VerticalPanel vpPainelTroca) {
		this.vpPainelTroca = vpPainelTroca;
	}


	public VerticalPanel getVpPainelTelaInicial() {
		return vpPainelTelaInicial;
	}


	public void setVpPainelTelaInicial(VerticalPanel vpPainelTelaInicial) {
		this.vpPainelTelaInicial = vpPainelTelaInicial;
	}

	public Button getBtnCadastrarNovo() {
		return btnCadastrarNovo;
	}


	public void setBtnCadastrarNovo(Button btnCadastrarNovo) {
		this.btnCadastrarNovo = btnCadastrarNovo;
	}


	public FlexTable getFtTabelaContatos() {
		return ftTabelaContatos;
	}


	public void setFtTabelaContatos(FlexTable ftTabelaContatos) {
		this.ftTabelaContatos = ftTabelaContatos;
	}


	public Label getTftNome() {
		return tftNome;
	}


	public void setTftNome(Label tftNome) {
		this.tftNome = tftNome;
	}


	public Label getTftApelido() {
		return tftApelido;
	}


	public void setTftApelido(Label tftApelido) {
		this.tftApelido = tftApelido;
	}


	public Label getTftTelefone() {
		return tftTelefone;
	}


	public void setTftTelefone(Label tftTelefone) {
		this.tftTelefone = tftTelefone;
	}


	public Label getTftEmail() {
		return tftEmail;
	}


	public void setTftEmail(Label tftEmail) {
		this.tftEmail = tftEmail;
	}


	public Label getTftDataNasci() {
		return tftDataNasci;
	}


	public void setTftDataNasci(Label tftDataNasci) {
		this.tftDataNasci = tftDataNasci;
	}


	public Label getTftRedesSociais() {
		return tftRedesSociais;
	}


	public void setTftRedesSociais(Label tftRedesSociais) {
		this.tftRedesSociais = tftRedesSociais;
	}

}
