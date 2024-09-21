package main.creationalDesignPattern.Prototype;

public class NetworkResource implements Cloneable {

	String networkUrl;
	int networkResourceId;
	boolean server = false;
	
	NetworkResource(String url, int id) {
		this.networkUrl = url;
		this.networkResourceId = id;
	}
	
	public void setNetworkUrl(String url) {
		this.networkUrl = url;
	}
	
	public void setNetworkResouceId(int id) {
		this.networkResourceId = id;
	}
	
	public void promoteAsServer() {
		this.server = true;
	}
	
	public String toString() {
		return "Network Resource = network url : " + this.networkUrl + ", network resource id : " + this.networkResourceId + ", is server : " + this.server;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		NetworkResource clonedObj = (NetworkResource) super.clone();
		clonedObj.setNetworkUrl(this.networkUrl);
		clonedObj.setNetworkResouceId(this.networkResourceId);
		if (this.server)
			clonedObj.promoteAsServer();
		return clonedObj;
	}
}
