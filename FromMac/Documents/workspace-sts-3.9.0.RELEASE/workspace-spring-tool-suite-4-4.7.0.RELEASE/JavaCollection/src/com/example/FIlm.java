package com.example;

public class FIlm implements Comparable<FIlm>{
private String name;
private Integer publish;
private String genre;
private Integer rate;

public FIlm(String name, Integer publish, String genre, Integer rate) {
	super();
	this.name = name;
	this.publish = publish;
	this.genre = genre;
	this.rate = rate;
	
}
@Override
public String toString() {
	return "FIlm [name=" + name + ", publish=" + publish + ", genre=" + genre + ", rate=" + rate + "]";
}
public String getName() {
	return name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((genre == null) ? 0 : genre.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((publish == null) ? 0 : publish.hashCode());
	result = prime * result + ((rate == null) ? 0 : rate.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FIlm other = (FIlm) obj;
	if (genre == null) {
		if (other.genre != null)
			return false;
	} else if (!genre.equals(other.genre))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (publish == null) {
		if (other.publish != null)
			return false;
	} else if (!publish.equals(other.publish))
		return false;
	if (rate == null) {
		if (other.rate != null)
			return false;
	} else if (!rate.equals(other.rate))
		return false;
	return true;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPublish() {
	return publish;
}
public void setPublish(Integer publish) {
	this.publish = publish;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Integer getRate() {
	return rate;
}
public void setRate(Integer rate) {
	this.rate = rate;
}
@Override
public int compareTo(FIlm o) {
/*if(this.rate == o.rate)	{
	return 0;
} else if (this.rate >o.rate) {
*/
	return this.rate.compareTo(o.rate);
}


}

