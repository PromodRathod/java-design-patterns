package main.behavioralDesignPattern.Iterator;

public class ChannelIteratorMain {

	public static void main(String[] args) {
		ChannelCollection channels = populateChannels();
		ChannelIterator baseIterator = channels.getIterator(ChannelLanguage.HINDI);
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}
		System.out.println("******");
		ChannelIterator englishIterator = channels.getIterator(ChannelLanguage.ENGLISH);
		while (englishIterator.hasNext()) {
			Channel c = englishIterator.next();
			System.out.println(c.toString());
		}
	}
	
	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelLanguage.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelLanguage.HINDI));
		channels.addChannel(new Channel(100.5, ChannelLanguage.KANNADA));
		channels.addChannel(new Channel(101.5, ChannelLanguage.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelLanguage.HINDI));
		channels.addChannel(new Channel(103.5, ChannelLanguage.KANNADA));
		channels.addChannel(new Channel(104.5, ChannelLanguage.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelLanguage.HINDI));
		channels.addChannel(new Channel(106.5, ChannelLanguage.KANNADA));
		return channels;
	}
}
