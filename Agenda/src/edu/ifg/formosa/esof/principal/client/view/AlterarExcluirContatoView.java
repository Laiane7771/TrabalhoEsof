package edu.ifg.formosa.esof.principal.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AlterarExcluirContatoView  extends Composite{
	
	
	private HorizontalPanel hpPainelLabelInformacoes;
	private HorizontalPanel hpPainelLabeleTextboxNome;
	private HorizontalPanel hpPainelLabeleTexboxEmailApelido;
	private HorizontalPanel hpPainelLabeleTextboxTelefone;
	private HorizontalPanel hpPainellabelRedesSociais;
	private HorizontalPanel hpPainelLabeleTextboxFacebook;
	private HorizontalPanel hpPainelLabeleTexboxGithub;
	private HorizontalPanel hpPainelLabeleTexboxTwitter;
	private HorizontalPanel hpPainelLabeleTexboxInstagram;
	private HorizontalPanel hpPainelBotoes;
	private VerticalPanel vpPainelGuardaFormulario;
	private Label lbInformacoesPessoas;
	private Label lbNome;
	private Label lbEmail;
	private Label lbApelido;
	private Label lbTelefone;
	private Label lbDataNasci;
	private Label lbRedesSociais;
	private Label lbFacebook;
	private Label lbGithub;
	private Label lbTwitter;
	private Label lbInstagram;
	private TextBox tbNome;
	private TextBox tbEmail;
	private TextBox tbApelido;
	private TextBox tbTelefone;
	private TextBox tbDataNasci;
	private TextBox tbFacebook;
	private TextBox tbGithub;
	private TextBox tbTwitter;
	private TextBox tbInstagram;
	private Button btnVoltar;
	private Button btnSalvar;
	private Button btnExcluir;
	
	public AlterarExcluirContatoView(){
		
		hpPainelLabelInformacoes = new HorizontalPanel();
		hpPainelLabelInformacoes.setStyleName("hpPainelLabelInformacoes");
		
		lbInformacoesPessoas = new Label("Informações Pessoais");
		lbInformacoesPessoas.setStyleName("lbInformacoesPessoas");
		
		hpPainelLabelInformacoes.add(lbInformacoesPessoas); //adiciona item
		
		hpPainelLabeleTextboxNome = new HorizontalPanel();
		hpPainelLabeleTextboxNome.setStyleName("hpPainelLabeleTextboxNome");
		
		lbNome = new Label("Nome:");
		lbNome.setStyleName("lbNome");
		
		tbNome = new TextBox();
		tbNome.setStyleName("tbNome");
		
		hpPainelLabeleTextboxNome.add(lbNome); //adiciona item
		hpPainelLabeleTextboxNome.setCellWidth(lbNome, "1%");
		hpPainelLabeleTextboxNome.add(tbNome);
		hpPainelLabeleTextboxNome.setCellWidth(tbNome, "43%");
		
		hpPainelLabeleTexboxEmailApelido = new HorizontalPanel();
		hpPainelLabeleTexboxEmailApelido.setStyleName("hpPainelLabeleTexboxEmailApelido");
		
		lbEmail = new Label("Email:");
		lbEmail.setStyleName("lbEmail");
		
		tbEmail = new TextBox();
		tbEmail.setStyleName("tbEmail");
		
		lbApelido = new Label("Apelido:");
		lbApelido.setStyleName("lbApelido");
		
		tbApelido = new TextBox();
		tbApelido.setStyleName("tbApelido");
		
		hpPainelLabeleTexboxEmailApelido.add(lbEmail); //adiciona itens
		hpPainelLabeleTexboxEmailApelido.setCellWidth(lbEmail, "1%");
		hpPainelLabeleTexboxEmailApelido.add(tbEmail); //adiciona itens
		hpPainelLabeleTexboxEmailApelido.setCellWidth(tbEmail, "10%");
		hpPainelLabeleTexboxEmailApelido.add(lbApelido); //adiciona itens
		hpPainelLabeleTexboxEmailApelido.setCellWidth(lbApelido, "1%");
		hpPainelLabeleTexboxEmailApelido.add(tbApelido); //adiciona itens
		hpPainelLabeleTexboxEmailApelido.setCellWidth(tbApelido, "25%");

		hpPainelLabeleTextboxTelefone = new HorizontalPanel();
		hpPainelLabeleTextboxTelefone.setStyleName("hpPainelLabeleTextboxTelefone");
		
		lbTelefone = new Label("Telefone:");
		lbTelefone.setStyleName("lbTelefone");
		
		tbTelefone = new TextBox();
		tbTelefone.setStyleName("tbTelefone");
		
		lbDataNasci = new Label("Data de Nascimento:");
		lbDataNasci.setStyleName("lbDataNasci");
		
		tbDataNasci = new TextBox();
		tbDataNasci.setStyleName("tbDataNasci");
		
		hpPainelLabeleTextboxTelefone.add(lbTelefone); //adiciona itens
		hpPainelLabeleTextboxTelefone.setCellWidth(lbTelefone, "1%");
		hpPainelLabeleTextboxTelefone.add(tbTelefone); //adiciona itens
		hpPainelLabeleTextboxTelefone.setCellWidth(tbTelefone, "3%");
		hpPainelLabeleTextboxTelefone.add(lbDataNasci); //adiciona itens
		hpPainelLabeleTextboxTelefone.setCellWidth(lbDataNasci, "20%");
		hpPainelLabeleTextboxTelefone.add(tbDataNasci); //adiciona itens
		hpPainelLabeleTextboxTelefone.setCellWidth(tbDataNasci, "51%");
		
		hpPainellabelRedesSociais = new HorizontalPanel();
		hpPainellabelRedesSociais.setStyleName("hpPainellabelRedesSociais");
		
		lbRedesSociais = new Label("Redes Sociais (Links)");
		lbRedesSociais.setStyleName("lbRedesSociais");
		
		hpPainellabelRedesSociais.add(lbRedesSociais); //adiciona itens
		
		hpPainelLabeleTextboxFacebook = new HorizontalPanel();
		hpPainelLabeleTextboxFacebook.setStyleName("hpPainelLabeleTextboxFacebook");
		
		lbFacebook = new Label("Facebook:");
		lbFacebook.setStyleName("lbFacebook");
		
		tbFacebook = new TextBox();
		tbFacebook.setStyleName("tbFacebook");
		
		hpPainelLabeleTextboxFacebook.add(lbFacebook);//adiciona itens
		hpPainelLabeleTextboxFacebook.setCellWidth(lbFacebook, "1%");
		hpPainelLabeleTextboxFacebook.add(tbFacebook); //adiciona itens
		hpPainelLabeleTextboxFacebook.setCellWidth(tbFacebook, "45%");
		
		hpPainelLabeleTexboxGithub = new HorizontalPanel();
		hpPainelLabeleTexboxGithub.setStyleName("hpPainelLabeleTexboxGithub");
		
		lbGithub = new Label("Github:");
		lbGithub.setStyleName("lbGithub");
		
		tbGithub = new TextBox();
		tbGithub.setStyleName("tbGithub");
		
		hpPainelLabeleTexboxGithub.add(lbGithub); //adiciona itens
		hpPainelLabeleTexboxGithub.setCellWidth(lbGithub, "1%");
		hpPainelLabeleTexboxGithub.add(tbGithub); //adiciona itens
		hpPainelLabeleTexboxGithub.setCellWidth(tbGithub, "45%");
		
		hpPainelLabeleTexboxTwitter = new HorizontalPanel();
		hpPainelLabeleTexboxTwitter.setStyleName("hpPainelLabeleTexboxTwitter");
		
		lbTwitter = new Label("Twitter:");
		lbTwitter.setStyleName("lbTwitter");
		
		tbTwitter = new TextBox();
		tbTwitter.setStyleName("tbTwitter");
		
		hpPainelLabeleTexboxTwitter.add(lbTwitter); //adiciona itens
		hpPainelLabeleTexboxTwitter.setCellWidth(lbTwitter, "1%");
		hpPainelLabeleTexboxTwitter.add(tbTwitter); //adiciona itens
		hpPainelLabeleTexboxTwitter.setCellWidth(tbTwitter, "45%");
		
		hpPainelLabeleTexboxInstagram = new HorizontalPanel();
		hpPainelLabeleTexboxInstagram.setStyleName("hpPainelLabeleTexboxInstagram");
		
		lbInstagram = new Label("Instagram:");
		lbInstagram.setStyleName("lbInstagram");
		
		tbInstagram = new TextBox();
		tbInstagram.setStyleName("tbInstagram");
		
		hpPainelLabeleTexboxInstagram.add(lbInstagram);
		hpPainelLabeleTexboxInstagram.setCellWidth(lbInstagram, "1%");
		hpPainelLabeleTexboxInstagram.add(tbInstagram);
		hpPainelLabeleTexboxInstagram.setCellWidth(tbInstagram, "45%");
		
		hpPainelBotoes = new HorizontalPanel();
		hpPainelBotoes.setStyleName("hpPainelBotoes");
		
		btnVoltar = new Button("Voltar");
		btnVoltar.setStyleName("btnVoltar");
		
		btnExcluir = new Button("Excluir");
		btnExcluir.setStyleName("btnExcluir");
		
		btnSalvar = new Button("Salvar");
		btnSalvar.setStyleName("btnSalvar");
		
		hpPainelBotoes.add(btnVoltar);
		hpPainelBotoes.add(btnExcluir);
		hpPainelBotoes.add(btnSalvar);
	
		
		vpPainelGuardaFormulario = new VerticalPanel();
		vpPainelGuardaFormulario.setStyleName("vpPainelGuardaFormulario");
		
		vpPainelGuardaFormulario.add(hpPainelLabelInformacoes);
		vpPainelGuardaFormulario.add(hpPainelLabeleTextboxNome);
		vpPainelGuardaFormulario.add(hpPainelLabeleTexboxEmailApelido);
		vpPainelGuardaFormulario.add(hpPainelLabeleTextboxTelefone);
		vpPainelGuardaFormulario.add(hpPainellabelRedesSociais);
		vpPainelGuardaFormulario.add(hpPainelLabeleTextboxFacebook);
		vpPainelGuardaFormulario.setCellWidth(hpPainelLabeleTextboxFacebook, "10%");
		vpPainelGuardaFormulario.add(hpPainelLabeleTexboxGithub);
		vpPainelGuardaFormulario.setCellWidth(hpPainelLabeleTexboxGithub, "10%");
		vpPainelGuardaFormulario.add(hpPainelLabeleTexboxTwitter);
		vpPainelGuardaFormulario.setCellWidth(hpPainelLabeleTexboxTwitter, "10%");
		vpPainelGuardaFormulario.add(hpPainelLabeleTexboxInstagram);
		vpPainelGuardaFormulario.setCellWidth(hpPainelLabeleTexboxInstagram, "10%");
		vpPainelGuardaFormulario.add(hpPainelBotoes);
		vpPainelGuardaFormulario.setCellWidth(hpPainelBotoes, "10%");
		
		initWidget(vpPainelGuardaFormulario);
		
	}



	public HorizontalPanel getHpPainelLabelInformacoes() {
		return hpPainelLabelInformacoes;
	}



	public void setHpPainelLabelInformacoes(HorizontalPanel hpPainelLabelInformacoes) {
		this.hpPainelLabelInformacoes = hpPainelLabelInformacoes;
	}



	public HorizontalPanel getHpPainelLabeleTextboxNome() {
		return hpPainelLabeleTextboxNome;
	}



	public void setHpPainelLabeleTextboxNome(
			HorizontalPanel hpPainelLabeleTextboxNome) {
		this.hpPainelLabeleTextboxNome = hpPainelLabeleTextboxNome;
	}



	public HorizontalPanel getHpPainelLabeleTexboxEmailApelido() {
		return hpPainelLabeleTexboxEmailApelido;
	}



	public void setHpPainelLabeleTexboxEmailApelido(
			HorizontalPanel hpPainelLabeleTexboxEmailApelido) {
		this.hpPainelLabeleTexboxEmailApelido = hpPainelLabeleTexboxEmailApelido;
	}



	public HorizontalPanel getHpPainelLabeleTextboxTelefone() {
		return hpPainelLabeleTextboxTelefone;
	}



	public void setHpPainelLabeleTextboxTelefone(
			HorizontalPanel hpPainelLabeleTextboxTelefone) {
		this.hpPainelLabeleTextboxTelefone = hpPainelLabeleTextboxTelefone;
	}



	public HorizontalPanel getHpPainellabelRedesSociais() {
		return hpPainellabelRedesSociais;
	}



	public void setHpPainellabelRedesSociais(
			HorizontalPanel hpPainellabelRedesSociais) {
		this.hpPainellabelRedesSociais = hpPainellabelRedesSociais;
	}



	public HorizontalPanel getHpPainelLabeleTextboxFacebook() {
		return hpPainelLabeleTextboxFacebook;
	}



	public void setHpPainelLabeleTextboxFacebook(
			HorizontalPanel hpPainelLabeleTextboxFacebook) {
		this.hpPainelLabeleTextboxFacebook = hpPainelLabeleTextboxFacebook;
	}



	public HorizontalPanel getHpPainelLabeleTexboxGithub() {
		return hpPainelLabeleTexboxGithub;
	}



	public void setHpPainelLabeleTexboxGithub(
			HorizontalPanel hpPainelLabeleTexboxGithub) {
		this.hpPainelLabeleTexboxGithub = hpPainelLabeleTexboxGithub;
	}



	public HorizontalPanel getHpPainelLabeleTexboxTwitter() {
		return hpPainelLabeleTexboxTwitter;
	}



	public void setHpPainelLabeleTexboxTwitter(
			HorizontalPanel hpPainelLabeleTexboxTwitter) {
		this.hpPainelLabeleTexboxTwitter = hpPainelLabeleTexboxTwitter;
	}



	public HorizontalPanel getHpPainelLabeleTexboxInstagram() {
		return hpPainelLabeleTexboxInstagram;
	}



	public void setHpPainelLabeleTexboxInstagram(
			HorizontalPanel hpPainelLabeleTexboxInstagram) {
		this.hpPainelLabeleTexboxInstagram = hpPainelLabeleTexboxInstagram;
	}



	public HorizontalPanel getHpPainelBotoes() {
		return hpPainelBotoes;
	}



	public void setHpPainelBotoes(HorizontalPanel hpPainelBotoes) {
		this.hpPainelBotoes = hpPainelBotoes;
	}



	public VerticalPanel getVpPainelGuardaFormulario() {
		return vpPainelGuardaFormulario;
	}



	public void setVpPainelGuardaFormulario(VerticalPanel vpPainelGuardaFormulario) {
		this.vpPainelGuardaFormulario = vpPainelGuardaFormulario;
	}



	public Label getLbInformacoesPessoas() {
		return lbInformacoesPessoas;
	}



	public void setLbInformacoesPessoas(Label lbInformacoesPessoas) {
		this.lbInformacoesPessoas = lbInformacoesPessoas;
	}



	public Label getLbNome() {
		return lbNome;
	}



	public void setLbNome(Label lbNome) {
		this.lbNome = lbNome;
	}



	public Label getLbEmail() {
		return lbEmail;
	}



	public void setLbEmail(Label lbEmail) {
		this.lbEmail = lbEmail;
	}



	public Label getLbApelido() {
		return lbApelido;
	}



	public void setLbApelido(Label lbApelido) {
		this.lbApelido = lbApelido;
	}



	public Label getLbTelefone() {
		return lbTelefone;
	}



	public void setLbTelefone(Label lbTelefone) {
		this.lbTelefone = lbTelefone;
	}



	public Label getLbDataNasci() {
		return lbDataNasci;
	}



	public void setLbDataNasci(Label lbDataNasci) {
		this.lbDataNasci = lbDataNasci;
	}



	public Label getLbRedesSociais() {
		return lbRedesSociais;
	}



	public void setLbRedesSociais(Label lbRedesSociais) {
		this.lbRedesSociais = lbRedesSociais;
	}



	public Label getLbFacebook() {
		return lbFacebook;
	}



	public void setLbFacebook(Label lbFacebook) {
		this.lbFacebook = lbFacebook;
	}



	public Label getLbGithub() {
		return lbGithub;
	}



	public void setLbGithub(Label lbGithub) {
		this.lbGithub = lbGithub;
	}



	public Label getLbTwitter() {
		return lbTwitter;
	}



	public void setLbTwitter(Label lbTwitter) {
		this.lbTwitter = lbTwitter;
	}



	public Label getLbInstagram() {
		return lbInstagram;
	}



	public void setLbInstagram(Label lbInstagram) {
		this.lbInstagram = lbInstagram;
	}



	public TextBox getTbNome() {
		return tbNome;
	}



	public void setTbNome(TextBox tbNome) {
		this.tbNome = tbNome;
	}



	public TextBox getTbEmail() {
		return tbEmail;
	}



	public void setTbEmail(TextBox tbEmail) {
		this.tbEmail = tbEmail;
	}



	public TextBox getTbApelido() {
		return tbApelido;
	}



	public void setTbApelido(TextBox tbApelido) {
		this.tbApelido = tbApelido;
	}



	public TextBox getTbTelefone() {
		return tbTelefone;
	}



	public void setTbTelefone(TextBox tbTelefone) {
		this.tbTelefone = tbTelefone;
	}



	public TextBox getTbDataNasci() {
		return tbDataNasci;
	}



	public void setTbDataNasci(TextBox tbDataNasci) {
		this.tbDataNasci = tbDataNasci;
	}



	public TextBox getTbFacebook() {
		return tbFacebook;
	}



	public void setTbFacebook(TextBox tbFacebook) {
		this.tbFacebook = tbFacebook;
	}



	public TextBox getTbGithub() {
		return tbGithub;
	}



	public void setTbGithub(TextBox tbGithub) {
		this.tbGithub = tbGithub;
	}



	public TextBox getTbTwitter() {
		return tbTwitter;
	}



	public void setTbTwitter(TextBox tbTwitter) {
		this.tbTwitter = tbTwitter;
	}



	public TextBox getTbInstagram() {
		return tbInstagram;
	}



	public void setTbInstagram(TextBox tbInstagram) {
		this.tbInstagram = tbInstagram;
	}



	public Button getBtnVoltar() {
		return btnVoltar;
	}



	public void setBtnVoltar(Button btnVoltar) {
		this.btnVoltar = btnVoltar;
	}



	public Button getBtnSalvar() {
		return btnSalvar;
	}



	public void setBtnSalvar(Button btnSalvar) {
		this.btnSalvar = btnSalvar;
	}



	public Button getBtnExcluir() {
		return btnExcluir;
	}



	public void setBtnExcluir(Button btnExcluir) {
		this.btnExcluir = btnExcluir;
	}
	
	

}
