package main.behavioralDesignPattern.Iterator;

public class Channel {

	private double frequency;
	private ChannelLanguage language;
	
	Channel(double fre, ChannelLanguage lang) {
		this.frequency = fre;
		this.language = lang;
	}
	
	public void setFrequency(double fre) {
		this.frequency = fre;
	}
	
	public void setLanguage(ChannelLanguage lang) {
		this.language = lang;
	}
	
	public double getFrequence() {
		return this.frequency;
	}
	
	public ChannelLanguage getLanguage() {
		return this.language;
	}
	
	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", language=" + language + "]";
	}
}
