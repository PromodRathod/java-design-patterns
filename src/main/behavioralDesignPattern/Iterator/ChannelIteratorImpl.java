package main.behavioralDesignPattern.Iterator;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

	private List<Channel> channels;
	private ChannelLanguage type;
	private int counter;
	
	ChannelIteratorImpl(ChannelLanguage type, List<Channel> channelList) {
		this.channels = channelList;
		this.type = type;
	}
	
	@Override
	public boolean hasNext() {
		while (counter < channels.size()) {
			Channel c = channels.get(counter);
			if (c.getLanguage().equals(type)) return true;
			else counter++;
		}
		return false;
	}

	@Override
	public Channel next() {
		return channels.get(counter++);
	}

}
