package entities;

import entities.enums.SituacaoEquipamento;

public class Equipamento {
	
	private String codigoEquipamento;
	private String tagEquipamento;
	private SituacaoEquipamento situacaoEquipamento;
	
	public Equipamento() {
	}
	
	public Equipamento(String codigoEquipamento, String tagEquipamento, SituacaoEquipamento situacaoEquipamento) {
		this.codigoEquipamento = codigoEquipamento;
		this.tagEquipamento = tagEquipamento;
		this.situacaoEquipamento = situacaoEquipamento;
	}

	public String getCodigoEquipamento() {
		return codigoEquipamento;
	}

	public void setCodigoEquipamento(String codigoEquipamento) {
		this.codigoEquipamento = codigoEquipamento;
	}

	public String getTagEquipamento() {
		return tagEquipamento;
	}

	public void setTagEquipamento(String tagEquipamento) {
		this.tagEquipamento = tagEquipamento;
	}

	public SituacaoEquipamento getSituacaoEquipamento() {
		return situacaoEquipamento;
	}

	public void setSituacaoEquipamento(SituacaoEquipamento situacaoEquipamento) {
		this.situacaoEquipamento = situacaoEquipamento;
	}

	@Override
	public String toString() {
		return "Equipamento [codigoEquipamento=" + codigoEquipamento + ", tagEquipamento=" + tagEquipamento
				+ ", situacaoEquipamento=" + situacaoEquipamento + "]";
	}
}
