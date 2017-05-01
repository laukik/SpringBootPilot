package bootSampleLaukik.model;

import javax.persistence.Entity;

@Entity(name="tbtoggle")
public class Toggle {

	String toggleName;
	String value;
	
	public Toggle(String toggleName, String value) {
		super();
		this.toggleName = toggleName;
		this.value = value;
	}
	public String getToggleName() {
		return toggleName;
	}
	public void setToggleName(String toggleName) {
		this.toggleName = toggleName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
