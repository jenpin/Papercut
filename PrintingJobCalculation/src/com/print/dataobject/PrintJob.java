package com.print.dataobject;

public class PrintJob {

	String paperType;

	int totalPages;

	int colorPages;

	boolean singleSided;

	/**
	 * @return the paperType
	 */
	public String getPaperType() {
		return paperType;
	}

	/**
	 * @param paperType the paperType to set
	 */
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}

	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}

	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	/**
	 * @return the colorPages
	 */
	public int getColorPages() {
		return colorPages;
	}

	/**
	 * @param colorPages the colorPages to set
	 */
	public void setColorPages(int colorPages) {
		this.colorPages = colorPages;
	}

	/**
	 * @return the singleSided
	 */
	public boolean isSingleSided() {
		return singleSided;
	}

	/**
	 * @param singleSided the singleSided to set
	 */
	public void setSingleSided(boolean singleSided) {
		this.singleSided = singleSided;
	}

}
