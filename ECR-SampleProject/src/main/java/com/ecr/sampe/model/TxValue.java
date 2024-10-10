package com.ecr.sampe.model;

public class TxValue {

	private Integer preCutOver;
	private Integer postCutOver;

	public TxValue() {

	}

	public TxValue(Integer preCutOver, Integer postCutOver) {
		this.preCutOver = preCutOver;
		this.postCutOver = postCutOver;
	}

	public Integer getPreCutOver() {
		return preCutOver;
	}

	public void setPreCutOver(Integer preCutOver) {
		this.preCutOver = preCutOver;
	}

	public Integer getPostCutOver() {
		return postCutOver;
	}

	public void setPostCutOver(Integer postCutOver) {
		this.postCutOver = postCutOver;
	}

}
