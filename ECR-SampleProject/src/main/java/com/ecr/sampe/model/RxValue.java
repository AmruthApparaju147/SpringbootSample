package com.ecr.sampe.model;

public class RxValue {
	
	private  Integer preCutOver;
	private Integer  postCutOver;
	
	public RxValue(){
		
	}
	
	public RxValue(Integer preCutOver, Integer postCutOver) {
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
