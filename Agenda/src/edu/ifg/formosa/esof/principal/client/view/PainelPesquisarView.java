package edu.ifg.formosa.esof.principal.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PainelPesquisarView extends Composite{

	private VerticalPanel vpPainelPesquisar;
	private HorizontalPanel hpPainelPesquisar;
	private HorizontalPanel hpPainelLabelContatos;
	private TextBox tbPesquisar;
	private Button btnPesquisar;
	private Label lbContatos;
	
	public PainelPesquisarView(){
		hpPainelPesquisar = new HorizontalPanel();
		hpPainelPesquisar.setStyleName("hpPainelPesquisar");
		
		tbPesquisar = new TextBox();
		tbPesquisar.setStyleName("tbPesquisar");
		
		btnPesquisar = new Button("");
		btnPesquisar.setStyleName("btnPesquisar");
		
		hpPainelPesquisar.add(tbPesquisar);
		hpPainelPesquisar.add(btnPesquisar);
		hpPainelPesquisar.setCellWidth(tbPesquisar, "38%");
		
		hpPainelLabelContatos = new HorizontalPanel();
		hpPainelLabelContatos.setStyleName("hpPainelLabelContatos");
		
		lbContatos = new Label("Contatos");
		lbContatos.setStyleName("lbContatos");
		
		hpPainelLabelContatos.add(lbContatos);
		hpPainelLabelContatos.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
		hpPainelLabelContatos.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		
		vpPainelPesquisar = new VerticalPanel();
		vpPainelPesquisar.setStyleName("vpPainelPesquisar");
		
		vpPainelPesquisar.add(hpPainelPesquisar);
		vpPainelPesquisar.add(hpPainelLabelContatos);
		
		
		initWidget(vpPainelPesquisar);
	}

	public VerticalPanel getVpPainelPesquisar() {
		return vpPainelPesquisar;
	}

	public void setVpPainelPesquisar(VerticalPanel vpPainelPesquisar) {
		this.vpPainelPesquisar = vpPainelPesquisar;
	}

	public HorizontalPanel getHpPainelPesquisar() {
		return hpPainelPesquisar;
	}

	public void setHpPainelPesquisar(HorizontalPanel hpPainelPesquisar) {
		this.hpPainelPesquisar = hpPainelPesquisar;
	}

	public HorizontalPanel getHpPainelLabelContatos() {
		return hpPainelLabelContatos;
	}

	public void setHpPainelLabelContatos(HorizontalPanel hpPainelLabelContatos) {
		this.hpPainelLabelContatos = hpPainelLabelContatos;
	}

	public TextBox getTbPesquisar() {
		return tbPesquisar;
	}

	public void setTbPesquisar(TextBox tbPesquisar) {
		this.tbPesquisar = tbPesquisar;
	}

	public Button getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(Button btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public Label getLbContatos() {
		return lbContatos;
	}

	public void setLbContatos(Label lbContatos) {
		this.lbContatos = lbContatos;
	}
	
}
