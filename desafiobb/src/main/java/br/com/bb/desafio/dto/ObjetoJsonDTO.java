package br.com.bb.desafio.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class ObjetoJsonDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HeaderPageDTO header;
	private List<DataIndicatorDTO> data;
	
	public HeaderPageDTO getHeader() {
		return header;
	}
	public void setHeader(HeaderPageDTO header) {
		this.header = header;
	}
	public List<DataIndicatorDTO> getData() {
		return data;
	}
	public void setData(List<DataIndicatorDTO> data) {
		this.data = data;
	}
	
}