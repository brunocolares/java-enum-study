package entities.enums;

public enum SituacaoEquipamento {
	EM_USO(1, "Em Uso"),
	FORA_DE_USO(2, "Fora de Uso"),
	EM_MANUTENCAO(3, "Em Manutenção"),
	RECUSADO(4, "Recusado");
	
	private final Integer id;
	private final String situacao;
	
	SituacaoEquipamento(Integer id, String situacao) {
		this.id = id;
		this.situacao = situacao;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public static SituacaoEquipamento fromId(Integer id) {
		for(SituacaoEquipamento equipamento : SituacaoEquipamento.values()) {
			if(equipamento.getId().equals(id)) {
				return equipamento;
			}
		}
		throw new IllegalArgumentException("O id não foi encontrado");
	}
	
}
