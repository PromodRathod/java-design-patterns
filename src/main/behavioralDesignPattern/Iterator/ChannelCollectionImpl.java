package main.behavioralDesignPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channelList = new ArrayList<>();
	
	@Override
	public void addChannel(Channel channel) {
		this.channelList.add(channel);
	}

	@Override
	public void removeChannel(Channel channel) {
		this.channelList.remove(channel);
	}

	@Override
	public ChannelIteratorImpl getIterator(ChannelLanguage lang) {
		return new ChannelIteratorImpl(lang, channelList);
	}

	
	
}
