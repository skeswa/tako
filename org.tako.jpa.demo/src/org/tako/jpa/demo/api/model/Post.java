package org.tako.jpa.demo.api.model;

import java.io.Serializable;

import org.tako.jpa.core.model.BaseEntity;


public class Post extends BaseEntity implements Serializable {
	
	private Long linkId;
	
	private Feed feed;
	
	public Post() {
	}
	
	public Post(final String name, final String code) {
		this.name = name;
		this.code = code;
	}

	public Long getLinkId() {
		return linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}
}
