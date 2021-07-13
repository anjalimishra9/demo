/**
 * 
 */
package com.example.demo.model;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

/**
 * @author anjali.mishra
 *
 */
public class Operations {

	@CsvBindByPosition(position = 1, required = true)
	private String rl100_Code;

	@CsvBindByPosition(position = 0)
	private String plc;

	@CsvBindByPosition(position = 2)
	private String rl100_LangName;

	@CsvBindByPosition(position = 3)
	private String rl100_KurzName;

	@CsvBindByPosition(position = 4)
	private String typ_Kurz;

	@CsvBindByPosition(position = 5)
	private String typ_Lang;

	@CsvBindByPosition(position = 6)
	private String betriebsZustand;

	@CsvDate(value = "yyyyMMdd")
	@CsvBindByPosition(position = 7)
	private LocalDate datumAb;

	@CsvDate(value = "yyyyMMdd")
	@CsvBindByPosition(position = 8)
	private LocalDate datumBis;

	@CsvBindByPosition(position = 9)
	private Integer niederlassung;

	@CsvBindByPosition(position = 10)
	private String regionalBereich;

	@CsvDate(value = "yyyyMMdd")
	@CsvBindByPosition(position = 11)
	private LocalDate letzeAenderung;

//	@CsvDate(value = "yyyyMMdd")
//	@CsvBindByPosition(position = 12)
//	private LocalDate dummyColumnOne;

	/**
	 * 
	 */
	public Operations() {
		super();
	}

	/**
	 * @param rl100_Code
	 * @param plc
	 * @param rl100_LangName
	 * @param rl100_KurzName
	 * @param typ_Kurz
	 * @param typ_Lang
	 * @param betriebsZustand
	 * @param datumAb
	 * @param datumBis
	 * @param niederlassung
	 * @param regionalBereich
	 * @param letzeAenderung
	 */
	public Operations(String rl100_Code, String plc, String rl100_LangName, String rl100_KurzName, String typ_Kurz,
			String typ_Lang, String betriebsZustand, LocalDate datumAb, LocalDate datumBis, Integer niederlassung,
			String regionalBereich, LocalDate letzeAenderung) {
		super();
		this.rl100_Code = rl100_Code;
		this.plc = plc;
		this.rl100_LangName = rl100_LangName;
		this.rl100_KurzName = rl100_KurzName;
		this.typ_Kurz = typ_Kurz;
		this.typ_Lang = typ_Lang;
		this.betriebsZustand = betriebsZustand;
		this.datumAb = datumAb;
		this.datumBis = datumBis;
		this.niederlassung = niederlassung;
		this.regionalBereich = regionalBereich;
		this.letzeAenderung = letzeAenderung;
	}

	/**
	 * @return the rl100_Code
	 */
	public String getRl100_Code() {
		return rl100_Code;
	}

	/**
	 * @param rl100_Code the rl100_Code to set
	 */
	public void setRl100_Code(String rl100_Code) {
		this.rl100_Code = rl100_Code;
	}

	/**
	 * @return the plc
	 */
	public String getPlc() {
		return plc;
	}

	/**
	 * @param plc the plc to set
	 */
	public void setPlc(String plc) {
		this.plc = plc;
	}

	/**
	 * @return the rl100_LangName
	 */
	public String getRl100_LangName() {
		return rl100_LangName;
	}

	/**
	 * @param rl100_LangName the rl100_LangName to set
	 */
	public void setRl100_LangName(String rl100_LangName) {
		this.rl100_LangName = rl100_LangName;
	}

	/**
	 * @return the rl100_KurzName
	 */
	public String getRl100_KurzName() {
		return rl100_KurzName;
	}

	/**
	 * @param rl100_KurzName the rl100_KurzName to set
	 */
	public void setRl100_KurzName(String rl100_KurzName) {
		this.rl100_KurzName = rl100_KurzName;
	}

	/**
	 * @return the typ_Kurz
	 */
	public String getTyp_Kurz() {
		return typ_Kurz;
	}

	/**
	 * @param typ_Kurz the typ_Kurz to set
	 */
	public void setTyp_Kurz(String typ_Kurz) {
		this.typ_Kurz = typ_Kurz;
	}

	/**
	 * @return the typ_Lang
	 */
	public String getTyp_Lang() {
		return typ_Lang;
	}

	/**
	 * @param typ_Lang the typ_Lang to set
	 */
	public void setTyp_Lang(String typ_Lang) {
		this.typ_Lang = typ_Lang;
	}

	/**
	 * @return the betriebsZustand
	 */
	public String getBetriebsZustand() {
		return betriebsZustand;
	}

	/**
	 * @param betriebsZustand the betriebsZustand to set
	 */
	public void setBetriebsZustand(String betriebsZustand) {
		this.betriebsZustand = betriebsZustand;
	}

	/**
	 * @return the datumAb
	 */
	public LocalDate getDatumAb() {
		return datumAb;
	}

	/**
	 * @param datumAb the datumAb to set
	 */
	public void setDatumAb(LocalDate datumAb) {
		this.datumAb = datumAb;
	}

	/**
	 * @return the datumBis
	 */
	public LocalDate getDatumBis() {
		return datumBis;
	}

	/**
	 * @param datumBis the datumBis to set
	 */
	public void setDatumBis(LocalDate datumBis) {
		this.datumBis = datumBis;
	}

	/**
	 * @return the niederlassung
	 */
	public Integer getNiederlassung() {
		return niederlassung;
	}

	/**
	 * @param niederlassung the niederlassung to set
	 */
	public void setNiederlassung(Integer niederlassung) {
		this.niederlassung = niederlassung;
	}

	/**
	 * @return the regionalBereich
	 */
	public String getRegionalBereich() {
		return regionalBereich;
	}

	/**
	 * @param regionalBereich the regionalBereich to set
	 */
	public void setRegionalBereich(String regionalBereich) {
		this.regionalBereich = regionalBereich;
	}

	/**
	 * @return the letzeAenderung
	 */
	public LocalDate getLetzeAenderung() {
		return letzeAenderung;
	}

	/**
	 * @param letzeAenderung the letzeAenderung to set
	 */
	public void setLetzeAenderung(LocalDate letzeAenderung) {
		this.letzeAenderung = letzeAenderung;
	}

	@Override
	public String toString() {
		return "Operations [rl100_Code=" + rl100_Code + ", plc=" + plc + ", rl100_LangName=" + rl100_LangName
				+ ", rl100_KurzName=" + rl100_KurzName + ", typ_Kurz=" + typ_Kurz + ", typ_Lang=" + typ_Lang
				+ ", betriebsZustand=" + betriebsZustand + ", datumAb=" + datumAb + ", datumBis=" + datumBis
				+ ", niederlassung=" + niederlassung + ", regionalBereich=" + regionalBereich + ", letzeAenderung="
				+ letzeAenderung + "]";
	}

}
