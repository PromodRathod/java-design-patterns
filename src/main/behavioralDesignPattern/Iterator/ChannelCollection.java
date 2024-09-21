package main.behavioralDesignPattern.Iterator;

public interface ChannelCollection {

	public void addChannel(Channel channel);
	public void removeChannel(Channel channel);
	public ChannelIteratorImpl getIterator(ChannelLanguage lang);
}
