package com.ecr.sampe.model;

public class EcrModel {

	private String cmtsId;
	private String interfaceName;
	private Integer cableModemOffline;
	private String description;
	private Integer rx;
	private Integer tx;

	public EcrModel() {
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCmtsId() {
		return cmtsId;
	}

	public void setCmtsId(String cmtsId) {
		this.cmtsId = cmtsId;
	}

	public Integer getRx() {
		return rx;
	}

	public Integer getTx() {
		return tx;
	}

	public void setTx(Integer tx) {
		this.tx = tx;
	}

	public void setRx(Integer rx) {
		this.rx = rx;
	}

	public Integer getCableModemOffline() {
		return cableModemOffline;
	}

	public void setCableModemOffline(Integer cableModemOffline) {
		this.cableModemOffline = cableModemOffline;
	}

	@Override
	public String toString() {
		return "EcrModel [cmtsId=" + cmtsId + ", interfaceName=" + interfaceName + ", cableModemOffline="
				+ cableModemOffline + ", description=" + description + ", Rx=" + rx + ", Tx=" + tx + "]";
	}

	public EcrModel(String cmtsId, String interfaceName, Integer cableModemOffline, String description, Integer rx,
			Integer tx) {
		this.cmtsId = cmtsId;
		this.interfaceName = interfaceName;
		this.cableModemOffline = cableModemOffline;
		this.description = description;
		this.rx = rx;
		this.tx = tx;
	}

}
